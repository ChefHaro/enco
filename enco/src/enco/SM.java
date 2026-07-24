/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enco;

/**
 *
 * @author CSHS-PC105
 */
public class SM  extends Task{

    @Override
    public void setStudentID(String studentID) {
       if(studentID == null || !studentID.matches("\\d{11}")){
           System.out.println("Invalid ID Data, 11 Digits required");setStudentIDValue("Error");
           
       }else{
           setStudentIDValue(studentID);
       }
    }

    @Override
    public String getStudentID() {
       
        return getStudentIDValue();
    }

    @Override
    public void setName(String name) {
          if(name == null || !name.trim().isEmpty()){
          setNameValue("Unkown");
           
       }else{
           setNameValue(name);
       }
        

    }

    @Override
    public String getName() {
        return getNameValue();
    }

    @Override
    public void setStrand(String strand) {
         if(strand == null || !strand.trim().isEmpty()){
          setStrandValue("not assign");
           
       }else{
           setStrandValue(strand);
       }
        
    }

    @Override
    public String getStrand() {

       return getStrandValue();
    }

    @Override
    public void setPrelim(double prelim) {
       if(prelim  >= 0){
          setPrelimValue(prelim);
           
       }else{
           setPrelimValue(prelim);
       }
        
        
    }

    @Override
    public double getPrelim() {
       
        return  getPrelimValue();

    }

    @Override
    public void setMidterm(double midterm) {
        if(midterm  >= 0){
          setMidtermValue(midterm);
           
       }else{
           setMidtermValue(midterm);
       }
        
    }
    

    @Override
    public double getMidterm() {
     
        return  getMidtermValue();
    }

    @Override
    public void setFinals(double finals) {
        if(finals  >= 0){
          setFinalsValue(finals);
           
       }else{
            setFinalsValue(finals);
       }
        
    }

    @Override
    public double getFinals() {
        
        
        return  getFinalsValue();

    }

    @Override
    public void setAbsences(int absences) {
        if(absences  >= 0){
          setAbsencesValue(absences);
           
       }else{
            setAbsencesValue(absences);
       }
    }

    @Override
    public int getAbsences() {
      
        return getAbsencesValue();
    }

    @Override
    public double computeAverage() {
         return (getPrelim() + getMidterm() + getFinals() /3 );

    }

    @Override
    public String getRemarks() {
      if(getAbsences()  >= 10){
         return "failed absent pa more!!!!";
           
       }
      if(computeAverage() >= 75) {
          return "pasado ka broo";
      }
        return "ahhhhhhh bagsak";
    }
    
}
