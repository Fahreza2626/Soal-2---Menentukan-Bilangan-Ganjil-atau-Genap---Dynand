import java.util.Scanner;
public class ukl{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan : ");
        int angka = input.nextInt();
        
        if(angka % 2 == 0){
            System.out.println("Bilangan ini adalah genap");
        }else{
            System.out.println("Bilangan ini adalah ganjil");
        }

    }
}