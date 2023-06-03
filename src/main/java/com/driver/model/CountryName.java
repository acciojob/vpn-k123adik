package com.driver.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public enum CountryName {
    IND("001"),
    USA("002"),
    AUS("003"),
    CHI("004"),
    JPN("005");

    private final String code;

    private CountryName(String s) {

        code = s;
    }

    public String toCode() {

        return this.code;
    }


}
