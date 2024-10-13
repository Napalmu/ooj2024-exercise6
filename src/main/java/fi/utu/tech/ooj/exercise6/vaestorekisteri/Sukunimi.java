package fi.utu.tech.ooj.exercise6.vaestorekisteri;

public class Sukunimi extends Nimi{

    public Sukunimi(String nimi) throws IllegalArgumentException{
        super(nimi);
    }

    @Override
    String validateName(String nimi) throws IllegalArgumentException {
        /*
        Nimen validointi on jätetty toteuttamatta. Tämä on esimerkki siitä
        miten yhteistä abstraktia yläluokkaa voisi käyttää. Ajatuksena on, että EtuNimi
        ja SukuNimi luokkien validointi on erilainen.
         */
        return nimi;
    }

    @Override
    public String toString() {
        return "Sukunimi: " + getNimi();
    }
}
