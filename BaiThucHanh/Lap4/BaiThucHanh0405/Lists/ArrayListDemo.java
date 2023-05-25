
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListDemo{
    public static void main(String[] args) {
        List<Student> arrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        Student.Insert(arrList);
        Student.Display(arrList);
    }
}
        
        