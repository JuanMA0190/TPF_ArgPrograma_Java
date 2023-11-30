package com.argprograma.tpf.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Mascota")
@Inheritance(strategy = InheritanceType.JOINED)
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;

    @OneToMany(mappedBy = "mascota", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<TurnoMedico> turnosMedicos;

    public Mascota() {
        this.turnosMedicos = new ArrayList<>();
    }

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.turnosMedicos = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<TurnoMedico> getTurnosMedicos() {
        return turnosMedicos;
    }

    public void setTurnosMedicos(List<TurnoMedico> turnosMedicos) {
        this.turnosMedicos = turnosMedicos;
    }

    public void addTurnoMedico(TurnoMedico turnoMedico) {
        turnosMedicos.add(turnoMedico);
        turnoMedico.setMascota(this);
    }

    public void removeTurnoMedico(TurnoMedico turnoMedico) {
        turnosMedicos.remove(turnoMedico);
        turnoMedico.setMascota(null);
    }
    

}
