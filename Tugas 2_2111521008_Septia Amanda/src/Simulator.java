
/* 
Nama  : Septia Amanda
NIM   : 2111521008 
Kelas : B
*/

public class Simulator 
{
    public static void main(String[] args) 
    {
        int Total_Jam_Sibuk;
        Mahasiswa mahasiswa3 = new Asdos(" Fairuzikun ", 21, 10); //(Upcasting) -> Proses Pengubahan Referensi dari SubClass Ke SuperClass
        Mahasiswa mahasiswa4 = new Asdos(" Angel-chan ", 20, 4); //(Upcasting)
        Dosen dosen1 = new Dosen(" Raja OP Damanik ", 5); 
        Dosen dosen2 = new Dosen(" Nivotko ", 3); 
        Mahasiswa mahasiswa1 = new Mahasiswa(" Firman ", 20); 
        Mahasiswa mahasiswa2 = new Mahasiswa(" Nid to pass this sem ", 23); 
        
        mahasiswa3.info();
        dosen1.info();
        mahasiswa4.info();
        mahasiswa1.info();
        mahasiswa2.info();
        dosen2.info();

        Total_Jam_Sibuk = mahasiswa3.getJamSibuk() + dosen1.getJamSibuk() + mahasiswa4.getJamSibuk() + mahasiswa1.getJamSibuk() + mahasiswa2.getJamSibuk() + dosen2.getJamSibuk();
        System.out.println(" Total jam sibuk elemen Fasilkom adalah " + Total_Jam_Sibuk);

        System.out.println(" ---------------------------------------------------------------------- ");
        System.out.println("                           Tugas 2 PBO ");
        System.out.println("                      Nama : Septia Amanda ");
        System.out.println("                      NIM  : 2111521008 ");
        System.out.println(" ---------------------------------------------------------------------- ");
    }
}