/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1SOLID;
import java.util.*;
/**
 *
 * @author mahir
 */
public class Barbell implements Liftable{
  
    public void work(User usr){
        if(usr.getStr()<3){
            System.out.println("too weak!!");
        }
        else{
            lift(usr, getReps());
        }
    }
    
    public void lift(User usr, int times){
        for(int i=0; i<times; i++){
            usr.gainStr(1);
        }
    }
    
    public int getReps(){
       return 3;
   }
}
