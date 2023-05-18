package BaiThucHanh.Lap4.BaiThucHanh0405;
import java.util.Scanner;

public class Student {
    public static String FullName;
    public static Int Age;
    public static void NhapThongTin(){
        Scanner sc = new scanner(System.in);
        System.out.println("Nhap ho ten: ");
        FullName = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        Age = sc.nextInt();
    }
    // Phương thức Insert list
    public static void Insert(List<Student> arrList )
    {
        Scanner sc = new scanner(System.in);
        System.out.println("nhap so phan tu cua list:");
        Int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            Student std = new Student();
            std.NhapThongTin();
            arrList.add(std);
        }
    }
    //Phương thức Insert set
    public static void Insert(Set<Student> arrSet)
    {
        Scanner sc = new scanner(System.in);
        System.out.println("nhap so phan tu cua list:");
        Int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            Student std = new Student();
            std.NhapThongTin();
            list.add(std);
        }
    }
    //Phương thức Update => by FullName
    public static void UpdateByName(List<Student> arrList)
    {
        Scanner sc = new scanner(System.in);
        System.out.println("nhap ten can tim kiem:");
        Int fname = sc.nextInt();
        boolean check = false;
        //kiemtra phan tu thu i co FullName co = gia tri fName
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i).FullName.equals(fName))
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
        Scanner sc = new scanner(System.in);
        System.out.println("nhap ten can tim kiem:");
        Int fname = sc.nextInt();
        //kiemtra phan tu thu i co FullName co = gia tri fName
        for(Student arr : arrSet )
        {
            if(arr.FullName.equals(fName))
            {
                //yeu cau nguoi dung nhap thong tin moi
                Student std = new Student();
                std.NhapThongTin();
                //update
                arrSet.set(i, std);
            }
            else{
                System.out.println("ket qua nhap khong chinh xac");
            }
        }
        //neu = thi thay doi gia tri cac thuoc tinh
    }
    //Phương thức Display
    public static void Display(List<Student> arrList){
        for (int i = 0; i < arr.size(); i++){
            System.out.printf("Sinh vien: %s, tuoi: %d", arr.get(i).FullName, arr.get(i).Age);
        }
    }


    public static void Display(Set<Student> arrSet){
        for (Student arr : arrSet){
            System.out.printf("Sinh vien: %s, tuoi: %d", arr.FullName, arr.Age);
        }
    }

    //Phương thức Delete => by FullName
    public static void DeleteByName(List<Student> arrList)
    {
        Scanner sc = new scanner(System.in);
        System.out.println("nhap ten can tim kiem:");
        Int fname = sc.nextInt();
        boolean check = false;
        //kiemtra phan tu thu i co FullName co = gia tri fName
        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i).FullName.equals(fName))
            {
                check = true;
                arrList.remove(i, std);
            }
            else{
                System.out.println("ket qua nhap khong chinh xac");
            }
        }
        //neu = thi thay doi gia tri cac thuoc tinh
    }
    public static void DeleteByName(Set<Student> arrSet)
    {
        Scanner sc = new scanner(System.in);
        System.out.println("nhap ten can tim kiem:");
        Int fname = sc.nextInt();
        //kiemtra phan tu thu i co FullName co = gia tri fName
        for(Student arr : arrSet )
        {
            if(arr.FullName.equals(fName))
            {
                arrSet.remove(i, std);
            }
            else{
                System.out.println("ket qua nhap khong chinh xac");
            }
        }
        //neu = thi thay doi gia tri cac thuoc tinh
    }

    
   
}
