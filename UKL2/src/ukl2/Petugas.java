
package ukl2;

import java.util.ArrayList;
public class Petugas implements User {
    private ArrayList <String> namaPetugas = new ArrayList <>();
    private ArrayList <String> alamat = new ArrayList <>();
    private ArrayList <String> telepon = new ArrayList <>();
    
    public Petugas(){
        addPetugas("Kirara", "Osaka", "800035428");
        addPetugas("Kazuki", "Solo", "60091274");
        addPetugas("Munir", "Surabaya", "1264931");
        addPetugas("Jack", "Sydney", "1000951824");
    }
    
    public void addPetugas(String nama, String alamat, String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
    }
    
    public void editPetugas(String nama, String alamat, String telepon, int id){
        setNama(id,nama);
        setAlamat(id,alamat);
        setTelepon(id,telepon);
    }
    
    public int getJmlPetugas(){
        return namaPetugas.size();
    }
    
     @Override
    public void setNama(String Nama) {
        namaPetugas.add(Nama);
    }
    
    public void setNama(int index, String Nama){
        namaPetugas.set(index, Nama);
    }

    @Override
    public void setAlamat(String Alamat) {
        alamat.add(Alamat);
    }
    
     public void setAlamat(int index, String alamat){
        this.alamat.set(index, alamat);
    }

    @Override
    public void setTelepon(String Telepon) {
        telepon.add(Telepon);
    }
    
    public void setTelepon(int index, String telepon){
        this.telepon.set(index, telepon);
    }

    @Override
    public String getNama(int Nama) {
        return namaPetugas.get(Nama);
    }

    @Override
    public String getAlamat(int Alamat) {
        return alamat.get(Alamat);
    }

    @Override
    public String getTelepon(int Telepon) {
        return telepon.get(Telepon);
        
    }
}
