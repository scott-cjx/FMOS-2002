package FMOS_2002;

/**
 Represents a FMOS_2002.MenuItem
 @author Scott Cheng
 @version 1.0
 @since 2024-03-22
 */

public class MenuItem {

    /**
     * FMOS_2002.MenuItem category
     */
    public enum CATEGORIES {
        SIDE,
        DRINK,
        SET_MEAL,
        NA
    }

    /**
     * is item available?
     */
    public enum AVAILABILITY {
        AVAILABLE,
        NOT_AVAILABLE,
        NA
    };
    private float price;
    private AVAILABILITY availability;
    private String description;
    private CATEGORIES category;

    public MenuItem(float price, AVAILABILITY availability) {
        this.price = price;
        this.availability = availability;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public AVAILABILITY getAvailability() {
        return availability;
    }

    public void setAvailability(AVAILABILITY availability) {
        this.availability = availability;
    }
}
