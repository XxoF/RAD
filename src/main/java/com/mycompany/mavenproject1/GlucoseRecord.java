/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class GlucoseRecord {
    private String PaID;
    private int    LevelGlu;
    private String DateTime;
    private String note;
    
    public GlucoseRecord(String PaID, int LevelGlu, String DateTime, String note){
        this.PaID       = PaID;
        this.LevelGlu   = LevelGlu;
        this.DateTime   = DateTime;
        this.note       = note;
    }
    
    public void setLevelGlu(int LevelGlu){
        this.LevelGlu = LevelGlu;
    }
    
    public int getLevelGlu(){
        return LevelGlu;
    }
    
    public void setDateTime(String DateTime){
        this.DateTime = DateTime;
    }
    
    public String getDateTime(){
        return DateTime;
    }
    
    public void setNote(String note){
        this.note = note;
    }
    
    public String getNote(){
        return note;
    }
    
    public void setPaID(String PaID){
        this.PaID = PaID;
    }
    
    public String getPaID(){
        return PaID;
    }
    
    public static int QuickAlert(int LevelGlu){
        if (LevelGlu < 90){
            return 1;
        }
        
        else if (LevelGlu > 130){
            return 2;
        }
        return 3;
    }
    
    public static int EmergencyAlert(int LevelGlu){
        if (LevelGlu < 70){
            return 1;
        }
        
        if (LevelGlu > 160){
            return 2;
        }
        
        return 3;
    }
}
