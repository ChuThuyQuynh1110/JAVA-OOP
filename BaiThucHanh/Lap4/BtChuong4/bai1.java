

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in); 
         
        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();
             
        // nhập và thêm phần tử cho ArrayList
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu i " + i +": ");
            int number = sc.nextInt();
            arrListInteger.add(number);
        }
        // Nhập số nguyên và xóa nếu giống
        System.out.print("Nhap so nguyen: "); 
        int numberToDelete = sc.nextInt();
        for (int i = 1; i < arrListInteger.size(); i++) 
        {
            if(arrListInteger.get(i) ==  numberToDelete){
                arrListInteger.remove(i);
                i--;
                continue;
            }
            arrListInteger.add(numberToDelete);

        }
        int max = arrListInteger.get(0);    
         
        for (int i = 1; i < arrListInteger.size(); i++) 
        {
            // nếu kết quả của phép so sánh này lớn hơn 0
            // tức biến max nhỏ hơn phần tử tại vị trí thứ i trong ArrayList
            // thì gán max = phần tử tại vị trí i
            // và đó chính là phần tử lớn nhất
            if (arrListInteger.get(i).compareTo(max) > 0) {
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInteger = " + max);
        // Sắp xếp dãy số và in ra màn hình
        arrListInteger.sort(null);
        System.out.println("sau khi sap xep:");
        for (int number : arrListInteger) {
            System.out.print(number + " ");
        }
}
}
