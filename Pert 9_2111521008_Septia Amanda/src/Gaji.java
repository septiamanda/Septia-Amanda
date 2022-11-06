public class Gaji extends Pegawai 
{
    private double salary; //Gaji Tahunan
    public Gaji (String name, String address, int number, double salary) 
    {
        super (name, address, number);
        setSalary (salary);
    }
    public void mailCheck ()
    {
        System.out.println("Memeriksa Class Gaji dalam Surat");
        System.out.println("Surat Tertuju Untuk" + getName() + "Dengan Gaji " + salary);

    }
    public double getSalary ()
    {
        return salary;
    }
    public void setSalary(double newSalary)
    {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }
    public double computePay()
    {
        System.out.println("Menghitung Pembayaran Gaji untuk " + getName());
        return salary/52;
    }
}
