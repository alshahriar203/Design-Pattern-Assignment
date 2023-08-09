/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1SOLID;

/**
 *
 * @author mahir
 */
public abstract class User {
    protected Equipment equipment;
    protected int str; 
    protected int cardio;
    
    public User(int str, int cardio){
        this.str=str;
        this.cardio=cardio;
        this.equipment=null;
    }
    
    public void pick(Equipment equipment){
        this.equipment=equipment;
    }
    public abstract int getStr();
    public abstract int getCardio();
    public abstract void gainStr(int amount);
    public abstract void gainCardio(int amount);
    public abstract void workout();
}
