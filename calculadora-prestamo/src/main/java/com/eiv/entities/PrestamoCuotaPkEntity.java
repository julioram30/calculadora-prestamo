package com.eiv.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrestamoCuotaPkEntity implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "prestamo_id",nullable = false)
    private Long prestamoId;
    
    @Column(name = "nro_cuota", nullable = false)
    private Long numeroCuota;

    public PrestamoCuotaPkEntity() {
        
    }
    
    public PrestamoCuotaPkEntity(PrestamoEntity prestamoEntity, long numeroCuota) {
        super();
        this.prestamoId = prestamoEntity.getId();
        this.numeroCuota = numeroCuota;
    }

    public Long getPrestamoId() {
        return prestamoId;
    }

    public void setPrestamoId(Long prestamoId) {
        this.prestamoId = prestamoId;
    }

    public Long getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(Long numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroCuota == null) ? 0 : numeroCuota.hashCode());
        result = prime * result + ((prestamoId == null) ? 0 : prestamoId.hashCode());
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
        PrestamoCuotaPkEntity other = (PrestamoCuotaPkEntity) obj;
        if (numeroCuota == null) {
            if (other.numeroCuota != null) {
                return false;
            }
        } else if (!numeroCuota.equals(other.numeroCuota)) {
            return false;
        }
        if (prestamoId == null) {
            if (other.prestamoId != null) {
                return false;
            }
        } else if (!prestamoId.equals(other.prestamoId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PrestamoCuotaPkEntity [prestamoId=" + prestamoId + ", " + "numeroCuota=" 
                + numeroCuota + "]";
    }
    
}
