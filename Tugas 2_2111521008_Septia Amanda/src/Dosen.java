public class Dosen extends Elemen 
{
    public int JumlahHariKerja;
    private int Jamsibuk;

    public Dosen (String Nama, int JumlahHariKerja)
    {
        super(Nama);
        Jamsibuk = JumlahHariKerja * 8; 
    } 

    public void info()
    {
        System.out.println(getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }

    public int getJamSibuk() //(Polymorphism)
    {
        return Jamsibuk;
    }
}
