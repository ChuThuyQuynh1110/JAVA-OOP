

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

public class Student {
    public static String FullName;
    public static int Age;

    public static void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        FullName = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Age = sc.nextInt();
    }

    // Phương thức Insert list
    public static void Insert(List<Student> arrList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua list:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            Student std = new Student();
            std.NhapThongTin();
            arrList.add(std);
        }
    }

    // Phương thức Insert set
    public static void Insert(Set<Student> arrSet)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua set:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            Student std = new Student();
            std.NhapThongTin();
            arrSet.add(std);
        }
    }

    // Phương thức Update => by FullName
    public static void UpdateByName(List<Student> arrList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten can tim kiem:");
        String fname = sc.nextLine();
        boolean check = false;
        //kiemtra phan tu thu i co FullName co = gia tri fName
        for(int i = 0; i < arrList.size(); i++)
        {
            if(arrList.get(i).FullName.equals(fname))
            {
                check = true;
                //yeu cau nguoi dung nhap thong tin moi
                Student std = new Student();
                std.NhapThongTin();
                //update
                arrList.set(i, std);
            }
            else{
                System.out.println("ket qua nhap khong chinh xac");
            }
        }
        //neu = thi thay doi gia tri cac thuoc tinh
    }

    public static void UpdateByName(Set<Student> arrSet)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten can tim kiem:");
        String fname = sc.nextLine();
        //kiemtra phan tu thu i co FullName co = gia tri fName
        for(Student student : arrSet )
        {
            if(student.FullName.equals(fname))
            {
                //yeu cau nguoi dung nhap thong tin moi
                Student std = new Student();
                std.NhapThongTin();
                //update
                arrSet.remove(student);
                arrSet.add(std);
            }
            else{
                System.out.println("ket qua nhap khong chinh xac");
            }
        }
        //neu = thi thay doi gia tri cac thuoc tinh
    }

    // Phương thức Display
    public static void Display(List<Student> arrList){
        for (int i = 0; i < arrList.size(); i++){
            System.out.printf("Sinh vien: %s, tuoi: %d\n", arrList.get(i).FullName, arrList.get(i).Age);
        }
    }

    public static void Display(Set<Student> arrSet){
        for (Student student : arrSet){
            System.out.printf("Sinh vien: %s, tuoi: %d\n", student.FullName, student.Age);
        }
    }

    // Phương thức Delete => by FullName
    public static void DeleteByName(List<Student> arrList)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten can tim kiem:");
        String fname = sc.nextLine();
        boolean check = false;
        //kiemtra phan tu thu i co FullName co = gia tri fName
        for(int i = 0; i < arrList.size(); i++)
        {
            if(arrList.get(i).FullName.equals(fname))
            {
                check = true;
                arrList.remove(i);
            }
            else{
                System.out.println("ket qua nhap khong chinh xac");
            }
        }
        //neu = thi thay doi gia tri cac thuoc tinh
    }

    public static void DeleteByName(Set<Student> arrSet)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten can tim kiem:");
        String fname = sc.nextLine();
        //kiemtra phan tu thu i co FullName co = gia tri fName
        for(Student student : arrSet )
        {
            if(student.FullName.equals(fname))
            {
                arrSet.remove(student);
            }
            else{
                System.out.println("ket qua nhap khong chinh xac");
            }
        }
        //neu = thi thay doi gia tri cac thuoc tinh
    }
}

