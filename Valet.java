public class Valet implements HotelService{
    public void pickUpVehicle(String plateNumber) {
        System.out.println("[Valet] Parking vehicle with plate number: "+plateNumber);
    }
    @Override
    public void performService() {
        System.out.println("[Valet] Request in progress...\n[Valet] Request completed.");
    }
}