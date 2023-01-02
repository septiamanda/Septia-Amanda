import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

//Interface
public class Reservasi implements Hotel 
{
    int idTamu;
    String namaReceptionist;
    int NoKamar;
    String tanggal;
    int lamaNginap;
    int NoKelas;
    static String Kamar;
    static String typeKamar;
    static int harga;
    static int TotalHarga;
    static int Nginap;
    static String Hari;
    static String lamaHari;
    static String pembayaran;
    static int Metode;

    static Scanner input = new Scanner(System.in);
    static Scanner inputan = new Scanner(System.in);

    public void IDTamu() 
    {
        System.out.print("-> Inputkan id Tamu   : ");
    }

    public void NamaTamu() 
    {
        System.out.print("-> Inputkan Nama Tamu : ");
    }

    public void Kamarnya() 
    {
        String[] nama = { "Kamar 01", "Kamar 02", "Kamar 03" };
        String temp;

        System.out.println("\n****************************");
        System.out.println("     SILAHKAN PILIH KAMAR     ");
        System.out.println("****************************");

        // Perulangan dengan for
        for (int i = 0; i < (nama.length - 1); i++) 
        {
            for (int j = 0; j < (nama.length - 1); j++) 
            {
                if (nama[j].compareTo(nama[j + 1]) > 0) 
                {
                    temp = nama[j + 1];
                    nama[j + 1] = nama[j];
                    nama[j] = temp;
                }
            }
        }
        for (int i = 0; i < nama.length; i++) 
        {
            System.out.println(i + 1 + " " + nama[i]);
        }
        System.out.print("\n> Inputkan Kamar Pilihan anda : ");
        NoKamar = input.nextInt();
        input.nextLine();

        // Percabangan if
        if (this.NoKamar == 1) 
        {
            Kamar = "Kamar 01";
        } 
        else if (this.NoKamar == 2) 
        {
            Kamar = "Kamar 02";
        } 
        else if (this.NoKamar == 3) 
        {
            Kamar = "Kamar 03";
        } 
        else 
        {
            System.out.println("Nomor yang anda masukkan salah");
            System.out.print("\n> Masukkan Kamar pilihan anda : ");
            NoKamar = input.nextInt();
            input.nextLine();
        }
    }

    public void Durasi() 
    {
        // Collection Framwork
        // Membuat Object Hashmap
        HashMap<Integer, String> Hari = new HashMap<Integer, String>();
        // Mengisi nilai ke object Hari
        Hari.put(1, " 1 Hari ");
        Hari.put(2, " 2 Hari ");
        Hari.put(3, " 3 Hari ");
        
        System.out.println("\n***************************************");
        System.out.println(" Lama CheckIn\n " + Hari);
        System.out.println("***************************************");
        System.out.print("> Masukkan nomor Lama CheckIn : ");
        lamaNginap = input.nextInt();
        input.nextLine();

        // Percabangan if
        if (lamaNginap == 1) 
        {
            Nginap = 1;
            lamaHari = " 1 Hari ";
        } 
        else if (lamaNginap == 2) 
        {
            Nginap = 2;
            lamaHari = " 2 Hari ";
        } 
        else if (lamaNginap == 3) 
        {
            Nginap = 3;
            lamaHari = " 3 Hari   ";
        } 
        else 
        {
            System.out.println(" Nomor yang anda inputkan salah");
            System.out.print("> Masukkan nomor Nginap : ");
            lamaNginap = input.nextInt();
            input.nextLine();
        }
    }

    public void Kelas() 
    {
        System.out.println("\n********************************************");
        System.out.println("                    CLASS                     ");
        System.out.println("********************************************");
        System.out.println(" 1. Luxury Class   ->   Rp300.000 ");
        System.out.println(" 2. Deluxe Class   ->   Rp500.000 ");
        System.out.println(" 3. Suit Class     ->   Rp750.000 ");
        System.out.println("********************************************");
        System.out.print("\n > Inputkan Jenis Kelas : ");
        NoKelas = input.nextInt();
        input.nextLine();

        // Percabangan if
        if (NoKelas == 1) 
        {
            typeKamar = "Luxury";
            harga = 300000;
        } 
        else if (NoKelas == 2) 
        {
            typeKamar = "Deluxe";
            harga = 500000;
        } 
        else if (NoKelas == 3) 
        {
            typeKamar = "Suit";
            harga = 750000;
        } 
        else 
        {
            System.out.println(" Nomor yang anda Inputkan salah ");
            System.out.print("\n > Inputkan Jenis Kelas : ");
            NoKelas = input.nextInt();
            input.nextLine();
        }
    }

    // Date
    public String Tanggal() 
    {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        this.tanggal = date.format(formatter);
        return this.tanggal;
    }

    @Override
    public void MetodePembayaran() 
    {}
}
