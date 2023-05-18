package BaiThucHanh2303;

import java.util.Scanner;

public class NhanVien {
        String HoTen;
        int Age;
        float HeSoLuong;
        final int LuongCoBan = 1490000;
        float Luong;
        void NhapThongTin(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap ho ten cua ban :");
            HoTen = scanner.nextLine();
            System.out.println(" Nhap tuoi cua ban:");
            Age = scanner.nextInt();
            System.out.println("Nhap He so luong cua ban:");
            HeSoLuong = scanner.nextFloat();
        }
        void TinhLuong(){
            Luong = HeSoLuong * LuongCoBan;
        }
        void InThongTin(){
            System.out.printf(" Ban %s, %d tuoi, he so luong %f co luong la %f", HoTen, Age, HeSoLuong , Luong);
        }
}
