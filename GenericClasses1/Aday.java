public abstract class Aday {
    public int getTurkce() {
        return turkce;
    }

    public Aday(int turkce, int matematik, int edebiyat, int fizik) {
        this.turkce = turkce;
        this.matematik = matematik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
    }

    public int getMatematik() {
        return matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    private int turkce;
private int matematik;
private int edebiyat;
private int fizik;


abstract int puanHesapla();

        }