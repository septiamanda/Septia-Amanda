public class Dosen extends Elemen 
{
    public int JumlahHariKerja;
    private int jamsibuk;

    public Dosen (String Nama, int JumlahHariKerja)
    {
        super(Nama);
        jamsibuk = JumlahHariKerja * 8; 
    } 

    public void mailCheck()
    {
        System.out.println(getNama() + " adalah seorang dosen dengan jam sibuk " + getJamSibuk());
    }

    public int getJamSibuk() //(Polymorphism)
    {
        return jamsibuk;
    }
}
