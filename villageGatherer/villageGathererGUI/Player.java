/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author rifatbhuiyan
 */
public class Player extends Iteam{                      // superclass is iteam and it is subclass 
    
    public String[] endMessage;
    private int playerIteamCount;
    private static String  userName;
    private int userEnergyLevel; 
    private int HungerLevel = 100;               // maybe we need this one the UMI 

                                                    
    
    Player(){
        
        System.out.println("Player!");
    }
    
    public void setuserName(String userName){
        
        this.userName = userName;         //insted of this we could use the class name because of static.
        
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
   
    
    public void pickUp(Iteam a){
        endMessage[playerIteamCount]= a.getDescription();
        playerIteamCount++;
    }
    
    public boolean hasIteam(Iteam a){
          int b = 0;
          for (int i = 0 ; i< userEnegery;i++)
          if (a.getDescription()==endMeassage[userEnergyLevel]){
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
    
    public String showMyThings(){
        
        return craft();                     
        
    }
    
    public int numItemsCarried(){
        return getCount();          // calling method from the iteam class
        
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
}
