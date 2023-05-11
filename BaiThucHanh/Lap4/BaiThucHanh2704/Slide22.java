package BaiThucHanh.Lap4.BaiThucHanh2704;

import java.util.ArrayList;
import java.util.Scanner;


public class Slide22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // khai bao arraylist
        ArrayList<Integer> arrList = new ArrayList<>();
        int number;
        // nhap vao kich thuoc cua arraylist
        System.out.println("nhap so phan tu cua ArrayList:");
        int n = scanner.nextInt();
        // nhap va add cac phan tu vao arraylist
        for (int i =0; i<n;i++){
            System.out.println("nhap phan tu thu "+ i+ "la");
            number = scanner.nextInt();
            arrList.add(number);
        }
        int max = arrList.get(0);
        for(int i =1; i<arrList.size();i++){
            if(arrList.get(i).compareTo(max)>0) {
                max = arrList.get(i);
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   Bai1         v888888p          )
        }
        System.out.println("phan tu lon nhat trong arrList = " + max);
    }
    
}
