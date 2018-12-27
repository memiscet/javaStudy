public class Test {
    public static void main(String[] args) {

        Sayisal sayisal1 = new Sayisal(30,40,20,30);
        Sayisal sayisal2 = new Sayisal(25,45,2,35);

        Sayisal birinci = birinci(sayisal1,sayisal2);

        System.out.println("Birinci syisal Ogrencinin puani "+birinci.puanHesapla());

        EsitAgirlik esitAgirlik1= new EsitAgirlik(30,20,40,2);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(40,10,50,0);

        EsitAgirlik birinci2 = birinci (esitAgirlik1,esitAgirlik2);
        System.out.println("Birinci esitagirlik Ogrencinin puani "+birinci2.puanHesapla());
    }


    public static <E extends Aday> E birinci(E e1, E e2){

        if (e1.puanHesapla()>e2.puanHesapla()){

            return e1;
        } else
        {
            return e2;
        }

    }
}
