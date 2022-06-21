/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 03 de junio de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase JPanel para controlar las operaciones CRUD
                aplicados a los objetos Encargado
 */
package view;

import controller.EncargadoController;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Encargado;

/**
 *
 * @author oscar
 */
public class PanelEncargado extends javax.swing.JPanel {

    private EncargadoController encController;
    private List<Encargado> listaEncargado;
    private DefaultTableModel modelo;

    /**
     * Creates new form Panel1
     */
    public PanelEncargado(List<Encargado> listEncargado) {
        initComponents();

        encController = new EncargadoController();
        listaEncargado = listEncargado;
        modelo = (DefaultTableModel) jTable1.getModel();
        encController.mostrarEncargado(listEncargado, modelo);
    }

    /*
    Método para limpiar(vaciar) los cuadros de texto
     */
    public void limpiar() {
        jText_Codigo.setText("");
        jText_Nombre.setText("");
        jText_Telefono.setText("");
    }

    /*
    Método para validar que la entrada del teclado sea simplemente numérica
     */
    public boolean isNumeric(String datos) {
        for (int i = 0; i < datos.length(); i++) {
            if (Character.compare(datos.charAt(i), '0') != 0
                    && Character.compare(datos.charAt(i), '1') != 0
                    && Character.compare(datos.charAt(i), '2') != 0
                    && Character.compare(datos.charAt(i), '3') != 0
                    && Character.compare(datos.charAt(i), '4') != 0
                    && Character.compare(datos.charAt(i), '5') != 0
                    && Character.compare(datos.charAt(i), '6') != 0
                    && Character.compare(datos.charAt(i), '7') != 0
                    && Character.compare(datos.charAt(i), '8') != 0
                    && Character.compare(datos.charAt(i), '9') != 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jText_Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jText_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jText_Telefono = new javax.swing.JTextField();
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

        jLabel1.setText("Código");

        jText_Codigo.setBackground(new java.awt.Color(39, 154, 180));
        jText_Codigo.setMaximumSize(new java.awt.Dimension(150, 20));

        jLabel2.setText("Nombre");

        jText_Nombre.setBackground(new java.awt.Color(39, 154, 180));
        jText_Nombre.setMaximumSize(new java.awt.Dimension(200, 20));

        jLabel3.setText("Teléfono");

        jText_Telefono.setBackground(new java.awt.Color(39, 154, 180));
        jText_Telefono.setMaximumSize(new java.awt.Dimension(90, 20));
        jText_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_TelefonoActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(66, 248, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        jTextField1.setText("código");

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
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jText_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jText_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14)
                                .addComponent(jText_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jText_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jText_Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jText_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_TelefonoActionPerformed
    /*
    Botón para agregar un nuevo elemento (objeto) a la lista
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Encargado encargado = new Encargado();
        if (jText_Codigo.getText().equals("")
                || jText_Nombre.getText().equals("")
                || jText_Telefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else if (jText_Codigo.getText().length() != 7) {
            JOptionPane.showMessageDialog(null, "El código debe constar de 7 "
                    + "cifras");
        } else if (jText_Telefono.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "El número de teléfono\ndebe "
                    + "constar de 10 cifras");
        } else {
            if (isNumeric(jText_Codigo.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Ingresa solo códigos "
                        + "numéricos");
            } else if (isNumeric(jText_Telefono.getText()) == false) {
                JOptionPane.showMessageDialog(null, "En el campo teléfono\n"
                        + "solo ingresa números");
            } else {
                Encargado encargado1 = encController.getEncargado(
                        listaEncargado, jText_Codigo.getText());
                if (encargado1 == null) {
                    encargado.setCodTrab(jText_Codigo.getText());
                    encargado.setNombre(jText_Nombre.getText());
                    encargado.setTelefono(jText_Telefono.getText());
                    limpiar();
                    jText_Codigo.setEditable(true);
                    listaEncargado = encController.crearEncargado(
                            listaEncargado, encargado);
                } else {
                    JOptionPane.showMessageDialog(null, "La código ya está "
                            + "registrado");
                    jText_Codigo.setEditable(true);
                }
            }
        }
        encController.mostrarEncargado(listaEncargado, modelo);
    }//GEN-LAST:event_jButton1ActionPerformed

    /*
    Botón para eliminar un objeto de la lista
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jText_Codigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresa una matrícula\no "
                    + "rellena todos los campos");
        } else {
            Encargado encargado = encController.getEncargado(listaEncargado,
                    jText_Codigo.getText());
            if (encargado == null) {
                JOptionPane.showMessageDialog(null, "No hay registro del "
                        + "encargado");
            } else {
                listaEncargado = encController.eliminarEncargado(listaEncargado,
                        encargado.getCodTrab());
                limpiar();
                jText_Codigo.setEditable(true);
            }
        }
        encController.mostrarEncargado(listaEncargado, modelo);
    }//GEN-LAST:event_jButton3ActionPerformed

    /*
    Botón para actualizar datos de un objeto dentro de la lista
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Encargado encargado1 = new Encargado();
        if (jText_Codigo.getText().equals("")
                || jText_Nombre.getText().equals("")
                || jText_Telefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else if (jText_Codigo.getText().length() != 7) {
            JOptionPane.showMessageDialog(null, "El código debe constar de 7 "
                    + "cifras");
        } else if (jText_Telefono.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "El número de teléfono\ndebe "
                    + "constar de 10 cifras");
        } else {
            if (isNumeric(jText_Codigo.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Ingresa solo códigos "
                        + "numéricos");
            } else if (isNumeric(jText_Telefono.getText()) == false) {
                JOptionPane.showMessageDialog(null, "En el campo teléfono\n"
                        + "solo ingresa números");
            } else {
                encargado1.setCodTrab(jText_Codigo.getText());
                encargado1.setNombre(jText_Nombre.getText());
                encargado1.setTelefono(jText_Telefono.getText());
                listaEncargado = encController.actualizarEncargado(
                        listaEncargado, encargado1);
                encController.mostrarEncargado(listaEncargado, modelo);
                limpiar();
            }
        }
        jText_Codigo.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /*
    Muestra en los cuadros de texto los datos de un objeto seleccionado
    desde la tabla
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jText_Codigo.setEditable(false);
        jText_Codigo.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                0).toString());
        jText_Nombre.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                1).toString());
        jText_Telefono.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    //Busca un objeto en la lista
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Encargado eBuscar = new Encargado();
        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ingresa el código de "
                    + "trbajador");
        } else {
            eBuscar = encController.getEncargado(listaEncargado,
                    jTextField1.getText());
            if (eBuscar != null) {
                jText_Codigo.setEditable(false);
                jText_Codigo.setText(eBuscar.getCodTrab());
                jText_Nombre.setText(eBuscar.getNombre());
                jText_Telefono.setText(eBuscar.getTelefono());
            } else {
                JOptionPane.showMessageDialog(null, "El encargado no existe");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    //Vacía el contenido de los cuadros de texto
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jText_Codigo.setEditable(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jText_Codigo;
    private javax.swing.JTextField jText_Nombre;
    private javax.swing.JTextField jText_Telefono;
    // End of variables declaration//GEN-END:variables
}
