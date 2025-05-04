import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String [] args){
        ParkingLot parkingLot = new ParkingLot();
        Status status = parkingLot.bookSpot(VehicleTypes.CAR);
        System.out.println(status.getMsg());
    }
}
