/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enco;

/**
 *
 * @author Dell_PC
 */
public abstract class Task {
   // Private variables
    private String studentID;
    private String name;
    private String strand;
    private double prelim;
    private double midterm;
    private double finals;
    private int absences;
    
     // ===== Student ID =====
    public abstract void setStudentID(String studentID);
    public abstract String getStudentID();
      // ===== Name =====
    public abstract void setName(String name);
    public abstract String getName();

    // ===== Strand =====
    public abstract void setStrand(String strand);
    public abstract String getStrand();

    // ===== Prelim =====
    public abstract void setPrelim(double prelim);
    public abstract double getPrelim();

    // ===== Midterm =====
    public abstract void setMidterm(double midterm);
    public abstract double getMidterm();

    // ===== Finals =====
    public abstract void setFinals(double finals);
    public abstract double getFinals();

    // ===== Absences =====
    public abstract void setAbsences(int absences);
    public abstract int getAbsences();

    
     // ===== Other Methods =====
    public abstract double computeAverage();
    public abstract String getRemarks();
    
    
      // Protected methods for subclasses
    protected void setStudentIDValue(String studentID) {
        this.studentID = studentID;
    }

     protected String getStudentIDValue() {
        return studentID;
    }
     
   protected void setNameValue(String name) {
        this.name = name;
    }

    protected String getNameValue() {
        return name;
    }

    protected void setStrandValue(String strand) {
        this.strand = strand;
    }

    protected String getStrandValue() {
        return strand;
    }

    protected void setPrelimValue(double prelim) {
        this.prelim = prelim;
    }

    protected double getPrelimValue() {
        return prelim;
    }

    protected void setMidtermValue(double midterm) {
        this.midterm = midterm;
    }

    protected double getMidtermValue() {
        return midterm;
    }

    protected void setFinalsValue(double finals) {
        this.finals = finals;
    }

    protected double getFinalsValue() {
        return finals;
    }

    protected void setAbsencesValue(int absences) {
        this.absences = absences;
    }

    protected int getAbsencesValue() {
        return absences;
    }  
     
     
     
    
}
