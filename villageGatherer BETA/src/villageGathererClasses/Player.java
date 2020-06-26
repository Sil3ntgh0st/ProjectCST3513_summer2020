/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villageGathererClasses;

import villageGathererGUI.villageMainMenu;

/**
 *
 * @author rifatbhuiyan
 */
public class Player {                      // superclass is T1Item and it is subclass 
    
    public String[] endMessage;
    private int playerItemCount;
    public static String userName;
    public static int userEnergyLevel; 
    private int HungerLevel = 100;               // maybe we need this one the UMI 

                                              
    
    public Player(){
    	
        userName = "";
        Player.userEnergyLevel = 0;
        this.HungerLevel = 50;
        System.out.println("Player with no name!");
    }
    
    public Player(String u) {
    	
    	userName = u;
    	Player.userEnergyLevel = 0;
        this.HungerLevel = 50;
        System.out.println("Player new name!");
    	
    }
    
    public void setUserName(String u){
        
        userName = u;   //instead of this we could use the class name because of static.
        
    }
    
    public static String getUserName(){
        
        return userName;
        
    }
    
    public void getHungerLevel(){
        System.out.println(HungerLevel - userEnergyLevel );           
        
    }
    
    
    public int updateHungerLevel(){                       
                                                                            
        HungerLevel++;                     
        return HungerLevel;
       
    }
    
    public void EnergylowAlert(){
        if (userEnergyLevel <25 ){
            System.out.println("Engery level at 25");
        }
   
    }
   
    
    public void pickUp(T1Item a){
        endMessage[playerItemCount]= a.getDescription();
        playerItemCount++;
    }
    
    public boolean hasIteam(T1Item a){
          int b = 0;
          for (int i = 0 ; i<userEnergyLevel;i++)
          if (a.getDescription()==endMessage[userEnergyLevel]){
              b=0;
              
          }
          else {
              b = 1;
          } 
           
          if(b==1){
              return true; 
          }
          else{
              return false;
          }
          
          
    }
    
//    public String showMyThings(){
//        
//        return craft();                     
//        
//    }
    
//    public int numItemsCarried(){
//        return getCount();          // calling method from the iteam class
//        
//    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
}
