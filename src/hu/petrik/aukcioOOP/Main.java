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
        }
        Festmenyek fs2 = new Festmenyek(fTomb);
        System.out.println(fs2);

        try{
            Festmenyek fs3 = new Festmenyek("festmenyek.txt");
            System.out.println(fs3);
        }catch (FileNotFoundException e){
            System.out.println("Hiba az festmenyek.txt fájl nem található");
        }catch (IOException e){
            System.err.println("Ismeretlen hiba történt a fájl beolvasás folyamán");
        }
    }
}
