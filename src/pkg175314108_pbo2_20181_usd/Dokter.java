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
public class Dokter {
    //sebuah bagian dari program , yang memiliki semua Attributes.
    private String nomorPegawai;    //Attributes yang merepresentasikan karakteristik dari suatu object untuk memasukan nomor pegawai.
    private String nama;    //Attributes yang merepresentasikan karakteristik dari suatu object untuk memasukan nama.
    private String tempatLahir; //Attributes yang merepresentasikan karakteristik dari suatu object untuk memasukan tempay lahir.
    private int tanggalLahir;   //Attributes yang merepresentasikan karakteristik dari suatu object untuk memasukan tanggal lahir.

    public String getNomorPegawai() {   //setiap kita panggil metode getNomorPegawai kita mengembalikan nilainya. Kemudian tampilkan metode getNomorPegawai tersebut.
        return nomorPegawai;    //untuk menampilkan atau mencetak nilai dari nomorPegawai.
    }

    public void setNomorPegawai(String nomorPegawai) {  //kita panggil metode setNomorPegawai dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        this.nomorPegawai = nomorPegawai;   //Nilai dari obyek nomorPegawai akan disimpan ke variabel nomorPegawai.   
    }

    public String getNama() {   //setiap kita panggil metode getNama kita mengembalikan nilainya. Kemudian tampilkan metode getNama tersebut.
        return nama;    //untuk menampilkan atau mencetak nilai dari attribute String nama.
    }

    public void setNama(String nama) {  //kita panggil metode setNama dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        this.nama = nama;   //Nilai dari obyek nama akan disimpan ke variabel nama.   
    }

    public String getTempatLahir() {    //setiap kita panggil metode getTempatLahir kita mengembalikan nilainya. Kemudian tampilkan metode getTempatLahir tersebut.
        return tempatLahir; //untuk menampilkan atau mencetak nilai dari attribute String tempatLahir.
    }

    public void setTempatLahir(String tempatLahir) {    //kita panggil metode setTempatLahir dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        this.tempatLahir = tempatLahir; //Nilai dari obyek tempatLahir akan disimpan ke variabel tempatLahir.
    }

    public int getTanggalLahir() {  //setiap kita panggil metode getTanggalLahir kita mengembalikan nilainya. Kemudian tampilkan metode getTanggalLahir tersebut.
        return tanggalLahir;    //untuk menampilkan atau mencetak nilai dari attribute integer tempatLahir.
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {    //kita panggil metode setTanggalLahir dengan menambahkan sebuah parameter. Maka akan tercetak pada System.Out.Println
        if (tanggalLahir > 0 && tanggalLahir <= 31) {       //jika ya maka akan mencetak atau menampilkan tanggal lahir.
        } else {                        //jika tidak maka mencetak "tanggalnya salah..."
            throw new Exception ("tanggalnya salah....");   //throw digunakan untuk melempar suatu eksepsi dalam program. Digunakan pada saat mendeklarasi suatu method untuk memberitahu bahwa method tersebut dapat melemparkan eksepsi.
        }
    }
    
}
