/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg175314108_pbo2_20181_usd;

/**
 *
 * @author admin
 */
public class pasien {
    private String noRekamMedis;        //Attribute noRekamMedis yang dideklarasi sebagai private.
    private String nama;        //Attribute nama dideklarasi sebagai private.
    private String alamat;     //Attribute alamat dideklarasi sebagai private.
    private String tempatLahir;     //Attribute tempatLahir dideklarasi sebagai private.
    private int tanggalLahir;     //Attribute tanggalLahir dideklarasi sebagai private.
    private int bulanLahir;     //Attribute tanggalLahir dideklarasi sebagai private.
    private int tahunLahir;     //Attribute tahunLahir dideklarasi sebagai private.
    
    public pasien(String nama) {
        this.nama = nama;
    }

    public String getNoRekamMedis() {   // setiap kita panggil metode getNoRekamMedis kita mengembalikan nilainya. Kemudian tampilkan metode getNoRekamMedis tersebut.
        return noRekamMedis;    //untuk menampilkan atau mencetak nilai dari nomorPegawai.
    }

    public void setNoRekamMedis(String noRekamMedis) {  //kita panggil metode setNoRekamMedis dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        this.noRekamMedis = noRekamMedis;   //Nilai dari obyek nomorPegawai akan disimpan ke variabel nomorPegawai.   
    }

    public String getNama() {   //setiap kita panggil metode getNama kita mengembalikan nilainya. Kemudian tampilkan metode getNama tersebut.
        return nama;    //untuk menampilkan atau mencetak nilai dari attribute String nama.
    }

    public void setNama(String nama) {  //kita panggil metode setNama dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        this.nama = nama;   //Nilai dari obyek nama akan disimpan ke variabel nama. 
    }

    public String getAlamat() { //setiap kita panggil metode getAlamat kita mengembalikan nilainya. Kemudian tampilkan metode getAlamat tersebut.
        return alamat;  //untuk menampilkan atau mencetak nilai dari attribute String nama.
    }

    public void setAlamat(String alamat) {  //kita panggil metode setAlamat dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        this.alamat = alamat;   //Nilai dari obyek nama akan disimpan ke variabel nama.
    }

    public String getTempatLahir() {    //setiap kita panggil metode getTempatLahir kita mengembalikan nilainya. Kemudian tampilkan metode getTempatLahir tersebut.
        return tempatLahir;     //untuk menampilkan atau mencetak nilai dari attribute String tempatLahir.
    }

    public void setTempatLahir(String tempatLahir) {    //kita panggil metode setTempatLahir dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        this.tempatLahir = tempatLahir; //Nilai dari obyek tempatLahir akan disimpan ke variabel tempatLahir.
    }

    public int getTanggalLahir() {  //setiap kita panggil metode getTanggalLahir kita mengembalikan nilainya. Kemudian tampilkan metode getTanggalLahir tersebut.
        return tanggalLahir;    //untuk menampilkan atau mencetak nilai dari attribute integer tempatLahir.
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {    //kita panggil metode setTanggalLahir dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        try{    //untuk menangani suatu kesalahan atau error pada suatu listing program.
        if (tanggalLahir > 0 && tanggalLahir <= 31) {}     //jika ya maka akan mencetak atau menampilkan tanggal lahir.
        } catch (Exception ex) {    //untuk menangani suatu kesalahan atau error pada suatu listing program.
            throw new Exception("tanggalnya salah....");    //throw digunakan untuk melempar suatu eksepsi dalam program. Digunakan pada saat mendeklarasi suatu method untuk memberitahu bahwa method tersebut dapat melemparkan eksepsi.
        }
    }

    public int getBulanLahir() {    //setiap kita panggil metode getBulanLahir kita mengembalikan nilainya. Kemudian tampilkan metode getBulanLahir tersebut.
        return bulanLahir;  //untuk menampilkan atau mencetak nilai dari attribute integer bulanLahir.
    }

    public void setBulanLahir(int bulanLahir) throws Exception {    //kita panggil metode setBulanLahir dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        try{    //untuk menangani suatu kesalahan atau error pada suatu listing program.
        if (bulanLahir > 0 && bulanLahir <= 12) {}  //jika ya maka akan mencetak atau menampilkan tanggal lahir.
            this.bulanLahir = bulanLahir;   //Nilai dari obyek bulanLahir akan disimpan ke variabel bulanLahir.
        } catch (Exception ex) {    //untuk menangani suatu kesalahan atau error pada suatu listing program.
            throw new Exception("bulannyanya salah...."); //throw digunakan untuk melempar suatu eksepsi dalam program. Digunakan pada saat mendeklarasi suatu method untuk memberitahu bahwa method tersebut dapat melemparkan eksepsi.
        }

    }

    public int getTahunLahir() {    //setiap kita panggil metode getTahunLahir kita mengembalikan nilainya. Kemudian tampilkan metode getTahunnLahir tersebut.
        return tahunLahir;  //untuk menampilkan atau mencetak nilai dari attribute integer bulanLahir.
    }

    public void setTahunLahir(int tahunLahir) throws Exception {    //kita panggil metode setBulanLahir dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        try{    //untuk menangani suatu kesalahan atau error pada suatu listing program.
        if (tahunLahir >= 0) {} //jika ya maka akan mencetak atau menampilkan tahun lahir.
            this.tahunLahir = tahunLahir;
        } catch (Exception ex) {    //untuk menangani suatu kesalahan atau error pada suatu listing program.
            throw new Exception("bulannyanya salah....");   //throw digunakan untuk melempar suatu eksepsi dalam program. Digunakan pada saat mendeklarasi suatu method untuk memberitahu bahwa method tersebut dapat melemparkan eksepsi.

        }

    }

}

    

