package in.apptonic.milkdelivery;

public class Database {

    String milkBrand;
    String quantity;

    public Database(){}

    public Database(String milkBrand, String quantity) {
        this.milkBrand = milkBrand;
        this.quantity = quantity;
    }

    public String getMilkBrand() {
        return milkBrand;
    }

    public void setMilkBrand(String milkBrand) {
        this.milkBrand = milkBrand;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
