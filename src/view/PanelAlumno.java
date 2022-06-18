/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 03 de junio de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase JPanel para controlar las operaciones CRUD
                aplicados a los objetos Alumno
 */
package view;

import controller.UsuarioController;
import pojo.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelAlumno extends javax.swing.JPanel {

    private UsuarioController userController;
    private List<Usuario> listaUsuario;
    private DefaultTableModel modelo;

    public PanelAlumno(List<Usuario> listaAlumno) {
        initComponents();

        userController = new UsuarioController();
        listaUsuario = listaAlumno;
        modelo = (DefaultTableModel) jTable1.getModel();
        userController.mostrarUsuario(listaAlumno, modelo);

    }

    public void limpiar() {
        jText_Matricula.setText("");
        jText_Nombre.setText("");
        jText_Carrera.setText("");
        jText_Semestre.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jText_Matricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jText_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jText_Carrera = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jText_Semestre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 51));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(39, 154, 180));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(98, 193, 222));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 95, -1));

        jButton2.setBackground(new java.awt.Color(98, 193, 222));
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 95, -1));

        jButton3.setBackground(new java.awt.Color(98, 193, 222));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 95, -1));

        jButton5.setBackground(new java.awt.Color(98, 193, 222));
        jButton5.setText("Borrar");
        jButton5.setMaximumSize(new java.awt.Dimension(83, 24));
        jButton5.setMinimumSize(new java.awt.Dimension(83, 24));
        jButton5.setPreferredSize(new java.awt.Dimension(83, 24));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 95, -1));

        add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(100, 176, 176));

        jLabel1.setText("Matrícula");

        jText_Matricula.setBackground(new java.awt.Color(39, 154, 180));
        jText_Matricula.setMaximumSize(new java.awt.Dimension(150, 20));

        jLabel2.setText("Nombre");

        jText_Nombre.setBackground(new java.awt.Color(39, 154, 180));
        jText_Nombre.setMaximumSize(new java.awt.Dimension(200, 20));

        jLabel3.setText("Carrera");

        jText_Carrera.setBackground(new java.awt.Color(39, 154, 180));
        jText_Carrera.setMaximumSize(new java.awt.Dimension(90, 20));
        jText_Carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_CarreraActionPerformed(evt);
            }
        });

        jLabel4.setText("Semestre");

        jText_Semestre.setBackground(new java.awt.Color(39, 154, 180));
        jText_Semestre.setMaximumSize(new java.awt.Dimension(150, 20));

        jTable1.setBackground(new java.awt.Color(66, 248, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nombre", "Carrera", "Semestre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setBackground(new java.awt.Color(39, 154, 180));
        jTextField1.setText("matrícula");

        jButton4.setBackground(new java.awt.Color(98, 193, 222));
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_Matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jText_Semestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jText_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(jText_Carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jText_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jText_Carrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jText_Semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jText_CarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_CarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_CarreraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Usuario usuario = new Usuario();
        if (jText_Matricula.getText().equals("")
                || jText_Nombre.getText().equals("")
                || jText_Carrera.getText().equals("")
                || jText_Semestre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else {
            Usuario usuario1 = userController.getUsuario(listaUsuario,
                    jText_Matricula.getText());
            if (usuario1 == null) {
                usuario.setMatricula(jText_Matricula.getText());
                usuario.setNombre(jText_Nombre.getText());
                usuario.setCarrera(jText_Carrera.getText());
                usuario.setSemestre(jText_Semestre.getText());

                limpiar();
                jText_Matricula.setEditable(true);

                listaUsuario = userController.crearUsuario(listaUsuario,
                        usuario);
            } else {
                JOptionPane.showMessageDialog(null, "La matrícula ya está "
                        + "registrada");
                jText_Matricula.setEditable(true);
            }

        }

        userController.mostrarUsuario(listaUsuario, modelo);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jText_Matricula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresa una matrícula\no "
                    + "rellena todos los campos");
        } else {
            Usuario usuario = userController.getUsuario(listaUsuario,
                    jText_Matricula.getText());
            if (usuario == null) {
                JOptionPane.showMessageDialog(null, "No hay registro del "
                        + "alumno");
            } else {
                listaUsuario = userController.eliminarUsuario(listaUsuario,
                        usuario.getMatricula());

                limpiar();
                jText_Matricula.setEditable(true);

            }
        }
        userController.mostrarUsuario(listaUsuario, modelo);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Usuario usuario1 = new Usuario();
        if (jText_Matricula.getText().equals("")
                || jText_Nombre.getText().equals("")
                || jText_Carrera.getText().equals("")
                || jText_Semestre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else {

            usuario1.setMatricula(jText_Matricula.getText());
            usuario1.setNombre(jText_Nombre.getText());
            usuario1.setCarrera(jText_Carrera.getText());
            usuario1.setSemestre(jText_Semestre.getText());

            listaUsuario = userController.actualizarUsuario(listaUsuario,
                    usuario1);
            userController.mostrarUsuario(listaUsuario, modelo);

            limpiar();

        }

        jText_Matricula.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jText_Matricula.setEditable(false);
        jText_Matricula.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                0).toString());
        jText_Nombre.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                1).toString());
        jText_Carrera.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                3).toString());
        jText_Semestre.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Usuario ubuscar = new Usuario();
        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ingresa la matrícula del "
                    + "alumno");
        } else {
            ubuscar = userController.getUsuario(listaUsuario,
                    jTextField1.getText());
            if (ubuscar != null) {
                jText_Matricula.setEditable(false);
                jText_Matricula.setText(ubuscar.getMatricula());
                jText_Nombre.setText(ubuscar.getNombre());
                jText_Carrera.setText(ubuscar.getCarrera());
                jText_Semestre.setText(ubuscar.getSemestre());
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jText_Matricula.setEditable(true);
        limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jText_Carrera;
    private javax.swing.JTextField jText_Matricula;
    private javax.swing.JTextField jText_Nombre;
    private javax.swing.JTextField jText_Semestre;
    // End of variables declaration//GEN-END:variables
}
