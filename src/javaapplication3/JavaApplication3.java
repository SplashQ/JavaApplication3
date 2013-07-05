/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author ww
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Aquarium aq = new Aquarium(); //Создать аквариум
           Fish f1 = new Fish("FishName", 20.1, 232.0); //Данные инициализации объектов передавать с помощью конструктора
           Reptile r1 = new Reptile("ReptileName", 100.5, 555.0); 
           aq.addFish(f1);
           aq.addReptile(r1);
           System.out.println("Weight of aquarium with aquarium animals: "+ aq.getWeight() + "\nPrice of aquarium with aquarium animals:  " + aq.getPrice());
    }
}
