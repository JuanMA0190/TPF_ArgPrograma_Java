package com.argprograma.tpf.main;

import com.argprograma.tpf.vistas.Principal;

public class Main {

    public static void main(String[] args) {
        /*GatoRepository gatoRepository = new GatoRepository();
        PerroRepository perroRepository = new PerroRepository();
        MascotaRepository mascotaRepository = new MascotaRepository();
        TurnoMedicoRepository turnoMedicoRepository = new TurnoMedicoRepository();

        try {
            // Crear un perro y asociarlo a la mascota
            Mascota perro = new Perro("NombrePerro", 5, "RazaPerro");
            mascotaRepository.guardar(perro);

            // Crear un gato y asociarlo a la mascota
            Mascota gato = new Gato("NombreGato", 2, "ColorGato");
            mascotaRepository.guardar(gato);

            // Crear un turno médico y asociarlo a la mascota
            TurnoMedico turnoMedicoPerro = new TurnoMedico(perro, LocalDate.now(), "Consulta de rutina");
            turnoMedicoRepository.guardar(turnoMedicoPerro);

            // Asociar el turno médico a la lista de turnos de la mascota
            perro.addTurnoMedico(turnoMedicoPerro);
            mascotaRepository.actualizar(perro);

            // Crear un turno médico y asociarlo a la mascota
            TurnoMedico turnoMedicoGato = new TurnoMedico(gato, LocalDate.now(), "Consulta de rutina");
            turnoMedicoRepository.guardar(turnoMedicoGato);

            // Asociar el turno médico a la lista de turnos de la mascota
            gato.addTurnoMedico(turnoMedicoGato);
            mascotaRepository.actualizar(gato);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
