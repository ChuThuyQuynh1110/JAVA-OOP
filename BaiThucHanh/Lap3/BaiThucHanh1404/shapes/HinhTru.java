package BaiThucHanh1404.shapes;
import java.util.Scanner;
public class HinhTru extends HinhTron{
    public float ChieuCao;
    public HinhTru(){
        ten = " Hinh Tru";
    }
    public void nhapChieuCao(){
        nhapBanKinh();
        System.out.println("Chieu cao = ");
        Scanner scanner = new Scanner(System.in);
        ChieuCao = scanner.nextFloat();
    }
    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * ChieuCao;

    }
}