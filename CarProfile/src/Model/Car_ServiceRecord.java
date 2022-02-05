/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Pavithra Ramkumar
 */
public class Car_ServiceRecord {
    private ArrayList<ServiceDetails> history;
    
    public Car_ServiceRecord(){
        
       this.history = new ArrayList<ServiceDetails>();
       
        
    }

    public ArrayList<ServiceDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<ServiceDetails> history) {
        this.history = history;
    }
    
    public ServiceDetails addnewRecord(){
        ServiceDetails newRecord = new ServiceDetails();
        history.add(newRecord);
        return newRecord;
        
    }
    
}
