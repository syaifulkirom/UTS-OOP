package entity;

public class smartphoneshop {

    private String label;
    private String harga;
    private String seris;
    private String warna;

    public smartphoneshop(String label, String harga, String seris, String warna) {
        this.label = label;
        this.harga = harga;
        this.seris = seris;
        this.warna = warna;
    }

    public boolean equals(Object object) {
        smartphoneshop smpshp = (smartphoneshop) object;
        return label.equals(smpshp.getLabel());
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getSeris() {
        return seris;
    }

    public void setSeris(String seris) {
        this.seris = seris;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}