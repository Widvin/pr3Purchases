package by.gsu.pms;
import by.gsu.pms.Purchases;
import by.gsu.pms.Info;

public class DiscountedPrice extends Purchases implements Info {
    private double discount;

    public DiscountedPrice(Commodity commodity, int PurchasedUnitsNumber, double discount) {
        super(commodity, PurchasedUnitsNumber);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getCost() {
        return (getCommodity().getPrice() - discount) * getPurchasedUnitsNumber();
    }
}
