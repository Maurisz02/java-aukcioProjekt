package hu.petrik.aukcioOOP;

import java.time.LocalDate;

public class Festmeny {
    private String cim;
    private String festo;
    private String stilus;
    private int licitekSzama;
    private int legmagasabbLicit;
    private LocalDate legutolsoLicitIdeje;
    private Boolean elkelt;

    Festmeny(String cim, String festo, String stilus){
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        this.licitekSzama = 0;
        this.legmagasabbLicit = 0;
        this.elkelt = false;
    }



}
