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
public class JavaClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calling Old Factory");
        FastFoodFactory old_res1 = new FastFoodFactory();
        old_res1.getFastFood("sandwich").serve();
        System.out.println("");        
        System.out.println("Calling every Restaurant");
        System.out.println("");
        System.out.println("Restaurant 1:");
        Restaurant1Factory factory_res1 = new Restaurant1Factory();
        factory_res1.getFastFood("hamburger").serve();
        factory_res1.getDrink("soda").pour();
        System.out.println("Restaurant 2:");
        Restaurant2Factory factory_res2 = new Restaurant2Factory();
        factory_res2.getFastFood("pizza").serve();
        factory_res2.getDrink("beer").pour();
        System.out.println("");
        System.out.println("Using Restaurant Factory Producer");
        System.out.println("");
        System.out.println("Restaurant 1:");
        RestaurantFactoryProducer factory_prod_res1 = new RestaurantFactoryProducer();
        factory_prod_res1.getRestaurantAbstractFactory(1).getFastFood("hot dog").serve();
        factory_prod_res1.getRestaurantAbstractFactory(1).getDrink("soda").pour();
        System.out.println("Restaurant 2:");
        RestaurantFactoryProducer factory_prod_res2 = new RestaurantFactoryProducer();
        factory_prod_res2.getRestaurantAbstractFactory(2).getFastFood("pizza").serve();
        factory_prod_res2.getRestaurantAbstractFactory(2).getDrink("juice").pour();
                
    }
    
}
