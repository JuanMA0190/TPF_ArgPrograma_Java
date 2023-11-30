package com.argprograma.tpf.vistas;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setResizable(false);
        this.setSize(757, 520);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMascotas = new javax.swing.JMenu();
        jMIMascotaAlta = new javax.swing.JMenuItem();
        jMenuVeterinario = new javax.swing.JMenu();
        jMIGestTurno = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgBackground.setBackground(new java.awt.Color(102, 102, 102));
        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        jPanel1.add(imgBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 480, 430));

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));

        jMenuMascotas.setBackground(new java.awt.Color(51, 51, 51));
        jMenuMascotas.setForeground(new java.awt.Color(255, 255, 255));
        jMenuMascotas.setText("Mascotas");

        jMIMascotaAlta.setBackground(new java.awt.Color(51, 51, 51));
        jMIMascotaAlta.setForeground(new java.awt.Color(255, 255, 255));
        jMIMascotaAlta.setText("Ingresar Mascota");
        jMIMascotaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMascotaAltaActionPerformed(evt);
            }
        });
        jMenuMascotas.add(jMIMascotaAlta);

        jMenuBar1.add(jMenuMascotas);

        jMenuVeterinario.setBackground(new java.awt.Color(51, 51, 51));
        jMenuVeterinario.setForeground(new java.awt.Color(255, 255, 255));
        jMenuVeterinario.setText("Veterinario");

        jMIGestTurno.setBackground(new java.awt.Color(51, 51, 51));
        jMIGestTurno.setForeground(new java.awt.Color(255, 255, 255));
        jMIGestTurno.setText("Gestión de Turno");
        jMIGestTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGestTurnoActionPerformed(evt);
            }
        });
        jMenuVeterinario.add(jMIGestTurno);

        jMenuBar1.add(jMenuVeterinario);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIMascotaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMascotaAltaActionPerformed
        MascotaAlta ma = new MascotaAlta();
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jMIMascotaAltaActionPerformed

    private void jMIGestTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGestTurnoActionPerformed
        GestionTurno gt = new GestionTurno();
        gt.setVisible(true);
        gt.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jMIGestTurnoActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgBackground;
    private javax.swing.JMenuItem jMIGestTurno;
    private javax.swing.JMenuItem jMIMascotaAlta;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuMascotas;
    private javax.swing.JMenu jMenuVeterinario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
