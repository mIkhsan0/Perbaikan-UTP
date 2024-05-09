class VVIP extends TiketKonser {
   // Do your magic here...

    //digunakan untuk mengambil jenis tiket konser
    @Override
    public String getTiketKonser() {
        return "UNLIMITED EXPERIENCE";
    }

    //digunakan untuk mengambil harga tiket konser dari abstract kelas yang mengimplementasikan HargaTiket interface
    @Override
    public int getHargaTiket() {
        return unlimitedExperience;
    }
}