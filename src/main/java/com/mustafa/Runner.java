package com.mustafa;

public class Runner {
    public static void main(String[] args) {
        /**
         * TurkceString sınıfının denemesi
         */

        /**
         * TurkceString sınıfında oluşturulan constructor ile turkceString nesnesi oluştururak girilen
         * metni TurkceString sınıfındaki ifade değişkenine atadık
         */
        TurkceString turkceString = new TurkceString("Bugun java calısıyorum");

        /**
         * karakterAl methodunun denemesi
         */
        char karakter  = turkceString.karakterAl(6);
        System.out.println("6. index teki karakter : " + karakter); // çıktı : j

        /**
         * indexBul methodunun denemesi
         */
        int index = turkceString.indexBul("a");
        System.out.println("'a' karakterinin indexi :  " + index); // çıktı : 7

        /**
         * altIfade methodunun denemesi
         */
        String ifade = turkceString.altIfade(6, 9);
        System.out.println("6 ile 9 indexleri arasındaki alt ifade : " + ifade); // çıktı: java
        

    }// main sonu
}// class sonu