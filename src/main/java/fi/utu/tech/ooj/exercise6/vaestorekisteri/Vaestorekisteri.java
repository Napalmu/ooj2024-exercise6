package fi.utu.tech.ooj.exercise6.vaestorekisteri;

import java.util.*;

public class Vaestorekisteri {
    private TreeMap<Sukunimi, TreeMap<EtuNimi, HashSet<Kansalainen>>> nimiRekisteri;
    private HashMap<HenkiloTunnus, Kansalainen> hetuRekisteri;
    private TreeMap<HenkiloTunnus, Kansalainen> ikajarjestysRekisteri;

    public Vaestorekisteri() {
        nimiRekisteri = new TreeMap<>();
        hetuRekisteri = new HashMap<>();
        ikajarjestysRekisteri = new TreeMap<>(DoBComparator);
    }

    //Date of Birth Comparator, järjestää henkilötunnukset syntymäajan mukaan.
    Comparator<HenkiloTunnus> DoBComparator = Comparator
                                            .comparing((HenkiloTunnus h) -> Integer.parseInt(h.toString().substring(4, 6))) //Vuosi
                                            .thenComparing((h) -> Integer.parseInt(h.toString().substring(2, 4))) //Kuukausi
                                            .thenComparing((h) -> Integer.parseInt(h.toString().substring(0, 2))) //Päivä
                                            .thenComparing((h) -> h.toString().substring(6)); //Loput luonollisessa järjestyksessä


    public void  lisaaRekisteriin(Kansalainen tyyppi) {
        if (nimiRekisteri.containsKey(tyyppi.getSukunimi())) {
            TreeMap<EtuNimi, HashSet<Kansalainen>> tempTree = nimiRekisteri.get(tyyppi.getSukunimi());
            if (tempTree.containsKey(tyyppi.getEtunimi())) {
                HashSet<Kansalainen> tempSet = tempTree.get(tyyppi.getEtunimi());
                tempSet.add(tyyppi);
            }else {
                HashSet<Kansalainen> tempSet = new HashSet<>();
                tempSet.add(tyyppi);
                tempTree.put(tyyppi.getEtunimi(),tempSet);
            }
        }
        else {
            HashSet<Kansalainen> tempSet = new HashSet<>();
            tempSet.add(tyyppi);
            TreeMap<EtuNimi, HashSet<Kansalainen>> tempTree = new TreeMap<>();
            tempTree.put(tyyppi.getEtunimi(), tempSet);
            nimiRekisteri.put(tyyppi.getSukunimi(), tempTree);
        }

        hetuRekisteri.put(tyyppi.getHenkilotunnus(), tyyppi);
        ikajarjestysRekisteri.put(tyyppi.getHenkilotunnus(), tyyppi);

    }
    public void muutaKansalaisenNimet(HenkiloTunnus hetu, EtuNimi etuNimi, Sukunimi sukunimi) {
        if (hetuRekisteri.containsKey(hetu)) {
            Kansalainen tempKansalainen = hetuRekisteri.get(hetu);
            tempKansalainen.setEtunimi(etuNimi);
            tempKansalainen.setSukunimi(sukunimi);
        }
    }
    public void tulostaNimirekisteri() {
        System.out.println("Kansalaiset listattuna sukunimen ja etunimen mukaisessa järjestyksessä");
        for (Map.Entry<Sukunimi, TreeMap<EtuNimi, HashSet<Kansalainen>>> sukunimiEntry : nimiRekisteri.entrySet()) {
            System.out.println(sukunimiEntry.getKey().toString());
            for (Map.Entry<EtuNimi, HashSet<Kansalainen>> etuNimiEntry : sukunimiEntry.getValue().entrySet()) {
                System.out.println("   " + etuNimiEntry.getKey().toString());
                for (Kansalainen kansalainen : etuNimiEntry.getValue()) {
                    System.out.println("      " + kansalainen);
                }
            }
        }
    }

    public void tulostaHetuRekisteri() {
        System.out.println("Kansalaiset listattuna rekisteristä, jossa henkilötunnus on avain");
        for (Map.Entry<HenkiloTunnus, Kansalainen> kansalainenEntry : hetuRekisteri.entrySet()) {
            System.out.println(kansalainenEntry.getKey());
            System.out.println("   " + kansalainenEntry.getValue());
        }
    }

    public void tulostaIkaRekisteri() {
        System.out.println("Kansalaiset listattuna iän mukaisessa järjestyksessä");
        for (Map.Entry<HenkiloTunnus, Kansalainen> kansalainenEntry : ikajarjestysRekisteri.entrySet()) {
            System.out.println(kansalainenEntry.getKey());
            System.out.println("   " + kansalainenEntry.getValue());
        }
    }

}
