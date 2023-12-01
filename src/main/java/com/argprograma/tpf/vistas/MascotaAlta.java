package com.argprograma.tpf.vistas;

import com.argprograma.tpf.entidades.Gato;
import com.argprograma.tpf.entidades.Mascota;
import com.argprograma.tpf.entidades.Perro;
import com.argprograma.tpf.entidades.TurnoMedico;
import com.argprograma.tpf.repositorios.GatoRepository;
import com.argprograma.tpf.repositorios.MascotaRepository;
import com.argprograma.tpf.repositorios.PerroRepository;
import com.argprograma.tpf.repositorios.TurnoMedicoRepository;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class MascotaAlta extends javax.swing.JFrame {

    MascotaRepository maRepo = null;
    TurnoMedicoRepository tMRepo = null;
    GatoRepository gRepo = null;
    PerroRepository pRepo = null;
    String[] titulos = {"ID", "Nombre", "Edad", "Raza", "Motivo_Turno", "Fecha_Turno", "Estado_Turno"};

    public MascotaAlta() {
        maRepo = new MascotaRepository();
        tMRepo = new TurnoMedicoRepository();
        gRepo = new GatoRepository();
        pRepo = new PerroRepository();
        initComponents();
        this.setResizable(false);
        this.setSize(810, 630);
        cargarTabla(Perro.class, titulos, tblPerro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jTPMascota = new javax.swing.JTabbedPane();
        PanelPerro = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPerro = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tbEdad = new javax.swing.JTextField();
        tbNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tbRaza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbMotivo = new javax.swing.JTextField();
        tbEstado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PanelGato = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGato = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tbNombreG = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tbEdadG = new javax.swing.JTextField();
        tbEstadoG = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbMotivoG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tbColor = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jLabel13 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("<- Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 90, 40));

        jTPMascota.setBackground(new java.awt.Color(102, 102, 102));
        jTPMascota.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTPMascotaStateChanged(evt);
            }
        });

        PanelPerro.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblPerro.setBackground(new java.awt.Color(102, 102, 102));
        tblPerro.setForeground(new java.awt.Color(255, 255, 255));
        tblPerro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblPerro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPerroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPerro);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardar.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(51, 51, 51));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha Turno");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad");

        tbEdad.setForeground(new java.awt.Color(0, 0, 0));
        tbEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbEdadKeyReleased(evt);
            }
        });

        tbNombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Motivo Turno");

        tbRaza.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Raza");

        tbMotivo.setForeground(new java.awt.Color(0, 0, 0));

        tbEstado.setEditable(false);
        tbEstado.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Estado Turno");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbEstado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbMotivo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(tbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tbRaza))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbEdad)
                    .addComponent(tbNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout PanelPerroLayout = new javax.swing.GroupLayout(PanelPerro);
        PanelPerro.setLayout(PanelPerroLayout);
        PanelPerroLayout.setHorizontalGroup(
            PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPerroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPerroLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPerroLayout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelPerroLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PanelPerroLayout.setVerticalGroup(
            PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPerroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelPerroLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnActualizar))
                        .addGroup(PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPerroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPerroLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTPMascota.addTab("Perro", PanelPerro);

        PanelGato.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblGato.setBackground(new java.awt.Color(102, 102, 102));
        tblGato.setForeground(new java.awt.Color(255, 255, 255));
        tblGato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblGato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGatoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGato);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");

        tbNombreG.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad");

        tbEdadG.setForeground(new java.awt.Color(0, 0, 0));
        tbEdadG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbEdadGKeyReleased(evt);
            }
        });

        tbEstadoG.setEditable(false);
        tbEstadoG.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Color");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado Turno");

        tbMotivoG.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Motivo Turno");

        tbColor.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tbColor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tbEstadoG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                    .addComponent(tbMotivoG, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(tbNombreG, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addGap(8, 8, 8)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbEdadG, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(15, 15, 15))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbEdadG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbNombreG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbMotivoG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbEstadoG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha Turno");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnGuardar1.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        btnActualizar1.setBackground(new java.awt.Color(51, 51, 51));
        btnActualizar1.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar1.setText("Actualizar");
        btnActualizar1.setEnabled(false);
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });

        btnEliminar1.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setEnabled(false);
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnCancelar1.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelGatoLayout = new javax.swing.GroupLayout(PanelGato);
        PanelGato.setLayout(PanelGatoLayout);
        PanelGatoLayout.setHorizontalGroup(
            PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelGatoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGatoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(PanelGatoLayout.createSequentialGroup()
                                .addGroup(PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelGatoLayout.createSequentialGroup()
                                        .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnActualizar1))
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(PanelGatoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGatoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        PanelGatoLayout.setVerticalGroup(
            PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGatoLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar1)
                            .addComponent(btnActualizar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTPMascota.addTab("Gato", PanelGato);

        jPanel1.add(jTPMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cargarTabla(Class<? extends Mascota> claseMascota, String[] titulos, JTable tabla) {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modeloTabla.setColumnIdentifiers(titulos);

        List<Mascota> listaMascotas = maRepo.obtenerTodos();

        if (listaMascotas != null) {
            for (Mascota mascota : listaMascotas) {
                if (claseMascota.isInstance(mascota)) {
                    List<TurnoMedico> turnos = mascota.getTurnosMedicos();

                    turnos.forEach(turno -> {
                        Object[] objeto = null;
                        if (mascota instanceof Perro) {
                            Perro perro = (Perro) mascota;
                            objeto = new Object[]{mascota.getId(), perro.getNombre(), perro.getEdad(), perro.getRaza(), turno.getMotivo(), turno.getFecha(), turno.getEstado()};
                        } else if (mascota instanceof Gato) {
                            Gato gato = (Gato) mascota;
                            objeto = new Object[]{mascota.getId(), gato.getNombre(), gato.getEdad(), gato.getColor(), turno.getMotivo(), turno.getFecha(), turno.getEstado()};
                        }
                        modeloTabla.addRow(objeto);
                    });
                }
            }
        }

        tabla.setModel(modeloTabla);

        // Configura la columna ID para que no sea visible
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setWidth(0);
        //-----------------------------------------------------------------
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
        tabla.setRowSorter(sorter);

        Comparator<Object> dateComparator = (date1, date2) -> ((LocalDate) date1).compareTo((LocalDate) date2);
        sorter.setComparator(titulos.length - 1, dateComparator);

    }

    private void limpiar() {
        LocalDate fechaActual = LocalDate.now();
        Date fechaActualDate = java.sql.Date.valueOf(fechaActual);

        tbNombre.setText("");
        tbNombreG.setText("");
        tbEdad.setText("");
        tbEdadG.setText("");
        tbRaza.setText("");
        tbColor.setText("");
        tbEstadoG.setText("");
        tbEstado.setText("");
        tbMotivo.setText("");
        tbMotivoG.setText("");
        jCalendar1.setDate(fechaActualDate);
    }

    private void jTPMascotaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTPMascotaStateChanged
        int selectedIndex = jTPMascota.getSelectedIndex();

        switch (selectedIndex) {
            case 0:
                titulos[3] = "Raza";
                cargarTabla(Perro.class, titulos, tblPerro);

                break;
            case 1:
                titulos[3] = "Color";
                cargarTabla(Gato.class, titulos, tblGato);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jTPMascotaStateChanged

    private void tblPerroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerroMouseClicked
        int filaSeleccionada = tblPerro.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String nombre = tblPerro.getValueAt(filaSeleccionada, 1).toString();
            String edad = tblPerro.getValueAt(filaSeleccionada, 2).toString();
            String raza = tblPerro.getValueAt(filaSeleccionada, 3).toString();
            String motivo = tblPerro.getValueAt(filaSeleccionada, 4).toString();

            LocalDate localDate = (LocalDate) tblPerro.getValueAt(filaSeleccionada, 5);
            
            String estado = tblPerro.getValueAt(filaSeleccionada, 6).toString();

            Date fecha = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            tbNombre.setText(nombre);
            tbEdad.setText(edad);
            tbRaza.setText(raza);
            tbMotivo.setText(motivo);
            jCalendar1.setDate(fecha);
            tbEstado.setText(estado);

            btnGuardar.setEnabled(false);
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
            tbMotivo.setEditable(false);
        }
    }//GEN-LAST:event_tblPerroMouseClicked

    private void tblGatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGatoMouseClicked
        int filaSeleccionada = tblGato.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String nombre = tblGato.getValueAt(filaSeleccionada, 1).toString();
            String edad = tblGato.getValueAt(filaSeleccionada, 2).toString();
            String color = tblGato.getValueAt(filaSeleccionada, 3).toString();
            String motivo = tblGato.getValueAt(filaSeleccionada, 4).toString();

            LocalDate localDate = (LocalDate) tblGato.getValueAt(filaSeleccionada, 5);
            
            String estado = tblGato.getValueAt(filaSeleccionada, 6).toString();

            Date fecha = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            tbNombreG.setText(nombre);
            tbEdadG.setText(edad);
            tbColor.setText(color);
            tbMotivoG.setText(motivo);
            tbEstadoG.setText(estado);
            jCalendar2.setDate(fecha);

            btnGuardar1.setEnabled(false);
            btnActualizar1.setEnabled(true);
            btnEliminar1.setEnabled(true);
            tbMotivo.setEditable(false);
        }
    }//GEN-LAST:event_tblGatoMouseClicked

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        bloquearModificaciones();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        bloquearModificaciones();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!tbNombre.getText().equals("") && !tbEdad.getText().equals("") && !tbRaza.getText().equals("") && !tbMotivo.getText().equals("")) {
            Mascota perro = new Perro(tbNombre.getText(), Integer.parseInt(tbEdad.getText()), tbRaza.getText());
            maRepo.guardar(perro);

            Date fecha = jCalendar1.getDate();
            Instant instant = fecha.toInstant();
            LocalDate fechaLocalDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();

            TurnoMedico turnoMedicoPerro = new TurnoMedico(perro, fechaLocalDate, tbMotivo.getText());
            tMRepo.guardar(turnoMedicoPerro);

            perro.addTurnoMedico(turnoMedicoPerro);
            maRepo.actualizar(perro);

            cargarTabla(Perro.class, titulos, tblPerro);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Rellene los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        if (!tbNombreG.getText().equals("") && !tbEdadG.getText().equals("")&& !tbColor.getText().equals("") && !tbMotivoG.getText().equals("")) {
            Mascota gato = new Gato(tbNombreG.getText(), Integer.parseInt(tbEdadG.getText()), tbColor.getText());
            maRepo.guardar(gato);

            Date fecha = jCalendar2.getDate();
            Instant instant = fecha.toInstant();
            LocalDate fechaLocalDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();

            TurnoMedico turnoMedicoPerro = new TurnoMedico(gato, fechaLocalDate, tbMotivoG.getText());
            tMRepo.guardar(turnoMedicoPerro);

            gato.addTurnoMedico(turnoMedicoPerro);
            maRepo.actualizar(gato);

            cargarTabla(Gato.class, titulos, tblGato);
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Rellene los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tblPerro.getSelectedRow();
        if (filaSeleccionada >= 0) {
            long id = (long) tblPerro.getValueAt(filaSeleccionada, 0);

            Mascota mEliminar = maRepo.obtenerPorId(id);

            maRepo.eliminar(mEliminar.getId());

            cargarTabla(Perro.class, titulos, tblPerro);
            bloquearModificaciones();

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una mascota", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        int filaSeleccionada = tblGato.getSelectedRow();
        if (filaSeleccionada >= 0) {
            long id = (long) tblGato.getValueAt(filaSeleccionada, 0);

            Mascota mEliminar = maRepo.obtenerPorId(id);

            maRepo.eliminar(mEliminar.getId());

            cargarTabla(Gato.class, titulos, tblGato);
            bloquearModificaciones();

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una mascota", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        int filaSeleccionada = tblGato.getSelectedRow();
        if (filaSeleccionada >= 0) {
            if (!tbNombreG.getText().equals("") && !tbEdadG.getText().equals("") && !tbColor.getText().equals("") && !tbMotivoG.getText().equals("")) {
                long id = (long) tblGato.getValueAt(filaSeleccionada, 0);

                Gato gEditar = gRepo.obtenerPorId(id);
                TurnoMedico tEditar = tMRepo.obtenerPorId(id);

                gEditar.setNombre(tbNombreG.getText());
                gEditar.setEdad(Integer.parseInt(tbEdadG.getText()));
                gEditar.setColor(tbColor.getText());

                gRepo.actualizar(gEditar);

                //Solo se deja editar el motivo, ya que la fecha se confirma o no
                tEditar.setMotivo(tbMotivoG.getText());
                tMRepo.actualizar(tEditar);

                cargarTabla(Gato.class, titulos, tblGato);
                bloquearModificaciones();
            } else {
                JOptionPane.showMessageDialog(null, "Rellene los campos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una mascota", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int filaSeleccionada = tblPerro.getSelectedRow();
        if (filaSeleccionada >= 0) {
            if (!tbNombre.getText().equals("") && !tbEdad.getText().equals("") && !tbRaza.getText().equals("") && !tbMotivo.getText().equals("")) {
                long id = (long) tblPerro.getValueAt(filaSeleccionada, 0);

                Perro pEditar = pRepo.obtenerPorId(id);
                TurnoMedico tEditar = tMRepo.obtenerPorId(id);

                pEditar.setNombre(tbNombre.getText());
                pEditar.setEdad(Integer.parseInt(tbEdad.getText()));
                pEditar.setRaza(tbRaza.getText());

                pRepo.actualizar(pEditar);

                //Solo se deja editar el motivo, ya que la fecha se confirma o no
                tEditar.setMotivo(tbMotivo.getText());
                tMRepo.actualizar(tEditar);

                cargarTabla(Perro.class, titulos, tblPerro);
                bloquearModificaciones();
            } else {
                JOptionPane.showMessageDialog(null, "Rellene los campos", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una mascota", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tbEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbEdadKeyReleased
        boolean ban;
        if (Character.isDigit(evt.getKeyChar())) {
            ban = false;
        } else if (Character.isISOControl(evt.getKeyChar())) {
            ban = false;
        } else if (Character.isSpaceChar(evt.getKeyChar())) {
            ban = false;
        } else {
            ban = true;
            JOptionPane.showMessageDialog(null, "Campo solo numerico", "Error", JOptionPane.ERROR_MESSAGE);
            tbEdad.setText("");
        }
    }//GEN-LAST:event_tbEdadKeyReleased

    private void tbEdadGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbEdadGKeyReleased
        boolean ban;
        if (Character.isDigit(evt.getKeyChar())) {
            ban = false;
        } else if (Character.isISOControl(evt.getKeyChar())) {
            ban = false;
        } else if (Character.isSpaceChar(evt.getKeyChar())) {
            ban = false;
        } else {
            ban = true;
            JOptionPane.showMessageDialog(null, "Campo solo numerico", "Error", JOptionPane.ERROR_MESSAGE);
            tbEdadG.setText("");
        }
    }//GEN-LAST:event_tbEdadGKeyReleased

    private void bloquearModificaciones() {
        limpiar();
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);

        btnGuardar1.setEnabled(true);
        btnEliminar1.setEnabled(false);
        btnActualizar1.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelGato;
    private javax.swing.JPanel PanelPerro;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTPMascota;
    private javax.swing.JTextField tbColor;
    private javax.swing.JTextField tbEdad;
    private javax.swing.JTextField tbEdadG;
    private javax.swing.JTextField tbEstado;
    private javax.swing.JTextField tbEstadoG;
    private javax.swing.JTextField tbMotivo;
    private javax.swing.JTextField tbMotivoG;
    private javax.swing.JTextField tbNombre;
    private javax.swing.JTextField tbNombreG;
    private javax.swing.JTextField tbRaza;
    private javax.swing.JTable tblGato;
    private javax.swing.JTable tblPerro;
    // End of variables declaration//GEN-END:variables
}
