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
    
    public String getDisplayCourseManagementMenu(){
        System.out.println("\n");
        System.out.println("\t----------------------------------------");
        System.out.println("\t Welcome To Course Management Subsystem");
        System.out.println("\t----------------------------------------");
        System.out.println("\t   Press 1 : Add New Courses ");
        System.out.println("\t   Press 2 : Remove Courses ");
        System.out.println("\t   Press 3 : Find Courses ");
        System.out.println("\t   Press 4 : Amend Courses ");
        System.out.println("\t   Press 5 : Display Courses");
        System.out.println("\t   Press 6 : Add Programme To Course");
        System.out.println("\t   Press 7 : Remove Programme From Courses ");
        System.out.println("\t   Press 0 : End ");
        System.out.print("\t   Please Enter Your Choice : ");
        String choice = scanner.next();
        scanner.nextLine();//buffer
        
        return choice;
    }
   public Course inputCourseDetails(){
       System.out.println("\n\n");
        //add order module title
        System.out.println("\t ----------------");
        System.out.println("\t Add New Course");
        System.out.println("\t ----------------");
      
        System.out.print("\t Please enter Course Code  : ");
        String cCode = scanner.nextLine();
        
        System.out.print("\t Please enter Course Name : ");
        String cName = scanner.nextLine();

        return new Course(cCode,cName);
   }
   
   public void deleteTheCourse(){
        System.out.println("\n\n");
        System.out.println("\t -------------");
        System.out.println("\t Delete Course");
        System.out.println("\t -------------");
   }
                     
   public int getDeleteNo(int deleteNo){
        System.out.print("\n\t Enter the number to delete: ");
        deleteNo = scanner.nextInt();
        scanner.nextLine();
        
        return deleteNo;
   }
   
   public String findTheCourse(String cCode){
        System.out.println("\n\n");
        System.out.println("\t -----------");
        System.out.println("\t Find Course");
        System.out.println("\t -----------");
        System.out.print("\t Enter Course Code : ");
        cCode = scanner.nextLine();
        
        return cCode;
   }
   public void amendTheCourse(){
        System.out.println("\n\n");
        System.out.println("\t ------------");
        System.out.println("\t Amend Course");
        System.out.println("\t ------------");
   }
   
   public int getAmendNo(int amendNo){
        System.out.print("\n\t Enter the number to delete: ");
        amendNo = scanner.nextInt();
        scanner.nextLine();
        
        return amendNo;
   }
   
   public String modifyCourse(String cCode){
       
       System.out.print("\t Enter new Course Code        : ");
       cCode = scanner.nextLine();
       
       return cCode;
   }
   public Course modifyTheCourse(String cCode){
        System.out.print("\t Enter new Course Name        : ");
        String cName = scanner.nextLine();
        
        //Declare object
        Course cr = new Course(cCode, cName);

        //courseList.add(cr);
        
        return cr;
        
    }
   public void displayTheCourse() {
        System.out.println("\n\n");
        System.out.println("\t --------------------");
        System.out.println("\t Display All Courses");
        System.out.println("\t --------------------");
  }
   
}
