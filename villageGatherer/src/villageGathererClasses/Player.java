/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villageGathererClasses;

/**
 *
 * @author rifatbhuiyan
 */
public class Player extends T1Item{                      // superclass is T1Item and it is subclass 
    
    public String[] endMessage;
    private int playerIteamCount;
    private static String  userName;
    private int userEnergyLevel; 
    private int HungerLevel = 100;               // maybe we need this one the UMI 

                                                    
    
    Player(){
    	
        this.userEnergyLevel = 0;
        this.HungerLevel = 50;
        this.userName = "";
        System.out.println("Player!");
    }
    
    public void setuserName(String userName){
        
        this.userName = userName;         //instead of this we could use the class name because of static.
        
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
        endMessage[playerIteamCount]= a.getDescription();
        playerIteamCount++;
    }
    
    public boolean hasIteam(T1Item a){
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
