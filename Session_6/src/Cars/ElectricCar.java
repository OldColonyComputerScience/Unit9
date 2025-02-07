package Cars;

public class ElectricCar extends Car
{
    // Complete the constructor
    public ElectricCar(String model, int batteryLevel){
        super(model, batteryLevel);
    }

    // Override getFuelLevel
    // Reinterprets fuelLevel as a percentage
    // Remember super.getFuelLevel will return fuelLevel!
    @Override
    public double getFuelLevel(){
        return super.getFuelLevel() / 100.0;
    }

    // Override milesLeft
    // Computes miles left by interpreting fuelLevel as a percentage
    @Override
    public double milesLeft(double milesPerCharge){
        return getFuelLevel() * milesPerCharge;
    }

    // Override toString
    // Should print: model electric car
    @Override
    public String toString(){
        return super.getModel() + " electric car";
    }
}
