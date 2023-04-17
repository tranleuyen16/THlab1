import java.util.Scanner;
import java.util.Arrays;
class ThongTinDangKyXe {
    private String chuXe;
    private String loaiXe;
    private int triGiaXe;
    private int dungTich;
    private Double thue;

    public ThongTinDangKyXe(){

    }

    public ThongTinDangKyXe (String chuXe, String loaiXe, int triGiaXe, int dungTich, Double thue){
        this.chuXe = chuXe;
        this.loaiXe = loaiXe;
        this.triGiaXe = triGiaXe;
        this.dungTich = dungTich;
        this.thue = thue;
    }

    public String getchuXe(){
        return chuXe;
    }
    public void setchuXe(String chuXe){
        this.chuXe = chuXe;
    }
    public String getloaiXe(){
        return loaiXe;
    }
    public void setloaiXe(String loaiXe){
        this.loaiXe = loaiXe;
    }
    public int gettriGiaXe(){
        return triGiaXe;
    }
    public void settriGiaXe(int triGiaXe){
        this.triGiaXe = triGiaXe;
    }
    public int getdungTich(){
        return dungTich;
    }
    public void setdungTich(int dungTich){
        this.dungTich = dungTich;
    }
    public Double getthue(){
        return thue;
    }
    public void setthue(Double thue){
        this.thue = thue;
    }
    public double tinhThue(){ 
        double thue; 
    if(dungTich<100) thue=triGiaXe*0.01; 
    else if (dungTich >= 100 && dungTich<=200) thue = triGiaXe * 0.03; 
    else thue = triGiaXe * 0.05; return thue; 
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "chuXe=" + chuXe +
                ", loaiXe='" + loaiXe + '\'' +
                ", triGiaXe='" + triGiaXe + '\'' +
                ", dungTich='" + dungTich + '\'' +
                ", thue='" + thue + '\'' +
                '}';
    }
    void inthue() {
        System.out.printf("%-5d %-20s %-15s %-15s %-15s\n", chuXe, loaiXe, triGiaXe, dungTich, thue);
    }
}
public class THlab1bt2 
{
    static Scanner sc = new Scanner (System.in);
    static void nhapXe (ThongTinDangKyXe nhap){
        System.out.printf("Ten chu xe: ");
        nhap.setchuXe(sc.nextLine());
        System.out.printf("Loai Xe: ");
        nhap.setloaiXe(sc.nextLine());
        System.out.printf("Dung tich: ");
        nhap.setdungTich(sc.nextInt());
        System.out.printf("Tri gia xe: ");
        nhap.settriGiaXe(sc.nextInt());
        System.out.printf("Thue: ");
        nhap.setthue(sc.nextDouble());
    }
     public static void main(String[] args)
     {
        ThongTinDangKyXe t[] = null;
        int a, n = 0;
        boolean flag = true;
            do
            {
                System.out.println("Ban chon lam gi : " );
                System.out.println("1. Nhap thong tin \n " + "2. Xuat thong tin xe \n " + "3. Nhap so khac de thoat ");
            a = sc.nextInt ();
                switch (a)
                {
                case 1 :
                    System.out.printf("Nhap so luong can nhap : ");
                    n = sc.nextInt();
                    t = new ThongTinDangKyXe [n];
                    for (int i = 0; i < n; i++){
                        System.out.printf("Xe thu " + (i + 1));
                        t[i]= new ThongTinDangKyXe();
                        nhapXe(t[i]);
                    }
                    break;
                case 2 :
                    System.out.printf("%5s %5s %10s %10s %8s \n ","Chu Xe ","Loai Xe","Tri Gia Xe","Dung Tich","Thue");
                    for (int i = 0;i < n; i ++){
                        t[i].inthue();
                    }
                    break;
                default:
                    System.out.printf("Ket Thuc");
flag = false;
                    break;
                }
            }while (flag);
    }
}