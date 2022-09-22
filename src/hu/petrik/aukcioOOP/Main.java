package hu.petrik.aukcioOOP;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Festmeny f1 = new Festmeny("Proba1","Maurisz","Bohém");
        Festmeny f2 = new Festmeny("Transformers","JamaulBee","Absztrakt");
        Festmenyek fs1 = new Festmenyek(new Festmeny[]{f1, f2});
        //System.out.println(f1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Hány darab festményt szeretnél hozzáadni?");
        int fdb = sc.nextInt();
        Festmeny[] fTomb = new Festmeny[fdb];
        for(int i = 0; i < fdb;i++){
            System.out.println("Add meg a festmény festőjét");
            String fCim = sc.next();
            System.out.println("Add meg a festmény címét");
            String fFesto = sc.next();
            System.out.println("Add meg a festmény stílusát");
            String fStilus = sc.next();
            Festmeny ujFestmeny = new Festmeny(fCim,fFesto,fStilus);
            fTomb[i] = ujFestmeny;
            fs1.getFestmenyek().add(fTomb[i]);
        }
        //System.out.println(fs1);

        Festmenyek fs3 = null;

        try{
            fs3 = new Festmenyek("festmenyek.txt");
            fs1.getFestmenyek().addAll(fs3.getFestmenyek());
            //System.out.println(fs1);

        }catch (FileNotFoundException e){
            System.out.println("Hiba az festmenyek.txt fájl nem található");
        }catch (IOException e){
            System.err.println("Ismeretlen hiba történt a fájl beolvasás folyamán");
        }

        for (int i = 1; i<20;i++){
            int rnd = (int)((Math.random() * (fs1.getFestmenyek().size()-1))+1);
            fs1.getFestmenyek().get(rnd).licit();
        }
        System.out.println("");
        System.out.println("Licit után");
        System.out.println(fs1);


    }
}
