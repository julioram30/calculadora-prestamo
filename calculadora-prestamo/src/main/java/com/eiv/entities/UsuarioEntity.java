package com.eiv.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @EmbeddedId
    private PersonaPkEntity pk;
    
    @Column(name = "nombre_usuario", nullable = false, length = 50)
    private String nombreUsuario;
    
    @Column(name = "hashed_pwd", nullable = false, length = 200)
    private String password;

    public UsuarioEntity() {
        this.pk = new  PersonaPkEntity();
    }
    
    public UsuarioEntity(PersonaPkEntity pk, String nombreUsuario, String password) {
        super();
        this.pk = pk;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public PersonaPkEntity getPk() {
        return pk;
    }

    public void setPk(PersonaPkEntity pk) {
        this.pk = pk;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
        UsuarioEntity other = (UsuarioEntity) obj;
        if (pk == null) {
            if (other.pk != null) {
                return false;
            }
        } else if (!pk.equals(other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UsuariosEntity [pk=" + pk + ", nombreUsuario=" + nombreUsuario + "]";
    }
    
    
}
