package BaiThucHanh2302;
import java.util.Scanner;
public class Slide30 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap gia tri dau vao, a = ");
        float a = Slide30.scanner.nextFloat();
        int tong = 0;
        int b;
        //sd vong lap while de tach
        while(a > 0)
        {
            b = (int) (a % 10);
            tong += b; 
            a /=10;
        }
        System.out.println("tong cac chu so cua gia tri dau vao la" + tong); 
    }

}
