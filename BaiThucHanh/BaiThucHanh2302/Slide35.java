package BaiThucHanh.BaiThucHanh2302;

import java.util.Scanner;

public class Slide35 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap so thu 1, a = ");
        float a = Slide35.scanner.nextFloat();
        System.out.print("Nhap so thu 2, b = ");
        float b = Slide35.scanner.nextFloat();
        if (a>b){
            System.out.println("so thu nhat: " + a +"lon hon so thu hai: "+b);
        }
        else if (a == b) {
            System.out.println("so thu nhat: " +a+"bang so thu 2: " +b);
        }
        else{
            System.out.println("so thu nhat: " + a + "be hon so thu hai: "+b);
        }
}
}
