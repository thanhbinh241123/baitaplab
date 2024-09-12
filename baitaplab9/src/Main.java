import java.util.InputMismatchException;
import java.util.Scanner;

class SinhVien{
    private String masv;
    private String hoten;
    private double diem;
    private int age;
     public SinhVien(String masv, String hoten, double diem, int age) {
         this.masv = masv;
         this.hoten = hoten;
         this.diem = diem;
         this.age = age;
     }

     public String getMasv() {
         return masv;
     }
     public void setMasv(String masv) {
         this.masv = masv;
     }
     public String getHoten() {
         return hoten;
     }
     public void setHoten(String hoten) {
         this.hoten = hoten;
     }
     public double getDiem() {
         return diem;
     }
     public void setDiem(double diem) {
         if (diem >= 0 && diem <= 10){
             this.diem = diem;
         }else {
             throw new InputMismatchException("Diem phai nam trong khoang tu 0 den 10.");
         }
     }
     public int getAge() {
         return age;
     }
     public void setAge(int age) {
         if (age > 18 && age < 100){
         this.age = age;
     }else {
             throw new IllegalArgumentException("Tuoi phai nam trong khoang tu 19 den 99. ");
         }
    }
    public String toString() {
         return "Ma SV: " + masv +",Ho ten: " + hoten +",Diem: " + diem +",Age: " + age;
    }
    public static SinhVien nhapSinhVien() {
         Scanner scanner = new Scanner(System.in);
         String masv, hoten;
         double diem = 0;
         int age = 0;
        System.out.println("Nhap ma sinh vien:");
        masv = scanner.nextLine();
        System.out.println("Nhap hoten sinh vien: ");
        hoten = scanner.nextLine();

        while (true) {
            try {
                System.out.print("Nhập điểm sinh viên (0-10): ");
                diem = scanner.nextDouble();
                if (diem < 0 || diem > 10) {
                    throw new IllegalArgumentException("Điểm phải nằm trong khoảng từ 0 đến 10.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Điểm phải là số thực. Vui lòng nhập lại.");
                scanner.next(); // Clear the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Nhập và kiểm tra tuổi
        while (true) {
            try {
                System.out.print("Nhập tuổi sinh viên (19-99): ");
                age = scanner.nextInt();
                if (age <= 18 || age >= 100) {
                    throw new IllegalArgumentException("Tuổi phải nằm trong khoảng từ 19 đến 99.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Tuổi phải là số nguyên. Vui lòng nhập lại.");
                scanner.next(); // Clear the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return new SinhVien(masv, hoten, diem, age);
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        SinhVien sv = nhapSinhVien();
        System.out.println("Thông tin sinh viên:");
        System.out.println(sv.toString());
    }
}