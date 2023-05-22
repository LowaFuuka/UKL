
package ukl2;

public class Laporan {
        public void laporan(Barang barang){
        int x = barang.getJmlBarang();
        System.out.println("\n==========        List Barang       ==========\n");
        for(int i=0;i < x;i++){
            System.out.println("Id Barang\t: " + barang.getId(i) +
                    "\nDengan Nama\t: "+ barang.getNamaBarang(i) +
                    "\nSeharga\t: Rp." + barang.getHarga(i) +
                    "\nBerstatus\t: "+ barang.getStatus(i) +
                    "\n-----");
        }
        }
    public void laporan(Petugas petugas){
        int x = petugas.getJmlPetugas();
        System.out.println("\n==========        List Employee       ==========\n");
        for(int i=0;i < x;i++){
            System.out.println("Nama Staff\t: " + petugas.getNama(i) +
                    "\nAlamat\t:"+ petugas.getAlamat(i) +
                    "\nContact\t:" + petugas.getTelepon(i) +                   
                    "\n-----");
        }
    }
    public void laporan(Masyarakat masyarakat){
        int x = masyarakat.getJmlMember();
           System.out.println("\n==========     List Client     ==========\n");
           for(int i=0;i < x;i++){
               System.out.println("Nama Client\t: " + masyarakat.getNama(i) +
                       "\nAlamat\t:"+ masyarakat.getAlamat(i) +
                       "\nContact\t:" + masyarakat.getTelepon(i) +                   
                       "\n-----");
        }
    }
}
