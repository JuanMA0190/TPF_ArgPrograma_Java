package com.argprograma.tpf.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Perro")
public class Perro extends Mascota implements Serializable {
    @Column(name="raza")
    private String raza;
    
    public Perro(){
    }

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
  
    
}
