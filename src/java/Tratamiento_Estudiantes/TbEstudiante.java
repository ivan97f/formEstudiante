/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tratamiento_Estudiantes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ivan
 */
@Entity
@Table(name = "TB_ESTUADIANTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEstuadiante.findAll", query = "SELECT t FROM TbEstuadiante t")
    , @NamedQuery(name = "TbEstuadiante.findById", query = "SELECT t FROM TbEstuadiante t WHERE t.id = :id")
    , @NamedQuery(name = "TbEstuadiante.findByNombre", query = "SELECT t FROM TbEstuadiante t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TbEstuadiante.findBySeccion", query = "SELECT t FROM TbEstuadiante t WHERE t.seccion = :seccion")
    , @NamedQuery(name = "TbEstuadiante.findByEmail", query = "SELECT t FROM TbEstuadiante t WHERE t.email = :email")})
public class TbEstudiante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 75)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 10)
    @Column(name = "SECCION")
    private String seccion;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 80)
    @Column(name = "EMAIL")
    private String email;

    public TbEstudiante() {
    }

    public TbEstudiante(Integer id) {
        this.id = id;
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

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEstudiante)) {
            return false;
        }
        TbEstudiante other = (TbEstudiante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tratamiento_Estudiantes.TbEstuadiante[ id=" + id + " ]";
    }
    
}
