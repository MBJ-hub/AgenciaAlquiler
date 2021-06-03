/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agenciaalquiler.vista;

import com.mycompany.agenciaalquiler.controlador.Controlador;
import com.mycompany.agenciaalquiler.modelo.Vehiculo;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



/**
 *
 * @author daw1
 */
public class Ventana extends javax.swing.JFrame {
    
    private DialogoVehiculo dialogoVehiculo = new DialogoVehiculo(this, true);
    private Controlador controlador;
    private VehiculoTableModel vehiculoTM;
  

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectorFicheros = new javax.swing.JFileChooser();
        bgOrdenListado = new javax.swing.ButtonGroup();
        pDatosVehiculo = new javax.swing.JPanel();
        pOtrasOperaciones = new javax.swing.JPanel();
        bMasBarato = new javax.swing.JButton();
        bMasCaro = new javax.swing.JButton();
        tMatricula = new javax.swing.JTextField();
        cbGrupo = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        spPlazas = new javax.swing.JSpinner();
        bBorrar = new javax.swing.JButton();
        bModificar = new javax.swing.JButton();
        jMatricula = new javax.swing.JLabel();
        jGrupo = new javax.swing.JLabel();
        jPlazas = new javax.swing.JLabel();
        lPrecioDia = new javax.swing.JLabel();
        jTipo = new javax.swing.JLabel();
        lCapacidad = new javax.swing.JLabel();
        tCapacidad = new javax.swing.JTextField();
        tPrecioDia = new javax.swing.JTextField();
        pListado = new javax.swing.JPanel();
        bListarVehiculos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        rbMatricula = new javax.swing.JRadioButton();
        rbPrecioAlquiler = new javax.swing.JRadioButton();
        cbFiltrarGrupo = new javax.swing.JComboBox<>();
        cbFiltrarTipo = new javax.swing.JComboBox<>();
        lOrdenListado = new javax.swing.JLabel();
        lFiltrarGrupo = new javax.swing.JLabel();
        lFiltrarTipo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        miArchivo = new javax.swing.JMenu();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();
        miVehiculo = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        miBuscar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pDatosVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Vehiculo"));

        pOtrasOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Otras Operaciones"));

        bMasBarato.setText("MOSTRAR VEHICULO MAS BARATO");
        bMasBarato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasBaratoActionPerformed(evt);
            }
        });

        bMasCaro.setText("MOSTRAR VEHICULO MAS CARO");
        bMasCaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasCaroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pOtrasOperacionesLayout = new javax.swing.GroupLayout(pOtrasOperaciones);
        pOtrasOperaciones.setLayout(pOtrasOperacionesLayout);
        pOtrasOperacionesLayout.setHorizontalGroup(
            pOtrasOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOtrasOperacionesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pOtrasOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bMasBarato, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(bMasCaro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pOtrasOperacionesLayout.setVerticalGroup(
            pOtrasOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOtrasOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bMasBarato)
                .addGap(18, 18, 18)
                .addComponent(bMasCaro)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        tMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMatriculaActionPerformed(evt);
            }
        });

        cbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C" }));
        cbGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGrupoActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TURISMO", "FURGONETA" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        bBorrar.setText("BORRAR");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        bModificar.setText("MODIFICAR");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });

        jMatricula.setText("MATRICULA");

        jGrupo.setText("GRUPO");

        jPlazas.setText("PLAZAS");

        lPrecioDia.setText("PRECIO POR DIA ");

        jTipo.setText("TIPO");

        lCapacidad.setText("CAPACIDAD");

        tCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCapacidadActionPerformed(evt);
            }
        });

        tPrecioDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPrecioDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pDatosVehiculoLayout = new javax.swing.GroupLayout(pDatosVehiculo);
        pDatosVehiculo.setLayout(pDatosVehiculoLayout);
        pDatosVehiculoLayout.setHorizontalGroup(
            pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosVehiculoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pDatosVehiculoLayout.createSequentialGroup()
                        .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jMatricula)
                            .addGroup(pDatosVehiculoLayout.createSequentialGroup()
                                .addComponent(jGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pDatosVehiculoLayout.createSequentialGroup()
                                .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pDatosVehiculoLayout.createSequentialGroup()
                                .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))))
                    .addComponent(pOtrasOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pDatosVehiculoLayout.createSequentialGroup()
                        .addComponent(jPlazas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pDatosVehiculoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bBorrar)
                        .addGap(41, 41, 41)
                        .addComponent(bModificar))
                    .addGroup(pDatosVehiculoLayout.createSequentialGroup()
                        .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lCapacidad)
                            .addComponent(lPrecioDia))
                        .addGap(28, 28, 28)
                        .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(tPrecioDia))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pDatosVehiculoLayout.setVerticalGroup(
            pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pDatosVehiculoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPlazas))
                .addGap(18, 18, 18)
                .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCapacidad)
                    .addComponent(tCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPrecioDia)
                    .addComponent(tPrecioDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pDatosVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBorrar)
                    .addComponent(bModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pOtrasOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pListado.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de vehiculos"));

        bListarVehiculos.setText("LISTAR VEHICULOS");
        bListarVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarVehiculosActionPerformed(evt);
            }
        });

        vehiculoTM=new VehiculoTableModel();
        tablaVehiculos.setModel(vehiculoTM);
        tablaVehiculos.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent lse){
                vehiculoSeleccionado(lse);
            }
        });
        jScrollPane1.setViewportView(tablaVehiculos);
        if (tablaVehiculos.getColumnModel().getColumnCount() > 0) {
            tablaVehiculos.getColumnModel().getColumn(0).setHeaderValue("MATRICULA");
            tablaVehiculos.getColumnModel().getColumn(1).setHeaderValue("TIPO");
            tablaVehiculos.getColumnModel().getColumn(2).setHeaderValue("GRUPO");
            tablaVehiculos.getColumnModel().getColumn(3).setHeaderValue("PLAZAS");
            tablaVehiculos.getColumnModel().getColumn(4).setHeaderValue("CAPACIDAD");
            tablaVehiculos.getColumnModel().getColumn(5).setHeaderValue("PRECIO ALQUILER");
        }

        bgOrdenListado.add(rbMatricula);
        rbMatricula.setText("MATRICULA");

        bgOrdenListado.add(rbPrecioAlquiler);
        rbPrecioAlquiler.setText("PRECIO ALQUILER");
        rbPrecioAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPrecioAlquilerActionPerformed(evt);
            }
        });

        cbFiltrarGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "TODOS" }));
        cbFiltrarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltrarGrupoActionPerformed(evt);
            }
        });

        cbFiltrarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TURISMO", "FURGONETA" }));
        cbFiltrarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltrarTipoActionPerformed(evt);
            }
        });

        lOrdenListado.setText("ORDEN DEL LISTADO");

        lFiltrarGrupo.setText("FILTRAR POR GRUPO");

        lFiltrarTipo.setText("FILTRAR POR TIPO");

        javax.swing.GroupLayout pListadoLayout = new javax.swing.GroupLayout(pListado);
        pListado.setLayout(pListadoLayout);
        pListadoLayout.setHorizontalGroup(
            pListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListadoLayout.createSequentialGroup()
                .addGroup(pListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pListadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbMatricula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbPrecioAlquiler)
                        .addGap(56, 56, 56)
                        .addComponent(lFiltrarGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFiltrarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lFiltrarTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFiltrarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pListadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lOrdenListado))
                    .addGroup(pListadoLayout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(bListarVehiculos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pListadoLayout.setVerticalGroup(
            pListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pListadoLayout.createSequentialGroup()
                .addComponent(bListarVehiculos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(lOrdenListado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMatricula)
                    .addComponent(rbPrecioAlquiler)
                    .addComponent(cbFiltrarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFiltrarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lFiltrarGrupo)
                    .addComponent(lFiltrarTipo))
                .addGap(44, 44, 44))
        );

        miArchivo.setText("Archivo");
        miArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miArchivoActionPerformed(evt);
            }
        });

        miAbrir.setText("Abrir");
        miAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbrirActionPerformed(evt);
            }
        });
        miArchivo.add(miAbrir);

        miGuardar.setText("Guardar");
        miGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarActionPerformed(evt);
            }
        });
        miArchivo.add(miGuardar);

        jMenuBar1.add(miArchivo);

        miVehiculo.setText("Vehiculo");

        miNuevo.setText("Nuevo");
        miNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNuevoActionPerformed(evt);
            }
        });
        miVehiculo.add(miNuevo);

        miBuscar.setText("Buscar");
        miBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarActionPerformed(evt);
            }
        });
        miVehiculo.add(miBuscar);

        jMenuBar1.add(miVehiculo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDatosVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pListado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pDatosVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pListado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMatriculaActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        // TODO add your handling code here:
        if(tMatricula.getText().trim().length()>0){
            this.solicitarConfirmacion();
            controlador.borrarVehiculo();
        }
    }//GEN-LAST:event_bBorrarActionPerformed

    private void cbGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGrupoActionPerformed

    private void rbPrecioAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPrecioAlquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPrecioAlquilerActionPerformed

    private void cbFiltrarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltrarTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFiltrarTipoActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbTipoActionPerformed

    private void cbFiltrarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltrarGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFiltrarGrupoActionPerformed

    private void bListarVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarVehiculosActionPerformed
        // TODO add your handling code here:
        controlador.listarVehiculos();
    }//GEN-LAST:event_bListarVehiculosActionPerformed

    private void miNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNuevoActionPerformed
        // TODO add your handling code here:
        if (dialogoVehiculo.mostrar() == DialogoVehiculo.ACEPTAR) {
            mostrarMatricula(dialogoVehiculo.getMatricula());
            mostrarGrupo(dialogoVehiculo.getGrupo());
            mostrarTipo(dialogoVehiculo.getTipo());
            if(cbTipo.getSelectedItem().equals("TURISMO")){
                mostrarPlazas(dialogoVehiculo.getPlazas());
            }else{
                mostrarCapacidad(dialogoVehiculo.getCapacidad());}
            controlador.crearVehiculo();
            this.actualizarTabla();
            dialogoVehiculo.limpiarCampos();
        }
    }//GEN-LAST:event_miNuevoActionPerformed

    private void miArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miArchivoActionPerformed

    private void miGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarActionPerformed
        // TODO add your handling code here:
        if (selectorFicheros.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            controlador.guardarVehiculos();
        }
    }//GEN-LAST:event_miGuardarActionPerformed

    private void miAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirActionPerformed
        // TODO add your handling code here:
        if (selectorFicheros.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            controlador.cargarVehiculos();
        }
    }//GEN-LAST:event_miAbrirActionPerformed

    private void miBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarActionPerformed
        // TODO add your handling code here:
        String matricula;
        
        matricula=JOptionPane.showInputDialog(this,"Introduce Matricula");
        if(matricula!=null){
            this.mostrarMatricula(matricula);
        controlador.buscarVehiculo();   
       }
        
    }//GEN-LAST:event_miBuscarActionPerformed

    private void bMasBaratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasBaratoActionPerformed
        // TODO add your handling code here:
        controlador.buscarVehiculoMasBarato();
    }//GEN-LAST:event_bMasBaratoActionPerformed

    private void bMasCaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasCaroActionPerformed
        // TODO add your handling code here:
        controlador.buscarVehiculoMasCaro();
    }//GEN-LAST:event_bMasCaroActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bModificarActionPerformed

    private void tCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tCapacidadActionPerformed

    private void tPrecioDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPrecioDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPrecioDiaActionPerformed

    /**
     *
     * @return
     */
    public String getMatricula(){
         return this.tMatricula.getText();
    }

    /**
     *
     * @return
     */
    public String getGrupo(){
        return this.cbGrupo.toString();
    }
    
    /**
     *
     * @return
     */
    public String getTipo(){
        return this.cbTipo.toString();
    }
    
    /**
     *
     * @return
     */
    public int getPlazas(){
        return (int)spPlazas.getValue();
    }
    
    /**
     *
     * @return
     */
    public float getCapacidad(){
        return (Float.parseFloat(this.tCapacidad.getText()));
    }
    
    /**
     *
     * @return
     */
    public String getArchivo(){
        return selectorFicheros.getSelectedFile().getAbsolutePath(); 
    }
    
    /**
     *
     * @return
     */
    public String getOrden(){
        return bgOrdenListado.getSelection().getActionCommand();
    }
    
    /**
     *
     * @return
     */
    public String getFiltroGrupo(){
        return this.cbFiltrarGrupo.getSelectedItem().toString();
    }
    
    /**
     *
     * @return
     */
    public String getFiltroTipo(){
        return this.cbFiltrarTipo.getSelectedItem().toString();
    }
    
    /**
     *
     * @param matricula
     */
    public void mostrarMatricula(String matricula){
        this.tMatricula.setText(matricula);
    }
    
    /**
     *
     * @param tipo
     */
    public void mostrarTipo(String tipo){
        this.cbTipo.setSelectedItem(tipo);
    }
    
    /**
     *
     * @param grupo
     */
    public void mostrarGrupo(String grupo){
        this.cbGrupo.setSelectedItem(grupo);
    }
    
    /**
     *
     * @param plazas
     */
    public void mostrarPlazas(int plazas){
        this.spPlazas.setValue(plazas);
    }
    
    /**
     *
     * @param capacidad
     */
    public void mostrarCapacidad(float capacidad){
        this.lCapacidad.setText(Float.toString(capacidad));
    }
    
    /**
     *
     * @param precio
     */
    public void mostrarPrecioAlquiler(float precio){}
    
    /**
     *
     * @param listado
     */
    public void listarVehiculos(List<Vehiculo> listado){
        vehiculoTM.setListadoVehiculos(listado);
        tablaVehiculos.revalidate();
    }
    
    /**
     *
     * @param mensaje
     */
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }
    
    /**
     *
     * @return
     */
    public boolean solicitarConfirmacion(){
        return JOptionPane.showConfirmDialog(this, "¿Está usted seguro de Borrar? Será permanente")==JOptionPane.OK_OPTION;
    }
    
    /**
     *
     * @param controlador
     */
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    
    public void limpiarCampos(){
        
    }
    
    /**
     *
     */
    public void mostrar(){
        setVisible(true);
    }
    
    private void vehiculoSeleccionado(ListSelectionEvent lse){
        int fila=tablaVehiculos.getSelectedRow();
        if(fila>=0){
            mostrarMatricula((String)tablaVehiculos.getValueAt(fila, 0));
            mostrarTipo((String)tablaVehiculos.getValueAt(fila, 1));
            mostrarGrupo((String)tablaVehiculos.getValueAt(fila, 2));
            mostrarPlazas((int)tablaVehiculos.getValueAt(fila, 3));
            mostrarCapacidad((float)tablaVehiculos.getValueAt(fila, 4));
            mostrarPrecioAlquiler((float)tablaVehiculos.getValueAt(fila, 5));

}
}
    
    
    /**
     *
     */
    public void actualizarTabla(){
        this.tablaVehiculos.revalidate();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana().setVisible(true);
        });
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bListarVehiculos;
    private javax.swing.JButton bMasBarato;
    private javax.swing.JButton bMasCaro;
    private javax.swing.JButton bModificar;
    private javax.swing.ButtonGroup bgOrdenListado;
    private javax.swing.JComboBox<String> cbFiltrarGrupo;
    private javax.swing.JComboBox<String> cbFiltrarTipo;
    private javax.swing.JComboBox<String> cbGrupo;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jGrupo;
    private javax.swing.JLabel jMatricula;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel jPlazas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTipo;
    private javax.swing.JLabel lCapacidad;
    private javax.swing.JLabel lFiltrarGrupo;
    private javax.swing.JLabel lFiltrarTipo;
    private javax.swing.JLabel lOrdenListado;
    private javax.swing.JLabel lPrecioDia;
    private javax.swing.JMenuItem miAbrir;
    private javax.swing.JMenu miArchivo;
    private javax.swing.JMenuItem miBuscar;
    private javax.swing.JMenuItem miGuardar;
    private javax.swing.JMenuItem miNuevo;
    private javax.swing.JMenu miVehiculo;
    private javax.swing.JPanel pDatosVehiculo;
    private javax.swing.JPanel pListado;
    private javax.swing.JPanel pOtrasOperaciones;
    private javax.swing.JRadioButton rbMatricula;
    private javax.swing.JRadioButton rbPrecioAlquiler;
    private javax.swing.JFileChooser selectorFicheros;
    private javax.swing.JSpinner spPlazas;
    private javax.swing.JTextField tCapacidad;
    private javax.swing.JTextField tMatricula;
    private javax.swing.JTextField tPrecioDia;
    private javax.swing.JTable tablaVehiculos;
    // End of variables declaration//GEN-END:variables
}