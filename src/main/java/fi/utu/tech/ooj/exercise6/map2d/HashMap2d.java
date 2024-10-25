package fi.utu.tech.ooj.exercise6.map2d;


import java.util.*;

/*Kirjoita tähän toteutus Map2d rajapinnan implementoivalle HashMap2d luokalle.
  Vinkki: huomaa, että myös luokan signatuuri on keskeneräinen.
 */
public class HashMap2d<K, S, V> implements Map2d<K, S, V>{
    private HashMap<K, HashMap<S,V>> map2d;
    private ArrayList<V> insertionOrder;

    public HashMap2d(){
       map2d = new HashMap<>();
       insertionOrder = new ArrayList<>();
    }
    /* Rutiini hakee avainten osoittavan arvon tai palauttaa null, jos sitä ei löydy*/
    @Override
    public V get(K key1, S key2) {
        return map2d.containsKey(key1) ? map2d.get(key1).get(key2) : null;
    }
    /*Rutiini lisää arvon avainparin osoittamaan osoitteeseen. Jos avaimet ovat jo olemassa ts. on
     olemassa vanha arvo, päivitetään tuo arvo uuteen.
     Jos vanha arvo löytyy, rutiini palauttaa sen paluuarvona. Jos vanhaa arvoa ei ole, palautetaan uusi juuri lisätty arvo.
     */
    @Override
    public V put(K key1, S key2, V value) {
        insertionOrder.add(value);
        return map2d.computeIfAbsent(key1, k -> new HashMap<>()).put(key2, value);
    }
    /* Poistaa avainten osoittaman arvon ja samalla myös palauttaa sen paluuarvona. Jos arvoa ei löydy, palautetaan null */
    @Override
    public V remove(K key1, S key2) {
        insertionOrder.remove(map2d.get(key1).get(key2));
        V removedItem = map2d.get(key1).remove(key2);
        if (map2d.get(key1).isEmpty()){
            map2d.remove(key1);
        }
        return removedItem;
    }
    /* Palauttaa totuusarvon true, jos avaimet löytyvät. Muuten false */
    @Override
    public boolean containtsKeyPair(K key1, S key2) {
        return map2d.containsKey(key1) && map2d.get(key1).containsKey(key2);
    }
    /*Palauttaa totuusarvon true, jos arvo löytyy edes kerran. Muuten false. */
    @Override
    public boolean containsValue(V value) {
        return map2d.containsValue(value);
    }
    /* Palauttaa true, jos tietorakenteessa on edes yksi avainpari ja sitä vastaava arvo */
    @Override
    public boolean isEmpty() {
        return map2d.isEmpty();
    }
    /*Palauttaa arvojen määrän */
    @Override
    public int size() {
        int size = 0;
        for (Map.Entry<K, HashMap<S, V>> entry : map2d.entrySet()){
            size += entry.getValue().size();
        }
        return size;
    }
    /*Palauttaa kaikki talletetut arvot Collection tyyppisenä joukkona. */
    @Override
    public Collection values() {
        return List.of(map2d);
    }
    /*Palauttaa kaikki arvot lisäämisjärjestyksessä niin, että ensimmäisenä lisätty on listan ensimmäinen jne.
    Huomaa, että arvojen muokkaaminen ei vaikuta järjestykseen vaan ainoastaan uuden avainparin ja niitä vastaavan arvon lisääminen määrää järjestyksen.
     */
    @Override
    public List getElementsInOrder() {
        return List.of(insertionOrder);
    }
}
