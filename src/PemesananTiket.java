import java.util.Scanner;

class PemesananTiket {
   // Do your magic here...

 private TiketKonser tiketKonser;

 // Sistem pemesanan tiket disini
 public PemesananTiket() {

  //hanya pilihan input nama dan tiket
  Scanner scanner = new Scanner(System.in);
  System.out.println("Selamat datang di Pemesanan Tiket!");
  System.out.print("Masukan nama pemesan: ");
  String namaPemesan = scanner.nextLine();
  System.out.println("1. CAT 8");
  System.out.println("2. CAT 1");
  System.out.println("3. FESTIVAL");
  System.out.println("4. VIP");
  System.out.println("5. UNLIMITED EXPERIENCE");
  System.out.print("Masukan pilihan: ");
  int pilihan = scanner.nextInt();

  validasi(pilihan); //Saya pisahkan untuk validasi hasil pilihan
  scanner.close(); //menutup scanner untuk memory
  nota(namaPemesan); //memanggil nota
 }

 //method validasi
 public void validasi(int pilihan) {
  //switch case untuk menentukan tiket konser yang dipilih dan berguna untuk validasi juga
  switch (pilihan) {
   //inisialisasi tiketKonser
   case 1 -> tiketKonser = new CAT8();
   case 2 -> tiketKonser = new CAT1();
   case 3 -> tiketKonser = new FESTIVAL();
   case 4 -> tiketKonser = new VIP();
   case 5 -> tiketKonser = new VVIP();
   //validasi kalau diluar dari 5 diatas
   default -> {
    System.out.println("ERROR");
    System.exit(0);
   }
  }
 }

 //print nota
 public void nota(String namaPemesan) {
  System.out.println("----- Detail Pemesanan -----");
  System.out.println("Nama Pemesan: " + namaPemesan);
  System.out.println("Kode Booking: " + Main.generateKodeBooking()); //mengambil hasil dari method static
  System.out.println("Tanggal Pemesanan: " + Main.getCurrentDate()); //sama
  System.out.println("Tiket yang dipesan: " + tiketKonser.getTiketKonser()); //mengambil jenis tiket konser
  System.out.println("Total harga: " + tiketKonser.getHargaTiket() + " USD"); //mengambil harga tiket konser
 }
 }