/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inhertiance;

/**
 *
 * @author manas
 */
public class bike extends vehicle {
    
    public int cubic_centimeters;

    public bike(int cubic_centimeters, String brand, int speed) {
        super(brand, speed);
        this.cubic_centimeters = cubic_centimeters;
    }

    public int getCubic_centimeters() {
        return cubic_centimeters;
    }

    public void setCubic_centimeters(int cubic_centimeters) {
        this.cubic_centimeters = cubic_centimeters;
    }
}
