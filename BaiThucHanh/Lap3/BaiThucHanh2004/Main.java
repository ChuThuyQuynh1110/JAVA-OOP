package BaiThucHanh2004;

public class Main {
    public static void main(String[] args) throws Exception {   
        DanhBaAB dv = new DanhBaAB(10);
        dv.Insert("1", "1");
        dv.Update("Chu Thuy Quynh", "0457784777");
        dv.SeachByName("Ho Thi Quynh Le", "03778559753");
        dv.Delete("Chu Thuy Quyn");
     }
 
    
}
