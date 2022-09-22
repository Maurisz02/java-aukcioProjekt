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

    Festmeny(String festo, String cim, String stilus){
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        this.licitekSzama = 0;
        this.legmagasabbLicit = 0;
        this.elkelt = false;
    }

    public String getFesto(){
        return this.festo;
    }

    public String getStilus(){
        return this.stilus;
    }

    public int getLicitekSzama(){
        return this.licitekSzama;
    }

    public int getLegmagasabbLicit(){
        return  this.legmagasabbLicit;
    }

    public LocalDate getLegutolsoLicitIdeje(){
        return this.legutolsoLicitIdeje;
    }

    public Boolean getElkelt() {
        return this.elkelt;
    }

    public void setElkelt(Boolean elkelt) {
        this.elkelt = elkelt;
    }

    public void licit(){
        if(this.elkelt){
            System.out.println("A festmény már elkelt!");
        }else if(this.licitekSzama==0){
            this.legmagasabbLicit = 100;
            legmagasabbLicit++;
            this.legmagasabbLicit =(int) Math.round(this.legmagasabbLicit/100.0) * 100;
            this.licitekSzama++;
            this.legutolsoLicitIdeje = LocalDate.now();
        }else if(this.licitekSzama!=0){
            double szazalek = this.legmagasabbLicit*0.1;
            this.legmagasabbLicit = this.legmagasabbLicit + (int)szazalek;
            this.legmagasabbLicit =(int) Math.round(this.legmagasabbLicit/100.0) * 100;
            this.licitekSzama++;
            this.legutolsoLicitIdeje = LocalDate.now();
        }
    }

    public void licit(int merek){
        if (merek <10 || merek > 100){
            System.out.println("Hibás paraméter");
        }else if(this.licitekSzama==0){
            this.legmagasabbLicit = 100;
            double szazalek = merek/100;
            this.legmagasabbLicit = this.legmagasabbLicit+(int)szazalek;
            this.legmagasabbLicit =(int) Math.round(this.legmagasabbLicit/100.0) * 100;
            this.licitekSzama++;
            this.legutolsoLicitIdeje = LocalDate.now();
        }else{
            licit();
        }
    }

    @Override
    public String toString() {
        if (elkelt){
            return String.format("%s: %s (%s)\nelkelt\n%d $ - %s (összesen: %d db)\n",this.festo,this.cim,this.stilus,this.legmagasabbLicit,this.legutolsoLicitIdeje,this.licitekSzama);
        }else{
            return String.format("%s: %s (%s)\n%d $ - %s (összesen: %d db)\n",this.festo,this.cim,this.stilus,this.legmagasabbLicit,this.legutolsoLicitIdeje,this.licitekSzama);
        }
    }
}
