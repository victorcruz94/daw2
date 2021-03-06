/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ponerfaltas;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author sergio
 */
public class NewJFrame extends javax.swing.JFrame {

    //ArrayList<Persona> lista=new ArrayList<Persona>();
    ArrayList<Persona> lista = new ArrayList<>();
    int i = 0;

    public NewJFrame() {
        initComponents();
    }
    
    public void refrescar(){
        this.casillaNombre.setText("");
        this.casillaApellido.setText("");
        this.casillaFaltas.setText("");
        this.casillaNumero.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        BotonPrimero = new javax.swing.JButton();
        BotonAnterior = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        BotonUltimo = new javax.swing.JButton();
        casillaNumero = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        casillaFoto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        casillaNombre = new javax.swing.JTextField();
        casillaApellido = new javax.swing.JTextField();
        casillaFaltas = new javax.swing.JTextField();
        BotonAñadir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonSalvar = new javax.swing.JButton();
        BotonImprimir = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonAzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        BotonPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/primer.png"))); // NOI18N
        BotonPrimero.setText("Primero");
        BotonPrimero.setFocusable(false);
        BotonPrimero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonPrimero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrimeroActionPerformed(evt);
            }
        });
        jToolBar1.add(BotonPrimero);

        BotonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enrere.png"))); // NOI18N
        BotonAnterior.setText("Anterior");
        BotonAnterior.setEnabled(false);
        BotonAnterior.setFocusable(false);
        BotonAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });
        jToolBar1.add(BotonAnterior);

        BotonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/endavant.png"))); // NOI18N
        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.setFocusable(false);
        BotonSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });
        jToolBar1.add(BotonSiguiente);

        BotonUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ultim.png"))); // NOI18N
        BotonUltimo.setText("Último");
        BotonUltimo.setFocusable(false);
        BotonUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUltimoActionPerformed(evt);
            }
        });
        jToolBar1.add(BotonUltimo);

        casillaNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        casillaNumero.setText("1");
        casillaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaNumeroActionPerformed(evt);
            }
        });
        jToolBar1.add(casillaNumero);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder("Foto"), null));
        jPanel1.setToolTipText("Foto\n");

        casillaFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a1.png"))); // NOI18N
        casillaFoto.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(casillaFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(casillaFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        jLabel3.setText("Faltas");

        casillaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaNombreActionPerformed(evt);
            }
        });

        casillaApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaApellidoActionPerformed(evt);
            }
        });

        BotonAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/insertar.png"))); // NOI18N
        BotonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirActionPerformed(evt);
            }
        });

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar.png"))); // NOI18N
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonSalvar.setText("Salvar");
        BotonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalvarActionPerformed(evt);
            }
        });

        BotonImprimir.setText("Imprimir");
        BotonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonImprimirActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualitzar.png"))); // NOI18N
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        BotonAzar.setText("Al azar");
        BotonAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(casillaApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(casillaNombre)
                            .addComponent(casillaFaltas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonImprimir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonAzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 112, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(casillaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(casillaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(casillaFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BotonActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonAñadir)
                            .addComponent(BotonEliminar)))
                    .addComponent(BotonAzar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonSalvar)
                    .addComponent(BotonImprimir)
                    .addComponent(BotonCancelar))
                .addGap(18, 18, 18)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializar() {
        /*Persona p1 = new Persona("David", "Aparicio", 2);
        lista.add(p1);
        Persona p2 = new Persona("Víctor", "Bejarano", 2);
        lista.add(p2);
        Persona p3 = new Persona("Adria", "Cabrera", 2);
        lista.add(p3);
        Persona p4 = new Persona("Sandra", "Callejas", 2);
        lista.add(p4);*/
        try {
            BufferedReader entrada = new BufferedReader(new FileReader("C:\\bd_alumnos.txt"));
            String x = entrada.readLine();
            while(x!=null){
                Persona p = new Persona(x);
                lista.add(p);
                System.out.println(p.getNom());
                x = entrada.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error Lectura");
        }
        mostrar(i);
        this.BotonPrimero.setEnabled(false);
        this.BotonAnterior.setEnabled(false);
        this.BotonCancelar.setVisible(false);
        this.BotonGuardar.setEnabled(false);
        cargarImagenes(i+1);
    }

    private void cargarImagenes(int a) {
        if(a == -1){
            casillaFoto.setIcon(new ImageIcon(getClass().getResource("/imagenes/Sergio.png")));
            casillaFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        }else{
            casillaFoto.setIcon(new ImageIcon(getClass().getResource("/imagenes/"+lista.get(a-1).getNom()+".png")));
            casillaFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        }
    }
    private void casillaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillaNombreActionPerformed

    private void casillaApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillaApellidoActionPerformed

    private void casillaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_casillaNumeroActionPerformed

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
        i = i - 1;
        this.BotonSiguiente.setEnabled(true);
        this.BotonUltimo.setEnabled(true);

        if (i == 0) {
            mostrar(i);
            this.BotonPrimero.setEnabled(false);
            this.BotonAnterior.setEnabled(false);
            cargarImagenes(i+1);

        } else {
            this.BotonAnterior.setEnabled(true);
            this.casillaNombre.setText(lista.get(i).getNom());
            this.casillaApellido.setText(lista.get(i).getCognom());
            this.casillaFaltas.setText(String.valueOf(lista.get(i).getFaltes()));
            this.casillaNumero.setText(String.valueOf(i+1));
            cargarImagenes(i+1);

        }
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
        if (i < lista.size() - 2) {
            i = i + 1;
            this.BotonPrimero.setEnabled(true);
            this.BotonAnterior.setEnabled(true);
            mostrar(i);
            cargarImagenes(i+1);
        } else {
            if(i == lista.size() -2){
                i = i + 1;
                mostrar(i);
                cargarImagenes(i+1);
                this.BotonSiguiente.setEnabled(false);
                this.BotonUltimo.setEnabled(false);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void BotonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUltimoActionPerformed
        // TODO add your handling code here:
        i= lista.size()-1;
        this.BotonPrimero.setEnabled(true);
        this.BotonAnterior.setEnabled(true);
        this.BotonSiguiente.setEnabled(false);
        this.BotonUltimo.setEnabled(false);

        mostrar(i);
        cargarImagenes(i+1);
    }//GEN-LAST:event_BotonUltimoActionPerformed

    private void BotonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrimeroActionPerformed
        // tal
        i = 0;
        mostrar(i);
        this.BotonPrimero.setEnabled(false);
        this.BotonAnterior.setEnabled(false);
        this.BotonSiguiente.setEnabled(true);
        this.BotonUltimo.setEnabled(true);
        cargarImagenes(i+1);
    }//GEN-LAST:event_BotonPrimeroActionPerformed

    private void mostrar(int i){
        refrescar();
        this.casillaNombre.setText(lista.get(i).getNom());
        this.casillaApellido.setText(lista.get(i).getCognom());
        this.casillaFaltas.setText(String.valueOf(lista.get(i).getFaltes()));
        this.casillaNumero.setText(String.valueOf(i+1));
    }
    
    private void BotonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirActionPerformed
        // TODO add your handling code here:
        refrescar();
        cargarImagenes(-1);
        this.BotonPrimero.setEnabled(false);
        this.BotonAnterior.setEnabled(false);
        this.BotonSiguiente.setEnabled(false);
        this.BotonUltimo.setEnabled(false);
        this.BotonEliminar.setEnabled(false);
        this.BotonImprimir.setEnabled(false);
        this.BotonSalvar.setEnabled(false);
        this.BotonCancelar.setVisible(true);
        this.BotonAñadir.setEnabled(false);
        this.BotonActualizar.setEnabled(false);
        this.BotonGuardar.setEnabled(true);
        //this.jLabel5.setIcon(null);
        this.casillaNumero.setText(String.valueOf(lista.size()+1));
    }//GEN-LAST:event_BotonAñadirActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        // TODO add your handling code here:
        if(this.casillaNombre.getText() != "" && this.casillaApellido.getText() != "" && this.casillaFaltas.getText() != ""){
            String nombre = this.casillaNombre.getText();
            String apellidos = this.casillaApellido.getText();
            int faltas = Integer.parseInt(this.casillaFaltas.getText());
            Persona p = new Persona(nombre,apellidos,faltas);
            lista.add(p);
            refrescar();
            i= lista.size()-1;
            for(Persona h:lista){
                System.out.println(h.getNom());
            }
            mostrar(i);
            cargarImagenes(i+1);
            this.BotonPrimero.setEnabled(true);
            this.BotonAnterior.setEnabled(true);
            this.BotonActualizar.setEnabled(true);
            this.BotonGuardar.setEnabled(false);
            this.BotonAñadir.setEnabled(true);
            this.BotonEliminar.setEnabled(true);
            this.BotonCancelar.setVisible(false);
            this.BotonSalvar.setEnabled(true);
            this.BotonImprimir.setEnabled(true);
        }else{
            System.out.println("No");
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        // TODO add your handling code here:
        i = Integer.parseInt(this.casillaNumero.getText())-1;
        lista.remove(i);
        if(i==lista.size()){
            i=i-1;
        }
        mostrar(i);
        cargarImagenes(i+1);
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // TODO add your handling code here:
        i = 0;
        mostrar(i);
        cargarImagenes(i+1);
        
        this.BotonSiguiente.setEnabled(true);
        this.BotonUltimo.setEnabled(true);
        this.BotonAñadir.setEnabled(true);
        this.BotonEliminar.setEnabled(true);
        this.BotonImprimir.setEnabled(true);
        this.BotonSalvar.setEnabled(true);
        this.BotonCancelar.setVisible(false);
        this.BotonActualizar.setEnabled(true);
        this.BotonGuardar.setEnabled(false);
    }//GEN-LAST:event_BotonCancelarActionPerformed
    
    private void BotonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalvarActionPerformed
        // TODO add your handling code here:
        i = Integer.parseInt(this.casillaNumero.getText())-1;
        mostrar(i);
        cargarImagenes(i+1);
        try {
            //PrintWriter escribir = new PrintWriter(new FileWriter("C:\\Animals2.txt"));
            BufferedWriter salida = new BufferedWriter(new FileWriter("C:\\alumnos2.txt",true));
            //for(int i=0;i<lista.size();i++){
            salida.write(lista.get(i).getNom()+";"+lista.get(i).getCognom()+";"+lista.get(i).getFaltes());
            salida.newLine();
            System.out.println(lista.get(i).getNom()+";"+lista.get(i).getCognom()+";"+lista.get(i).getFaltes());
            salida.flush();
        } catch (Exception e) {
            System.out.println("Error escritura");
        }
    }//GEN-LAST:event_BotonSalvarActionPerformed

    private void BotonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonImprimirActionPerformed
        // TODO add your handling code here:
        i = Integer.parseInt(this.casillaNumero.getText())-1;
        mostrar(i);
        cargarImagenes(i+1);
        try {
            //PrintWriter escribir = new PrintWriter(new FileWriter("C:\\Animals2.txt"));
            BufferedWriter salida = new BufferedWriter(new FileWriter("C:\\alumnos.txt",true));
            //for(int i=0;i<lista.size();i++){
            for(Persona a:lista){
                salida.write(a.getNom()+";"+a.getCognom()+";"+a.getFaltes());
                salida.newLine();
                System.out.println(a.getNom()+";"+a.getCognom()+";"+a.getFaltes());
            }
            salida.flush();
        } catch (Exception e) {
            System.out.println("Error escritura");
        }
    }//GEN-LAST:event_BotonImprimirActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        // TODO add your handling code here:
        i = Integer.parseInt(this.casillaNumero.getText())-1;
        lista.get(i).setNom(this.casillaNombre.getText());
        System.out.println(this.casillaNombre.getText());
        lista.get(i).setCognom(this.casillaApellido.getText());
        lista.get(i).setFaltes(Integer.parseInt(this.casillaFaltas.getText()));
        mostrar(i);
        cargarImagenes(i+1);
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAzarActionPerformed
        // TODO add your handling code here:
        Random rnd = new Random();
        int tiempo=5,num;
        try{
            for(int t=0;t<tiempo;t++){
                num = rnd.nextInt(4);
                mostrar(num);
                cargarImagenes(num+1);
                System.out.println(lista.get(num).getNom());
                Thread.currentThread().sleep(500);
                mostrar(num);
                cargarImagenes(num+1);
            }
        }catch(Exception e){
            System.out.println("Error Randomizar");
        }
    }//GEN-LAST:event_BotonAzarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJFrame frame = new NewJFrame();
                frame.setVisible(true);
                frame.inicializar();

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonAzar;
    private javax.swing.JButton BotonAñadir;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonImprimir;
    private javax.swing.JButton BotonPrimero;
    private javax.swing.JButton BotonSalvar;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JButton BotonUltimo;
    private javax.swing.JTextField casillaApellido;
    private javax.swing.JTextField casillaFaltas;
    private javax.swing.JLabel casillaFoto;
    private javax.swing.JTextField casillaNombre;
    private javax.swing.JTextField casillaNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
