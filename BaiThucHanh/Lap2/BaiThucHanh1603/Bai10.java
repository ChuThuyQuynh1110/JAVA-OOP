package BaiThucHanh1603;

import java.util.Scanner;

public class Bai10 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        int count = 0;
       
        do {
            System.out.println("Nhap mot chuoi bat ki duoi 80 ki tu: ");
            chuoi = scanner.nextLine();
        } while (chuoi.length() > 80);

        System.out.println("Nhap ki tu can dem so lan xuat hien: ");
        kytu = scanner.next().charAt(0);
    
        for (int i = 0; i < chuoi.length(); i++) {
            if (kytu == chuoi.charAt(i)) {
                count++;
            }
        }
            
        System.out.println("So lan ki tu xuat hien " + kytu +
            " trong chuoi " + chuoi + " = " + count);
    }

}
