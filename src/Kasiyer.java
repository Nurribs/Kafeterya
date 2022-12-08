import java.util.Scanner;

public class Kasiyer {
    Kasa musteri;
    Scanner inp = new Scanner(System.in);

    public Kasiyer() {
        new Kasa();
    }

    public Kasiyer(String isim) {
        Kasa musteri = new Kasa("Nur");
        this.musteri = musteri;
    }

    public void isVakti() {
        int i = 1;
        int secim2 = 0;
        double fiyat2;


        while (secim2 != 5) {
            System.out.println("Menü: \n1-Salata \n2-Hamburger \n3-Pizza \n4-Tatlı \n5-Çıkış Yap");
            System.out.print(i + ". siparişi seçiniz: ");
            secim2 = inp.nextInt();
            if (secim2 < 0 || secim2 > 5) {
                System.out.println("Geçersiz giriş yaptınız tekrar deneyiniz..");
            } else if (secim2 == 5) {
                break;
            } else {
                System.out.print("Yiyeceğin fiyatını giriniz: ");
                fiyat2 = inp.nextDouble();
                musteri.hesapla(secim2, fiyat2);
                i++;
            }
        }
        musteri.fisYazdir();
    }
}

