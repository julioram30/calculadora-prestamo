package com.eiv.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.eiv.enums.GeneroEnum;
import com.mysql.cj.jdbc.Blob;

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
    private Blob foto;
    
    @Column(name = "id_localidad", nullable = false)
    private LocalidadEntity localidad;
    
    @Column(name = "codigo_postal",length = 10) 
    private String codigoPostal;

}
