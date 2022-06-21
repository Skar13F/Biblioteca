/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 01 de junio de 2022
 * Fecha de actualización: 09 de junio de 2022
 * Descripción: clase JPanel para controlar las operaciones CRUD
                aplicados a los objetos Prestamos, además enlazamos
                las listas provenientes de otros páneles para ocupar
                su información
 */
package view;

import controller.EncargadoController;
import controller.PrestamoController;
import controller.LibroController;
import controller.UsuarioController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Usuario;
import pojo.Libro;
import pojo.Encargado;
import pojo.Prestamo;

/**
 *
 * @author oscar
 */
public class PanelPrestamo extends javax.swing.JPanel {

    private List<Libro> listaLibro;
    private List<Usuario> listaAlumno;
    private List<Encargado> listaEncargado;
    private List<Prestamo> listaPrestamo;

    private PrestamoController prestController;
    private DefaultTableModel modelo;
    private List<String> listaIsbn;

    private LibroController libroAux;
    private UsuarioController alumnoAux;
    private EncargadoController encargadoAux;

    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    private int id;

    /**
     * Constructor que recibe las listas cargadas de información inicializa
     * algunos atributos
     */
    public PanelPrestamo(List<Libro> listLibro, List<Usuario> listAlumno,
            List<Encargado> listEncargado) {
        initComponents();

        prestController = new PrestamoController();
        listaLibro = listLibro;
        listaAlumno = listAlumno;
        listaEncargado = listEncargado;

        libroAux = new LibroController();
        alumnoAux = new UsuarioController();
        encargadoAux = new EncargadoController();

        listaPrestamo = new ArrayList<>();
        modelo = (DefaultTableModel) jTable1.getModel();
        listaIsbn = new ArrayList<>();
        jText_FechaSol.setText(formatter.format(new Date()));
        jText_FechaSol.setEditable(false);
        
        rellenarComboAlumno();
        rellenarComboEncargado();
        rellenarComboLibro();
    }

    //Vacía la información de los jtext 
    public void limpiar() {
        jText_FechaEnt.setText("00/00/0000");
    }

    //Lee datos de las entradas de texto y las guarda en un objeto préstamo
    public Prestamo leer() {
        Prestamo prestamoLeer = new Prestamo();
        prestamoLeer.setId(id);
        prestamoLeer.setFechaSol((ParseFecha(jText_FechaSol.getText())));
        prestamoLeer.setFechaEnt(ParseFecha(jText_FechaEnt.getText()));
        prestamoLeer.setMatricula(jComboBox1.getSelectedItem().toString());
        prestamoLeer.setCodTrab(jComboBox2.getSelectedItem().toString());

        listaIsbn.add(jComboBox3.getSelectedItem().toString());

        prestamoLeer.setNombres(listaIsbn);
        return prestamoLeer;
    }

    public static Date ParseFecha(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            
        }
        return fechaDate;
    }

    public void rellenarComboAlumno() {
        for (int i = 0; i < listaAlumno.size(); i++) {
            jComboBox1.addItem(listaAlumno.get(i).getMatricula());
        }
    }

    public void rellenarComboEncargado() {
        for (int i = 0; i < listaEncargado.size(); i++) {
            jComboBox2.addItem(listaEncargado.get(i).getCodTrab());
        }
    }

    public void rellenarComboLibro() {
        for (int i = 0; i < listaLibro.size(); i++) {
            jComboBox3.addItem(listaLibro.get(i).getIsbn());
        }
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
        jText_FechaSol = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jText_FechaEnt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();

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

        jLabel1.setText("Solicitud");

        jText_FechaSol.setBackground(new java.awt.Color(39, 154, 180));
        jText_FechaSol.setMaximumSize(new java.awt.Dimension(150, 20));
        jText_FechaSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_FechaSolActionPerformed(evt);
            }
        });

        jLabel2.setText("Entrega");

        jText_FechaEnt.setBackground(new java.awt.Color(39, 154, 180));
        jText_FechaEnt.setText("00/00/0000");
        jText_FechaEnt.setMaximumSize(new java.awt.Dimension(200, 20));

        jLabel3.setText("Matrícula");

        jLabel4.setText("Encargado");

        jLabel5.setText("Libros");

        jTable1.setBackground(new java.awt.Color(66, 248, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Fecha Solicitud", "Fecha entrega", "Matrícula", "Encargado", "Libros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(35);
        }

        jButton6.setBackground(new java.awt.Color(0, 255, 222));
        jButton6.setText("+");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
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
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_FechaSol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_FechaEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_FechaSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jText_FechaEnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jButton6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    /*
    Botón para agregar un nuevo elemento (objeto) a la lista
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Prestamo prestamo = new Prestamo();

        Usuario alumno = alumnoAux.getUsuario(listaAlumno, jComboBox1.getSelectedItem().toString());
        Libro libro = libroAux.getLibro(listaLibro, jComboBox3.getSelectedItem().toString());
        Encargado encargado = encargadoAux.getEncargado(listaEncargado, jComboBox2.getSelectedItem().toString());

        if (jText_FechaEnt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else if (alumno == null) {
            JOptionPane.showMessageDialog(null, "El alumno no existe\n"
                    + "regístralo antes");
        } else if (libro == null) {
            JOptionPane.showMessageDialog(null, "El libro no existe");
        } else if (encargado == null) {
            JOptionPane.showMessageDialog(null, "El encargado no existe\n "
                    + "regístralo");
        } else {
            prestamo = leer();
            listaPrestamo = prestController.crearPrestamo(listaPrestamo,
                    prestamo);
            limpiar();
            List<String> vacio = new ArrayList<>();
            listaIsbn = vacio;
        }

        prestController.mostrarPrestamo(listaPrestamo, listaLibro,
                listaEncargado, listaAlumno, modelo);

    }//GEN-LAST:event_jButton1ActionPerformed

    /*
    Botón para eliminar un objeto de la lista
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jText_FechaSol.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else {
            Prestamo leerD = leer();
            Prestamo prestamo23 = prestController.getPrestamo(listaPrestamo,
                    leerD);
            if (prestamo23 != null) {
                listaPrestamo = prestController.eliminarPrestamo(listaPrestamo,
                        leerD);

                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No hay registro "
                        + "del prestamo");

            }
        }
        prestController.mostrarPrestamo(listaPrestamo, listaLibro,
                listaEncargado, listaAlumno, modelo);
    }//GEN-LAST:event_jButton3ActionPerformed

    /*
    Botón para actualizar datos de un objeto dentro de la lista
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Prestamo prestamo1 = new Prestamo();
        if (jText_FechaSol.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
        } else {
            prestamo1 = leer();
            listaPrestamo = prestController.actualizarPrestamo(listaPrestamo,
                    id, prestamo1);
            prestController.mostrarPrestamo(listaPrestamo, listaLibro,
                    listaEncargado, listaAlumno, modelo);

            limpiar();
            jText_FechaSol.setEditable(true);
            List<String> vacio = new ArrayList<>();
            listaIsbn = vacio;

        }

        jText_FechaSol.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /*
    Muestra en los cuadros de texto los datos de un objeto seleccionado
    desde la tabla
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),
                0).toString());
        jText_FechaSol.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                1).toString());
        jText_FechaEnt.setText(jTable1.getValueAt(jTable1.getSelectedRow(),
                2).toString());
        jComboBox1.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 3));
        jComboBox2.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 4));
        jComboBox3.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 5));
    }//GEN-LAST:event_jTable1MouseClicked

    //Vacía el contenido de los cuadros de texto
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jText_FechaSol.setEditable(true);
        limpiar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jText_FechaSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_FechaSolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_FechaSolActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    //Busca un objeto dentro de la lista
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Libro libroBuscar = libroAux.getLibro(listaLibro, jComboBox3.getSelectedItem().toString());
        if (libroBuscar != null) {
            listaIsbn.add(jComboBox3.getSelectedItem().toString());
        } else {
            JOptionPane.showMessageDialog(null, "no hay registro del libro");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jText_FechaEnt;
    private javax.swing.JTextField jText_FechaSol;
    // End of variables declaration//GEN-END:variables
}
