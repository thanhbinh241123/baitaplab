import java.sql.SQLOutput;
import java.util.Scanner;
public class Product {
    private String name;
    private double price;
    private double tax;

    public Product(){
    }

    public Product(String name, double price, double tax){
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setprice(double price){
        this.price = price;
    }

    public double getTax(){
        return tax;
    }

    public void settax(double tax){
        this.tax = tax;
    }

    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten san pham: ");
        setName(scanner.nextLine());

        System.out.println("Nhap gia san pham");
        setprice(scanner.nextDouble());

        System.out.println("Nhap thue san pham");
        settax(scanner.nextDouble());
    }

    public void xuatThongTin(){
        System.out.println("Ten san pham: "+ getName());
        System.out.println("Gia san pham: "+ getPrice());
        System.out.println("Thue san pham: "+ getTax());
        System.out.println("So tien thue: "+ getTaxPrice());
    }

    public double getTaxPrice(){
        return getPrice() * getTax();
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println("Nhap thong tin cho san pham 1:");
        product1.nhapThongTin();

        Product product2 = new Product("Dien thoai", 15000, 0.08);

        System.out.println("Nhap thong tin cho san pham 1:");
        product1.xuatThongTin();

        System.out.println("Nhap thong tin san pham 2:");
        product2.xuatThongTin();

    }
}
