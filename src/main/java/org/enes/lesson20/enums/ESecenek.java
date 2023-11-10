package org.enes.lesson20.enums;

import javax.swing.plaf.PanelUI;

public enum ESecenek {
    TAS("MAKAS"),
    KAGIT("TAS"),
    MAKAS("KAGIT");

   String kazanan;

   private ESecenek(String kazanan){
       this.kazanan=kazanan;
   }
}
