package com.eiv.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eiv.enums.RegionEnum;

@Entity
@Table(name = "provincias")
public class ProvinciaEntity {
    
    @Id
    @Column (name = "id_provincia", nullable = false)
    private Integer id;
    
    @Column(name = "nombre",nullable = false,unique = true,length = 400)
    private String nombre;
    
    @Column(name = "region", nullable = false,length = 3)
    private RegionEnum region;

    public ProvinciaEntity() {
        
    }
    
    public ProvinciaEntity(Integer id, String nombre) {
        super();
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RegionEnum getRegion() {
        return region;
    }

    public void setRegion(RegionEnum region) {
        this.region = region;
    }
    
    @Override
    public String toString() {
        return "ProvinciaEntity [id=" + id + ", nombre=" + nombre + "]";
    }
    
    

}
