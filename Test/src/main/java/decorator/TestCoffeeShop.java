/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author gsaba
 */
public class TestCoffeeShop {
    public static void main(String []args) {
        Beverage b1 = new Espresso();
        System.out.println(b1);
        
        Beverage b2 = new Espresso();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(b2);
        
        Beverage b3 = new HouseBlend();
        b3 = new Mocha(b3);
        b3 = new Whip(b3);
        System.out.println(b3);
    }
}
