package hu.petrik.aukcioOOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Festmenyek {
    private List<Festmeny> festemenyek;

    public Festmenyek(Festmeny[] festmenyTomb){
        this.festemenyek = new ArrayList<>();
        this.festemenyek.addAll(Arrays.asList(festmenyTomb));
    }
}
