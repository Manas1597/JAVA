/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inhertiance;

/**
 *
 * @author manas
 */
public class Inhertiance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        car ertiga = new car("petrol" , "ertiga" , 150);
        System.out.println("brand name " + ertiga.getBrand());
        System.out.println("Enginetype " + ertiga.getEnginetype());
        System.out.println("top speed " + ertiga.speed);
        
        bike pulsar = new bike(  250, "ertiga" , 150);
        System.out.println("brand name " + pulsar.getBrand());
        System.out.println("CC " + pulsar.cubic_centimeters);
        System.out.println("top speed " + pulsar.speed);
        
    }
    
}
