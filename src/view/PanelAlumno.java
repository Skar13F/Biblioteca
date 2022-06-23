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

    /**
     * Constructor que recibe la lista alumno cargada de información. Inicializa
     * algunos atributos
     */
    public PanelAlumno(List<Usuario> listaAlumno) {
        initComponents();
        userController = new UsuarioController();
        listaUsuario = listaAlumno;
        modelo = (DefaultTableModel) jTable1.getModel();
        userController.mostrarUsuario(listaAlumno, modelo);
        //evita que las columnas de la tabla cambien de posicion
        jTable1.getTableHeader().setReorderingAllowed(false);
    }

    /*
    Método para borrar el contenido de los cuadros de texto
     */
    public void limpiar() {
        jText_Matricula.setText("");
        jText_Nombre.setText("");
        jComboBox_carrera.setSelectedItem("- - Carrera - -");
        jComboBox_semestre.setSelectedItem("- - Semestre - -");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_agregar = new javax.swing.JButton();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jText_Matricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jText_Nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton_buscar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox_carrera = new javax.swing.JComboBox<>();
        jComboBox_semestre = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 51));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(39, 154, 180));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_agregar.setBackground(new java.awt.Color(98, 193, 222));
        jButton_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        jButton_agregar.setText("Agregar   ");
        jButton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jButton_actualizar.setBackground(new java.awt.Color(98, 193, 222));
        jButton_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, -1));

        jButton_eliminar.setBackground(new java.awt.Color(98, 193, 222));
        jButton_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        jButton_eliminar.setText("Eliminar   ");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        add(jPanel1, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(100, 176, 176));

        jLabel1.setText("Matrícula");

        jText_Matricula.setBackground(new java.awt.Color(39, 154, 180));
        jText_Matricula.setMaximumSize(new java.awt.Dimension(150, 20));
        jText_Matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jText_MatriculaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_MatriculaKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre");

        jText_Nombre.setBackground(new java.awt.Color(39, 154, 180));
        jText_Nombre.setMaximumSize(new java.awt.Dimension(200, 20));
        jText_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jText_NombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jText_NombreKeyTyped(evt);
            }
        });

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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(120);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(1).setMinWidth(120);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(2).setMinWidth(120);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(3).setMinWidth(120);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        jTextField1.setText("matrícula");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N
        jButton_buscar.setBorderPainted(false);
        jButton_buscar.setContentAreaFilled(false);
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        jButton5.setText("Limpiar");
        jButton5.setContentAreaFilled(false);
        jButton5.setMaximumSize(new java.awt.Dimension(83, 24));
        jButton5.setMinimumSize(new java.awt.Dimension(83, 24));
        jButton5.setPreferredSize(new java.awt.Dimension(83, 24));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - Carrera - -", "L. Informática", "L. A. Municipal", "L. A. Pública", "L. A. Empresarial", "L. Nutrición", "L. Medicina", "L. Odontología", "L. Enfermería" }));
        jComboBox_carrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox_carreraKeyPressed(evt);
            }
        });

        jComboBox_semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - Semestre - -", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Séptimo", "Octavo", "Noveno", "Décimo" }));
        jComboBox_semestre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox_semestreKeyPressed(evt);
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
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jText_Matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jComboBox_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jText_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(jComboBox_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jComboBox_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    /*
    Botón para agregar un nuevo elemento (objeto) a la lista
     */
    private void jButton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarActionPerformed
        Usuario usuario = new Usuario();
        if (jText_Matricula.getText().equals("")
                || jText_Nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else if (jComboBox_semestre.getSelectedItem().equals("- - Semestre"
                + " - -")) {
            JOptionPane.showMessageDialog(null, "Selecciona un semestre");
        } else if (jComboBox_carrera.getSelectedItem().equals("- - Carrera"
                + " - -")) {
            JOptionPane.showMessageDialog(null, "Selecciona una carrera");
        } else {
            Usuario usuario1 = userController.getUsuario(listaUsuario,
                    jText_Matricula.getText());
            if (usuario1 == null) {
                usuario.setMatricula(jText_Matricula.getText());
                usuario.setNombre(jText_Nombre.getText());
                usuario.setCarrera(jComboBox_carrera.getSelectedItem().
                        toString());
                usuario.setSemestre(jComboBox_semestre.getSelectedItem().
                        toString());
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
    }//GEN-LAST:event_jButton_agregarActionPerformed
    /*
    Botón para eliminar un objeto de la lista
     */
    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
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
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    /*
    Botón para actualizar datos de un objeto dentro de la lista
     */
    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        Usuario usuario1 = new Usuario();
        if (jText_Matricula.getText().equals("")
                || jText_Nombre.getText().equals("")
                || jComboBox_carrera.getSelectedItem().equals("- - Carrera -"
                        + " -")
                || jComboBox_semestre.getSelectedItem().equals("- - Semestre"
                        + " - -")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else {
            usuario1.setMatricula(jText_Matricula.getText());
            usuario1.setNombre(jText_Nombre.getText());
            usuario1.setCarrera(jComboBox_carrera.getSelectedItem().toString());
            usuario1.setSemestre(jComboBox_semestre.getSelectedItem().
                    toString());
            listaUsuario = userController.actualizarUsuario(listaUsuario,
                    usuario1);
            userController.mostrarUsuario(listaUsuario, modelo);
            limpiar();
        }
        jText_Matricula.setEditable(true);
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    /*
    Muestra en los cuadros de texto los datos de un objeto seleccionado
    desde la tabla
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jText_Matricula.setEditable(false);
        jText_Matricula.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                0).toString());
        jText_Nombre.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                1).toString());
        jComboBox_carrera.setSelectedItem(jTable1.getValueAt(jTable1.
                getSelectedRow(), 2).toString());
        jComboBox_semestre.setSelectedItem(jTable1.getValueAt(jTable1.
                getSelectedRow(), 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    //Busca un objeto dentro de la lista
    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
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
                jComboBox_carrera.setSelectedItem(ubuscar.getCarrera());
                jComboBox_semestre.setSelectedItem(ubuscar.getSemestre());
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
        }
    }//GEN-LAST:event_jButton_buscarActionPerformed

    //Vacía el contenido de los cuadros de texto
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jText_Matricula.setEditable(true);
        limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jText_MatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_MatriculaKeyTyped

        if (jText_Matricula.getText().length() >= 10) {
            evt.consume();
        } else {
            char letra = evt.getKeyChar();

            if (!Character.isDigit(letra)) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jText_MatriculaKeyTyped

    private void jText_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_NombreKeyTyped
        if (jText_Nombre.getText().length() >= 25) {
            evt.consume();
        }
    }//GEN-LAST:event_jText_NombreKeyTyped

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if (jTextField1.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jText_MatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_MatriculaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jText_Nombre.requestFocus();
        }
    }//GEN-LAST:event_jText_MatriculaKeyPressed

    private void jText_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_NombreKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jComboBox_semestre.requestFocus();
        }
    }//GEN-LAST:event_jText_NombreKeyPressed

    private void jComboBox_semestreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox_semestreKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jComboBox_carrera.requestFocus();
        }
    }//GEN-LAST:event_jComboBox_semestreKeyPressed

    private void jComboBox_carreraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox_carreraKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jButton_agregar.requestFocus();
        }
    }//GEN-LAST:event_jComboBox_carreraKeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            jButton_buscar.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_agregar;
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JComboBox<String> jComboBox_carrera;
    private javax.swing.JComboBox<String> jComboBox_semestre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jText_Matricula;
    private javax.swing.JTextField jText_Nombre;
    // End of variables declaration//GEN-END:variables
}
