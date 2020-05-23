package by.gsu.pms;
import by.gsu.pms.Purchases;
import by.gsu.pms.Info;

public class PersentOfDiscount extends Purchases implements Info {
    private double discount ;

    public PersentOfDiscount(Commodity commodity, int numberOfPurchasedUnits, double discount) {
        super(commodity, numberOfPurchasedUnits);
        this.discount = discount;
    }

    public double getDiscount() {

        return discount;
    }

    public void setDiscount(double discount)
    {
        this.discount = discount;
    }

    @Override
    public double getCost()
    {
        return getCommodity().getPrice() * getPurchasedUnitsNumber() * (100-discount)/100;
    }
}
