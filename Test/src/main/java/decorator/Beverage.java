/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author gsaba
 */
public abstract class Beverage {
    String description = "Unkown Beverage";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();

    @Override
    public String toString() {
        return String.format("%s - Php %,.2f", this.getDescription(), this.cost());
    }
    
    
}
