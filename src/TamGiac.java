import java.util.Scanner;

public class TamGiac extends DaGiac{
    private int SoCanh;
    private int[] KichThuocTamGiac;

    public TamGiac(){
        SoCanh = 3;
        KichThuocTamGiac = new int[3];
    }
    public void NhapCanh(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < SoCanh; i++) {
            System.out.print("Nhap kich thuoc canh thu " + (i + 1) + ": ");
            KichThuocTamGiac[i] = scanner.nextInt();
        }
    }
    public int TinhChuVi(){
        return KichThuocTamGiac[0] + KichThuocTamGiac[1] + KichThuocTamGiac[2];
    }
    public double TinhDienTich(){
        double S = 0;
        double P = TinhChuVi() / 2;
        double A = KichThuocTamGiac[0];
        double B = KichThuocTamGiac[1];
        double C = KichThuocTamGiac[2];
        return S = Math.sqrt(P * (P - A) * (P - B) * (P - C));
    }
    public void InCanhTamGiac(){
        for (int i = 0; i < SoCanh; i++){
            System.out.println("Kich thuoc canh thu " + (i + 1) + ":" + KichThuocTamGiac[i]);
        }
    }
}
