import javax.sql.rowset.spi.SyncResolver;
import java.net.SocketOption;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double tax;

    public Product() {
    }

    public Product(String name, double price, double tax) {
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        name = scanner.nextLine();

        System.out.println("Nhap gia san pham: ");
        price = scanner.nextDouble();

        System.out.println("Nhap thue san pham (duoi dang thap phan)");
        tax = scanner.nextDouble();
    }

    public void xuatThongTin(){
        System.out.println("Ten san pham: " + name);
        System.out.println("Gia san pham: " + price);
        System.out.println("Thue san pham: " + tax);
        System.out.println("so tien thue: " +getTaxPrice());
    }

    public double getTaxPrice() {
        return price * tax;
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println("Nhap thong tin cho san pham 1: ");
        product1.nhapThongTin();

        Product product2 = new Product("Dien thoai", 15000, 0.08);

        System.out.println("\nThong tin san pham 1:");
        product1.xuatThongTin();

        System.out.println("\nThong tin san pham 2:");
        product2.xuatThongTin();
    }
}
