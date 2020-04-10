import java.util.scanner;

public class InputOutput{
 public static void main (string[] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  int jumlahSks;
  double IPK;
  System.out.print("Masukan nama anda: ");
  nama = scanner.nextline();
  System.out.println("Hai. "+nama);

  System.out.print("Masukan jumlah sks yang sudah di tempuh:
  jumlahSks = scanner.nextint();
  
  System.out.print("Masukan IPK sementara :");
  IPK =scanner.nextdouble();

  double jumlah = IPK * jumlahSks;
  System.out.print("total nilai = "+jumlah); 
 }
}