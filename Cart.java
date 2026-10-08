public class Cart implements HotelService{
    public void requestCart(int numberOfCarts) {
        System.out.println("[Cart] Delivering "+numberOfCarts+" carts...");
    }

    @Override
    public void performService() {
        System.out.println("[Cart] Request in progress...\n[Cart] Request completed.");
    }
}