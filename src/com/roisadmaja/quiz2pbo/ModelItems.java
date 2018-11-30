package com.roisadmaja.quiz2pbo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
// class ModelItems merupakan class untuk memodelkan item
public class ModelItems {
//atribut nama untuk mendeklarasikan nama

    private String nama;
//atribut harga untuk mendeklarasikan harga
    private double harga;
//konstruktor merupakan method untuk mengeksekusi

    public ModelItems(String nama, double harga) {
        this.nama = nama; //inputan nama akan masuk ke atribut nama
        this.harga = harga;//inputan harga akan masuk ke atribut harga
    }

    //method getNama berguna untuk mengambil nama
    public String getNama() {
        return nama; //return nama untuk mengembalikan nilai dari nama
    }

    //setNama untuk mengatur inputan nama
    public void setNama(String nama) {
        this.nama = nama;//mendeklarasikan inputan nama
    }

    //getharga untuk mengambil value dari harga
    public double getHarga() {
        return harga; // mengembalikan nilai harga
    }

    //setHarga untuk mengatur inputan harga
    public void setHarga(double harga) {
        this.harga = harga;//mendeklarasikan inputan harga
    }

    //mengoveride class ModelItems
    @Override
    public String toString() {
        return this.nama; //mengembalikan nilai nama
    }
}
