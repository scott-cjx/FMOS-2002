public class Order {
    public enum ORDER_STATUS {
        IN_PROGRESS,
        READY_TO_PICKUP,
        COMPLETED,
        NA
    };

    public enum ORDER_TYPE {
        TAKEOUT,
        DINE_IN,
        NA
    }
    private static int SYS_ORDERS = 0;
    private ORDER_TYPE orderType = ORDER_TYPE.NA;
    private ORDER_STATUS orderStatus = ORDER_STATUS.NA;
    private int orderID;
    private MenuItem[] orders;

    public Order(ORDER_TYPE orderType, ORDER_STATUS orderStatus, MenuItem[] orders) {
        this.orderType = orderType;
        this.orderStatus = orderStatus;
        this.orders = orders;

        this.orderID = Order.SYS_ORDERS++;      // user current ORDER_ID in system and add 1 after
    }

    public ORDER_STATUS getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(ORDER_STATUS orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderID() {
        return orderID;
    }

    public MenuItem[] getOrders() {
        return orders;
    }

    public void displayOrder() {
//        print order
    }
}
