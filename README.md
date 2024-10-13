# DTEK0066 exercise 6 template

## Tehtävänanto

Tehtävänanto löytyy Villestä. Osa tehtävistä tehdään Villessa ja osa palautetaan Gitlabin kautta. Linkki omaan repositorioon ilmoitetaan Villessä. 

Forkkaa itsellesi tämä projekti pohjaksi. Huomaa, että kaikki harjoituskerran 6 tehtävät tehdään samaan projektiin eli pohja forkataan vain kerran.

Main.java luokka sisältää ohjelman käynnistävän main-rutiinin. Muihin luokkiin ei tule main-rutiinia lisätä. Harjoitustyöpohja on rakennettu niin, 
että Main-luokan ajamalla kaikki harjoitustehtävät suoritetaan. 

Huomaa, että testit täytyy kuitenkin ajaa erikseen. 

## Tehtäviin vastaaminen

- Tehtävät 1-2 vastataan Villessä
- Tehtävä 3 Tutustutaan tehtäväpohjan koodiin ja vastataan Villessä
- Tehtävä 4 Ohjelmointitehtävä. Tehtävänanto Villessä. Koodataan tehtäväpohjaan ja oman Gitlab repositorion linkki tallennetaan Villeen.
- Tehtävä 5 Ohjelmointitehtävä. Tehtävänanto Villessä. Koodataan tehtäväpohjaan ja oman Gitlab repositorion linkki tallennetaan Villeen.


Maven-projektissa testit sijoitetaan test-hakemiston alle. 

## Työnkulku

1. [Forkkaa tämä projekti](https://tech.utugit.fi/soft/tools/lectures/dtek2074/2023-fi/git/gitlab/#gitlab-projektin-forkkaus)
2. [Kloonaa oma kopiosi projektista](https://tech.utugit.fi/soft/tools/lectures/dtek2074/2023-fi/git/gitlab/#gitlab-projektin-haku-paikalliseksi)
3. Tee tehtäviä
4. [Tallenna muutokset gitiin](https://tech.utugit.fi/soft/tools/lectures/dtek2074/2023-fi/git/usage/#ty%C3%B6kopion-ja-indeksin-k%C3%A4sittely)
5. [Lähetä muutokset takaisin GitLabiin](https://tech.utugit.fi/soft/tools/lectures/dtek2074/2023-fi/git/gitlab/#paikallisen-muutoksen-l%C3%A4hett%C3%A4minen-gitlabiin)

Tarvittaessa toista vaiheet 3 -- 5.

## Mavenin käskyjä

Jos käytät jotain integroitua kehitysympäristöä (IntelliJ Idea, Eclipse, VS Code), et todennäköisesti tarvitse alla olevia komentoja. 

[Lue tarvittaessa ohjeet](https://tech.utugit.fi/soft/tools/lectures/dtek2074/2023-fi/build/basic/).

```bash
$ mvn clean
$ mvn compile
$ mvn test
$ mvn exec:java
```
