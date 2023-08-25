/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import adt.ArrayList;
import adt.ListInterface;

/**
 *
 * @author kaon
 */
public class Course {
    // declare the course variables and link to programme interface
    private String courseCode;
    private String courseName;
    private ListInterface<Programme> courseProgramme;
    
  public Course(){
      this.courseCode = null;
      this.courseName = null;
      this.courseProgramme = new ArrayList<>();
           }
    
    public Course(String courseCode,String courseName){
    this.courseCode = courseCode;
    this.courseName = courseName;
    this.courseProgramme = new ArrayList<>();
    }

    public Course(String courseCode) {
         this.courseCode = courseCode;
         this.courseProgramme = new ArrayList<>();
    }
    public Course(String courseCode, String courseName, ListInterface<Programme> programme) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseProgramme = programme;
    }

    // getter and setter the course variables
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
 
   
    public ListInterface<Programme> getAllProgramme() {
        return courseProgramme;
    }
    
    public void addProgrammeToCourse(Programme programme) {
        courseProgramme.add(programme);
    }
    
    
     @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        final Course other = (Course) object;

        if (!(this.courseCode.equals(other.courseCode))) {
            return false;
        }

        return true;
    }
   @Override
    public String toString(){
        return String.format(" Course Code : %-12s   Course Name : %-30s\n", courseCode, courseName);
    } 
}
