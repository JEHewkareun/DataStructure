/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

/**
 *
 * @author kaon
 */
public class MessageUI {
    
    // if the number invalid will display the Invalid Number Message
    public static void displayInvalidNumMessage() {
        System.out.println("\n\t\t --- INVALID NUMBER ! Please Enter Again ---");
    }
    
    // if the user enter the number to exit will show the Exit Program Message
    public static void displayExitMessage() {
        System.out.println("\n --- Bye Bye ! Exit the Program ---");
    }
    
    // if the user enter invalid number , the system will show the message ask for enter again
    public static void displayRetypeMessage() {
        System.out.println("\n\t\t Opps! Please Enter Again ......");
    }
    
    // if the course added completely will show the message Course Added Successfully
    public static void displayCourseAddedMessage(){
        System.out.println("\n\t\t--- Nice! Added Course Successfully ---\n");
    }
    
    // if the course already added and the user add again will display the course exists message 
    public static void displayCourseExistMessage(){
        System.out.println("\n\t\t--- Exists Course !---\n");
    }
    
    // if the course deleted successfully , will show the course deleted message
    public static void displayCourseDeletedMessage(){
        System.out.println("\n\t\t --- Ok! Deleted Course Successfully ---");
    }
    
    // if the course modified successfullt , will show the course modified successfully
    public static void displayCourseModifiedMessage(){
        System.out.println("\n\t\t --- Good! Modified Course Successfully ! ---");
    }
    
    // if the user search the course that no exists at the system , the system will show the No Course Found message
    public static void displayNoCourseFoundMessage(){
        System.out.println("\n\t\t --- No Course Found ! Please add new Course ---");
    }
    
    // if the user delete the programme successfully, the system will show the programme deleted successfully message
    public static void displayProgDeletedMessage(){
        System.out.println("\n\t\t --- Ok! Deleted Programme Successfully ! ---");
    }
    
    // if the user add programme successfullt, the system will show the programme added successfully message 
    public static void displayProgAddedMessage(){
        System.out.println("\n\t\t--- Nice! Added Programme Successfully !---\n");
    }
            
}
