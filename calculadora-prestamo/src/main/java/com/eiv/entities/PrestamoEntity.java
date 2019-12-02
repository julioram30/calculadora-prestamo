package com.eiv.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prestamos")
public class PrestamoEntity {
    
    @Id
    @Column(name = "prestamo_id", nullable = false, unique = true)
    private Long id;

    @Column(name = "fecha_alta", nullable = false)
    private LocalDate fechaAlta; 
    
    @OneToOne
    @JoinColumn(name = "linea_id",referencedColumnName = "linea_id", nullable = false)
    private LineaEntity linea;
    
    @OneToOne
    @JoinColumns({
                @JoinColumn(
                name = "usuario_tipo_documento", referencedColumnName = "id_tipodocumento", 
                nullable = false),
                @JoinColumn(
                name = "usuario_numero_documento", referencedColumnName = "numero_documento", 
                nullable = false) })
    private UsuarioEntity usuario;
    
    @Column(name = "tea", nullable = false)
            private BigDecimal tea;
    
    @Column(name = "tea_modulo", nullable = false)
    private BigDecimal teaModulo;
    
    @Column(name = "capital_prestado", nullable = false)
    private BigDecimal capital;
    
    @Column(name = "total_intereses", nullable = false)
    private BigDecimal intereses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LineaEntity getLinea() {
        return linea;
    }

    public void setLinea(LineaEntity linea) {
        this.linea = linea;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getTea() {
        return tea;
    }

    public void setTea(BigDecimal tea) {
        this.tea = tea;
    }

    public BigDecimal getTeaModulo() {
        return teaModulo;
    }

    public void setTeaModulo(BigDecimal teaModulo) {
        this.teaModulo = teaModulo;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public BigDecimal getIntereses() {
        return intereses;
    }

    public void setIntereses(BigDecimal intereses) {
        this.intereses = intereses;
    }

    public PrestamoEntity(Long id) {
        super();
        this.id = id;
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
        PrestamoEntity other = (PrestamoEntity) obj;
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
        return "PrestamoEntity [id=" + id + ", fechaAlta=" + fechaAlta + ", linea=" + linea + "]";
    }
    
    
}
