/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Assignment3Builder;

/**
 *
 * @author mahir
 */
public interface BurgerBuilder {
    public void buildBun(String bun);
    public void buildCheese(int cheese_slices);
    public void buildPatty(String patty);
    public void buildSauce(String sauce);
    public void buildLettuce(boolean lettuce);
    public void buildOnion(boolean onion);
    
    public String getBun();
    
    public int getCheeseSlices();
    public String getPatty();
    public String getSauce();
    public boolean getLettuce();
    public boolean getOnion();
    
    public Burger getBurger();
    
}
