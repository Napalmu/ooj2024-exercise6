package fi.utu.tech.ooj.exercise6.vaestorekisteri;

import java.util.Comparator;
import java.util.regex.Pattern;

public class HenkiloTunnus implements Comparable<HenkiloTunnus> {
    private String tunnus;
    public HenkiloTunnus(String tunnus) throws IllegalArgumentException{
        if (!onValidiHenkilotunnus(tunnus)) throw new IllegalArgumentException();
        this.tunnus = tunnus;
    }

    public String getTunnus() {
        return tunnus;
    }

    public void setTunnus(String tunnus) {
        this.tunnus = tunnus;
    }

    public static boolean onValidiHenkilotunnus(String henkilotunnus) {
        String regex = "^(\\d{2})(\\d{2})(\\d{2})([-+A])(\\d{3})([0-9A-FHJ-NPR-Y])$";
        Pattern pattern = Pattern.compile(regex);
        if (!pattern.matcher(henkilotunnus).matches()) {
            return false;
        }

        String paiva = henkilotunnus.substring(0, 2);
        String kuukausi = henkilotunnus.substring(2, 4);
        String vuosi = henkilotunnus.substring(4, 6);
        char erottavaMerkki = henkilotunnus.charAt(6);
        String yksilollinenTunnus = henkilotunnus.substring(7, 10);
        char tarkistusMerkki = henkilotunnus.charAt(10);

        int vuosiInt = muodostaTaydellinenVuosi(vuosi, erottavaMerkki);

        if (!onValidiPaivays(paiva, kuukausi, vuosiInt)) {
            return false;
        }

        String syntymaOsa = paiva + kuukausi + vuosi + yksilollinenTunnus;
        int syntymaLuku = Integer.parseInt(syntymaOsa);
        String tarkistusMerkkiOikea = laskeTarkistusMerkki(syntymaLuku);
        return tarkistusMerkkiOikea.equals(String.valueOf(tarkistusMerkki));
    }
    private static int muodostaTaydellinenVuosi(String vuosi, char erottavaMerkki) {
        int vuosiInt = Integer.parseInt(vuosi);
        switch (erottavaMerkki) {
            case '+':
                return 1800 + vuosiInt;
            case '-':
                return 1900 + vuosiInt;
            case 'A':
                return 2000 + vuosiInt;
            default:
                throw new IllegalArgumentException("Virheellinen erottava merkki: " + erottavaMerkki);
        }
    }
    private static boolean onValidiPaivays(String paiva, String kuukausi, int vuosi) {
        int p = Integer.parseInt(paiva);
        int k = Integer.parseInt(kuukausi);
        if (k < 1 || k > 12) {
            return false;
        }
        int[] kuukaudenPaivat = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (k == 2 && onKarkausvuosi(vuosi)) {
            kuukaudenPaivat[1] = 29;
        }
        return p >= 1 && p <= kuukaudenPaivat[k - 1];
    }

    private static boolean onKarkausvuosi(int vuosi) {
        if (vuosi % 4 == 0) {
            if (vuosi % 100 == 0) {
                return vuosi % 400 == 0;
            }
            return true;
        }
        return false;
    }
    private static String laskeTarkistusMerkki(int syntymaLuku) {
        String merkit = "0123456789ABCDEFHJKLMNPRSTUVWXY";
        int indeksi = syntymaLuku % 31;
        return String.valueOf(merkit.charAt(indeksi));
    }

    @Override
    public int compareTo(HenkiloTunnus toinenTunnus) {
        return this.tunnus.compareTo(toinenTunnus.getTunnus());
    }

    @Override
    public String toString() {
        return tunnus;
    }
}
