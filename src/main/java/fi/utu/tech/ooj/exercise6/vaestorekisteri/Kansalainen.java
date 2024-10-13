package fi.utu.tech.ooj.exercise6.vaestorekisteri;

public class Kansalainen {

    private EtuNimi etunimi;
    private Sukunimi sukunimi;
    private HenkiloTunnus henkilotunnus;

    public Kansalainen(EtuNimi etunimi, Sukunimi sukunimi, HenkiloTunnus henkilotunnus) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.henkilotunnus = henkilotunnus;
    }
    public EtuNimi getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(EtuNimi etunimi) {
        this.etunimi = etunimi;
    }

    public Sukunimi getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(Sukunimi sukunimi) {
        this.sukunimi = sukunimi;
    }

    public HenkiloTunnus getHenkilotunnus() {
        return henkilotunnus;
    }

    public void setHenkilotunnus(HenkiloTunnus henkilotunnus) {
        this.henkilotunnus = henkilotunnus;
    }

    @Override
    public String toString() {
        return sukunimi + ", " + etunimi + ", " + henkilotunnus;
    }
}
