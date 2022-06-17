/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 01 de junio de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase JPanel para controlar las operaciones CRUD
                aplicados a los objetos Libro
 */
package view;

import controller.LibroController;
import pojo.Libro;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oscar
 */
public class PanelLibro extends javax.swing.JPanel {

    private LibroController libController;
    private List<Libro> listaLibro;
    private DefaultTableModel modelo;

    /**
     * Creates new form Panel1
     */
    public PanelLibro(List<Libro> listLib) {
        initComponents();

        libController = new LibroController();
        //listaLibro = new ArrayList<>();
        listaLibro = listLib;
        modelo = (DefaultTableModel) jTable1.getModel();
        libController.mostrarlibro(listLib, modelo);

    }

    public void limpiar() {
        jText_ISBN.setText("");
        jText_Titulo.setText("");
        jText_Genero.setText("");
        jText_Autor.setText("");
        jText_Cantidad.setText("");
    }

    public Libro leer(Libro libroLeer) {
        libroLeer.setIsbn(jText_ISBN.getText());
        libroLeer.setTitulo(jText_Titulo.getText());
        libroLeer.setClasificacion(jText_Genero.getText());
        libroLeer.setAutor(jText_Autor.getText());
        libroLeer.setCantidad(Short.parseShort(jText_Cantidad.getText()));
        return libroLeer;
    }

    public boolean isNumeric(String datos) {
        for (int i = 0; i < datos.length(); i++) {
            if (Character.compare(datos.charAt(0), '0') == 0) {
                return false;
            }
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
        jText_ISBN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jText_Titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jText_Genero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jText_Autor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jText_Cantidad = new javax.swing.JTextField();
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

        jLabel1.setText("ISBN");

        jText_ISBN.setBackground(new java.awt.Color(39, 154, 180));
        jText_ISBN.setMaximumSize(new java.awt.Dimension(150, 20));

        jLabel2.setText("Título");

        jText_Titulo.setBackground(new java.awt.Color(39, 154, 180));
        jText_Titulo.setMaximumSize(new java.awt.Dimension(200, 20));

        jLabel3.setText("Género");

        jText_Genero.setBackground(new java.awt.Color(39, 154, 180));
        jText_Genero.setMaximumSize(new java.awt.Dimension(90, 20));
        jText_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_GeneroActionPerformed(evt);
            }
        });

        jLabel4.setText("Autor");

        jText_Autor.setBackground(new java.awt.Color(39, 154, 180));
        jText_Autor.setMaximumSize(new java.awt.Dimension(150, 20));

        jLabel5.setText("Cantidad");

        jText_Cantidad.setBackground(new java.awt.Color(39, 154, 180));
        jText_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_CantidadActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(66, 248, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Título", "Autor", "Género", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(153, 153, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setBackground(new java.awt.Color(39, 154, 180));
        jTextField1.setText("isbn");

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
                                    .addComponent(jText_ISBN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jText_Autor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jText_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jText_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(jText_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jText_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jText_Genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jText_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jText_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jText_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_GeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_GeneroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Libro libro = new Libro();
        if (jText_ISBN.getText().equals("") || jText_Titulo.getText().equals("")
                || jText_Genero.getText().equals("")
                || jText_Autor.getText().equals("")
                || jText_Cantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else if (isNumeric(jText_Cantidad.getText())) {
            Libro libro1 = libController.getLibro(listaLibro,
                    jText_ISBN.getText());
            if (libro1 == null) {
                libro = leer(libro);

                limpiar();
                jText_ISBN.setEditable(true);

                listaLibro = libController.crearLibro(listaLibro, libro);
            } else {
                JOptionPane.showMessageDialog(null, "El ISBN ya está "
                        + "registrado");
                jText_ISBN.setEditable(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "En el campo cantidad\nsolo "
                    + "ingresa números positivos");

        }

        libController.mostrarlibro(listaLibro, modelo);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jText_ISBN.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresa un isbn\no rellena "
                    + "todos los campos");
        } else {
            Libro libro = libController.getLibro(listaLibro,
                    jText_ISBN.getText());
            if (libro == null) {
                JOptionPane.showMessageDialog(null, "No hay registro "
                        + "del libro");
            } else {
                listaLibro = libController.eliminarLibro(listaLibro,
                        libro.getIsbn());

                limpiar();
                jText_ISBN.setEditable(true);

            }
        }
        libController.mostrarlibro(listaLibro, modelo);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Libro libro1 = new Libro();
        if (jText_ISBN.getText().equals("")
                || jText_Titulo.getText().equals("")
                || jText_Genero.getText().equals("")
                || jText_Autor.getText().equals("")
                || jText_Cantidad.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else {
            libro1 = leer(libro1);
            listaLibro = libController.actualizarLibro(listaLibro, libro1);
            libController.mostrarlibro(listaLibro, modelo);

            limpiar();

        }

        jText_ISBN.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        jText_ISBN.setEditable(false);
        jText_ISBN.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                0).toString());
        jText_Titulo.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                1).toString());
        jText_Genero.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                3).toString());
        jText_Autor.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                2).toString());
        jText_Cantidad.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        limpiar();
        Libro lbuscar = new Libro();
        if (jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ingresa el ISBN del libro");
        } else {
            lbuscar = libController.getLibro(listaLibro, jTextField1.getText());
            if (lbuscar != null) {
                jText_ISBN.setEditable(false);
                jText_ISBN.setText(lbuscar.getIsbn());
                jText_Titulo.setText(lbuscar.getTitulo());
                jText_Genero.setText(lbuscar.getClasificacion());
                jText_Autor.setText(lbuscar.getAutor());

                jText_Cantidad.setText(Short.toString(lbuscar.getCantidad()));
            } else {
                JOptionPane.showMessageDialog(null, "El libro no existe");
            }

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jText_ISBN.setEditable(true);
        limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jText_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_CantidadActionPerformed

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jText_Autor;
    private javax.swing.JTextField jText_Cantidad;
    private javax.swing.JTextField jText_Genero;
    private javax.swing.JTextField jText_ISBN;
    private javax.swing.JTextField jText_Titulo;
    // End of variables declaration//GEN-END:variables
}
