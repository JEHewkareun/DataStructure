/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boundary;
import Entity.*;
import adt.ArrayList;
import adt.ListInterface;
import java.util.Scanner;
/**
 *
 * @author kaon
 */
public class ProgrammeMaintenanceUI {
    Scanner scanner = new Scanner(System.in);
    private ListInterface<Programme> programmeList = new ArrayList<>();
    
    public String addProgrammeToCourse(String courseCode){
        System.out.println("\n\n");
        System.out.println("\t ------------------------");
        System.out.println("\t Add Programme To Course");
        System.out.println("\t ------------------------");
        
        System.out.print("\t Enter Course Code to Add Programme to Course: ");
        courseCode = scanner.nextLine();
        
        return courseCode;
    } 
    
    public String addTheProgramme(String programmeCode){
        System.out.print("\t Enter Programme Code : ");
        programmeCode = scanner.nextLine();
        
        return programmeCode;
    }
    
    public Programme addProgramme(String programmeCode){

        System.out.print("\t Enter Programme Name: ");
        String programmeName = scanner.nextLine();
        
       //Declare object
        Programme programme = new Programme(programmeCode, programmeName);
        //add new programme into programmelist
        programmeList.add(programme);
        return programme;
        
    }
    
    public String deleteProgrammeFromCourse(String courseCode){
        
        System.out.println("\n\n");
        System.out.println("\t ----------------------------");
        System.out.println("\t Delete Programme from Course");
        System.out.println("\t ----------------------------");
        System.out.print("\t Enter Course Code : ");
        courseCode = scanner.nextLine();
        
        return courseCode;
        
    }
    
     
}
