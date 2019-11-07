/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan53.rabbit;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan tentang rabbit
 */
public class PBO210118048Latihan53Rabbit {

    public static void main(String[] args) {
        
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is " + rabbit.getName() + 
                "\n" + rabbit.getName() +" is Vegetarian? " + rabbit.isVegetarian() +
                "\n" + rabbit.getName() +" eats " + rabbit.getEats() +
                "\n" + rabbit.getName() +" has " + rabbit.getNoOfLegs() +" legs." +
                "\n" + rabbit.getName() +" color is " + rabbit.getColor()
        );
    }

}
