package com.elda.primeravez.entity;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="persona")
@EntityListeners(AuditingEntityListener.class)
public class PersonasEntity {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    protected PersonasEntity() {}
    public PersonasEntity(Long id,String nombre, String apellido) {
     this.id=id;
        this.setNombre(nombre);
        this.setApellido(apellido);
    }    
 public Long getId() {
  return id;
 }
 public void setId(Long id) {
  this.id = id;
 }
 public String getApellido() {
  return apellido;
 }
 public void setApellido(String apellido) {
  this.apellido = apellido;
 }
 public String getNombre() {
  return nombre;
 }
 public void setNombre(String nombre) {
  this.nombre = nombre;
 }
 @Override
 public String toString() {
  return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
 }
}
