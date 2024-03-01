public class Main {
    public static void main(String[] args) {
        GenArrayList<ATK> listATK = new GenArrayList<ATK>();
        GenArrayList<Bag> listBag = new GenArrayList<Bag>();

        listATK.addItem(new ATK("A001", "Pensil", "Greebel", 20));
        listATK.addItem(new ATK("A002", "Pulpen", "Faster", 15));
        listATK.addItem(new ATK("A003", "Spidol", "Snowman Board Marker", 10));
        listATK.addItem(new ATK("A004", "Buku Tulis", "Kiky", 16));
        listATK.addItem(new ATK("A005", "Kertas", "Art Paper", 10));

        listBag.addItem(new Bag("C001", "Tas", "Christian Dior", 5));
        listBag.addItem(new Bag("C002", "Mouse", "Logitech", 30));
        listBag.addItem(new Bag("C003", "Correction Tape", "Joyko", 50));
        listBag.addItem(new Bag("C004", "Paper Clip", "Joyko", 75));
        listBag.addItem(new Bag("C005", "Stapler", "Joyko", 60));

        listATK.removeItem(1);
        listATK.editItem(1, new ATK("A002", "Pulpen", "Faster", 15));

        listATK.print();
        listBag.print();
    }
}