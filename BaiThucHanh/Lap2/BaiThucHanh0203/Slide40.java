package BaiThucHanh0203;

import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args){
        int so;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri so nguyen tu 1 den 7:");
        so = sc.nextInt();
        switch(so)
        {
            case 1: System.out.println("Chu Nhat"); break;
            case 2: System.out.println("Thu hai"); break;
            case 3: System.out.println("Thu ba"); break;
            case 4: System.out.println("Thu tu"); break;
            case 5: System.out.println("Thu nam"); break;
            case 6: System.out.println("Thu sau"); break;
            case 7: System.out.println("Thu bay"); break;
            default: System.out.println("khong phai ngay trong tuan");break;
        }
    }
}
