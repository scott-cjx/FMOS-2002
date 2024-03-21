/**
 The main CLI interface handler
 @author Scott Cheng
 @version 1.0
 @since 2024-03-22
 */

public class Menu {
    public static final int MAX_WIDTH_PRINT = 64;
    public static final int HEADER_FRONT_WIDTH = 5;
    public static final char HEADER_PAD_CHAR = '=';

    private User currentUser;
    private static Staff currentStaff;
    private static boolean isStaff = false;

    /**
     * fixed states of menus
     */
    public enum MENUS {
        MAIN,
        LOGIN,
        ORDER
    }

    public static void main(String[] args) {
        printMainMenu();

        currentStaff = new Staff("Scott" ,Staff.STAFF_TYPE.STAFF);
        isStaff = true;

        printCurrentUser();
    }

    static void printMainMenu() {
        printHeader("FMOS");
    }

    static void printCurrentUser() {
        if (!isStaff) return;
        if (currentStaff.getStaffType() == Staff.STAFF_TYPE.NA) return;

        System.out.print("Currently logged in as: ");
        System.out.println(currentStaff.name);

        System.out.print(currentStaff.getStaffType().name());

//        if (currentStaff.getStaffType() != Staff.STAFF_TYPE.ADMIN) {
//            System.out.print(" @ ");
//            System.out.println(currentStaff.getBranch().getBranchName());
//            return;
//        }
        System.out.println();
    }

    static void printHeader(String header) {
        if (header.length() > MAX_WIDTH_PRINT-2) return;
//        todo make this multiple liner

        for (int i = 0; i < HEADER_FRONT_WIDTH-1; i++) {
            System.out.print(HEADER_PAD_CHAR);
        }
        System.out.print(' ');
        System.out.print(header);
        System.out.print(' ');

        int remainder_length = MAX_WIDTH_PRINT - header.length() - 2;
        for (int i = 0; i < remainder_length; i++) {
            System.out.print(HEADER_PAD_CHAR);
        }
        System.out.println();
    }
}
