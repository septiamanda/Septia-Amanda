public class Mahasiswa extends Elemen 
{
public int SKS;
   public int Jamsibuk;

   public Mahasiswa (String Nama, int SKS)
   {
       super(Nama);
       Jamsibuk = SKS * 3;
   } 

   public void mailCheck()
   {
       System.out.println(getNama() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
   }

   public int getJamSibuk() //(Polymorphism)
   {
    return Jamsibuk;
   }
}