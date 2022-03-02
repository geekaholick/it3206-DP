/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design1;

/**
 *
 * @author gsaba
 */
public class TestMain {
    public static void main(String []args) {
        Duck d = new DecoyDuck();
        System.out.println("Decoy Duck");
        d.performFly();
        d.performQuack();
        
        d = new RubberDuck(new FlyNoWay(), new Squeak());
        System.out.println("Rubber Duck");
        d.performFly();
        d.performQuack();
        
        d = new MarbledDuck(new FlyLow(), new Quack());
        System.out.println("Marbled Duck");
        d.performFly();
        d.performQuack();
    }
}
