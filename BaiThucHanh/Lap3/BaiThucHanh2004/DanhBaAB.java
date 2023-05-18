package BaiThucHanh2004;

public class DanhBaAB  {
    public DanhBa[] arr;
    public int num;
    public DanhBaAB(int size) {
        arr = new DanhBa[size];
        num = 0;
    }
    public void Insert(String name, String newSDT) {
        if(num < arr.length){
            for(int num = 0; num < arr.length; num++) {
                DanhBa std = new DanhBa(null, null);
                std.NhapThongTin();
                std.InThongTin();
                arr[num] = std;
                arr[num].getName();
                arr[num].getSDT();
                System.out.println("Them contact thanh cong. ");
            }
        }
        else {
            System.out.println("Danh ba full! ");
        }
    }
    public void Update(String name, String newSDT) {
        for(int i = 0; i < num; i++) {
            if(arr[i].getName().equals(name)) {
                arr[i].getSDT();
                System.out.println("Cap nhap SDT moi thanh cong.");
                return;
            }
        }
        System.out.println("Khong tim thay contact nao co ten " + name);
    }
    public void Delete(String name) {
        for(int i = 0; i < num; i++) {
            if(arr[i].getName().equals(name)) {
                for(int j = 0; j < num - 1; j ++) {
                    arr[i] = arr[j + 1];
                }
                arr[num - 1] = null;
                num--;
                System.out.println("Xoa contact thanh cong. ");
                return;
            }
        }
    }
    public void SeachByName(String name, String SDT) {
        for(int i = 0; i < num; i++) {
            if(arr[i].getName().equals(name)) {
                System.out.println("SDT cua" + name + "la: " + SDT );
                arr[i].getSDT();
                return;
            }
        }
        System.out.println("Khong tim thay contact co ten " + name);
    }


    
}
