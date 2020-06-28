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
public class Player {                      // superclass is T1Item and it is subclass 
    
    public String[] endMessage;
    public static String userName;
    public static int userEnergyLevel = 100;               // maybe we need this one the UMI 

                                              
    
    public Player(){
    	
        userName = "";
        userEnergyLevel = 100;
        System.out.println("Player with no name!");
    }
    
    public Player(String u) {
    	
    	Player.userName = u;
    	userEnergyLevel = 100;
        System.out.println("Player new name!");
    	
    }
    
    public static void setUserName(String u){
        
    	Player.userName = u;   //instead of this we could use the class name because of static.
        
    }
    
    public static String getUserName(){
        
        return Player.userName;
        
    }
    
    public static int getEnergyLevel() {
    	
		return Player.userEnergyLevel;
    	
    }
    
    
    public static void updateEnergyLevel(int e){
    	Player.userEnergyLevel = e;
        
    }
    
    public void EnergylowAlert(){
        if (userEnergyLevel <25 ){
            System.out.println("Engery level at 25");
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
