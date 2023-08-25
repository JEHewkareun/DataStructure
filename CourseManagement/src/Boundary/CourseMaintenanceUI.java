/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary;
import Entity.Course;
import java.util.Scanner;
/**
 *
 * @author kaon
 */
public class CourseMaintenanceUI {
    Scanner scanner = new Scanner(System.in);
    
    //Diaplay the Course Management Menu
    public String getDisplayCourseManagementMenu(){
        System.out.println("\n");
        System.out.println("\t+---------------------------------------------+");
        System.out.println("\t|  Welcome To Course Management Subsystem ><  |");
        System.out.println("\t+---------------------------------------------+");
        System.out.println("\t|   Enter 1 : Add New Courses                 |");
        System.out.println("\t|   Enter 2 : Remove the Courses              |");
        System.out.println("\t|   Enter 3 : Find the Courses                |");
        System.out.println("\t|   Enter 4 : Amend the Courses               |");
        System.out.println("\t|   Enter 5 : Display the Courses             |");
        System.out.println("\t|   Enter 6 : Add Programme To Course         |");
        System.out.println("\t|   Enter 7 : Remove Programme From Courses   |");
        System.out.println("\t|   Enter 0 : Exit Program                    |");
        System.out.println("\t+---------------------------------------------+");
        System.out.print("\t   Please Enter Your Option : ");
        String option = scanner.next();
        scanner.nextLine();
        
        return option;
    }
    
    //Add course details
   public Course inputCourseDetails(){
       System.out.println("\n\n");
        //add order module title
        System.out.println("\t +------------------+");
        System.out.println("\t |  Add New Course  |");
        System.out.println("\t +------------------+");
      
        System.out.print("\t Please enter the Course Code  : ");
        String courseCode = scanner.nextLine();
        
        System.out.print("\t Please enter the Course Name : ");
        String courseName = scanner.nextLine();

        return new Course(courseCode,courseName);
   }
   
   //Delete the course
   public void deleteTheCourse(){
        System.out.println("\n\n");
        System.out.println("\t +---------------+");
        System.out.println("\t | Delete Course |");
        System.out.println("\t +---------------+");
   }
   
   //Enter the number to delete the course
   public int getDeleteNo(int deleteNo){
        System.out.print("\n\t Enter the number to delete: ");
        deleteNo = scanner.nextInt();
        scanner.nextLine();
        
        return deleteNo;
   }
   
   //Find the course
   public String findTheCourse(String courseCode){
        System.out.println("\n\n");
        System.out.println("\t +-------------+");
        System.out.println("\t | Find Course |");
        System.out.println("\t +-------------+");
        System.out.print("\t Enter Course Code to find the course : ");
        courseCode = scanner.nextLine();
        
        return courseCode;
   }
   
   //Amend the course
   public void amendTheCourse(){
        System.out.println("\n\n");
        System.out.println("\t +--------------+");
        System.out.println("\t | Amend Course |");
        System.out.println("\t +--------------+");
   }
   
   //Enter the number to amend the course
   public int getAmendNo(int amendNo){
        System.out.print("\n\t Enter the number to amend: ");
        amendNo = scanner.nextInt();
        scanner.nextLine();
        
        return amendNo;
   }
   
   public String modifyCourse(String courseCode){
       
       System.out.print("\t Enter new Course Code        : ");
       courseCode = scanner.nextLine();
       
       return courseCode;
   }
   public Course modifyTheCourse(String courseCode){
        System.out.print("\t Enter new Course Name        : ");
        String courseName = scanner.nextLine();
        
        Course course = new Course(courseCode, courseName);
        
        return course;
        
    }
   
   //Display the course
   public void displayTheCourse() {
        System.out.println("\n\n");
        System.out.println("\t +----------------------+");
        System.out.println("\t |  Display All Courses |");
        System.out.println("\t +----------------------+");
  }
   
}
