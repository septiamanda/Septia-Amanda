import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TAQueue2 
{
    public static void main(String[] args) 
    {
        String pembeli;
        int i=0;
        boolean bool = true;

        Queue <String> purchaseQueue = new LinkedList<>();

        Scanner pilih = new Scanner(System.in);

        System.out.println("Antrian Pnjualan Mobil pada Dealer");
        System.out.println("..................................");

        System.out.println("1. ENQUEUE");
        System.out.println("2. DEQUEUE");
        System.out.println("3. Elemen Paling Depan/Awal");
        System.out.println("4. Apakah Antrian kosong? ");
        System.out.println("5. Tampilkan Queue");
        System.out.println("6. Jumlah Mobil");
        System.out.println("7. Selesai");
        System.out.print("Masukkan Pilihan [1-7] : ");

        do
        {
            int input=pilih.nextInt();
            switch (input) 
            {
                case 1:
                    System.out.println("Banyak Mobil yang di Enqueue : ");
                    i=0;
                    int h=pilih.nextInt();
                    do
                    {
                        System.out.print("Inputkan nama mobil : ");
                        pembeli=pilih.next();
                        purchaseQueue.add(pembeli);
                        i++;
                    }
                    while(i<h);
                    System.out.println("Antrian Pembelian : "+purchaseQueue);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Mobil yang diambil : "+purchaseQueue.poll()); 
                    System.out.println("");
                    break;
    
                case 3:
                    System.out.println("Elemen paling awal/depan : "+purchaseQueue.peek()); 
                    System.out.println("");
                    break;
    
                case 4:
                    System.out.println("Apakah Antrian kosong? : " +purchaseQueue.isEmpty());
                    System.out.println("");
                    break;
    
                case 5:
                    System.out.println("Tampilkan Queue : " +purchaseQueue);
                    System.out.println("");
                    break;
                
                case 6:
                    System.out.println("Jumlah Mobil : " +purchaseQueue.size());
                    System.out.println("");
                    break;
                    
                case 7:
                    System.exit(0);
                    break;
    
                default:
                    System.err.println("Pilihan tidak tersedia!");
                    System.out.println("");
            }
        }
        while(bool);       
    }
}
