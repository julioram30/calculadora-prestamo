package com.eiv.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eiv.enums.SistemaAmortizacionEnum;

@Entity
@Table(name = "lineas")
public class LineaEntity {

    @Id
    @Column(name = "linea_id",nullable = false)
    private Integer id;
    
    @Column(name = "nombre",nullable = false,length = 200)
    private String nombre;
    
    @Column(name = "sistema_amortizacion",length = 1)
    private SistemaAmortizacionEnum sistemaAmortizacion;
    
    @Column(name = "tasa_min")
    private BigDecimal tasaMinima;
    
    @Column(name = "tasa_max")
    private BigDecimal tasaMaxima;
    
    @Column(name = "cuotas_min")
    private BigDecimal cuotasMinimas;
    
    @Column(name = "cuotas_max")
    private BigDecimal cuotasMaximas;
    
    @Column(name = "capital_min")
    private BigDecimal capitalMinimo;
    
    @Column(name = "capital_max")
    private BigDecimal capitalMaximo;
    
    @Column(name = "fecha_alta")
    private LocalDate fechaAlta;
    
    
    
}
