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
    public void addReptile(Animal a){
       price += a.getPrice();
       weight += a.getWeight();
    }
    public void addFish(Animal a){
        price += a.getPrice();
        weight += a.getWeight();
    }
     public double getWeight() {
      return weight;
    }
     public double getPrice() {
      return price;
    }
}
