/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dkjconstruction.equip;

/**
 *
 * @author VINUSH
 */
public class EquipmentDetail {
    


   // private String equipID;
    private String name;
    private String cost;
    private double totalCost;
    private String count;
   private int assignedCount;
   
    

     public EquipmentDetail( String name,String count,String cost,double totalCost,int assignedCount) {
      //  this.equipID = equipID;
        this.name = name;
        this.count=count;
        this.cost = cost;
        this.totalCost = totalCost;
        this.assignedCount=assignedCount;
        
    }

    

     


    

    public String getName() {return name; }

    public void setName(String name) { this.name = name; }

  
    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
    
     public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
    
    
    public String getCount() {
        return count;
    }

    public void setCount(String lifeTime) {
        this.count = count;
    }
    
    
    public int getAssignedCount() {
        return assignedCount;
    }

    public void setAssignedCount(int assignedCount) {
         this.assignedCount=assignedCount;
    }   

 }

