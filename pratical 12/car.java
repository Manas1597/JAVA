/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inhertiance;

/**
 *
 * @author manas
 */
public class car extends vehicle {
    
    public String Enginetype;
    
    
    
    
    
    
  

    public car(String Enginetype, String brand, int speed) {
        super(brand, speed);
        this.Enginetype = Enginetype;
    }

    public String getEnginetype() {
        return Enginetype;
    }

    public void setEnginetype(String Enginetype) {
        this.Enginetype = Enginetype;
    }
    
    
}
