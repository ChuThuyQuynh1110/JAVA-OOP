package BaiThucHanh2505;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n;  
        Scanner sc = new Scanner(System.in);   
        try{
            System.out.println("Nhap vao do dai cua mang: ");
            n= sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap vao phan tu thu " + (i+1) + ": ");
                array[i] = sc.nextInt();  
            }
            for (int i = 0; i < n; i++) {
                System.out.println("phan tu thu " + i + ": " + array[i]);
            } 
        }
        catch (Exception ex) {
            System.out.println("loi: " + ex.getMessage());
        }
        finally{
            System.out.println("vui long nhap dung du lieu");
        }
    }
}
