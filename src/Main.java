

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        //loader coviddata fra filen
        ArrayList<Covid19Data> covidTal = fh.loadCovid19Data();

        // display coviddata
        for (Covid19Data covid19data : covidTal) { //måske her stort d?
            System.out.println(covidTal);
        }
    }
}
