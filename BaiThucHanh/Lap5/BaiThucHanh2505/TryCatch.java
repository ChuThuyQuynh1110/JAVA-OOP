package BaiThucHanh2505;

public class TryCatch {
    public static void main(String args[]) {
    try {
        String s = null;
        System.out.println(s.length());
        System.out.println("trong khoi try");

    }catch(Exception ex){
        System.out.println(ex.getMessage());
    }
}
}
