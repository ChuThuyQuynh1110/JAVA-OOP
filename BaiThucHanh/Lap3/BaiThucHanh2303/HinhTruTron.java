package BaiThucHanh2303;

import java.util.Scanner;

public class HinhTruTron {
    float BanKinh;
    final float PI = 3.14f;
    float ChieuCao;
    float ChuViDay;
    float DienTichXungQuanh;
    float DienTichToanPhan;
    void NhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tru tron: ");
        BanKinh = scanner.nextFloat();
        System.out.println("Nhap chieu cao hinh tru tron: ");
        ChieuCao = scanner.nextFloat();
    }
    void TinhChuVi(){
        ChuViDay = 2*PI*BanKinh;
    }
    void TinhDienTichXungQuanh(){
        DienTichXungQuanh = 2*PI*BanKinh*ChieuCao;
    }
    void TinhDienTichToanPhan(){
        DienTichToanPhan = 2 * BanKinh * PI *(BanKinh + ChieuCao);
    }
    void InThongTin(){
        System.out.printf(" hinh tru tron co ban kinh la %f va chieu cao la %f" , BanKinh, ChieuCao);
        System.out.printf(" thi co chu vi day la %f ; dien tich xung quanh la %f ; dien tich toan phan la %f", ChuViDay, DienTichXungQuanh,DienTichToanPhan);
    }
}