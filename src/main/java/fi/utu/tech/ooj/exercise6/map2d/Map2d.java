package fi.utu.tech.ooj.exercise6.map2d;

import java.util.Collection;
import java.util.List;

public interface Map2d<K, S, V> {

    /* Rutiini hakee avainten osoittavan arvon tai palauttaa null, jos sitä ei löydy*/
    V get(K key1, S key2);

    /*Rutiini lisää arvon avainparin osoittamaan osoitteeseen. Jos avaimet ovat jo olemassa ts. on
    olemassa vanha arvo, päivitetään tuo arvo uuteen.
    Jos vanha arvo löytyy, rutiini palauttaa sen paluuarvona. Jos vanhaa arvoa ei ole, palautetaan uusi juuri lisätty arvo.
     */
    V put(K key1, S key2, V value);

    /* Poistaa avainten osoittaman arvon ja samalla myös palauttaa sen paluuarvona. Jos arvoa ei löydy, palautetaan null */
    V remove(K key1, S key2);

    /* Palauttaa totuusarvon true, jos avaimet löytyvät. Muuten false */
    boolean containtsKeyPair(K key1, S key2);

    /*Palauttaa totuusarvon true, jos arvo löytyy edes kerran. Muuten false. */
    boolean containsValue(V value);

    /* Palauttaa true, jos tietorakenteessa on edes yksi avainpari ja sitä vastaava arvo */
    boolean isEmpty();
    /*Palauttaa arvojen määrän */
    int size();
    /*Palauttaa kaikki talletetut arvot Collection tyyppisenä joukkona. */
    Collection<V> values();

    /*Palauttaa kaikki arvot lisäämisjärjestyksessä niin, että ensimmäisenä lisätty en listan ensimmäinen jne.
    Huomaa, että arvojen muokkaaminen ei vaikuta järjestykseen vaan ainoastaan uuden avainparin ja niitä vastaavan arvon lisääminen määrää järjestyksen.
     */
    List<V> getElementsInOrder();
}
