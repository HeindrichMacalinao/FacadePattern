public class HotelApp {
    public static void main(String[] args) {
        Cart cart = new Cart();
        HouseKeeping hk = new HouseKeeping();
        Valet valet = new Valet();

        FrontDesk fd = new FrontDesk(cart, hk, valet);

        fd.requestCart(5);
        fd.requestHouseKeeping("6767");
        fd.requestValet("MOY 511");
    }
}