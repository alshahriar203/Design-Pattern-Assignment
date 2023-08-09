/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment3Builder;

/**
 *
 * @author mahir
 */
public class ConcreteBurgerBuilder implements BurgerBuilder {
    private String bun;
    private int cheese_slices;
    private String patty;
    private String sauce;
    private boolean lettuce;
    private boolean onion;
    public void buildBun(String bun){
        this.bun=bun;
    }
    public void buildCheese(int cheese_slices){
        this.cheese_slices=cheese_slices;
    }
    public void buildPatty(String patty){
        this.patty=patty;
    }
    public void buildSauce(String sauce){
        this.sauce=sauce;
    }
    public void buildLettuce(boolean lettuce){
        this.lettuce=lettuce;
    }
    public void buildOnion(boolean onion){
        this.onion=onion;
    }
    
    public String getBun(){
        return bun;
    }
    public int getCheeseSlices(){
        return cheese_slices;
    }
    public String getPatty(){
        return patty;
    }
    public String getSauce(){
        return sauce;
    }
    public boolean getLettuce(){
        return lettuce;
    }
    public boolean getOnion(){
        return onion;
    }
    
    public Burger getBurger(){
        return new Burger(this);
    }
}
