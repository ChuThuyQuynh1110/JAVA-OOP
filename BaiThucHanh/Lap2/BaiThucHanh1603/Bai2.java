package BaiThucHanh1603;

import java.util.Scanner;

public class Bai2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.println("nhap vao so can kiem tra n:");
        n = Bai2.scanner.nextInt();
        if(n%2==0)
        {
            System.out.println("Day la so chan!");
        }
        else
        {
            System.out.println("Day la so le!");
        }
    }
}
