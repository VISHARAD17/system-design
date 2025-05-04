import java.util.ArrayList;
import java.util.List;

public class Level{
    private int levelId;
    List<ParkingSpot> allParkingSpots;
    int bookSlots;

    public Level(int lId){
        levelId = lId;
        allParkingSpots = new ArrayList<>();
        bookSlots = 15;

        for(int i=0; i<5; i++){
            allParkingSpots.add(new ParkingSpot(1, VehicleTypes.BIKE));
        }


        for(int i=0; i<5; i++){
            allParkingSpots.add(new ParkingSpot(2, VehicleTypes.CAR));
        }


        for(int i=0; i<5; i++){
            allParkingSpots.add(new ParkingSpot(3, VehicleTypes.TRUCK));
        }
    }


    // getter 
    List<ParkingSpot> getAllParkingSpots(){
        return allParkingSpots;
    }

    public int getLevelId() {
        return levelId;
    }
}

