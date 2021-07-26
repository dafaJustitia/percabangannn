
package sepedamotor;


public class becakMotor extends SepedaMotor{
    
    
    public becakMotor(){
        jmlRoda = 3;
        bahanBakar = "avtur";
    }
    public void tampilkan(){
        
        System.out.println("Harga :");
        System.out.println("Jumlah Roda ");
    }
    public void tampilkan(int a, int b){
        System.out.println("Harga bemo :"+a);
        System.out.println("Jumlah Roda bemo "+b);
    }
    public static void main(String[] args) {
        becakMotor bemo = new becakMotor();
        bemo.tampilkan(11000, 5);
    }
    
    
    
    
    
}
