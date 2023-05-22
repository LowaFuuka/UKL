
package ukl2;

import java.util.ArrayList;
public class Masyarakat implements User {
    private ArrayList <String> namaMasyarakat = new ArrayList <>();
    private ArrayList <String> alamat = new ArrayList <>();
    private ArrayList <String> telepon = new ArrayList <>();
    
    public Masyarakat(){
        addMasyarakat("Charlotte", "Berlin", "8000123154");
        addMasyarakat("Sushang", "Wuhan", "8997351");
        addMasyarakat("Sakura", "Tokyo", "85812351");
        addMasyarakat("Kazuku", "Tokyo", "82617851");
    }
    
    public void addMasyarakat(String nama, String alamat, String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
    }
    
    public void editMasyarakat(String nama, String alamat, String telepon, int id){
        setNama(id,nama);
        setAlamat(id,alamat);
        setTelepon(id,telepon);
    }
    
    public int getJmlMember(){
        return namaMasyarakat.size();
    }
    
     @Override
    public void setNama(String Nama) {
        namaMasyarakat.add(Nama);
    }
    
    public void setNama(int index, String Nama){
        namaMasyarakat.set(index, Nama);
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
        return namaMasyarakat.get(Nama);
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
