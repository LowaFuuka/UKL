
package ukl2;

import java.util.ArrayList;
public class Barang {
    private ArrayList <Integer> idBarang = new ArrayList <>();
    private ArrayList <String> namaBarang =  new ArrayList <>();
    private ArrayList <Integer> hargaAwal = new ArrayList <>();
    private ArrayList <Boolean> status = new ArrayList <>();
    
    public Barang(){
        addBarang(1,500000,"Statue");
        addBarang(2,2500000,"STRV m/42");
        addBarang(3,2500000,"VK 45.03");
    }
    
     public void addBarang(int id,int harga,String namaBarang){
        setId(id);
        setHarga(harga);
        setNamaBarang(namaBarang);
        setStatus(true);
    }


    public void setId(int id) {
        idBarang.add(id);
    }
   
    public void setHarga(int harga) {
        hargaAwal.add(harga);
    }
    
    public void setNamaBarang(String nama){
        namaBarang.add(nama);
    }
    
    public void setStatus(boolean status){
        this.status.add(status);
    }
    
    public void editStatus(int index,boolean status){
        this.status.set(index, status);
    }

    public int getId(int id) {
        return idBarang.get(id);
    }
    
    public int getHarga(int harga) {
        return hargaAwal.get(harga);
    }
    
    public String getNamaBarang(int nama){
        return namaBarang.get(nama);
    }
    
    public boolean getStatus(int status){
        return this.status.get(status);
    }

    public int getJmlBarang(){
        return namaBarang.size();
    }

}
