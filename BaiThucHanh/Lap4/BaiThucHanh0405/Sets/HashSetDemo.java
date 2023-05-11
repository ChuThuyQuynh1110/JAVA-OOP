package BaiThucHanh.Lap4.BaiThucHanh0405.Sets;
import java.util.Scanner;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<Student> arrList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu: ");
        int n = sc.nextInt();
        Student.Insert(arrList, 0);
        Student.Display(arrList);
    }

}
