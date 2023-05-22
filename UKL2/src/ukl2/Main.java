
package ukl2;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner uwog = new Scanner(System.in);
        Lelang proses = new Lelang();
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Barang barang = new Barang();
        Laporan lapor = new Laporan();
        do{
        System.out.println("==========      Auction     ==========");
        System.out.println("Login Sebagai: ");
        System.out.println("1. Penawar\n2. Staff");
        System.out.print("Input: ");
        boolean a = true;
        int pilih = uwog.nextInt();
        if (pilih==1) {
            proses.prosesLelang(masyarakat, barang, pilih);
        }
        else if (pilih==2) {
            System.out.print("Masukkan ID Staff: ");
            int id = uwog.nextInt();
            System.out.println("Berhasil Login Sebagai "+petugas.getNama(id-1));
            do{
                System.out.println("1. Mulai lelang\n2. Cek Laporan Barang\n3. Cek Laporan Client\n4. Cek Laporan Staff\n5. Logout\n6. Tutup lelang");
                int staffaction = uwog.nextInt();
                switch(staffaction){
                    case 1:
                        proses.setStatusLelang(true);
                        System.out.println("Lelang dimulai");
                        break;
                    case 2: 
                        lapor.laporan(barang);
                        break;
                    case 3:
                        lapor.laporan(masyarakat);
                        break;
                    case 4:
                        lapor.laporan(petugas);
                        break; 
                    case 5:
                        a = false;
                        break;
                    case 6:
                        System.exit(0);
                        break;
                }
            }while(a);
        }
        else{
            System.out.println("Tidak Tersedia");
        }
    }while(true);
    }
}