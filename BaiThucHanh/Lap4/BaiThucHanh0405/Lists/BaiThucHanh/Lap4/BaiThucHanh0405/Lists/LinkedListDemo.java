package BaiThucHanh.Lap4.BaiThucHanh0405.Lists;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> arrList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu: ");
        int n = sc.nextInt();
        Student.Insert(arrList, 0);
        Student.Display(arrList);
    }
 
}
