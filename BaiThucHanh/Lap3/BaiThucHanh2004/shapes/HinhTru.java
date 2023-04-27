package BaiThucHanh.Lap3.BaiThucHanh2004.shapes;
import java.util.Scanner;

public class HinhTru extends HinhTron {
    
    public float chieuCao;

    public HinhTru(){
        ten = "Hinh Tru";
    }

    public void nhapChieuCao(){
            System.out.println("\n Chieu cao = ");
            Scanner scanner = new Scanner(System.in);
            chieuCao = scanner.nextFloat();
        
    }

    public void tinhTheTich() {
        theTich = dienTich * chieuCao;
    }

    public void Hienthi() {
        super.Hienthi();
        System.out.printf("Chieu cao = %f, The Tich = %f", chieuCao, theTich);
    }
}
