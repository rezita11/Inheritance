package InheritancePraktikum;
public class Siswa extends Sekolah {
    private String nama;
    private int umur;
    
    public Siswa (String nama, int umur, int absen, String kelas){
        super(absen, kelas);
        this.nama=nama;
        this.umur=umur;
    }
    public void identity(){
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        super.show();
    }
}
