/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automobiledealer.Model.Vehicle;

/**
 *
 * @author AkbarFauzy
 */
public class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(String _registrationNumber, String _name, String _brand, String _color, int _numWheel, double _weight, int _numDoors, String _transmission, int _price, String _fuelType, int _horsePower, String _status, int _loadCapacity) {
        super(_registrationNumber, _name, _brand, _color, _numWheel, _weight, _numDoors, _transmission, _price, _fuelType, _horsePower, _status);
        this.loadCapacity = _loadCapacity;
    }


    public void setLoadCapacity(int loadCapacity){
        this.loadCapacity = loadCapacity;
    }
    
    public double getLoadCapacity(){
        return this.loadCapacity;
    }


}
