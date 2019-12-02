package com.eiv.enums;

public enum GeneroEnum {
     MASCULINO('M'),
     FEMENINO('F'),
     INDEFINIDO('Ì');
    
    private Character genero;

    private GeneroEnum(Character genero) {
        this.genero = genero;
    }

    public Character getGenero() {
        return genero;
    }

    public static GeneroEnum of(Character genero) {
        if (genero == null) { 
            throw new IllegalArgumentException("no puede ser nulo");
        } else if (genero.toString().trim().equalsIgnoreCase("M")) {
            return MASCULINO;
        } else if (genero.toString().trim().equalsIgnoreCase("F")) {
            return FEMENINO;
        } else if (genero.toString().trim().equalsIgnoreCase("I")) {
            return INDEFINIDO;    
        } else {
            throw new IllegalArgumentException("no es un tipo de enumeracion Genero");
        }
    }

    
}
