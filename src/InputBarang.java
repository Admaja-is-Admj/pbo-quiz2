
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class InputBarang {

    ArrayList<Items> inputList;

    public InputBarang() {
        inputList = new ArrayList();
    }

    public void isiData(String nama, double harga, int jumlah) {
        Items item = new Items(nama, harga, jumlah);
        inputList.add(item);
    }

    public ArrayList<Items> getData() {
        return inputList;
    }
}
