package BaiThucHanh.Lap4.BaiThucHanh0405.Sets;
import java.util.HashSet;
import java.util.Scanner;


public class HashSetDemo {
    public static void main(String[] args){
        HashSet<Student> arrList = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        Student.Insert(arrList, 0);
        Student.Display(arrList);
    }

}
