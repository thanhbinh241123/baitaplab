public class Main{
    public static void main(String[] args){
        SinhVienIT svIT = new SinhVienIT(8.5,7.0);
        System.out.println("Diem sinh vien IT");
        svIT.displayDiem();

        SinhVienCoKhi svCK = new SinhVienCoKhi(7.5,8.0);
        System.out.println("Diem sinh vien Co Khi");
        svCK.displayDiem();
    }
}