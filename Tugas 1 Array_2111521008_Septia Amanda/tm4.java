import java.util.ArrayList;

public class tm4 
{
    public static void main(String[] args) 
    {
        //String[] nama = {"A","N","D","A"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("A");
        nama.add("N");
        nama.add("D");
        nama.add("A");
        
        //Soal no 4
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
        //indexOf(a), indexOf(c), indexOf(q)
    
        System.out.println(nama.indexOf("a"));
        System.out.println(nama.indexOf("c"));
        System.out.println(nama.indexOf("q"));
    }  
}