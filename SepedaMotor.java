
package sepedamotor;

/**
 *
 * @author MOKLET-2
 */
public class SepedaMotor {
    
    int jmlRoda;
    private long harga;
    protected String bahanBakar;
    
    public int getRoda(){
        return jmlRoda;
    }
    public void setRoda(int jmlRoda){
        this.jmlRoda=jmlRoda;
    }
    public long getHarga(){
        return harga;
    }
    public void setHarga(long harga){
        this.harga = harga;
    }
    public void tampilkan(){
    System.out.println("Jumlah roda :"+getRoda());
    System.out.println("Harga motor :"+getHarga());
    
    }
    
     public static void main(String[] args) {
   SepedaMotor honda=new SepedaMotor();
   honda.jmlRoda=2;
   honda.harga = 1000000;
   honda.tampilkan();
}       
  
}

    

  

