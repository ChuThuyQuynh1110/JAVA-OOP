package BaiThucHanh2505.Throw;

import java.io.IOException;

public class TestThrows1 {
    void m() throws IOException{
        throw new IOException("loi thiet bi", null);
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try {
            n();
        }catch (Exception ex){
            System.out.println(" ngoai le duoc xu ly");
        }
    }
    public static void main(String args[]) {
        TestThrows1 obj = new TestThrows1();
        obj.p();
        System.out.println("luong binh thuong ....");
    }
}
