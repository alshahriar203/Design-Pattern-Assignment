/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment3Builder;

/**
 *
 * @author mahir
 */
public class Burger {
    private final String bun;
    private final int cheese_slices;
    private final String patty;
    private final String sauce;
    private final boolean lettuce;
    private final boolean onion;
    
    public Burger(BurgerBuilder builder){
        this.bun=builder.getBun();
        this.cheese_slices=builder.getCheeseSlices();
        this.patty=builder.getPatty();
        this.sauce=builder.getSauce();
        this.lettuce=builder.getLettuce();
        this.onion=builder.getOnion();
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
    public boolean isLettuce(){
        return lettuce;
    }
    public boolean isOnion(){
        return onion;
    }
    
    
}
