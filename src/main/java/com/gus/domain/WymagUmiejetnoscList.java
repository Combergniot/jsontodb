package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class WymagUmiejetnoscList {

    private  String umiejetnosc;
    @Column(name = "idOfery_umiejetnosc")
    private  String idOferty;

    /**
     * No args constructor for use in serialization
     *
     */
    public WymagUmiejetnoscList() {
    }
}
