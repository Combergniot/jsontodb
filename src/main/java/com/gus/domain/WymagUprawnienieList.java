package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class WymagUprawnienieList {

    private  String uprawnienie;
    @Column(name = "staz_uprawnienie")
    private  String staz;
    @Column(name = "idOfery_uprawnienie")
    private  String idOferty;

    /**
     * No args constructor for use in serialization
     *
     */
    public WymagUprawnienieList() {
    }
}
