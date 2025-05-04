public class ParkingSpot{
    int size;
    VehicleTypes vehicleType;
    boolean available;

    public ParkingSpot(int s, VehicleTypes vt){
        size = s;
        vehicleType = vt;
        available = true;
    }

    // getters
    
    public int getSize(){
        return size;
    }

    public void bookSpot(){
        available = !available;
    }

    public boolean isAvailable(){
        return available;
    }

    public VehicleTypes getVehicleType(){
        return vehicleType;
    }
}
