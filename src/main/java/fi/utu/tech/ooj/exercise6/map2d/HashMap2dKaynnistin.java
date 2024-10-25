package fi.utu.tech.ooj.exercise6.map2d;

public class HashMap2dKaynnistin {

    public static void kaynnistaOhjelma() {
        System.out.println("------ HashMap2d luokan demo käynnistyy ------");

        /*
         * Tämä rutiini suoritetaan automaattisesti, kun tehtäväpohja suoritetaan
         *
         * Demoa tässä tekemäsi luokan toimintaa.
         *
         * */

        //Luodaan uusi HashMap2d-olio
        HashMap2d<Integer, Integer, String> testMap = new HashMap2d<>();
        //Testataan, onko rakenne tyhjä
        System.out.println("Onko tyhjä: 1/2 " +testMap.isEmpty());
        //Lisätään uusia oliota rakenteeseen
        testMap.put(1, 1, "x");
        testMap.put(1, 2, "y");
        testMap.put(2, 1, "z");
        //Testataan uudestaan, onko rakenne tyhjä
        System.out.println("Onko tyhjä: 2/2 "+testMap.isEmpty());
        //Tulostetaan koko
        System.out.println("Koko: "+testMap.size());
        //Haetaan rakenteesta määrätyillä avaimilla lisätty olio
        System.out.println("Haetaan olio avaimilla 1 ja 1: "+testMap.get(1, 1));
        System.out.println("Haetaan olio avaimilla 1 ja 2: "+testMap.get(1, 2));
        //Poistetaan lisätty olio
        System.out.println("Poistetaan olio avaimilla 1 ja 1: "+testMap.remove(1, 1));
        //Tulostetaan koko poistamisen jälkeen
        System.out.println("Koko poistamisen jälkeen: "+testMap.size());
        //Testataan, löytyykö jokin avainpari
        System.out.println("Löytyykö avainpari 2 ja 1: "+testMap.containtsKeyPair(2, 1));
        //Listataan talletetut oliot lisäämisjärjestyksessä
        System.out.println("Olioden lisäämisjärjestys: "+testMap.getElementsInOrder());


        System.out.println("------ HashMap2d luokan demo päättyy ------");
    }
}
