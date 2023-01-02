import java.util.InputMismatchException;

//Inheritance
public class Pembayaran extends Reservasi
{
    public int Kelas(int harga)
    {
        Pembayaran.harga = harga;
        return harga;
    }

    @Override
    public void MetodePembayaran()
    {
        System.out.println("\n********************************************");
        System.out.println("               METODE PEMBAYARAN              ");
        System.out.println("********************************************  ");
        System.out.println(" 1. Virtual Account  BCA (Diskon 5%)          ");
        System.out.println(" 2. Virtual Account Lainnya No Diskon         ");
        System.out.println(" 3. E-Wallet                                  ");
        System.out.println(" 4. Tunai                                     ");
        System.out.print("\n > Inputkan Metode Pembayaran : ");
        Metode = input.nextInt();

        //Pengkondisian if
        if (Metode == 1)
        {
            //Operasi Matematika
            TotalHarga = (int) (((double) 95/100) * harga);
            pembayaran = "Virtual Account BCA";
        }
        else if (Metode == 2)
        {
            TotalHarga = harga;
            pembayaran = "Bank Lainnya No Diskon";
        }
        else if (Metode == 3)
        {
            TotalHarga = harga;
            pembayaran = "E-Wallet";
        }
        else if (Metode == 4)
        {
            TotalHarga = harga;
            pembayaran = "Tunai";
        }
        else 
        {
            System.out.println(" Inputkan Metode Pembayaran Yang Diinginkan ");
            System.out.print("\n -> Inputkan Metode Pembayaran ");
            Metode = input.nextInt();
        }
    }

    @Override
    // This Exception
    public void Durasi()
    {
        boolean kondisi = true;
        do
        {
            try
            {
                if (lamaNginap <= 0 || lamaNginap > 3)
                    throw new Exception();
                kondisi = false;
            }
            catch (InputMismatchException e)
            {
                System.out.print(" Maaf Inputan anda salah, silahkan Inputkan Angka saja 1-3" + "\n");
                input.nextLine();
            }
            catch (Exception e)
            {
                System.out.print("Inputan anda salah! pilihan harus hanya bisa diisi angka 1-3" + "\n");
                input.nextLine();
            }
            finally 
            {
                System.out.print(" Hore! Sudah Benar" + "\n ");
            }
        }
        while (kondisi);
    }
}
