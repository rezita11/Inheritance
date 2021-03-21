package latihan2;
public class Employ extends Person{
    private String noKaryawan;
    //Konstruktor
    public Employ (String noKaryawan, String nama, int usia){
        super (nama, usia);
        this.noKaryawan = noKaryawan;
    }
    //Methode
    public void info (){
        System.out.println("No. Karyawan : " +this.noKaryawan);
        super.info();
    }
    
}//Akkhir kelas Employ
