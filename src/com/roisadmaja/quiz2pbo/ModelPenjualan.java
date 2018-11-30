/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roisadmaja.quiz2pbo;

import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ModelPenjualan {//class modelpenjualan untuk memodelkan tabel

    ArrayList<ModelItems> arr = new ArrayList<>();//membuat array list
    private int jumlah;//untuk menyimpan jumlah
    private double total;//untuk menyimpan total
    DefaultTableModel table = new DefaultTableModel(); // menyimpan data tabel

    public ModelPenjualan() {//konstruktor
        getTable().addColumn("Nama");//membuat kolom nama
        getTable().addColumn("Harga");//membuat kolom harga
        getTable().addColumn("Jumlah");//membuat kolom jumlah
    }

    public double hitungTotal() {//menghitung menjumlahkan harga dan jumlah yang ada di tabel
        total = 0;//total untuk menyimpan angka
        for (int i = 0; i < table.getRowCount(); i++) {//melakukan perulangan
            total = total + Double.parseDouble(table.getValueAt(i, 1).toString());//menjumlahkan
        }
        return total;//mengembalikan nilai total
    }

    public int getJumlah() {//mengambil jumlah
        return jumlah;// mengembalikan jumlah
    }

    public void setJumlah(int jumlah) {//mengatur inputan jumlah
        this.jumlah = jumlah;//menyimpan nilai jumlah
    }

    public double getTotal() {//mengambil nilai total
        return total;//mengembalikan nilai total
    }

    public void setTotal(double total) {//mengatur total
        this.total = total;//menyimpan nilai total
    }

    public DefaultTableModel getTable() {//mengambil tabel
        return table;//mengembalikan nilai tabel
    }

    public void setTable(DefaultTableModel table) {//mengatur tabel
        this.table = table;//menyimpan nilai di tabel
    }

    public String itemList() {//membuat list
        String tmp = "";//menyimpan nilai string
        for (int i = 0; i < table.getRowCount(); i++) {//melakukan perulangan
            tmp += table.getValueAt(i, 0).toString() + " " + table.getValueAt(i, 2).toString()//melakukan pencarian dan penambahan nilai
                    + " " + (Double.parseDouble(table.getValueAt(i, 1).toString()) * Integer.parseInt(table.getValueAt(i, 2).toString())) + "\n";
        }
        return tmp; //mengembalikan nilai
    }

    public int getTableRow() {//mengambil nilai baris
        return table.getRowCount();//mengembalikan nilai baris
    }

}
