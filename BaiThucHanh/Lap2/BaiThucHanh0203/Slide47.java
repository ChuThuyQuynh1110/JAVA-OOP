package BaiThucHanh0203;

import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args){
        int so;
        int tong;
        tong = 0;
        Scanner sc = new Scanner(System.in);
        while(tong < 100){
            System.out.println("Nhap vao gia tri so nguyen:");
            so = sc.nextInt();
            tong += so;
        }
        System.out.println("Tong cua cac so nhap vao la:" + tong);
    }
}
