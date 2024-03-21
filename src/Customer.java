public class Customer extends User {

    public Customer() {super();}

    public Customer(GENDER gender, int age, String name) {
        super(gender, age, name);
    }

    boolean processOrder(Order order) {
//        check first, if not ready, how to complete
        if (order.getOrderStatus() != Order.ORDER_STATUS.READY_TO_PICKUP) return false;

        order.setOrderStatus(Order.ORDER_STATUS.COMPLETED);
        return true;
    }

    boolean removeFromCart(MenuItem menuItem) {
        return false;
    }

    boolean addToCart(MenuItem menuItem) {
        return false;
    }

    boolean editFromCart(MenuItem menuItem) {
        return false;
    }

    void diplayCart() {

    }

    boolean checkoutCart() {
        return false;
    }

    boolean makePayment() {
//        NOT IMPLEMENTED, ASSUME PAYMENT OK
        return true;
    }

    void displayReceipt() {

    }
}
