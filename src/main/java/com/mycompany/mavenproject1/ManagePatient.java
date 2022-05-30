/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class ManagePatient {
    private String PID;
    private String MPID;
    private String Message;
    
    public ManagePatient(String PID, String MPID, String Message){
        this.PID = PID;
        this.MPID = MPID;
        this.Message = Message;
    }
    
    public void AddMessage(String Mess){
        this.Message = Mess;
    }
    
    public String getMessage(){
        return this.Message;
    }
}
