/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1SOLID;

/**
 *
 * @author mahir
 */
public class ElectronicBarbell extends Barbell {
    @Override
    public void lift(User usr, int times){
        for(int i=0; i<times; i++){
            usr.gainStr(2);
            Display(i+1);
        }
    }
    public void Display(int num){
        System.out.println(num);
    }
}
