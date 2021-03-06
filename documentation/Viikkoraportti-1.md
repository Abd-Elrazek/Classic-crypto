# Viikkoraportti 1

## Mitä olen tehnyt

Keskiviikko ja torstai käytetty lähinnä kryptografiaan tutustumiseen ensin yleisellä tasolla lukemalla [wikipediaa: Cryptoraphy](https://en.wikipedia.org/wiki/Cryptography) ja seurailemalla sieltä alisivuja. Lisäksi luin aiheissa linkattua sivustoa http://rumkin.com/tools/cipher/index.php ja sen perusteella etsin wikipediasta lisätietoa sivustolla mainituista salausmenetelmistä.

Perjantaina laitettu projekti pystyyn GitHubiin ja yritetty tarkentaa mitä toteutetaan. Suunnitelma keskittyä klassisiin salausalgoritmeihin eli ennen 1970-lukua käytettyihin ja niiden salauksen rikkomiseen (cryptanalysis). 
 
## Miten ohjelma on edistynyt

Projekti on luotu, ei muuta edistystä

## Mitä opin tällä viikolla

Perusteet kryptografian historiasta ja sen miten selkeä ero klassisten "kynällä ja paperilla" käytettävien ja toisaalta modernien salausmenetelmien välillä on. 

Tutustuin joidenkin menetelmien toimintaperiaatteisiin tarkemmin yrittäen ymmärtää mekanismin (Vigenere, one-time-pad ja muita) ja lisäksi luin modulo-laskennasta ja yleisesti lukuteoriasta koska jo klassisissa algoritmeissa esimerkiksi suurimman yhteisen tekijän löytäminen näytti nousevan esiin. Modulolaskentaan ja lukuteoriaan liittyen lähteinä käytin *Introduction to Algorithms* ja *Johdatus abstraktiin algebraan* -kirjoja soveltuvin osin ja wikipedia/internet.

Lisäksi opin myös perusteita modernista kryptografiasta ja erityisesti RSA-salauksesta (suurten alkulukujen löytäminen ja niiden kertomimen suhteellisen helppoa mutta käänteisesti tulon tekijöiden selvittäminen vaikeaa).

Selkeni, että on parempi lähteä liikkeelle klassisista menetelmistä ja toteuttaa useampi niistä. Ja ajatus on, että saatu oppi ja kokemus salausten toteuttamisessa toivottavasti auttaa sitten näiden menetelmien rikkomisessa algoritmisesti. Työtä voi sitten laajentaa lisäämällä lisää salausmenetelmiä ja salauksen rikkomisen parantamisella. RSA-salausta tuskin toteutetaan ellei jää erityisen paljon aikaa.

## Mikä jäi epäselväksi/Vaikeudet/Kysymykset

* Salauksen rikkominen (kryptoanalyysi) algoritmisesti tai lähinnä se, että pitääkö pyrkiä siihen että rikkominen tapahtuu kokonaan automaattisesti vai niin, että käyttäjä ajaa jotain ohjelmaa ja sitten tekee valistuneita päätöksiä välissä? Eli siis algoritmit olisivat enemmän päätöksenteon apuväline kuin suora automaattinen menetelmä.

* Pitääkö pystyä luomaan algoritmi joka rikkoo esimerkiksi useamman tyyppisen salauksen tietämättä/olettamatta mitä (klassista) salausmenetelmää on käytetty vai voiko vain luoda työkalun useampaa salaustyyppiä varten, joissa sitten tarvitaan ihminen tekemään valistunut päätös mitä työkalua pitää käyttää ja mitä johtopäätöksiä vetää?

* Käsiteltävien syötteiden koko sekä salausalgoritmeissa että salauksen rikkomisessa.

* Klassiset salaukset käsittelevät käytännössä tekstin salaamista, onko tämä riittävää?

## Mitä teen seuraavaksi

Pyrkimys toteuttaa useampi klassinen salausmenetelmä/algoritmi (Vigenere ensimmäisenä, ja sitten joku muu) niin että plaintextin voi muuttaa ciphertextiksi ja toisinpäin sekä lisäksi asiaankuuluvat testit.

Lisätutkimusta salauksen rikkomiseen liittyen ja toivottavasti jotain alustavaa on saatu aikaan siihen liittyen.

## Käytetty tuntimäärä

| päivä   | aika (h) | toimenpiteet |
| :----:|:--------| :----------|
| Viikko 1 |   
| 25.7. | ~ 5 | Aiheeseen perehtyminen |
| 26.7. | ~ 5 | Aiheeseen perehtyminen |
| 27.7. | 5 | Projektin pystytys, dokumentoinnin kirjoitus, aiheen tarkennus |

[Tuntikirjanpito](https://github.com/Jsos17/Classic-crypto/blob/master/documentation/tuntikirjanpito.md)
