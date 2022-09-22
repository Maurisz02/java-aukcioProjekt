package hu.petrik.aukcioOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Festmeny f1 = new Festmeny("Proba1","Maurisz","Bohém");
        Festmeny f2 = new Festmeny("Transformers","JamaulBee","Absztrakt");
        Festmenyek fs1 = new Festmenyek(new Festmeny[]{f1, f2});

        Festmeny[] fTomb = new Festmeny[]{};

        //System.out.println(f1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Hány darab festményt szeretnél hozzáadni?");
        int fdb = sc.nextInt();
        for(int i = 0; i < fdb-1;i++){
            System.out.println("Add meg a festmény címét");
            String fCim = sc.next();
            System.out.println("Add meg a festmény festőjét");
            String fFesto = sc.next();
            System.out.println("Add meg a festmény stílusát");
            String fStilus = sc.next();
            Festmeny ujFestmeny = new Festmeny(fCim,fFesto,fStilus);
            fTomb[i] = ujFestmeny;
            System.out.println(fTomb[i]);
        }
    }
}
