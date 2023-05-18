import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class bai4 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        // Thêm tên các loại trái cây vào HashSet
        hashSet.add("Táo");
        hashSet.add("Cam");
        hashSet.add("Xoài");
        hashSet.add("Dưa hấu");

        // Hiển thị số phần tử trong HashSet
        System.out.println("Số phần tử trong HashSet: " + hashSet.size());

        // Nhập tên một loại trái cây và kiểm tra sự tồn tại
        String loaiTraiCay = "Xoài";
        if (hashSet.contains(loaiTraiCay)) {
            System.out.println("Tìm thấy " + loaiTraiCay + " trong HashSet.");
        } else {
            System.out.println("Không tìm thấy " + loaiTraiCay + " trong HashSet.");
        }

        // Xóa một loại trái cây bất kỳ trong HashSet
        String loaiTraiCayXoa = "Cam";
        hashSet.remove(loaiTraiCayXoa);

        // Hiển thị các phần tử còn lại trong HashSet
        System.out.println("Các phần tử còn lại trong HashSet:");
        for (String traiCay : hashSet) {
            System.out.println(traiCay);
        }

        // Tạo một List mới và thêm các phần tử của List vào HashSet
        List<String> list = new ArrayList<>();
        list.add("Dừa");
        list.add("Kiwi");
        list.add("Xoài");

        hashSet.addAll(list);

        // Hiển thị lại HashSet sử dụng Iterator
        System.out.println("Các phần tử trong HashSet sau khi thêm từ List:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String traiCay = iterator.next();
            System.out.println(traiCay);
        }

        // Xóa các phần tử của List có trong HashSet
        hashSet.removeAll(list);

        // Hiển thị lại HashSet
        System.out.println("Các phần tử trong HashSet sau khi xóa các phần tử của List:");
        for (String traiCay : hashSet) {
            System.out.println(traiCay);
        }
    }
}
