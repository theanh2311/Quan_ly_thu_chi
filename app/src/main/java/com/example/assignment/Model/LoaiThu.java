package com.example.assignment.Model;

public class LoaiThu {
    String loaithu;
    int idthu;

    public String getLoaithu() {
        return loaithu;
    }

    public void setLoaithu(String loaithu) {
        this.loaithu = loaithu;
    }

    public int getIdthu() {
        return idthu;
    }

    public void setIdthu(int idthu) {
        this.idthu = idthu;
    }

    public LoaiThu(String loaithu, int idthu) {
        this.loaithu = loaithu;
        this.idthu = idthu;
    }
}
