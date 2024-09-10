import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private double tax;

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten san pham: ");
        name = scanner.nextLine();

        System.out.print("Nhap gia san pham: ");
        price = scanner.nextDouble();

        System.out.print("Nhap thue san pham (duoi dang thap phan):");
        tax = scanner.nextDouble();
    }

    public void xuatThongTin(){
        System.out.println("Ten san pham:" + name);
        System.out.println("Gia san pham" + price);
        System.out.println("Thue san pham:" + tax);
        System.out.println("So tien thua:" + getTaxPrice());
        
    }
    
    public double getTaxPrice(){
        return price * tax;
    }
    
    public static void main(String[] args){
        Product product = new Product();
        
        product.nhapThongTin();
        product.xuatThongTin();
    }
}
