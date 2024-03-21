/**
 Represents a Customer.
 @author Scott Cheng
 @version 1.0
 @since 2024-03-22
 */

public class Customer extends User {

    public Customer() {super();}

    public Customer(GENDER gender, int age, String name) {
        super(gender, age, name);
    }

    /**
     * complete order if it is able to be picked up
     * @param order
     * @return is order successfully processed by customer
     */
    boolean processOrder(Order order) {
//        check first, if not ready, how to complete
        if (order.getOrderStatus() != Order.ORDER_STATUS.READY_TO_PICKUP) return false;

        order.setOrderStatus(Order.ORDER_STATUS.COMPLETED);
        return true;
    }

//    todo
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
