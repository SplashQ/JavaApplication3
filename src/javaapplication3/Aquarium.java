/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author ww
 */
public class Aquarium {
    private double weight = 0;
    private double price = 0;
    public void addReptile(Reptile r){
       price += r.getPrice();
       weight += r.getWeight();
    }
    public void addFish(Fish f){
        price += f.getPrice();
        weight += f.getWeight();
    }
     public double getWeight() {
      return weight;
    }
     public double getPrice() {
      return price;
    }
}
