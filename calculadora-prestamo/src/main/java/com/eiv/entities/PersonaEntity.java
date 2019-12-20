package com.eiv.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.eiv.enums.GeneroEnum;


@Entity
@Table(name = "personas")
public class PersonaEntity {
    
    @EmbeddedId
    PersonaPkEntity pk;
    
    @Column(name = "nombre_apellido", nullable = false, length = 400)
    private String nombreApellido;
    
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
    
    @Column(name = "genero")
    private GeneroEnum genero;
    
    @Column(name = "es_argentino", nullable = false)
    private Boolean argentino;
    
    @Column(name = "correo_electronica",length = 300)
    private String correoElectronico;
    
    @Column(name = "foto_cara")
    @Lob
    private byte[] foto;
    
    @OneToOne
    @JoinColumn(name = "id_localidad", nullable = false, referencedColumnName = "id_localidad")
    private LocalidadEntity localidad;
    
    @Column(name = "codigo_postal",length = 10) 
    private String codigoPostal;

    public PersonaEntity() {
    }
    
    public PersonaEntity(PersonaPkEntity pk) {
        super();
        this.pk = pk;
    }

    public PersonaPkEntity getPk() {
        return pk;
    }

    public void setPk(PersonaPkEntity pk) {
        this.pk = pk;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public GeneroEnum getGenero() {
        return genero;
    }

    public void setGenero(GeneroEnum genero) {
        this.genero = genero;
    }

    public Boolean getArgentino() {
        return argentino;
    }

    public void setArgentino(Boolean argentino) {
        this.argentino = argentino;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public LocalidadEntity getLocalidad() {
        return localidad;
    }

    public void setLocalidad(LocalidadEntity localidad) {
        this.localidad = localidad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "PersonaEntity [pk=" + pk + ", nombreApellido=" + nombreApellido + "]";
    }
    
    
    

}
