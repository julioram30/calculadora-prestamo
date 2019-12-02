package com.eiv.enums;

public enum SistemaAmortizacionEnum {
    FRANCES('F'), 
    ALEMAN('A');

    private Character sistemaAmort;

    private SistemaAmortizacionEnum(Character sistemaAmort) {
        this.sistemaAmort = sistemaAmort;
    }

    public Character getSistemaAmort() {
        return sistemaAmort;
    }

    public static SistemaAmortizacionEnum of(Character sistemaAmort) {
        if (sistemaAmort == null) { 
            throw new IllegalArgumentException("no puede ser nulo");
        } else if (sistemaAmort.toString().trim().equalsIgnoreCase("A")) {
            return ALEMAN;
        } else if (sistemaAmort.toString().trim().equalsIgnoreCase("A")) {
            return FRANCES;
        } else {
            throw new IllegalArgumentException("no es un tipo de enumeracion SistemaAmortizacion");
        }

    }

}
