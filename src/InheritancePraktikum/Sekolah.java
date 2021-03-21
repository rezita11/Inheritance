package InheritancePraktikum;
public class Sekolah {
    private int absen;
    private String kelas;
    
    public Sekolah (int absen, String kelas){
        this.absen=absen;
        this.kelas=kelas;
    }
    public void show(){
        System.out.println("Absen : "+absen);
        System.out.println("Kelas : "+kelas);
    }
    
}
