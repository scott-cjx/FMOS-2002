public class Admin extends Staff {

    public Admin(String name, STAFF_TYPE staffType) {
        super(name, staffType);
    }

    //    STAFF USER MODIFIERS
    boolean addStaff(Staff staff) {
        return false;
    }

    boolean removeStaff(Staff staff) {
        return false;
    }

    boolean editStaff(Staff staff) {
        return false;
    }

    //    STAFF BRANCH MODIFIERS
    boolean promoteStaff(Staff staff) {
        return false;
    }

    boolean transferStaff(Staff staff, Branch toBranch) {
        return false;
    }

    boolean assignStaffToBranch(Staff staff, Branch toBranch) {

//        returns false if unable to add
        return false;
    }

    void displayStaff(Branch branch, STAFF_TYPE staffType, GENDER gender, int age) {

    }

    //    BRANCH MODIFIERS
    boolean removeBranch(Branch branch) {
        return false;
    }

    boolean addBranch(Branch branch) {
        return false;
    }

    //    PLATFORM MODIFIERS
    boolean removePaymentMethod(PaymentMethod paymentMethod) {
        return false;
    }

    boolean addPaymentMethod(PaymentMethod paymentMethod) {
        return false;
    }
}
