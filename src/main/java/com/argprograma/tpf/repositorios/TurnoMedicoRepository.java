package com.argprograma.tpf.repositorios;

import com.argprograma.tpf.DAO.TurnoMedicoDAO;
import com.argprograma.tpf.entidades.TurnoMedico;
import com.argprograma.tpf.persistencia.TurnoMedicoJpaController;
import com.argprograma.tpf.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class TurnoMedicoRepository implements TurnoMedicoDAO {
    public TurnoMedicoJpaController controllerTmJpa;

    public TurnoMedicoRepository() {
        controllerTmJpa = new TurnoMedicoJpaController();
    }

    @Override
    public TurnoMedico obtenerPorId(long id) {
        return controllerTmJpa.findTurnoMedico(id);
    }

    @Override
    public void guardar(TurnoMedico tm) {
        controllerTmJpa.create(tm);
    }

    @Override
    public void actualizar(TurnoMedico tm) {
        try {
            controllerTmJpa.edit(tm);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void eliminar(long id) {
        try {
            controllerTmJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<TurnoMedico> obtenerTodos() {
        return controllerTmJpa.findTurnoMedicoEntities();
    }
    
    
}
