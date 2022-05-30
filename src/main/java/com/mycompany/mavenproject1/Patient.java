/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class Patient {
    private String PID;
    private String Name;
    private String Gender;
    private String DayOfBirth;
    
    public Patient(String PID, String Name, String Gender, String DayOfBirth) {
    this.PID        = PID;
    this.Name       = Name;
    this.Gender     = Gender;
    this.DayOfBirth = DayOfBirth;
    }
    
    public void setPID(String PID){
        this.PID = PID;
    }
    
    public String getPID(){
        return PID;
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public String getName(){
        return Name;
    }

    public void setGender(String Gender){
        this.Gender = Gender;
    }
    
    public String getGender(){
        return Gender;
    }
    
    public void setDayOfBirth(String DayOfBirth){
        this.DayOfBirth = DayOfBirth;
    }
    
    public String getDayOfBirth(){
        return DayOfBirth;
    }
}
