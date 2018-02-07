package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class WymagZawodList {

     private  String nazwa;
    @Column(name = "staz_zawod")
     private  String staz;
     @Column(name = "idOfery_zawod")
     private  String idOferty;

    /**
     * No args constructor for use in serialization
     *
     */
    public WymagZawodList() {
    }
}
