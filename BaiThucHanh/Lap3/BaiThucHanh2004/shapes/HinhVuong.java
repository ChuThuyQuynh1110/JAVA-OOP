package BaiThucHanh.Lap3.BaiThucHanh2004.shapes;
import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{

    public HinhVuong(){
        ten = " Hinh Vuong";
    }
    public void nhapCanh(){
        System.out.println("Canh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
    public void hienthi() {
        super.hienthi();
    }
}

