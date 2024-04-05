import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19Data> loadCovid19Data() {
        ArrayList<Covid19Data> covidData = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sc.nextLine();  // Skip første linje

        Covid19Data covidTal = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();    // Split linje og læg tokens i attributter
            String[] attributes = line.split(";"); //Splitter linjerne inde i filen
            covidTal = new Covid19Data(
                    attributes[0], // region
                    attributes[1], // aldersgruppe
                    (Integer.parseInt(attributes[2])), //BekræftedeTilfældeIAlt
                    (Integer.parseInt(attributes[3])), //Døde
                    (Integer.parseInt(attributes[4])), //Indlagte på intensiv
                    (Integer.parseInt(attributes[5])), //IndlagteDato
                    attributes[6] //Dato
            );

            covidData.add(covidTal);

        }
        sc.close();
        return covidData;
    }

}

