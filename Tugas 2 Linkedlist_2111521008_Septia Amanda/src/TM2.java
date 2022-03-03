import java.util.LinkedList;

public class TM2 
{
   public static void main(String[] args) 
   {
       // Diketahui nama saya. Dimana saya adalah sebuah Limkedlist. 
       // nama lengkap saya dimana lengkap dengan spasi

       LinkedList <String> saya = new LinkedList<>();

       saya.add("S");
       saya.add("E");
       saya.add("P");
       saya.add("T");
       saya.add("I");
       saya.add("A");
       saya.add(" ");
       saya.add("A");
       saya.add("M");
       saya.add("A");
       saya.add("N");
       saya.add("D");
       saya.add("A");

       System.out.println("Nama Saya :" +saya);
       System.out.println("Ukuran :" +saya.size());

       //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini :

       //1. Add karakter lain yang anda inginkan
       saya.addFirst("Mult.");
       saya.addFirst("Sc.");
       saya.addFirst("Dr.");
       saya.addFirst("Ing.");
       saya.addFirst("Ir.");
       saya.addFirst("Prof.");
       saya.addLast("B.A.");
       saya.add("B.M");
       saya.add("B.Sc");
       System.out.println("setelah di add : " +saya);

       //2. Sisipkan karakter lain yang anda inginkan
       saya.add(2, "DR(HC)");
       saya.add(20, "Sp.KN.");
       saya.add(21, "Sc.D.");
       System.out.println("setelah di disisipkan : " +saya);

       //3. Hapus beberapa karakter yang ingin anda hapus
       saya.remove(4);
       saya.remove(20);
       saya.remove(21);
       System.out.println("setelah di remove : " +saya);

       //4. Buat fungsi POP dan PUSH paja project anda
       //*Fungsi POP
       System.out.println("fungsi POP : " +saya.pop());
       System.out.println("fungsi POP : " +saya.pop());
       System.out.println("hasil fungsi POP : " +saya);

       //*Fungsi PUSH
       saya.push("Ir.");
       saya.push("Prof.");
       System.out.println("hasil fungsi PUSH : " +saya);    
   } 
}
