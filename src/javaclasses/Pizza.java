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
public class Pizza implements FastFood{
    @Override public void prepareIngredients(){};
    @Override public void cook(){};
    @Override public void serve(){
        System.out.println("I'm pizza! yum");
    }; 
}
