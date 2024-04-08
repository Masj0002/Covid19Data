

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        Scanner input = new Scanner(System.in);

        //loader coviddata fra filen
        ArrayList<Covid19Data> covidTal = fh.loadCovid19Data();


        //Bruger interface
        while (true) {
            System.out.println("Velkommen til Covid sortering ddi hvad ville du?");
            System.out.println("1: Vis data sorteret efter Region" + "\n" + "2: Vis data sorteret efter Aldersgruppe" + "\n" + "3: Stop Program");
            int tal = input.nextInt();
            switch (tal) {
                case 1:
                    for (Covid19Data covid19Data : covidTal) { //måske her stort d?
                      //  System.out.println(covidTal);
                    }
                    System.out.println("Sorteret efter Region");

                    //Using NameComparator to sort the elements
                    covidTal.sort(new RegionComparator().thenComparing(Covid19Data::getAldersGruppe));

                    //Traversing the elements of list
                    for (Covid19Data st : covidTal) {
                        System.out.println("Region: "+st.getRegion() + " AldersGruppe: " + st.getAldersGruppe() + " Bekræftede tilfælde: "
                                + st.getBekræftedeTilfældeIAlt() + " Døde: " + st.getDøde() + " Indlagte på intensiv: "
                                + st.getIndlagtePåIntensivAfdeling() + " Indlagte: " + st.getIndlagte() + " Dato: "
                                + st.getDato());
                    }
                    break;
                case 2:
                    System.out.println("Sorteret efter Aldersgruppe");
                    covidTal.sort(new AldersGruppeComparator().thenComparing(Covid19Data::getRegion));
                    for (Covid19Data st : covidTal) {
                        System.out.println("Aldersgruppe: "+st.getAldersGruppe() + " Region: " + st.getRegion() + " Bekræftede tilfælde: "
                                + st.getBekræftedeTilfældeIAlt() + " Døde: " + st.getDøde() + " Indlagte på intensiv: "
                                + st.getIndlagtePåIntensivAfdeling() + " Indlagte: " + st.getIndlagte() + " Dato: "
                                + st.getDato());
                    }
                case 3:
                    System.exit(0);
                default:

            }
        }
    }
}
