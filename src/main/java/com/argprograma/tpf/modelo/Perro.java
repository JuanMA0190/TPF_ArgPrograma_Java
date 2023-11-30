package com.argprograma.tpf.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Perro")
public class Perro extends Mascota implements Serializable {
    @Column(name="raza")
    private String raza;

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

    @Override
    public String toString() {
        return "Mi nombre es: "+this.getNombre()+" y mi raza es: "+this.getRaza();
    }
  
}
