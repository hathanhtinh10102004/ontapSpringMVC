package com.example.btbotuc3.model;

public class Bt {
    private int id;
    private String detail;
    // chi tiet
    private String type;
    // kieu
    private int price;
    // gia
    private boolean status;
    // trang thai


    public Bt() {
    }

    public Bt(int id, String detail, String type, int price, boolean status) {
        this.id = id;
        this.detail = detail;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bt{" +
                "id=" + id +
                ", detail='" + detail + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

