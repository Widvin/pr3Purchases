package by.gsu.pms;

public abstract class Purchases
{
    private Commodity commodity;
    private int PurchasedUnitsNumber;

    public Purchases() {
        this.commodity = new Commodity();
        this.PurchasedUnitsNumber = 0;
    }

    public Purchases(Commodity commodity, int PurchasedUnitsNumber) {
        this.commodity = commodity;
        this.PurchasedUnitsNumber = PurchasedUnitsNumber;
    }

    public Commodity getCommodity()
    {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        
        this.commodity = commodity;
    }

    public int getPurchasedUnitsNumber() {
        
        return PurchasedUnitsNumber;
    }

    public void setPurchasedUnitsNumber(int PurchasedUnitsNumber) {
        this.PurchasedUnitsNumber = PurchasedUnitsNumber;
    }

    public abstract double getCost();

    public String toString(){
        return commodity.toString() + ";  " + PurchasedUnitsNumber + ";  " + getCost();
    }

    public boolean CompareTo(Purchases purchase){
        return getCost() > purchase.getCost();
    }

}
