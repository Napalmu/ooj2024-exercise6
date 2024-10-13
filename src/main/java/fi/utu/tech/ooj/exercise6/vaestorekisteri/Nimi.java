package fi.utu.tech.ooj.exercise6.vaestorekisteri;

import java.util.Objects;

abstract class Nimi implements Comparable<Nimi>{


    private String nimi;
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Nimi(String nimi) throws IllegalArgumentException {
        this. nimi = validateName(nimi);
    }

    abstract String validateName(String nimi) throws IllegalArgumentException;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nimi nimi1 = (Nimi) o;
        return Objects.equals(getNimi(), nimi1.getNimi());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNimi());
    }
    @Override
    public String toString() {
        return "Nimi{" +
                "nimi='" + nimi + '\'' +
                '}';
    }
    public int compareTo(Nimi toinenNimi) {
        return this.nimi.compareTo(toinenNimi.getNimi());
    }

}
