package BaiThucHanh.BaiThucHanh2302;
import java.util.Scanner;
public class Slide34 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap he so bac 1, a = ");
        float a = Slide34.scanner.nextFloat();
        System.out.print("Nhap he so bac 2, b = ");
        float b = Slide34.scanner.nextFloat();
        System.out.print("Nhap hang so tu do, c = ");
        float c = Slide34.scanner.nextFloat();
        Slide34.giaiPTBac2(a, b, c);
    }
        public static void giaiPTBac2(float a, float b, float c) {
            // kiểm tra các hệ số
            if (a == 0) {
                if (b == 0) {
                    System.out.println("Phuong trinh vo nghiem!");
                }
                else {
                    System.out.println("Phuong trinh co mot nghiem: " + "x = " + (-c / b));
                }
                return;
            }
            // tính delta
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            // tính nghiệm
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phuong trinh co 2 nghiem la: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } 
            else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phuong trinh co nghiem kep : "
                        + "x1 = x2 = " + x1);
            } 
            else {
                System.out.println("Phuong trinh vo nghiem!");
            }
        }

}
