/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class Physician {
    private String PyID;
    private String PyName;
    
    public Physician(String PyID, String PyName){
        this.PyID   = PyID;
        this.PyName = PyName;
    }
    
    public void setPyID(String PyID){
        this.PyID = PyID;
    }
    
    public String getPyID(){
        return PyID;
    }
    
    public void setPyName(String PyName){
        this.PyName = PyName;
    }
    
    public String getPyName(){
        return PyName;
    }    
}
