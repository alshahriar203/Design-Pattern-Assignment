/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment3Builder;

/**
 *
 * @author mahir
 */
public class Client {
    public static void DisplayBurger(Burger burger){
       System.out.println(burger.getBun()+" bun");
       System.out.println(burger.getPatty()+ " patty");
       System.out.println(burger.getCheeseSlices()+ " slices of cheese");
       System.out.println(burger.getSauce()+" Sauce");
       
       if(burger.isLettuce()==true){
           System.out.println("with lettuce");
       }
       else{
           System.out.println("without lettuce");
       }
       if(burger.isOnion()==true){
           System.out.println("with onion");
       }
       else{
           System.out.println("without onion");
       }
    }
    
    public static void main(String args[]){
        BurgerBuilder builder= new ConcreteBurgerBuilder();
        builder.buildBun("Brioche");
        builder.buildCheese(1);
        builder.buildPatty("Beef");
        builder.buildSauce("Naga");
        builder.buildLettuce(true);
        builder.buildOnion(false);
        
        Burger burger= builder.getBurger();
        DisplayBurger(burger);
        
    }
}
