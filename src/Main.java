import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so luong tam giac: ");
            int n = scanner.nextInt();
            TamGiac[] tamGiacs = new TamGiac[n];
            for (int i = 0; i < n; i++){
                System.out.println("Nhap tam giac thu " + (i + 1) + ":");
                TamGiac tamGiac = new TamGiac();
                tamGiac.NhapCanh();
                tamGiacs[i] = tamGiac;
            }
            double DienTichMax = tamGiacs[0].TinhDienTich();
            for (int i = 0; i < n; i++){
                double DienTich = tamGiacs[i].TinhDienTich();
                if (DienTich > DienTichMax){
                    DienTichMax = DienTich;
                }
            }
            System.out.println("Cac canh cua tam giac co dien tich lon nhat la: ");
            for (int i = 0; i < n; i++){
                if (tamGiacs[i].TinhDienTich() == DienTichMax){
                    tamGiacs[i].InCanhTamGiac();
                }
            }


        } catch (InputMismatchException e) {
            System.out.println("sai tham số đầu vào");
        }
    }
}