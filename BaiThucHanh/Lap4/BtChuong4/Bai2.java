import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n, node, sum = 0, count = 0;
        double tbCong;
        DecimalFormat dcf = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
             
        System.out.println("Nhap vao so phan tu cua danh sach: ");
        n = sc.nextInt();
             
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + i + ": ");
            node = sc.nextInt();
            linkedList.add(node);
        }
             
        for (int i = 0; i < n; i++) {
            if (linkedList.get(i) % 2 == 0) {
                sum += linkedList.get(i);
                count++;    // biến lưu trữ số các số chẵn
            }
        }
             
        tbCong = (double)sum / count;
        System.out.println("Trung binh cong cua cac so chan trong danh sach = " + 
            dcf.format(tbCong));
    }
}
