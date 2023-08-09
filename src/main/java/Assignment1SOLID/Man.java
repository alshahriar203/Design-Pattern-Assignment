/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1SOLID;

/**
 *
 * @author mahir
 */
public class Man extends User {
        
    private final int t_level=2; //testosterone level
    
    public Man(int str, int cardio){
        super(str, cardio);
    }
    
    public int getStr(){
        return str;
    }
    public int getCardio(){
        return cardio;
    }
    public void workout(){

        if(equipment!=null) equipment.work(this);
       
    }
    
    public void gainStr(int amount){
        str+=amount*t_level;
    }
    
    public void gainCardio(int amount){
        cardio+=amount*t_level;
    }
    
}
