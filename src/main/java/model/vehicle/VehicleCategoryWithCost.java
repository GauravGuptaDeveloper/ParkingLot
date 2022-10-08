package model.vehicle;

public enum VehicleCategoryWithCost {
    TWOWHEELER(10),
    FOURWHEELER(15);

    private int farePrice;

    VehicleCategoryWithCost(int price){
        this.farePrice = price;
    }

    public int getFarePrice() {
        return farePrice;
    }
}
