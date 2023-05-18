package demo.set;

import java.util.Scanner;
import java.util.Set;

public class TreeSet {
    public static void public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetInteger  = new TreeSet<>();
        Scanner sc  = new Scanner(System.in);

        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);

        System.out.println("Cac phan tu trong treeSetInteger: ");
        System.out.println(treeSetInteger);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();

        if (treeSetInteger.contains(number)){
            treeSetInteger.add(number);
            System.out.println("Them thanh cong");
            System.out.println("Cac phan tu trong treeSetInteger sau khi them: ");
            System.out.println(treeSetInteger);
        }
        else{
            System.out.println("phan tu" + number +"da ton tai");
        }
    }
}
