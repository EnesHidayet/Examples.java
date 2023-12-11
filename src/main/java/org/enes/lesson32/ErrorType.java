package org.enes.lesson32;

public enum ErrorType {

    DOLU_YER_SECIMI(1001,"Se�ilen y�k yeri dolu ba�ka bir yer se�iniz."),
    DUSUK_AGIRLIK_HATASI(1003,"250 kg alt� y�kler limana kabul edilmemektedir."),
    GECERSIZ_KABUL_TARIHI(1004,"Verilen tarih ge�mi�tir."),
    MESAI_DISI_GUN_HATASI(1005,"Cumartesi Pazar ben yokum."),
    YUK_YERI_SINIR_HATASI(1002,"Se�ilen de�er se�meniz istenen aral�kta de�ildir");


    private String message;
    private int code;

    ErrorType( int code,String message) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
