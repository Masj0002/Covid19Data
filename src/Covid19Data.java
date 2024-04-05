public class Covid19Data {
    private String region;
    private String aldersGruppe;
    private int bekræftedeTilfældeIAlt;
    private int døde;
    private int indlagtePåIntensivAfdeling;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersGruppe, int bekræftedeTilfældeIAlt, int døde,
                       int indlagtePåIntensivAfdeling, int indlagte, String dato) {
        this.region = region;
        this.aldersGruppe = aldersGruppe;
        this.bekræftedeTilfældeIAlt = bekræftedeTilfældeIAlt;
        this.døde = døde;
        this.indlagtePåIntensivAfdeling = indlagtePåIntensivAfdeling;
        this.indlagte = indlagte;
        this.dato = dato;


    }

    public String getRegion() {
        return region;
    }

    public String getAldersGruppe() {
        return aldersGruppe;
    }

    public int getBekræftedeTilfældeIAlt() {
        return bekræftedeTilfældeIAlt;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagtePåIntensivAfdeling() {
        return indlagtePåIntensivAfdeling;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Nøgletal" +
                "region=" + region + '\'' +
                ", aldersGruppe=" + aldersGruppe + '\'' +
                ", bekræftedeTilfældeIAlt=" + bekræftedeTilfældeIAlt +
                ", døde=" + døde +
                ", indlagtePåIntensivAfdeling=" + indlagtePåIntensivAfdeling +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'';
        return result;
    }
}
