package com.example.assignment.Model;

public class KhoanThu {
    String khoanthu;
    int id;

    public String getKhoanthu() {
        return khoanthu;
    }

    public void setKhoanthu(String khoanthu) {
        this.khoanthu = khoanthu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public KhoanThu(String khoanthu, int id) {
        this.khoanthu = khoanthu;
        this.id = id;
    }
}
