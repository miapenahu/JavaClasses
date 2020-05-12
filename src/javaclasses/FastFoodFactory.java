/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasses;

/**
 *
 * @author Miguel Alejandro
 */

//Esto fue antes de implementar el RestaurantAbstractFactory
public class FastFoodFactory {
    public FastFood getFastFood(String type){
    switch (type){
        case "hamburger": return new Hamburger();
        case "sandwich": return new Sandwich();
        case "hot dog": return new HotDog();
        default: return null;
    }
}
}
