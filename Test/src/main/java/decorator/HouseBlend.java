/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author gsaba
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }
    
    @Override
    public double cost() {
        return 120;
    }
    
}
