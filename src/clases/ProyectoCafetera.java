/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Admin
 */
public class ProyectoCafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera cafeteras[] = new Cafetera[5];
        cafeteras[0] = new Cafetera();
        cafeteras[1] = new Cafetera(2000, 1500);
        cafeteras[2] = new Cafetera(1500);
        cafeteras[3] = new Cafetera(2000, 2000);
        cafeteras[4] = new Cafetera(700);
        
        Cafetera cafe1 = new Cafetera();
        System.out.println(cafe1.toString());
        cafe1.llenarCafetera();
        System.out.println(cafe1.toString());
        cafe1.servirTaza(250);
        System.out.println(cafe1.toString());
        cafe1.agregarCafe(100);
        System.out.println(cafe1.toString());
        cafe1.agregarCafe(300);
        System.out.println(cafe1.toString());
        cafe1.vaciarCafetera();
        System.out.println(cafe1.toString());
        
        /*
        for (Cafetera cafetera : cafeteras) {
            System.out.println(cafetera.toString());
        }
        
        cafeteras[4].servirTaza(300);
        cafeteras[2].llenarCafetera();
        cafeteras[1].agregarCafe(700);
        
        for (Cafetera cafetera : cafeteras) {
            System.out.println(cafetera.toString());
        }
        */
    }
}
