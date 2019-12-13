package com.eiv.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prestamos_cuotas")
public class PrestamoCuotaEntity {
    
    @EmbeddedId
    PrestamoCuotaPkEntity pk;
    
    @OneToOne
    @JoinColumn(name = "prestamo_id", referencedColumnName = "prestamo_id", 
            nullable = false, insertable = false, updatable = false)
    private PrestamoEntity prestamoEntity;
    
    @Column(name = "nro_cuota", nullable = false, insertable = false, updatable = false)
    private Integer id;
    
    @Column(name = "prestamo_id", nullable = false, insertable = false, updatable = false)
    private Integer numeroPrestamo;
    
    @Column(name = "importe_capital", nullable = false)
    private BigDecimal importeCapital;
    
    @Column(name = "importe_interes", nullable = false)
    private BigDecimal importeInteres;
    
    @Column(name = "importe_total", nullable = false)
    private BigDecimal importeTotal;

    public PrestamoCuotaEntity() {
        
    }

    public PrestamoCuotaEntity(Integer id) {
        super();
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getnumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setnumeroPrestamo(Integer numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public BigDecimal getImporteCapital() {
        return importeCapital;
    }

    public void setImporteCapital(BigDecimal importeCapital) {
        this.importeCapital = importeCapital;
    }

    public BigDecimal getImporteInteres() {
        return importeInteres;
    }

    public void setImporteInteres(BigDecimal importeInteres) {
        this.importeInteres = importeInteres;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PrestamoCuotaEntity other = (PrestamoCuotaEntity) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PrestamoCuotaEntity [id=" + id + ", numeroCxuota=" + numeroPrestamo + "]";
    }
    
    
    
        
    

}
