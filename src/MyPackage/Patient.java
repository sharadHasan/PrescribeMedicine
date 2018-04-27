package MyPackage;

public class Patient {
    int id;
    String patientName;
    String medicine1;
    String medicine2;
    String dose1;
    String dose2;
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setPatientName(String patientName){
        this.patientName = patientName;
    }
    
    public void setMedicine1(String medicine1){
        this.medicine1 = medicine1;
    }
    
    public void setMedicine2(String medicine2){
        this.medicine2 = medicine1;
    }
    
    public void setDose1(String dose1){
        this.dose1 = dose1;
    }
    
    public void setDose2(String dose2){
        this.dose2 = dose2;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getPatientName(){
        return this.patientName;
    }
    
    public String getMedicine1(){
        return this.medicine1;
    }
    
    public String getMedicine2(){
        return this.medicine2;
    }
    
    public String getDose1(){
        return this.dose1;
    }
    
    public String getDose2(){
        return this.dose2;
    }
}
