import java.util.LinkedList;

public class TA3 
{
    public static void main(String[] args) 
    {
        //Buatlah sebuah LinkedList 
        //yang mana pada LinkedList tersebut dapat menambah data berupa No_Bp, Nama_Mahasiswa, Alamat.

        LinkedList <String> NIM = new LinkedList<>();
        LinkedList <String> NAMA = new LinkedList<>();
        LinkedList <String> ALAMAT = new LinkedList<>();

        NIM.add("2111521008");
        NAMA.add("Septia Amanda");
        ALAMAT.add("Lubuk Alung");

        System.out.println("................................Data Mahasiswa...............................");
        System.out.println(" NAMA   \t = " + NIM);
        System.out.println(" NIM    \t = " + NAMA);
        System.out.println(" ALAMAT \t = " + ALAMAT);
        System.out.println("..............................Universitas Andalas............................");
        System.out.println("                                                                             ");
        
        //Penambahan data berupa nama, nim, dan alamat mahasiswa
        NIM.add("2111521009");
        NAMA.add("Novita Ramadhani");
        ALAMAT.add("Pariaman");

        NIM.add("2103211075");
        NAMA.add("Farhan Alkautsar");
        ALAMAT.add("Bogor");

        NIM.add("2111521010");
        NAMA.add("Viola Parlin");
        ALAMAT.add("Medan");

        NIM.add("2111123025");
        NAMA.add("Yuni Altriana");
        ALAMAT.add("Padang");

        NIM.add("2111523010");
        NAMA.add("Riswanan Muslim");
        ALAMAT.add("Bandung");

        System.out.println("................................Data Mahasiswa...............................");
        System.out.println(" NAMA   \t = " + NIM);
        System.out.println(" NIM    \t = " + NAMA);
        System.out.println(" ALAMAT \t = " + ALAMAT);
        System.out.println("..............................Universitas Andalas............................");
        System.out.println("                                                                             ");

        //Penyisipan beberapa data mahasiswa
        NIM.set(4, "2111522020");
        NAMA.set(4, "Chairunnisa");
        ALAMAT.set(4, "Jakarta");

        NIM.set(5, "2111530002");
        NAMA.set(5, "Siti Fatimah");
        ALAMAT.set(5, "Aceh");

        System.out.println(".........................Hasil sisipan data mahasiswa.........................");
        System.out.println(" Hasil sisipan beberapa data mahasiswa = " + NIM);
        System.out.println(" Hasil sisipan beberapa data mahasiswa = " + NAMA);
        System.out.println(" Hasil sisipan beberapa data mahasiswa = " + ALAMAT);
        System.out.println(".............................Universitas Andalas..............................");
        System.out.println("                                                                              ");

        //Remove data mahasiswa
        NIM.remove(3);
        NAMA.remove(3);
        ALAMAT.remove(3);

        System.out.println("..........................Hasil remove data mahasiswa..........................");
        System.out.println("NAMA    \t = " + NAMA);
        System.out.println("NIM     \t = " + NIM);
        System.out.println("ALAMAT  \t = " + ALAMAT);
        System.out.println("..............................Universitas Andalas..............................");
        System.out.println("                                                                               ");

        //Fungsi POP
        System.out.println("............................Karakter yang dihapus..............................");
        System.out.println("Karakter yang dihapus = " +NIM.pop());
        System.out.println("Karakter yang dihapus = " +NAMA.pop());
        System.out.println("Karakter yang dihapus = " +ALAMAT.pop());
        System.out.println("..............................................................................");
        System.out.println("                                                                              ");

        System.out.println("..............................Hasil Fungsi POP................................");
        System.out.println("Hasil Fungsi POP = " +NIM);
        System.out.println("Hasil Fungsi POP = " +NAMA);
        System.out.println("Hasil Fungsi POP = " +ALAMAT);
        System.out.println("..............................................................................");
        System.out.println("                                                                              ");

        //Fungsi PUSH
        NIM.push("2112512008");
        NAMA.push("Bj. Habibie");
        ALAMAT.push("Jerman");

        System.out.println("..............................Hasil Fungsi PUSH..............................");
        System.out.println("Hasil Fungsi PUSH = " +NIM);
        System.out.println("Hasil Fungsi PUSH = " +NAMA);
        System.out.println("Hasil Fungsi PUSH = " +ALAMAT);
        System.out.println("..............................................................................");
        System.out.println("                                                                              ");

        //Fungsi IndexOf
        System.out.println("...........................Hasil Fungsi IndexOf..............................");
        System.out.println("IndexOf NIM     \t = " +NIM.indexOf("2111521008"));
        System.out.println("IndexOf NAMA    \t = " +NAMA.indexOf("Farhan Alkautsar"));
        System.out.println("IndexOf ALAMAT  \t = " +ALAMAT.indexOf("Jerman"));
        System.out.println("............................................................................");
        System.out.println("                                                                            ");

        //Fungsi Get
        System.out.println(".................................Fungsi Get.................................");
        System.out.println("Get NIM     : \t " + NIM.get(3));
        System.out.println("Get NAMA    : \t " + NAMA.get(3));
        System.out.println("Get ALAMAT  : \t " + ALAMAT.get(3));
        System.out.println("............................................................................");
        System.out.println("                                                                            ");

        //isEmpty
        System.out.println("is NIM Empty    \t = " +NIM.isEmpty());

        NAMA.clear();
        System.out.println("is NAMA Empty   \t = " +NAMA.isEmpty());

        ALAMAT.clear();
        System.out.println("is ALAMAT Empty \t = " +ALAMAT.isEmpty());
    }
}