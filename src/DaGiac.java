import java.util.Scanner;

public class DaGiac {
    private int SoCanh;
    private int[] KichThuoc;

    public DaGiac() {

    }

    public int getSoCanh() {
        return SoCanh;
    }

    public void setSoCanh(int soCanh) {
        SoCanh = soCanh;
    }

    public int[] getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(int[] kichThuoc) {
        KichThuoc = kichThuoc;
    }

    public DaGiac(int soCanh) {
        setSoCanh(soCanh);
        setKichThuoc(new int[soCanh]);
    }
    public void NhapCanh(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < getSoCanh(); i++){
            KichThuoc[i] = scanner.nextInt();
        }
    }
    public int TinhChuVi(){
        int chuVi = 0;
        for (int i = 0; i <getSoCanh(); i++){
            chuVi = chuVi + getKichThuoc()[i];
        }
        return chuVi;
    }
    public void HienThiCanh(){
        for (int i = 0; i <getSoCanh(); i++){
            System.out.println("kích thước cạnh thứ " + (i+1) + ":" + getKichThuoc()[i]);
        }
    }
}
