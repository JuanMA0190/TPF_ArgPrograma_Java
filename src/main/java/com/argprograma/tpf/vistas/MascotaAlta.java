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
    String[] titulos = {"Nombre", "Edad", "Raza", "Motivo", "Fecha_Turno"};

    public MascotaAlta() {
        maRepo = new MascotaRepository();
        tMRepo = new TurnoMedicoRepository();
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
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tbEdad = new javax.swing.JTextField();
        tbNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tbRaza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tbMotivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PanelGato = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGato = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tbNombreG = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tbEdadG = new javax.swing.JTextField();
        tbColor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbMotivoG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jCalendar2 = new com.toedter.calendar.JCalendar();
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
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

        btnEliminar.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);

        btnCancelar.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad");

        tbEdad.setForeground(new java.awt.Color(0, 0, 0));

        tbNombre.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Motivo:");

        tbRaza.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Raza");

        tbMotivo.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha:");

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
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tbMotivo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(tbRaza))
                                .addGap(18, 18, 18)
                                .addComponent(tbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout PanelPerroLayout = new javax.swing.GroupLayout(PanelPerro);
        PanelPerro.setLayout(PanelPerroLayout);
        PanelPerroLayout.setHorizontalGroup(
            PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPerroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPerroLayout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnActualizar)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PanelPerroLayout.setVerticalGroup(
            PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPerroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelPerroLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(btnCancelar))))
                .addContainerGap())
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

        tbColor.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Color");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Motivo");

        tbMotivoG.setForeground(new java.awt.Color(0, 0, 0));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbNombreG)
                            .addComponent(tbColor))
                        .addGap(18, 18, 18)
                        .addComponent(tbEdadG, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(tbMotivoG, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbEdadG)
                    .addComponent(tbNombreG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbMotivoG, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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

        btnEliminar1.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar1.setText("Eliminar");
        btnEliminar1.setEnabled(false);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelGatoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelGatoLayout.createSequentialGroup()
                                .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnActualizar1)
                            .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        PanelGatoLayout.setVerticalGroup(
            PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGatoLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelGatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar1)
                            .addComponent(btnEliminar1)))
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
                            objeto = new Object[]{perro.getNombre(), perro.getEdad(), perro.getRaza(), turno.getMotivo(), turno.getFecha()};
                        } else if (mascota instanceof Gato) {
                            Gato gato = (Gato) mascota;
                            objeto = new Object[]{gato.getNombre(), gato.getEdad(), gato.getColor(), turno.getMotivo(), turno.getFecha()};
                        }
                        modeloTabla.addRow(objeto);
                    });
                }
            }
        }

        tabla.setModel(modeloTabla);

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
        tabla.setRowSorter(sorter);

        Comparator<Object> dateComparator = (date1, date2) -> ((LocalDate) date1).compareTo((LocalDate) date2);
        sorter.setComparator(tabla.getColumnCount() - 1, dateComparator);

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
        tbMotivo.setText("");
        tbMotivoG.setText("");
        jCalendar1.setDate(fechaActualDate);
    }

    private void jTPMascotaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTPMascotaStateChanged
        int selectedIndex = jTPMascota.getSelectedIndex();

        switch (selectedIndex) {
            case 0:
                titulos[2] = "Raza";
                cargarTabla(Perro.class, titulos, tblPerro);

                break;
            case 1:
                titulos[2] = "Color";
                cargarTabla(Gato.class, titulos, tblGato);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jTPMascotaStateChanged

    private void tblPerroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPerroMouseClicked
        int filaSeleccionada = tblPerro.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String nombre = tblPerro.getValueAt(filaSeleccionada, 0).toString();
            String edad = tblPerro.getValueAt(filaSeleccionada, 1).toString();
            String raza = tblPerro.getValueAt(filaSeleccionada, 2).toString();
            String motivo = tblPerro.getValueAt(filaSeleccionada, 3).toString();

            // Supongamos que la columna 4 contiene la fecha como LocalDate
            LocalDate localDate = (LocalDate) tblPerro.getValueAt(filaSeleccionada, 4);

            Date fecha = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            tbNombre.setText(nombre);
            tbEdad.setText(edad);
            tbRaza.setText(raza);
            tbMotivo.setText(motivo);
            jCalendar1.setDate(fecha);
            
            btnGuardar.setEnabled(false);
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(true);
        }
    }//GEN-LAST:event_tblPerroMouseClicked

    private void tblGatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGatoMouseClicked
        int filaSeleccionada = tblGato.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String nombre = tblGato.getValueAt(filaSeleccionada, 0).toString();
            String edad = tblGato.getValueAt(filaSeleccionada, 1).toString();
            String color = tblGato.getValueAt(filaSeleccionada, 2).toString();
            String motivo = tblGato.getValueAt(filaSeleccionada, 3).toString();

            // Supongamos que la columna 4 contiene la fecha como LocalDate
            LocalDate localDate = (LocalDate) tblGato.getValueAt(filaSeleccionada, 4);

            Date fecha = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            tbNombreG.setText(nombre);
            tbEdadG.setText(edad);
            tbColor.setText(color);
            tbMotivoG.setText(motivo);
            jCalendar2.setDate(fecha);
            
            btnGuardar1.setEnabled(false);
            btnActualizar1.setEnabled(true);
            btnEliminar1.setEnabled(true);
        }
    }//GEN-LAST:event_tblGatoMouseClicked

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        limpiar();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
        
        btnGuardar1.setEnabled(true);
        btnEliminar1.setEnabled(false);
        btnActualizar1.setEnabled(false);
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
        }else{
            JOptionPane.showMessageDialog(null, "Rellene los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
         if (!tbNombreG.getText().equals("") && !tbEdadG.getText().equals("") && !tbColor.getText().equals("") && !tbMotivoG.getText().equals("")) {
            Mascota gato = new Gato(tbNombreG.getText(), Integer.parseInt(tbEdadG.getText()), tbColor.getText());
            maRepo.guardar(gato);

            Date fecha = jCalendar1.getDate();
            Instant instant = fecha.toInstant();
            LocalDate fechaLocalDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();

            TurnoMedico turnoMedicoPerro = new TurnoMedico(gato, fechaLocalDate, tbMotivoG.getText());
            tMRepo.guardar(turnoMedicoPerro);

            gato.addTurnoMedico(turnoMedicoPerro);
            maRepo.actualizar(gato);

            cargarTabla(Gato.class, titulos, tblGato);
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Rellene los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed


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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField tbMotivo;
    private javax.swing.JTextField tbMotivoG;
    private javax.swing.JTextField tbNombre;
    private javax.swing.JTextField tbNombreG;
    private javax.swing.JTextField tbRaza;
    private javax.swing.JTable tblGato;
    private javax.swing.JTable tblPerro;
    // End of variables declaration//GEN-END:variables
}
