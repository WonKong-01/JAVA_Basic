package oop.Inherit.product;

public class ElectronicProduct {

    String productName;
    double price;
    String manufacturer;

    public ElectronicProduct(String product, double price, String manufacturer) {
        this.productName = product;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public void displayInfo() {
        System.out.printf("%s, 가격: %.0f원, 제조사: %s\n"
                , this.productName, this.price, this.manufacturer);   // %.f원 -> price가 double 변수이기 때문에 int (x)
    }
}
