package BaiThucHanh1603;

import java.util.Scanner;

public class Bai1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // khai báo nhập biến
        System.out.print("Nhap so thu 1, a = ");
        float a = Bai1.scanner.nextFloat();
        System.out.print("Nhap so thu 2, b = ");
        float b = Bai1.scanner.nextFloat();
        // ý 1
        float tong = a + b ;
        float hieu = a - b ;
        float tich = a*b;
        float thuong = a/b;
        float du = a%b;
        System.out.println("Tong hai so la: " + tong);
        System.out.println("Hieu khi a tru cho b là: " + hieu);
        System.out.println("Tich hai so la: " + tich);
        System.out.println("Thuong khi chia a cho b la: " + thuong);
        System.out.println("so du khi chia a cho b la: " + du);
        // ý 2
        if (a>b){
            System.out.println("so thu nhat: " + a +" lon hon so thu hai: "+b);
        }
        else if (a == b) {
            System.out.println("so thu nhat: " +a+" bang so thu 2: " +b);
        }
        else{
            System.out.println("so thu nhat: " + a + " be hon so thu hai: "+b);
        }
}
}
