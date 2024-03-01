public class Bag implements Comparable<Bag> {
    String kodeBarang;
    String jenisBarang;
    String namaBarang;
    int stokBarang;

    public Bag(String kodeBarang, String jenisBarang, String namaBarang, int stokBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }

    @Override
    public String toString() {
        return "Bag [KodeBarang=" + kodeBarang + ", jenisBarang=" + jenisBarang + ", namaBarang=" + namaBarang + ", stok=" + stokBarang + "]";     
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    @Override
    public int compareTo(Bag o) {
        return this.getKodeBarang().compareTo(o.getKodeBarang());
    }
}