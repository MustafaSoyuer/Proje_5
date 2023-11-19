package com.mustafa;


public class TurkceString {
    private String ifade;

     /**
      * TurkceString sınıfının constructor ı
      * @param metin
      */
     public TurkceString(String metin) {
            this.ifade = metin;
        }

    /**
     * index numarasının girildiği, String içindeki karakteri dönen metod
     * @param index
     * @return
     */
    public char karakterAl(int index) {
            return ifade.charAt(index);
        }

    /**
     * karakterin girildiği, String içerisindeki indexini dönen metod
     * @param karakter
     * @return
     */
    public int indexBul(String karakter) {
            return ifade.indexOf(karakter);
        }

    /**
     * başlangıç ve bitiş indexlerinin girildiği, String içerisindeki alt stringi dönen metod
     * başlangıç ve bitiş indexleri dahildir.
     * @param baslangic
     * @param bitis
     * @return
     */
     public String altIfade(int baslangic, int bitis) {
            return ifade.substring(baslangic, bitis + 1); // bitiş indexide dahil edilmek istendiği için +1 eklenmiştir
        }


    }// class sonu





