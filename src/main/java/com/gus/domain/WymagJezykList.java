package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class WymagJezykList {

    private  String jezyk;
    private  String znajomoscMowy;
    private  String znajomoscPisma;
    @Column(name = "idOfery_jezyk")
    private  String idOferty;

    /**
     * No args constructor for use in serialization
     *
     */
    public WymagJezykList() {
    }
}
