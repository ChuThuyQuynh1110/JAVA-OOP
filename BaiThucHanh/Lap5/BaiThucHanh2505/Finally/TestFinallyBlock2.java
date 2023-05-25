package BaiThucHanh2505.Finally;

public class TestFinallyBlock2 {
    public static void main(String args[]){
        try{
            int data = 25/0;
            System.out.println(data);
        }
        catch(NullPointerException ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code....");
    }
}
