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
public class Klinik {
   private String idKlinik;    //Attribute idKlinik dideklarasi sebagai private.
    private String nama;    //Attribute nama dideklarasi sebagai private.

    public String getIdKlinik() {   //setiap kita panggil metode getIdKlinik kita mengembalikan nilainya. Kemudian tampilkan metode getIdklinik tersebut.
        return idKlinik;    //untuk menampilkan atau mencetak nilai dari attribute  idKlinik.
    }

    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
     
}
