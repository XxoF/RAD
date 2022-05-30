/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class MedicalPersonnal {
    private String MPID;
    private String MPName;
    
    public MedicalPersonnal(String MPID, String MPName){
        this.MPID   = MPID;
        this.MPName = MPName;
    }
    
    public void setMPID(String MPID){
        this.MPID = MPID;
    }
    
    public String getMPID(){
        return MPID;
    }
    
    public void setMPName(String MPName){
        this.MPName = MPName;
    }
    
    public String getMPName(){
        return MPName;
    }
}
