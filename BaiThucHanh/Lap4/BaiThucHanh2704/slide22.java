import java.util.ArrayList;
import java.util.Scanner;

public class slide22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // khai bao arraylist
        ArrayList<Integer> arrList = new ArrayList<>();
        int number;
        // nhap vao kich thuoc cua arraylist
        System.out.println("nhap so phan tu cua ArrayList:");
        int n = scanner.nextInt();
        // nhap va add cac phan tu vao arraylist
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + i + ":");
            number = scanner.nextInt();
            arrList.add(number);
        }
        int max = arrList.get(0);
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        System.out.println("phan tu lon nhat trong arrList = " + max);
    }
    
}
