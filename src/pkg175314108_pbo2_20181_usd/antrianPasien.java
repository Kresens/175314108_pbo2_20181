/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg175314108_pbo2_20181_usd;

/**
 *
 * @author User
 */
public class antrianPasien {
    private int tanggalAntri;   //Attribute tanggalLahir dideklarasi sebagai private.
    private int bulanAntrian;   //Attribute bulanLahir dideklarasi sebagai private.
    private int tahunlAntrian;  //Attribute tahunLahir dideklarasi sebagai private.
    private Klinik klinik;  //Attribute klinik dideklarasi sebagai private.
    private pasien daftarPasien[];

    

    public int getTanggalAntrian() {    //setiap kita panggil metode getTanggalAntrian kita mengembalikan nilainya. Kemudian tampilkan metode getTanggalLahir tersebut.
        return tanggalAntri;    //untuk menampilkan atau mencetak nilai dari attribute integer tanggalLahir.
    }

    public void setTanggalAntrian(int tanggalAntrian) throws Exception {    //kita panggil metode setTanggalAntrian dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        try {   //untuk menangani suatu kesalahan atau error pada suatu listing program.
            if (tanggalAntrian > 0 && tanggalAntrian <= 31) {   //jika ya maka akan mencetak atau menampilkan tanggal antrian.
            }
            this.tanggalAntri = tanggalAntrian; //Nilai dari obyek bulanLahir akan disimpan ke variabel tanggalAntrian.
        } catch (Exception ex) {    //untuk menangani suatu kesalahan atau error pada suatu listing program.
            throw new Exception("tanggalnya salah....");    //throw digunakan untuk melempar suatu eksepsi dalam program. Digunakan pada saat mendeklarasi suatu method untuk memberitahu bahwa method tersebut
        }
    }

    public int getBulanAntrian() {  //setiap kita panggil metode getBulanantrian kita mengembalikan nilainya. Kemudian tampilkan metode getBulanantrian tersebut.
        return bulanAntrian;    //untuk menampilkan atau mencetak nilai dari attribute integer bulanAntrian.
    }

    public void setBulanAntrian(int bulanAntrian) throws Exception {    //kita panggil metode setBulanLahir dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        try {   //untuk menangani suatu kesalahan atau error pada suatu listing program.
            if (tanggalAntri > 0 && tanggalAntri <= 31) {   //jika ya maka akan mencetak atau menampilkan tanggal lahir.
            }
            this.bulanAntrian = bulanAntrian;   //Nilai dari obyek bulanLahir akan disimpan ke variabel bulanAntrian.
        } catch (Exception ex) {    //untuk menangani suatu kesalahan atau error pada suatu listing program.
            throw new Exception("bulannya salah....");  //throw digunakan untuk melempar suatu eksepsi dalam program. Digunakan pada saat mendeklarasi suatu method untuk memberitahu bahwa method tersebut
        }
    }


public int getTahunlAntrian() { //setiap kita panggil metode getTahunAntrian kita mengembalikan nilainya. Kemudian tampilkan metode getTahunnLahir tersebut.
        return tahunlAntrian;   //untuk menampilkan atau mencetak nilai dari attribute integer tahunAntrian.

    }

    public void setTahunlAntrian(int tahunlAntrian) throws Exception {  //kita panggil metode setBulanLahir dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        try{    //kita panggil metode setBulanLahir dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        if (tanggalAntri > 0 && tanggalAntri <= 31) {}  //jika ya maka akan mencetak atau menampilkan tanggal antri.
            this.tahunlAntrian = tahunlAntrian;
        } catch (Exception ex) {     //untuk menangani suatu kesalahan atau error pada suatu listing program.
            throw new Exception("tahunnya salah....");  //throw digunakan untuk melempar suatu eksepsi dalam program. Digunakan pada saat mendeklarasi suatu method untuk memberitahu bahwa method tersebut dapat melemparkan eksepsi.
        }
    }

    public Klinik getKlinik() { //setiap kita panggil metode getKlinik kita mengembalikan nilainya. Kemudian tampilkan metode getKlinik tersebut.
        return klinik;  //untuk menampilkan atau mencetak nilai dari attribute  tahunAntrian.
    }

    public void setKlinik(Klinik klinik) {  //kita panggil metode setKLinik dengan menambahkan sebuah parameter. Maka akan tercetak pada System.
        this.klinik = klinik;   //Nilai dari obyek daftarPasien akan disimpan ke variabel klinik.
    }

    public pasien[] getDaftarPasien() { //setiap kita panggil metode getDaftarPasien kita mengembalikan nilainya. Kemudian tampilkan metode getDaftarPasien tersebut.
        return daftarPasien;     //untuk menampilkan atau mencetak nilai dari attribute  daftarPasien..
    }

    public void setDaftarPasien(pasien[] daftarPasien) {    //kita panggil metode setDaftarPasien dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.
        this.daftarPasien = daftarPasien;   //Nilai dari obyek daftarPasien akan disimpan ke variabel daftarPasien.
    



}

    private static class Klinik {

    public Klinik() {
}
}

}
