
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class LinkedListDemo {
    public static void main(String[] args) {
        List<Student> arrList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan tu: ");
        int n = sc.nextInt();
        Student.Insert(arrList);
        Student.Display(arrList);
    }
 
}
