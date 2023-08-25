/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author kaon
 */
public class Programme {
    // declare the programme variables
    private String programmeCode;
    private String programmeName;
    
    public Programme() {
        programmeCode = null;
        programmeName = null;
    }
    
    public Programme(String Code) {
        programmeCode = Code;
        this.programmeName = null;
    }
     public Programme(String programmeCode, String programmeName) {
        this.programmeCode = programmeCode;
        this.programmeName = programmeName;
    }
     
    // getter and setter the programme variables
    public String getProgrammeCode() {
        return programmeCode;
    }

    public void setProgrammeCode(String programmeCode) {
        this.programmeCode = programmeCode;
    }

    public String getProgrammeName() {
        return programmeName;
    }

    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName;
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

        final Programme other = (Programme) object;

        if (this.programmeCode != other.programmeCode) {
            return false;
        }

        return true;
    }
    
    @Override
    public String toString(){
        return String.format(" Programme Code : %-15s   Programme Name : %-32s\n", programmeCode, programmeName);
    }
}
