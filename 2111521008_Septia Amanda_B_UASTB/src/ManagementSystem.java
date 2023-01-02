import java.util.Scanner;
import java.util.InputMismatchException;
import java.sql.*;

public class ManagementSystem extends Reservasi
{
    static Connection conn;
    public static void main(String[] args)
    {
        //CRUD
        try (Scanner input = new Scanner(System.in)) 
        {
            String pilihanUser;
            boolean isLanjutkan = true;

            String url = "jdbc:mysql://localhost:3306/reservasi";
            
            try 
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url,"root", "");
                System.out.println(" Class Driver ditemukan\n ");
                System.out.println(" = WELCOME TO HOTEL ALKASA =\n ");

                while (isLanjutkan) 
                {
                    System.out.println("\n***************************************");
                    System.out.println("     Program Reservasi Kamar Hotel    ");
                    System.out.println("             ALKASA BOGOR             ");
                    System.out.println("***************************************");
                    System.out.println(" 1. Lihat  Data Tamu ");
                    System.out.println(" 2. Tambah Data Tamu ");
                    System.out.println(" 3. Ubah   Data Tamu ");
                    System.out.println(" 4. Hapus  Data Tamu ");
                    System.out.println(" 5. Cari   Data Tamu ");

                    System.out.println("\n> Masukkan Pilihan Anda (1/2/3/4/5) : ");
                    pilihanUser = input.next();input.nextLine();

                    switch (pilihanUser) 
                    {
                        case "1" :
                            lihatData();
                            break;
                        
                        case "2" :
                            tambahData();
                            break;

                        case "3" :
                            ubahData();
                            break;

                        case "4" :
                            hapusData();
                            break;
                        
                        case "5" :
                            cariData();
                            break;
                        default:
                            System.err.println("\nInputan anda tidak ditemukan\nInputkan [1-5]");
                    }

                    System.out.print("\n> Apakah Anda ingin melanjutkan [y/n]? ");
                    pilihanUser = input.next();input.nextLine();
                    isLanjutkan = pilihanUser.equalsIgnoreCase("y");
                }
                System.out.println(" Terima Kasih Telah Mengunjungi Hotel Kami\n");

            } 
            catch (ClassNotFoundException ex) 
            {
                System.err.println("\nDriver Error\n");
                System.exit(0);
            } 
            catch (Exception e) 
            {
                System.err.println("Tidak Ada Koneksi");
            }
        } 
    }
    
    private static void lihatData() throws SQLException 
    {
        System.out.println("\n**************************************");
        String text1 = "   Daftar Seluruh Tamu Hotel ALKASA   ";
        System.out.println(text1.toUpperCase());
        System.out.println("**************************************");

        String sql = "SELECT * FROM reservasi";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) 
        {
            System.out.print("\nTanggal Reservasi\t: ");
            System.out.print(result.getString("tanggal"));
            System.out.print("\nID Tamu\t\t\t: ");
            System.out.print(result.getInt("id_Tamu"));
            System.out.print("\nNama Tamu\t\t: ");
            System.out.print(result.getString("NamaTamu"));
            System.out.print("\nNginap\t\t\t: ");
            System.out.print(result.getString("Nginap"));
            System.out.print("\nHari\t\t\t: ");
            System.out.print(result.getString("Hari"));
            System.out.print("\nType Kamar\t\t: ");
            System.out.print(result.getString("Type_Kamar"));
            System.out.print("\nNomor Kamar\t\t: ");
            System.out.print(result.getString("KamarHotel"));
            System.out.print("\nMetode Pembayaran\t: ");
            System.out.print(result.getString("Pembayaran"));
            System.out.print("\nTotal Harga\t\t: ");
            System.out.print(result.getInt("Total_Harga"));
            System.out.print("\n");
        }
    }

    private static void tambahData() throws SQLException 
    {
        System.out.println("\n**********************************************");
        String text2 = "     Tambah Data Tamu ";
        System.out.println(text2.toUpperCase());
        System.out.println("**********************************************");

        try 
        {
            Reservasi reserv = new Reservasi();
            reserv.IDTamu();
            Integer idTamu = input.nextInt(); input.nextLine();
            reserv.NamaTamu();
            String namaTamu = input.nextLine();
            reserv.Tanggal();
            String tanggal = reserv.tanggal;
            reserv.Kamarnya();
            reserv.Durasi();
            reserv.Kelas();

            Pembayaran bayar = new Pembayaran();
            bayar.MetodePembayaran();
            Integer.toString(TotalHarga);
            
            String sql = "INSERT INTO reservasi(tanggal, id_Tamu, NamaTamu, Nginap, Hari, Type_Kamar, KamarHotel, Pembayaran, Total_Harga ) VALUES ( '"+ tanggal + "','" + idTamu + "','" + namaTamu + "','" + Nginap + "','" + lamaHari + "','" +
            typeKamar  + "','" + Kamar + "','" + pembayaran + "','" + TotalHarga + "')";
                         
            Statement statement = conn.createStatement();
            statement.execute(sql);
            System.out.println("\n Berhasil Menginputkan Data ");

        } 
        catch (SQLException e) 
        {
            System.err.println("\n Terjadi Kesalahan dalam Penginputan Metode Pembayaran ");
        }
        catch (InputMismatchException e) 
        {
            System.err.println("\n Silahkan Inputkan dengan Angka ");
        }
    }

    private static void ubahData() throws SQLException 
    {
        System.out.println("\n*************************************");
        String text3 = " Ubah Data Tamu ";
        System.out.println(text3.toUpperCase());
        System.out.println("*************************************");

        try 
        {
            try
            {
                lihatData(); 
                {
                    System.out.print("\n Inputkan Id Tamu yang akan di ubah atau di Update = ");
                    Integer idTamu = Integer.parseInt(inputan.nextLine());

                    String sql = "SELECT * FROM reservasi WHERE id_Tamu = " + idTamu;

                    Statement statement = conn.createStatement();
                    ResultSet result = statement.executeQuery(sql);

                    if (result.next())
                    {
                        System.out.print("\n Nama Tamu [" + result.getString("NamaTamu") + "]\t: ");
                        String NamaTamu = inputan.nextLine();

                        Reservasi reserv = new Reservasi();
                        reserv.Tanggal();
                        String tanggal = reserv.tanggal;
                        reserv.Kamarnya();
                        reserv.Durasi();
                        reserv.Kelas();

                        Pembayaran bayar = new Pembayaran();
                        bayar.MetodePembayaran();
                        Integer.toString(TotalHarga);
                        
                        // System.out.pritln(sql)
                        sql = "UPDATE reservasi SET tanggal='" + tanggal + "',NamaTamu='" + NamaTamu + "',KamarHotel = '" + Kamar
                            + "',Nginap = '" + Nginap + "',Hari ='" + lamaHari + "', Type_Kamar ='" + typeKamar + "', Pembayaran='" + pembayaran
                            + "', total_Harga ='" + TotalHarga + "' WHERE id_Tamu='" + idTamu + "'";

                        if (statement.executeUpdate(sql) > 0)
                        {
                            System.out.println("\n Berhasil Memperbaharui Data Tamu = id_Tamu " + idTamu);
                        }
                    }
                    statement.close();
                }
            }
            catch (SQLException e)
            {
                System.err.println("\nTerjadi Kesalahan Dalam Mengedit Data");
                System.err.println(e.getMessage());
            }
    
        } 
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
    }

    private static void hapusData()
    {
        System.out.println("\n*******************************************");
        String text4 = "                   HAPUS DATA TAMU                 ";
        System.out.println(text4.toUpperCase());
        System.out.println("*******************************************");

        try
        {
            try
            {
                lihatData();
                System.out.print("\n> Ketikkan Id Tamu yang akan di Hapus : ");
                Integer idTamu = Integer.parseInt(inputan.nextLine());

                String sql = " DELETE FROM reservasi WHERE id_Tamu = " + idTamu;
                Statement statement = conn.createStatement();

                if (statement.executeUpdate(sql) > 0)
                {
                    System.out.println("\nBerhasil Menghapus Data Tamu = IdTamu " + idTamu);
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        } 
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
    }
    private static void cariData() throws SQLException
    {
        System.out.println("\n************************************");
        String text5 = "               CARI DATA PEMBELI             ";
        System.out.println(text5.toUpperCase());
        System.out.println("************************************");

        System.out.print("\nMasukkan Nama Tamu: ");
        
        String keyword = inputan.nextLine();
        Statement statement = conn.createStatement();
        String sql = "SELECT * FROM reservasi WHERE NamaTamu LIKE '%" + keyword + "%'";
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) 
        {
            System.out.print("\nTanggal Reservasi\t: ");
            System.out.print(result.getString("Tanggal"));
            System.out.print("\nID Tamu\t\t\t: ");
            System.out.print(result.getInt("id_Tamu"));
            System.out.print("\nNama Tamu\t\t: ");
            System.out.print(result.getString("NamaTamu"));
            System.out.print("\nNginap\t\t\t: ");
            System.out.print(result.getString("Nginap"));
            System.out.print("\nHari\t\t\t: ");
            System.out.print(result.getString("Hari"));
            System.out.print("\nType Kamar\t\t: ");
            System.out.print(result.getString("Type_Kamar"));
            System.out.print("\nNomor Kamar\t\t: ");
            System.out.print(result.getString("KamarHotel"));
            System.out.print("\nMetode Pembayaran\t: ");
            System.out.print(result.getString("Pembayaran"));
            System.out.print("\nTotal Harga\t\t: ");
            System.out.print(result.getInt("Total_Harga"));
            System.out.print("\n");
        }

    }
}
