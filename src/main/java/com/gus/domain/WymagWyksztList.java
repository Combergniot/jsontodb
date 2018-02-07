package com.gus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@Embeddable
public class WymagWyksztList {


    private String typ;
    private String poziom;
    @Column(name = "idOfery_wyksztalcenie")
    private String idOferty;

    /**
     * No args constructor for use in serialization
     *
     */
    public WymagWyksztList() {
    }
}
