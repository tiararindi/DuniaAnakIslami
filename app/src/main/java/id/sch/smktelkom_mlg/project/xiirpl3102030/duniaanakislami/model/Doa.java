package id.sch.smktelkom_mlg.project.xiirpl3102030.duniaanakislami.model;

import java.io.Serializable;

/**
 * Created by Win_8.1 on 11/24/2016.
 */
public class Doa implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public Doa(String judul, String deskripsi, String detail, String lokasi,
               String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}
