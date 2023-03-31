package BaiThucHanh0203;

import java.util.Scanner;

public class Slide55 {
    public static void main(String[] args){
        int so;
        Scanner sc = new Scanner(System.in);
        so = 0;
        System.out.println("Cac so chia het cho 5:");
        for (;so < 200;){
            so ++;
            if(so % 5 == 0){
                System.out.println(so);
                continue;
            }
            else{
                continue;
            }
        }
    }
   
}
