public class Asdos extends Mahasiswa 
{
    public int JamNgasdos;
    
    public Asdos(String Nama, int SKS, int JamNgasdos)
    {
        super(Nama, SKS);
        Jamsibuk = Jamsibuk + JamNgasdos ; //(DownCasting) -> Melakukan pengubahan dari SuperClass ke SubClass
    }

    public int getJamSibuk() //(Polymorphism)
    {
        return Jamsibuk;
    }
}