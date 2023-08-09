/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1SOLID;

/**
 *
 * @author mahir
 */
public class Gym {
    public static void main(String args[]){
        User usr=new Man(3,0);
        Equipment eq= new Barbell();
        usr.pick(eq);
        usr.workout();
        System.out.println(usr.getStr());
        System.out.println();
        
        eq=new ElectronicBarbell();
        usr.pick(eq);
        usr.workout();
        System.out.println(usr.getStr());
    }
}
