package hu.petrik.aukcioOOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Festmenyek {
    private List<Festmeny> festmenyek;

    public Festmenyek(Festmeny[] festmenyTomb){
        this.festmenyek = new ArrayList<>();
        this.festmenyek.addAll(Arrays.asList(festmenyTomb));
    }

    public Festmenyek(String fajlNev) throws IOException {
        this.festmenyek = new ArrayList<>();
        FileReader fr = new FileReader(fajlNev);
        BufferedReader br = new BufferedReader(fr);
        String sor = br.readLine();
        while(sor != null && !sor.equals("")){
            String[] adatok = sor.split(";");
            Festmeny ember = new Festmeny(adatok[0], adatok[1],adatok[2]);
            this.festmenyek.add(ember);
            sor = br.readLine();
        }
        br.close();
        fr.close();

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
