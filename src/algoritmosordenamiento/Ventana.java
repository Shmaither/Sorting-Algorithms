
// **************************************************************************************************************************************************
// UNIVERSIDAD ESTATAL A DISTANCIA
// ESCUELA DE CIENCIAS EXACTAS Y NATURALES
// CARRERA INGENIERIA INFORMATICA
// CATETRAS TECNOLOGIA DE SISTEMAS

// ESTRUCTURA DE DATOS_00825
// PROYECTO 1
// ESTUDIANTE: SHMAITER JOSE MORALES RIZO
// CEDULA: 0207020436

// GRUPO: B
// PROFESOR: FABIAN SEQUEIRA
// SEGUNDO CUATRIMESTRE 2020
// **************************************************************************************************************************************************

package algoritmosordenamiento;

import java.text.DecimalFormat;

public class Ventana extends javax.swing.JFrame {

    public AlgoritmosOrdenamiento iniciar = new AlgoritmosOrdenamiento();
   
    DecimalFormat df = new DecimalFormat("###.#######");
    
    public Ventana() {
        initComponents();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPaneAleatorios = new javax.swing.JScrollPane();
        jTextAreaAleatorios = new javax.swing.JTextArea();
        jScrollPaneBurbuja = new javax.swing.JScrollPane();
        jTextAreaBurbuja = new javax.swing.JTextArea();
        jScrollPaneShell = new javax.swing.JScrollPane();
        jTextAreaShell = new javax.swing.JTextArea();
        jScrollPaneQuick = new javax.swing.JScrollPane();
        jTextAreaQuick = new javax.swing.JTextArea();
        jButtonSalir = new javax.swing.JButton();
        jLabelOB = new javax.swing.JLabel();
        jLabelOS = new javax.swing.JLabel();
        jLabelOQ = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTiempoBurbuja = new javax.swing.JLabel();
        jLabelTiempoQuick = new javax.swing.JLabel();
        jLabelTiempoShell = new javax.swing.JLabel();
        jLabelNA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordenamientos");
        setLocation(new java.awt.Point(200, 200));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setText("EJECUTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPaneAleatorios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPaneAleatorios.setPreferredSize(new java.awt.Dimension(270, 100));

        jTextAreaAleatorios.setEditable(false);
        jTextAreaAleatorios.setColumns(1);
        jScrollPaneAleatorios.setViewportView(jTextAreaAleatorios);

        jScrollPaneBurbuja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPaneBurbuja.setPreferredSize(new java.awt.Dimension(270, 100));

        jTextAreaBurbuja.setEditable(false);
        jTextAreaBurbuja.setColumns(20);
        jTextAreaBurbuja.setRows(5);
        jScrollPaneBurbuja.setViewportView(jTextAreaBurbuja);

        jScrollPaneShell.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPaneShell.setPreferredSize(new java.awt.Dimension(270, 100));

        jTextAreaShell.setEditable(false);
        jTextAreaShell.setColumns(20);
        jTextAreaShell.setRows(5);
        jScrollPaneShell.setViewportView(jTextAreaShell);

        jScrollPaneQuick.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPaneQuick.setPreferredSize(new java.awt.Dimension(270, 100));

        jTextAreaQuick.setEditable(false);
        jTextAreaQuick.setColumns(20);
        jTextAreaQuick.setRows(5);
        jScrollPaneQuick.setViewportView(jTextAreaQuick);

        jButtonSalir.setBackground(new java.awt.Color(204, 51, 0));
        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabelOB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOB.setText("ORDENAMIENTO BURBUJA");

        jLabelOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOS.setText("ORDENAMIENTO SHELL");

        jLabelOQ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelOQ.setText("ORDENAMIENTO QUICK");

        jLabelTiempoBurbuja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTiempoBurbuja.setText("0.0000000");
        jLabelTiempoBurbuja.setPreferredSize(new java.awt.Dimension(86, 25));

        jLabelTiempoQuick.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTiempoQuick.setText("0.0000000");

        jLabelTiempoShell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTiempoShell.setText("0.0000000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelTiempoBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTiempoShell, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabelTiempoQuick, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTiempoBurbuja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTiempoShell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTiempoQuick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabelNA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNA.setText("NÚMEROS ALEATORIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelNA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneBurbuja, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(jLabelOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneShell, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(jLabelOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneQuick, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(jLabelOQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNA, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addComponent(jLabelOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelOQ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneQuick, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneShell, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneAleatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneBurbuja, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        iniciar.genera(); // Se llama al método que llena el arreglo de numeros aleatorios y a los métodos que generan cada ordenamiento.
        
        // Se muestran los arreglos con cada ordenamiento
        mostrarAleatorios();
        mostrarBurbuja();
        mostrarShell();
        mostrarQuick();
        
        iniciar.numeros.clear();
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void mostrarAleatorios(){
        jTextAreaAleatorios.setText(""); // Limpia los datos mostrados en la ejecución anterior.
        int contador = 0;
        for (Integer n : iniciar.numeros) {
            contador++;
            jTextAreaAleatorios.append("[" + contador + "] " + n.toString() + "\n"); 
        } 
    }

    private void mostrarBurbuja() {
        
        jTextAreaBurbuja.setText("");
        int contador = 0;
        for (Integer n : iniciar.burbuja) {
            contador++;
            jTextAreaBurbuja.append("[" + contador + "] " + n.toString() + "\n");
        }
        
        String b = String.valueOf(df.format(iniciar.tiempos[0]));
        jLabelTiempoBurbuja.setText(b + " segundos");
    }

    private void mostrarShell() {
        
        jTextAreaShell.setText("");
        int contador = 0;
        for (Integer n : iniciar.shellsort) {
            contador++;
            jTextAreaShell.append("[" + contador + "] " + n.toString() + "\n");
        }
        
        String s = String.valueOf(df.format(iniciar.tiempos[1]));
        jLabelTiempoShell.setText(s + " segundos");
    }
    
    private void mostrarQuick() {

        jTextAreaQuick.setText("");
        int contador = 0;
        for (Integer n : iniciar.quicksort) {
            contador++;
            
            jTextAreaQuick.append("[" + df.format(contador) + "] " + n.toString() + "\n");
        }
        
        String q = String.valueOf(df.format(iniciar.tiempos[2]));
        jLabelTiempoQuick.setText(q + " segundos");
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelNA;
    private javax.swing.JLabel jLabelOB;
    private javax.swing.JLabel jLabelOQ;
    private javax.swing.JLabel jLabelOS;
    private javax.swing.JLabel jLabelTiempoBurbuja;
    private javax.swing.JLabel jLabelTiempoQuick;
    private javax.swing.JLabel jLabelTiempoShell;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneAleatorios;
    private javax.swing.JScrollPane jScrollPaneBurbuja;
    private javax.swing.JScrollPane jScrollPaneQuick;
    private javax.swing.JScrollPane jScrollPaneShell;
    private javax.swing.JTextArea jTextAreaAleatorios;
    private javax.swing.JTextArea jTextAreaBurbuja;
    private javax.swing.JTextArea jTextAreaQuick;
    private javax.swing.JTextArea jTextAreaShell;
    // End of variables declaration//GEN-END:variables
}
