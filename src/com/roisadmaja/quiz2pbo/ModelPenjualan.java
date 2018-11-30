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
public class ModelPenjualan {

    ArrayList<ModelItems> arr = new ArrayList<>();
    private int jumlah;
    private double total;
    DefaultTableModel table = new DefaultTableModel();

    public ModelPenjualan() {
        getTable().addColumn("Nama");
        getTable().addColumn("Harga");
        getTable().addColumn("Jumlah");
    }

    public double hitungTotal() {
        total = 0;
        for (int i = 0; i < table.getRowCount(); i++) {
            total = total + Double.parseDouble(table.getValueAt(i, 1).toString());
        }
        return total;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public DefaultTableModel getTable() {
        return table;
    }

    public void setTable(DefaultTableModel table) {
        this.table = table;
    }

    public String itemList() {
        String tmp = "";
        for (int i = 0; i < table.getRowCount(); i++) {
            tmp += table.getValueAt(i, 0).toString() + " " + table.getValueAt(i, 2).toString()
                    + " " + (Double.parseDouble(table.getValueAt(i, 1).toString()) * Integer.parseInt(table.getValueAt(i, 2).toString())) + "\n";
        }
        return tmp;
    }

    public int getTableRow() {
        return table.getRowCount();
    }

}
