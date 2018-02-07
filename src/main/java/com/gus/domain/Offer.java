package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
public class Offer  {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String hash;
    private String nrOferty;
    private String stanowisko;
    private String miejscePracyCzlonPierwszy;
    private String miejscePracyCzlonDrugi;
    private String rodzajWynagrodzenia;
    private String wynagrodzenie;
    @Lob
    private String wynagrodzenieOpis;
    private String pracodawca;
    private String skroconyRodzajZatrudnienia;
    private String rodzajZatrudnienia;
    private String wymiarEtatu;
    private String dataDodania;
    private String systemCzasuPracy;
    private String rodzajZakresuObowiazkow;
    @Lob
    private String zakresObowiazkow;
    @Lob
    private String wymagania;
    private String zrodloNazwa;
    private String zrodloNazwaOpisSkr;
    private String zrodloKod;
    private String typOferty;
    private String typStawki;
    @Embedded
    private List rodzajOferty;
    private String kraj;
    private String kodKraju;
    private String miejscowosc;
    private String kodMiejscowosci;
    private Boolean publikowacDanePracodawcy;
    private String kodSystemuWynagradzenia;
    @Embedded
    private List<WymagWyksztList> wymagWyksztList;
    @Embedded
    private List<WymagZawodList> wymagZawodList;
    @Embedded
    private List<WymagJezykList> wymagJezykList;
    @Embedded
    private List<WymagUprawnienieList> wymagUprawnienieList;
    @Embedded
    private List<WymagUmiejetnoscList> wymagUmiejetnoscList;
    @Lob
    private String wymagInne;
    private String stazOgol;
    private String dataModyfikacji;
    private String dataWaznosci;
    private String dataRozpoczeciaPracy;

    /**
     * No args constructor for use in serialization
     *
     */
    public Offer(){

    }
}
