public class FrontDesk {
    private Cart cart;
    private HouseKeeping hk;
    private Valet valet;

    public FrontDesk(Cart cart, HouseKeeping hk, Valet valet) {
        this.cart = cart;
        this.hk = hk;
        this.valet = valet;
    }

    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
        cart.performService();
    }

    public void requestHouseKeeping(String roomNumber) {
        hk.cleanRoom(roomNumber);
        hk.performService();
    }

    public void requestValet(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
        valet.performService();
    }
}