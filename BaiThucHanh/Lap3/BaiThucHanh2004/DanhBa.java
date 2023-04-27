package BaiThucHanh.Lap3.BaiThucHanh2004;

import java.util.Scanner;

public class DanhBa {
    public String name;
    public String sdt;
    
    public DanhBa(String name, String sdt) {
        this.name = name;
        this.sdt = sdt;
    }
    public void NhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten la: ");
        name = scanner.nextLine();
        System.out.println("Nhap sdt la: ");
        sdt = scanner.nextLine();
    }
    public void InThongTin(){
        System.out.printf("Ho va ten: %s , so dien thoai: %s ", name, sdt);
    }
    public String getName() {
        return name;
    }
    
    public String getSDT() {
        return sdt;
    }
    
    public void setSDT(String sdt) {
        this.sdt = sdt;
    } 
}
