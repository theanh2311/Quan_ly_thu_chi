package com.example.assignment.Model;

public class KhoanChi {
    String khoanchi;
    int idchi;

    public KhoanChi(String khoanchi,int idchi) {
        this.khoanchi = khoanchi;
        this.idchi =idchi;
    }

    public String getKhoanchi() {
        return khoanchi;
    }

    public void setKhoanchi(String khoanchi) {
        this.khoanchi = khoanchi;
    }

    public int getIdchi() {
        return idchi;
    }

    public void setIdchi(int idchi) {
        this.idchi = idchi;
    }
}
