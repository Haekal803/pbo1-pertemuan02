import koneksi.Database;
import model.Dosen;
import model.Mahasiwa;
import model.MataKuliah;

public class main{
 public static void main(String [] args){
  System.out.println("Ini program main");
  Database.hubungkan();
  Dosen.tampilanInfo();
  Mahasiswa.tampilanInfo();
  MataKuliah.tampilanInfo();
 }
}