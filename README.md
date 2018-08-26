# Classic-crypto

## Tietorakenteet ja algoritmit aineopintojen harjoitustyö

Harjoitustyö toteuttaa Java-kielellä klassisia (pre-1940-luku) kryptografisia algoritmeja ja kryptoanalyysiä näihin liittyen.

Salausalgoritmeista on toteutettu Vigenère cipher, Keyed Vigenère cipher ja Autokey Vigenère cipher sekä yksinkertainen (Single) ja kaksinkertainen (Double) Columnar Transposition.

Ohjelmassa on käyttöliittymä, jonka kautta salauksia voi tehdä (encrypt) ja avata (decrypt), ja lisäksi ohjelmaan on tulossa joidenkin salausten murtamiseen liittyvää toiminnallisuutta (molemmat kesken).

### Vigenère cipher

Vigenère cipher ja sen variantit kuuluvat luokkaan polyalphabetic substitution cipher eli ne ovat salauksia, joissa salauksessa jokainen kirjain vaihdetaan toiseen erityisen avainsanan perusteella ja käyttäen useita eri aakkostoja.

### Transposition cipher

Transposition cipher taas perustuu kirjainten järjestysten vaihtamiseen asettamalla viesti erityisen avainsanan pituisille riveille matriisi-muotoon ja sitten muodostamalla salateksti poimimalla matriisista sarakkeita perustuen avainsanan kirjainten aakkosjärjestykseen. 

Tarvittaessa avainsanan voisi myös korvata numerosarjalla, koska itse avaimessa ainoa merkitsevä tekijä on avaimen kirjainten aakkosjärjestys. Tästä syystä on suositeltavaa, että avainsanassa jokainen kirjain esiintyy vain yhden kerran, koska muuten salauksen aakkosjärjestyksen määrääminen ei välttämättä enää ole yksikäsitteistä.

Yksinkertaisessa (Single) columnar transposition cipherissa edellä kuvattu salaus tehdään kerran yhden avaimen perusteella, kun taas kaksinkertaisessa (double) columnar trnsposition cipherissa yksinkertainen salaus tehdään kaksi kertaa peräjälkeen käyttäen kahta avainta. Käytetyt avaimet voivat olla samoja, tosin kahden eri avaimen käyttö antaa vahvemman salauksen.

### Lisähuomautus

[Vigenère cipheriin](https://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher) ja sen variantteihin viitataan tässä työssä usein pelkästään sanoilla "Vigenere cipher" kirjoittamisen helpottamiseksi, vaikka oikeaan kirjoitusasuun siis kuuluu tuo è-merkki.

### Salauksen murtaminen eli cryptanalysis (kesken)

Työssä on toteutettu toiminnallisuutta (kesken) tavallisen Vigenère cipherin murtamiseen sekä yksinketaisen columnar transposition cipherin murtamiseen.

## Keskeiset dokumentit

[Määrittelydokumentti](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/Maarittelydokumentti.md)

[Testausdokumentti](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/Testausdokumentti.md)

[Toteutusdokumentti](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/Toteutusdokumentti.md)

## Viikkoraportit

[Viikkoraportti 1](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/Viikkoraportti-1.md)

[Viikkoraportti 2](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/Viikkoraportti-2.md)

[Viikkoraportti 3](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/Viikkoraportti-3.md)

[Viikkoraportti 4](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/Viikkoraportti-4.md)

[Viikkoraportti 5](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/Viikkoraportti-5.md)

[Viikkoraportti 6](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/Viikkoraportti-6.md)

## Tuntikirjanpito

[Tuntikirjanpito](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/tuntikirjanpito.md)

## Muuta

Tiedosto, jota käytetty ja johon dokumentoitu osa testausprosessista liittyen erityisesti paljon laskentaa vaativien metodien testaukseen IndexOfCoincidence luokassa. LibreOffice Calcin avulla pystyi semi-automatisoimaan laskentaa ja tekemään sen monelta osin täysin riippumattomasti omasta koodista. 

[IC_test.xlxs](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/IC_test.xlsx)
