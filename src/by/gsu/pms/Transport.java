package by.gsu.pms;
import by.gsu.pms.Purchases;
import by.gsu.pms.Info;


public class Transport extends Purchases implements Info {
    private double transportExpenses;

    public Transport(Commodity commodity, int PurchasedUnitsNumber, double transportExpenses) {
        super(commodity, PurchasedUnitsNumber);
        this.transportExpenses = transportExpenses;
    }

    public double getTransportExpenses() {
        return transportExpenses;
    }

    public void setTransportExpenses(double transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    @Override
    public double getCost() {
        return getCommodity().getPrice() * getPurchasedUnitsNumber() + transportExpenses;
    }

}
