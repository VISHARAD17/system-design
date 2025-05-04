import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<Level> allLevels;

    public ParkingLot(){
        allLevels = new ArrayList<>();
        allLevels.add(new Level(1));
        allLevels.add(new Level(2));
    }


    public Status bookSpot(VehicleTypes vehicleType){
        for(Level curLevel: allLevels){
            for(ParkingSpot spot: curLevel.getAllParkingSpots()){
                if(spot.isAvailable() && spot.getVehicleType().equals(vehicleType)){
                    spot.bookSpot();
                    curLevel.bookSlots +=1;
                    return new Status(200, "spot book for level " + curLevel.getLevelId() + " for vehicle " + vehicleType);
                }
            }
        }

        return new Status(200, "no matching slots available");
    }

}
