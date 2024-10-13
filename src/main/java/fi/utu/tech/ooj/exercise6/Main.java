package fi.utu.tech.ooj.exercise6;


import fi.utu.tech.ooj.exercise6.vaestorekisteri.VaestorekisteriKaynnistin;
import fi.utu.tech.ooj.exercise6.map2d.HashMap2dKaynnistin;

public class Main {
    public static void main(String[] args) {
        System.out.println("DTEK0066 2024 syksy, Tehtäväkerta 6");

        /*  Tämä main-metodi on ainoa, joka tarvitaan kaikkien tehtävien suorittamiseksi.
            Alla olevat kutsut suorittavat kaikkien harjoitustehtävien ajot.
         */

        System.out.println("Tehtäväpohja käynnistyy");
        VaestorekisteriKaynnistin.kaynnistaOhjelma();
        HashMap2dKaynnistin.kaynnistaOhjelma();

        System.out.println("Tehtävien suoritus on päättynyt");

    }
}
