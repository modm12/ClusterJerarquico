/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author modm_
 */
@Entity
@Table(name = "individuo", catalog = "virtualizacion", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Individuo.findAll", query = "SELECT i FROM Individuo i"),
    @NamedQuery(name = "Individuo.findById", query = "SELECT i FROM Individuo i WHERE i.id = :id"),
    @NamedQuery(name = "Individuo.findByDepartamento", query = "SELECT i FROM Individuo i WHERE i.departamento = :departamento"),
    @NamedQuery(name = "Individuo.findByNombre", query = "SELECT i FROM Individuo i WHERE i.nombre = :nombre"),
    @NamedQuery(name = "Individuo.findByDpi", query = "SELECT i FROM Individuo i WHERE i.dpi = :dpi"),
    @NamedQuery(name = "Individuo.findByEsCivil", query = "SELECT i FROM Individuo i WHERE i.esCivil = :esCivil"),
    @NamedQuery(name = "Individuo.findBySexo", query = "SELECT i FROM Individuo i WHERE i.sexo = :sexo")})
public class Individuo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Departamento")
    private String departamento;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "DPI")
    private String dpi;
    @Column(name = "EsCivil")
    private Integer esCivil;
    @Column(name = "Sexo")
    private Boolean sexo;

    public Individuo() {
    }

    public Individuo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public Integer getEsCivil() {
        return esCivil;
    }

    public void setEsCivil(Integer esCivil) {
        this.esCivil = esCivil;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
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
        if (!(object instanceof Individuo)) {
            return false;
        }
        Individuo other = (Individuo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conexion.exceptions.Individuo[ id=" + id + " ]";
    }
    
}
