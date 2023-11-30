package com.argprograma.tpf.modelo;

import com.argprograma.tpf.modelo.estados.*;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TurnoMedico")
public class TurnoMedico implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    
    @ManyToOne
    @JoinColumn(name="id_mascota")
    @Column(name="id_mascota")
    private Mascota mascota;
    
    @Column(name="fecha")
    private LocalDate fecha;
    
    @Column(name="motivo")
    private String motivo;
    
    @Column(name="estado")
    private Estado estado;
    
    public TurnoMedico(Mascota mascota, LocalDate fecha, String motivo) {
        this.mascota = mascota;
        this.fecha = fecha;
        this.motivo = motivo;
        this.estado = new TurnoPendiente();
    }
    public long getId(){
        return id;
    }
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public void procesarTurno() {
        estado.procesarTurno(this);
    }
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "La mascota "+this.mascota.getNombre()+" turno: "+this.getEstado().procesarTurno(this);
    }
     
}
