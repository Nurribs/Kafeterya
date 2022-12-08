public class Kasa {
    double toplamSatisMiktari = 0;
    double gunlukKar = 0;
    double salataKar = 0;
    int tatliSayisi = 0;
    int salataSayisi = 0;


    public Kasa() {
        System.out.println("Kafeteryaya hoşgeldiniz..");
    }

    public Kasa(String isim) {
        System.out.println("Hoşgeldin " + isim);
    }

    public void hesapla(int secim, double fiyat) {
        topSatHesapla(fiyat);
        gunlukKrHesapla(secim, fiyat);
    }

    private void topSatHesapla(double fiyat) {
        toplamSatisMiktari += fiyat;
    }

    private void gunlukKrHesapla(int secim, double fiyat) {
        if (secim == 1) {
            gunlukKar += (fiyat * 30 / 100);
            salataSayisi++;
            salataKar += fiyat * 30 / 100;
        }
        if (secim == 2) {
            gunlukKar += (fiyat * 25 / 100);
        }
        if (secim == 3) {
            gunlukKar += (fiyat * 35 / 100);
        }
        if (secim == 4) {
            gunlukKar += (fiyat * 20 / 100);
            tatliSayisiArttir();
        }
    }

    private void salataKari(double kar) {
        kar = salataKar;
    }

    private void tatliSayisiArttir() {
        tatliSayisi++;
    }

    public void fisYazdir() {
        System.out.println("Toplam satış miktarı: " + toplamSatisMiktari + " ₺ dir.");
        System.out.println("Günlük kar miktarı: " + gunlukKar + " ₺ dir.");
        System.out.println("Ortalama salata kârı: " + (salataKar / salataSayisi));
        System.out.println("Sipariş edilen toplam tatlı sayısı: " + tatliSayisi);
    }

}
