/**
 Represents an Admin, staff
 Admin is responsible for company management and staff management.
 @author Scott Cheng
 @version 1.0
 @since 2024-03-22
 */

public class Admin extends Staff {

    /**
     * Creating a new admin account
     * @param name
     * @param staffType
     */
    public Admin(String name, STAFF_TYPE staffType) {
        super(name, staffType);
    }

    //    STAFF USER MODIFIERS

    /**
     * adding a staff to the system
     * @param staff
     * @return
     */
    boolean addStaff(Staff staff) {
        return false;
    }

    /**
     * removing a staff from the system
     * @param staff
     * @return
     */
    boolean removeStaff(Staff staff) {
        return false;
    }

    /**
     * editing the staff details in the system
     * @param staff
     * @return
     */
    boolean editStaff(Staff staff) {
        return false;
    }

    //    STAFF BRANCH MODIFIERS

    /**
     * promote a staff to branch manager
     * @param staff
     * @return
     */
    boolean promoteStaff(Staff staff) {
        return false;
    }

    /**
     * transfer staff from a branch to another branch
     * @param staff
     * @param toBranch
     * @return
     */
    boolean transferStaff(Staff staff, Branch toBranch) {
        return false;
    }

    /**
     * assign a staff to a branch
     * @param staff
     * @param toBranch
     * @return
     */
    boolean assignStaffToBranch(Staff staff, Branch toBranch) {

//        returns false if unable to add
        return false;
    }

    /**
     * displays staff based on the filters
     * @param branch
     * @param staffType
     * @param gender
     * @param age
     */
    void displayStaff(Branch branch, STAFF_TYPE staffType, GENDER gender, int age) {

    }

    //    BRANCH MODIFIERS

    /**
     * removing a branch from the system
     * @param branch
     * @return
     */
    boolean removeBranch(Branch branch) {
        return false;
    }

    /**
     * adding a branch to the system
     * @param branch
     * @return
     */
    boolean addBranch(Branch branch) {
        return false;
    }

    //    PLATFORM MODIFIERS

    /**
     * removing a payment method from the system
     * @param paymentMethod
     * @return
     */
    boolean removePaymentMethod(PaymentMethod paymentMethod) {
        return false;
    }

    /**
     * adding a payment method to the system
     * @param paymentMethod
     * @return
     */
    boolean addPaymentMethod(PaymentMethod paymentMethod) {
        return false;
    }
}
