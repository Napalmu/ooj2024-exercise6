package fi.utu.tech.ooj.exercise6.vaestorekisteri;

public class VaestorekisteriKaynnistin {

    public static void kaynnistaOhjelma() {
        System.out.println("------ Väestörekisteri demo käynnistyy ------");

        /*
        * Tämä rutiini suoritetaan automaattisesti, kun tehtäväpohja suoritetaan
        *
        * Lisää tähän Väestörekisterin demonstrointiin tarvittava koodi
        *
        * */
        // Alla oleva henkilötunnus ei ole todellinen vaan testitunnus, joka ei kuulu kenellekään.
        // Tulevaisuudessa olevia testitunnuksia voi luoda esimerkiksi sivustolla:
        // https://www.lintukoto.net/muut/henkilotunnus/
        HenkiloTunnus tun = new HenkiloTunnus("220526A989U");
        System.out.println("Henkilötunnus on: " + tun.getTunnus());


        // Luo Kansalainen-oliot
        Kansalainen kansalainen1 = new Kansalainen(new EtuNimi("Mikko"), new Sukunimi("Virtanen"), new HenkiloTunnus("220526A973A"));
        Kansalainen kansalainen2 = new Kansalainen(new EtuNimi("Anna"), new Sukunimi("Virtanen"), new HenkiloTunnus("150525A9958"));
        Kansalainen kansalainen3 = new Kansalainen(new EtuNimi("Mikko"), new Sukunimi("Korhonen"), new HenkiloTunnus("190625A987C"));
        Kansalainen kansalainen4 = new Kansalainen(new EtuNimi("Laura"), new Sukunimi("Korhonen"), new HenkiloTunnus("200625A9251"));
        Kansalainen kansalainen5 = new Kansalainen(new EtuNimi("Pekka"), new Sukunimi("Laine"), new HenkiloTunnus("200625A9251"));
        Kansalainen kansalainen6 = new Kansalainen(new EtuNimi("Anna"), new Sukunimi("Laine"), new HenkiloTunnus("160425A983P"));
        Kansalainen kansalainen7 = new Kansalainen(new EtuNimi("Sami"), new Sukunimi("Mäkinen"), new HenkiloTunnus("160425A917K"));
        Kansalainen kansalainen8 = new Kansalainen(new EtuNimi("Laura"), new Sukunimi("Mäkinen"), new HenkiloTunnus("130126A927T"));
        Kansalainen kansalainen9 = new Kansalainen(new EtuNimi("Mikko"), new Sukunimi("Nieminen"), new HenkiloTunnus("040226A993X"));
        Kansalainen kansalainen10 = new Kansalainen(new EtuNimi("Sami"), new Sukunimi("Virtanen"), new HenkiloTunnus("120226A921S"));

        Vaestorekisteri vaestorekisteri = new Vaestorekisteri();
        vaestorekisteri.lisaaRekisteriin(kansalainen1);
        vaestorekisteri.lisaaRekisteriin(kansalainen2);
        vaestorekisteri.lisaaRekisteriin(kansalainen3);
        vaestorekisteri.lisaaRekisteriin(kansalainen4);
        vaestorekisteri.lisaaRekisteriin(kansalainen5);
        vaestorekisteri.lisaaRekisteriin(kansalainen6);
        vaestorekisteri.lisaaRekisteriin(kansalainen7);
        vaestorekisteri.lisaaRekisteriin(kansalainen8);
        vaestorekisteri.lisaaRekisteriin(kansalainen9);
        vaestorekisteri.lisaaRekisteriin(kansalainen10);

        vaestorekisteri.tulostaNimirekisteri();
        vaestorekisteri.tulostaHetuRekisteri();
        vaestorekisteri.tulostaIkaRekisteri();

        //Muutosrutiinia voi kutsua näin:
        //vaestorekisteri.muutaKansalaisenNimet(kansalainen1.getHenkilotunnus(), new EtuNimi("Jorma"), new Sukunimi("Karhu"));


        System.out.println("------ Väestörekisteri demo päättyy ------");
    }
}
