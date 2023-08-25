/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import adt.*;
import Boundary.*;
import Entity.*;
import Utility.MessageUI;
import java.util.Scanner;
/**
 *
 * @author kaon
 */
public class CourseMaintenance {
    private ListInterface<Course> courseList = new ArrayList<>();
    private ListInterface<Programme> programmeList = new ArrayList<>(); 
    private CourseMaintenanceUI courseUI = new CourseMaintenanceUI();
    private ProgrammeMaintenanceUI programmeUI = new ProgrammeMaintenanceUI();
    private Scanner scanner = new Scanner(System.in);
    
    // run the course meu 
    public void runCourseMenu(){
      String option;
        do{
            option = courseUI.getDisplayCourseManagementMenu();
            switch (option) {
                case "1":
                    //Add Course Function
                    addCourse();   
                    break;
                case "2":
                    //Remove Course Function
                    deleteCourse();
                    break;
                case "3":
                    //Find Course Function
                    findCourse();
                    break;
                case "4":
                    //Amend Course Function
                    amendCourse();
                    break;
                case "5":
                    //Display Course Function 
                    displayCourse();
                    break;
                case "6":
                    //Add programme to Course Function 
                    addProgrammeToCourse();
                    break;
                case "7":
                    //Remove programme from Course Function 
                    deleteProgramme();
                    break;
                case "0":
                    //Show the Exit message and stop run the program
                    MessageUI.displayExitMessage();
                    break;
                default:
                    // if the user type the number out of range will show the message ask them retype the number again
                    MessageUI.displayRetypeMessage();
        }
    }while(!option.equals("0"));
}
    
    //Add course
    public void addCourse(){
        Course course = courseUI.inputCourseDetails();
         
        courseList.add(course);
        System.out.println("\n");
        // after the user added the course will display the message Course Added
        MessageUI.displayCourseAddedMessage();
       
    }
    
    //Delete the course
    public void deleteCourse(){
       
        courseUI.deleteTheCourse();
        
        for (int i=1; i < courseList.getNumberOfEntries()+1;i++){
               System.out.println("\t "+ i + " > " + courseList.getEntry(i));
           }
        int deleteNo = 0;
        deleteNo = courseUI.getDeleteNo(deleteNo);
        if (deleteNo >= 1 && deleteNo <= courseList.getNumberOfEntries()) {
            System.out.println("\t"+courseList.getEntry(deleteNo));
            courseList.remove(deleteNo);
            MessageUI.displayCourseDeletedMessage();
        } else {
            MessageUI.displayInvalidNumMessage();
            }
    }
    
    //Find the course
    public void findCourse(){
        String courseCode= null;
        courseCode = courseUI.findTheCourse(courseCode);
        
        Course course = courseList.getEntry(new Course(courseCode));
        
        if(course != null){           
            System.out.println("\t Course : \n\t" + course);    
        }else{
            MessageUI.displayNoCourseFoundMessage();
        }
    }
    
    //Amend the course
    public void amendCourse(){
        courseUI.amendTheCourse();
        
        if(courseList.getNumberOfEntries() != 0){
            for (int i=1; i < courseList.getNumberOfEntries()+1;i++){
               System.out.println("\t "+ i + " > " + courseList.getEntry(i));
            }
                int amendNo=0;
                amendNo = courseUI.getAmendNo(amendNo);
                String courseCode= null;
                courseCode = courseUI.modifyCourse(courseCode);
                
                Course courseAmend = courseList.getEntry(new Course(courseCode));
                
                if(courseAmend == null){   
                Course course = courseUI.modifyTheCourse(courseCode);
                
                if (amendNo >= 1 && amendNo <= courseList.getNumberOfEntries()) {
                        courseList.replace(amendNo, course);
                        MessageUI.displayCourseModifiedMessage();
                }else{
                        MessageUI.displayInvalidNumMessage();
                }
            
            }else{
                    //replace the same Course Code data (Change this after)
                if (amendNo >= 1 && amendNo <= courseList.getNumberOfEntries()) {
                        courseList.replace(amendNo, courseAmend);
                        MessageUI.displayExitMessage();
                } else {
                        MessageUI.displayInvalidNumMessage();
                }
            }
                
        } else{
                MessageUI.displayNoCourseFoundMessage();
              }
    }
    
    //Display the course 
    public void displayCourse(){
        courseUI.displayTheCourse();
        if(courseList.getNumberOfEntries()!=0){
        for (int i = 0; i < courseList.getNumberOfEntries(); i++) {  
           System.out.println("\t Course : \n\t" +courseList.getEntry(i + 1));
            System.out.println("\n");
           System.out.println("\t Programme : \n\t" +courseList.getEntry(i + 1).getAllProgramme());
        }
        }else{
            MessageUI.displayNoCourseFoundMessage();
        }
    }
    
    //Add Programme to Course
     public void addProgrammeToCourse(){
        String courseCode = null;
        courseCode = programmeUI.addProgrammeToCourse(courseCode);
        
        Course course = courseList.getEntry(new Course(courseCode));
        if(course != null){
            
            String programmeCode = null;
            programmeCode = programmeUI.addTheProgramme(programmeCode);
            Programme programme = programmeList.getEntry(new Programme(programmeCode));
            
            if (programme == null) {
            //if programme not found
            //ask user to enter new programme  details
            //assign new programme to programme list
            //add to course
            Programme programmeAdd = programmeUI.addProgramme(programmeCode);
                do {
                    course = courseList.getEntry(new Course(courseCode));
                } while (course == null);
               
            //assign programme to course
                course.addProgrammeToCourse(programmeAdd);
                MessageUI.displayProgAddedMessage();
            } else {
         
                do{
                    course = courseList.getEntry(new Course(courseCode));
                } while (course == null);

            //assign programme to course
                course.addProgrammeToCourse(programme);
                MessageUI.displayProgAddedMessage();
                }
            
        }else{
            MessageUI.displayNoCourseFoundMessage();
        }
        
    } 
     
    // Delete Programme
    public void deleteProgramme(){
        String courseCode = null;
        courseCode = programmeUI.deleteProgrammeFromCourse(courseCode);
        
        Course course = courseList.getEntry(new Course(courseCode));
        if(course != null){
            
            if (course.getAllProgramme().getNumberOfEntries() != 0) {
                System.out.println("\n");
                System.out.println("\t Course Info : \n\t" + course);
                for (int i = 1; i < course.getAllProgramme().getNumberOfEntries() + 1; i++) {
                    System.out.println("\t "+ i + " > " + course.getAllProgramme().getEntry(i));
                }
                int deleteNo = 0;
                deleteNo = courseUI.getDeleteNo(deleteNo);
                
                if (deleteNo >= 1 && deleteNo <= course.getAllProgramme().getNumberOfEntries()) {
                    System.out.println("\t"+course.getAllProgramme().getEntry(deleteNo));
                    course.getAllProgramme().remove(deleteNo);
                    MessageUI.displayProgDeletedMessage();
                } else {
                    MessageUI.displayInvalidNumMessage();
                }
            }else {
            MessageUI.displayRetypeMessage();
        }
        }else{
            MessageUI.displayNoCourseFoundMessage();
        }
            
    }
    
    public static void main(String[] args) {
        new CourseMaintenance().runCourseMenu();
  }
}