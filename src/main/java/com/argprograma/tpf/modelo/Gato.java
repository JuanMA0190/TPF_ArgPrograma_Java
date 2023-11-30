package com.argprograma.tpf.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Gato")
public class Gato extends Mascota implements Serializable{
    @Column(name="color")
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mi nombre es: "+this.getNombre()+" y mi color es: "+this.getColor();
    }

}