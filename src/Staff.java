/**
 Represents a Staff
 There are different types of Staff
 @author Scott Cheng
 @version 1.0
 @since 2024-03-22
 */


public class Staff extends User {
    /**
     * Type of Staff
     */
    public enum STAFF_TYPE {
        ADMIN('A'), BRANCH_MANAGER('B'), STAFF('S'), NA('N');

        public char toChar() {
            return toChar;
        }

        private final char toChar;
        STAFF_TYPE(char toChar) {
            this.toChar = toChar;
        }
    }

    private STAFF_TYPE staffType = STAFF_TYPE.NA;
    private String password = "password";
    private String staffLoginID;

    /**
     * branch this Staff belongs to
     */
    private Branch branch;

//    THIS SHOULD BE DISABLED
//    public Staff() {
//    }

//    public Staff(STAFF_TYPE staffType, String password) {
//        super();
//        this.staffType = staffType;
//        this.password = password;
//    }


    public Staff(String name, STAFF_TYPE staffType) {
        super(name);
        this.staffType = staffType;
    }

    boolean login(String staffLoginID, String password) {
        if (!this.staffLoginID.equals( staffLoginID)) return false;
        if (!this.password.equals( password)) return false;

        return true;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStaffType(STAFF_TYPE staffType) {
        this.staffType = staffType;
    }

    void displayNewOrders() {

    }

    void displayOrder(Order order) {
        order.displayOrder();
    }

    void processOrder(Order order) {
        order.setOrderStatus(Order.ORDER_STATUS.READY_TO_PICKUP);
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public STAFF_TYPE getStaffType() {
        return staffType;
    }
}
