package org.enes.lesson32;

public enum ErrorType {

    DOLU_YER_SECIMI(1001,"Seçilen yük yeri dolu baþka bir yer seçiniz."),
    DUSUK_AGIRLIK_HATASI(1003,"250 kg altý yükler limana kabul edilmemektedir."),
    YUK_YERI_SINIR_HATASI(1002,"Seçilen deðer seçmeniz istenen aralýkta deðildir");

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
