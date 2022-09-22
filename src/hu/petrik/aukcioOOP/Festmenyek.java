package hu.petrik.aukcioOOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Festmenyek {
    private List<Festmeny> festmenyek;

    public Festmenyek(Festmeny[] festmenyTomb){
        this.festmenyek = new ArrayList<>();
        this.festmenyek.addAll(Arrays.asList(festmenyTomb));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Festmeny e: this.festmenyek){
            sb.append(e.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
