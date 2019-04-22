package data;

import java.util.*;
import entity.*;

public class smartphoneshopdata {

    private static List<smartphoneshopdata> data = new LinkedList<smartphoneshopdata>();

    public void tambahData(smartphoneshopdata smpshp) {
        data.add(smpshp);
        System.out.println("data smartphone telah tersimpan");
    }

    public void ubahData(smartphoneshopdata smpshp) {
        int idx = data.indexOf(smpshp);
        if(idx >= 0) {
            data.set(idx, smpshp);
            System.out.println("data smartphone telah berubah");
        }
    }

    public void hapusData(String label) {
        int idx = data.indexOf(new smartphoneshopdata(label, "", "", "" ));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data smartphone telah terhapus");
        }
    }

    public void tampilkanData() {
        System.out.println("\n--= Data Smartphoneshop =--");
        int urutan = 1;
        for (smartphoneshopdata smpshp : data){
            System.out.println("data ke-" + urutan++);
            System.out.println("  LABEL : " + smpshp.getLabel());
            System.out.println("  HARGA : " + smpshp.getHarga());
            System.out.println("  SERIS : " + smpshp.getSeris());
            System.out.println("  WARNA : " + smpshp.getWarna());
        }
    }

}