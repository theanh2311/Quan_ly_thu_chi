package com.example.assignment.Model;

public class ThongKeChi {
    String ngaythang,khoanchi,loaichi;

    public String getNgaythang() {
        return ngaythang;
    }

    public void setNgaythang(String ngaythang) {
        this.ngaythang = ngaythang;
    }

    public String getKhoanchi() {
        return khoanchi;
    }

    public void setKhoanchi(String khoanchi) {
        this.khoanchi = khoanchi;
    }

    public String getLoaichi() {
        return loaichi;
    }

    public void setLoaichi(String loaichi) {
        this.loaichi = loaichi;
    }

    public ThongKeChi(String ngaythang, String khoanchi, String loaichi) {
        this.ngaythang = ngaythang;
        this.khoanchi = khoanchi;
        this.loaichi = loaichi;
    }
}
