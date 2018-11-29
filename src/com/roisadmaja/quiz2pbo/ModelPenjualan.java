/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roisadmaja.quiz2pbo;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ModelPenjualan {

    private double subTotal = 0;
    private double total = 0;
    private DefaultTableModel tabel = new DefaultTableModel();

    public ModelPenjualan() {
        getTabel().addColumn("Nama");
        getTabel().addColumn("Harga");
        getTabel().addColumn("jumlah");
    }

    public double countSubTotal() {
        subTotal = 0;
        for (int i = 0; i < tabel.getRowCount(); i++) {
            subTotal = subTotal + Double.parseDouble((String) tabel.getValueAt(i, 3));
        }
        return subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public DefaultTableModel getTabel() {
        return tabel;
    }

    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
