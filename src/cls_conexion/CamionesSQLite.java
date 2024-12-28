package cls_conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class CamionesSQLite extends javax.swing.JFrame {
    DefaultTableModel modelo;
    DefaultTableModel tabla;
    Connection cnn=null;
    public CamionesSQLite() {
        initComponents();
        setSize(800,400);
        setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCamiones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cboportipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnTodosCamiones = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cboporempresa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemp = new javax.swing.JTextField();
        txtdis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tblCamiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD_EMP", "COD_CAMION", "PLACA", "COLOR", "MARCA", "AÑO", "TIPO"
            }
        ));
        jScrollPane1.setViewportView(tblCamiones);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LISTADO GENERAL DE CAMIONES");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setText("CERRAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        cboportipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cboportipo.setForeground(new java.awt.Color(255, 0, 0));
        cboportipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        cboportipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboportipoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("TIPO");

        btnTodosCamiones.setBackground(new java.awt.Color(51, 0, 153));
        btnTodosCamiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTodosCamiones.setForeground(new java.awt.Color(255, 255, 153));
        btnTodosCamiones.setText("Todos");
        btnTodosCamiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosCamionesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Por empresa");

        cboporempresa.setBackground(new java.awt.Color(0, 0, 153));
        cboporempresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cboporempresa.setForeground(new java.awt.Color(255, 255, 204));
        cboporempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboporempresaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Distrito");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Empresa");

        txtemp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtemp.setForeground(new java.awt.Color(51, 0, 153));

        txtdis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtdis.setForeground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboporempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(btnTodosCamiones)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboportipo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtemp, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdis, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboportipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnTodosCamiones)
                    .addComponent(jLabel3)
                    .addComponent(cboporempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cargarcomboempresa(){
     Cls_Conexion objC = new Cls_Conexion();
       Statement st;
       ResultSet rs;
       String sql = "select idemp from empresa";
       try{
           cnn= objC.Conexion();
           st = cnn.createStatement();
           rs = st.executeQuery(sql);
           while(rs.next()){
               this.cboporempresa.addItem(rs.getString("idemp"));
           }
           cnn.close();
       }catch(SQLException ex){
           System.out.println("Error es -->"+ex.getMessage());
       }
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       limpiarTabla();
        cargarcomboempresa();
       Cls_Conexion objC = new Cls_Conexion();
       Statement st;
       ResultSet rs;
       String sql = "select * from tblcamion";
       try{
           cnn= objC.Conexion();
           st = cnn.createStatement();
           rs = st.executeQuery(sql);
           Object [] camion = new Object[7];
           modelo=(DefaultTableModel) tblCamiones.getModel(); 
           while(rs.next()){
               camion[0]=rs.getString("idemp");
               camion[1]=rs.getString("idcamion");
               camion[2]=rs.getString("placa");
               camion[3]=rs.getString("color");
               camion[4]=rs.getString("marca");
               camion[5]=rs.getString("anio");
               camion[6]=rs.getString("tipo");
              modelo.addRow(camion);
           }
             tblCamiones.setModel(modelo); 
             intercalarfilas();
               cnn.close();
       }catch(SQLException ex){
           System.out.println("Error es -->"+ex.getMessage());
       }
    }//GEN-LAST:event_formComponentShown
public void intercalarfilas(){
            CeldaIntercalada celda = new CeldaIntercalada();
              for(int y = 0 ; y< tblCamiones.getColumnCount();y++){
               tblCamiones.getColumnModel().getColumn(y).setCellRenderer(celda);
   }
}
public void  listadogeneral(){
        Cls_Conexion objC = new Cls_Conexion();
    Statement st;
    ResultSet rs;
    String sql = "select * from tblcamion";
    try {
        cnn = objC.Conexion();
        st = cnn.createStatement();
        rs = st.executeQuery(sql);
        
        // Clear the previous rows in the table model
        modelo = (DefaultTableModel) tblCamiones.getModel();
        modelo.setRowCount(0);  // Clear existing rows
        
        Object[] camion = new Object[7];
        while (rs.next()) {
            camion[0] = rs.getString("idemp");
            camion[1] = rs.getString("idcamion");
            camion[2] = rs.getString("placa");
            camion[3] = rs.getString("color");
            camion[4] = rs.getString("marca");
            camion[5] = rs.getString("anio");
            camion[6] = rs.getString("tipo");
            modelo.addRow(camion);  // Add new row
        }
        
        tblCamiones.setModel(modelo);
        cnn.close();
    } catch (SQLException ex) {
        System.out.println("Error es -->" + ex.getMessage());
    }
 }
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked
public void limpiarTabla(){
   DefaultTableModel modelo = (DefaultTableModel) tblCamiones.getModel();
    int filas = modelo.getRowCount(); // Obtén el número de filas actuales
    
    // Recorre y elimina las filas desde la última hasta la primera
    for (int i = filas - 1; i >= 0; i--) {
        modelo.removeRow(i);
    }
  }
 public void cargar_empresa(){
   Cls_Conexion objC = new Cls_Conexion();
    String sqlemp = "select * from empresa where idemp = '" + this.cboporempresa.getSelectedItem() + "'";
    Statement st1;
    ResultSet rs1;
    String sqlcam = "select * from tblcamion where idemp = '" + this.cboporempresa.getSelectedItem() + "'";

    try {
        cnn = objC.Conexion();

        // Cargar datos de la empresa
        st1 = cnn.createStatement();
        rs1 = st1.executeQuery(sqlemp);
        if (rs1.next()) {
            // Limpiar los campos de empresa antes de cargar nuevos datos
            this.txtemp.setText("");  // Limpiar el campo txtemp
            this.txtdis.setText("");  // Limpiar el campo txtdis
            this.txtemp.setText(rs1.getString("empresa"));
            this.txtdis.setText(rs1.getString("distrito"));
        }
    } catch (SQLException ex) {
        System.out.println("Error al cargar empresa: " + ex.getMessage());
    }

    // Limpiar el modelo de la tabla antes de cargar nuevos datos
    limpiarTabla();

    // Cargar datos de camiones
    Statement st2;
    ResultSet rs2;
    try {
        st2 = cnn.createStatement();
        rs2 = st2.executeQuery(sqlcam);
        Object[] camion = new Object[7];
        modelo = (DefaultTableModel) tblCamiones.getModel();

        // Asegurarse de que no haya filas duplicadas
        while (rs2.next()) {
            String idCamion = rs2.getString("idcamion");

            // Verificar si la fila ya existe en la tabla
            boolean exists = false;
            for (int i = 0; i < modelo.getRowCount(); i++) {
                if (modelo.getValueAt(i, 1).equals(idCamion)) {  // Comprobar si el idcamion ya está en la tabla
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                // Si no existe, agregar la nueva fila
                camion[0] = rs2.getString("idemp");
                camion[1] = idCamion;
                camion[2] = rs2.getString("placa");
                camion[3] = rs2.getString("color");
                camion[4] = rs2.getString("marca");
                camion[5] = rs2.getString("anio");
                camion[6] = rs2.getString("tipo");
                modelo.addRow(camion);
            }
        }

        tblCamiones.setModel(modelo);
        cnn.close();
    } catch (SQLException ex) {
        System.out.println("Error al cargar camiones: " + ex.getMessage());
    }
  }
    private void cboportipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboportipoActionPerformed
      limpiarTabla();
      Cls_Conexion objC = new Cls_Conexion();
    Statement st;
    ResultSet rs;
    
    // Usa un PreparedStatement para evitar problemas de inyección SQL
    String sql = "SELECT * FROM tblcamion WHERE tipo = ?";
    try {
        cnn = objC.Conexion();
        PreparedStatement ps = cnn.prepareStatement(sql);
        ps.setString(1, this.cboportipo.getSelectedItem().toString()); // Pasa el parámetro seleccionado
        
        rs = ps.executeQuery(); // Ejecuta la consulta preparada
        
        // Prepara el modelo de la tabla
        modelo = (DefaultTableModel) tblCamiones.getModel();
        
        // Procesa los resultados
        Object[] camion = new Object[7];
        while (rs.next()) {
            camion[0] = rs.getString("idemp");
            camion[1] = rs.getString("idcamion");
            camion[2] = rs.getString("placa");
            camion[3] = rs.getString("color");
            camion[4] = rs.getString("marca");
            camion[5] = rs.getString("anio");
            camion[6] = rs.getString("tipo");
            modelo.addRow(camion); // Agrega una fila por cada resultado
        }
        
        tblCamiones.setModel(modelo); // Asocia el modelo a la tabla
        cnn.close(); // Cierra la conexión
    } catch (SQLException ex) {
        System.out.println("Error es --> " + ex.getMessage());
    }
    }//GEN-LAST:event_cboportipoActionPerformed

    private void btnTodosCamionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosCamionesActionPerformed
        listadogeneral();
    }//GEN-LAST:event_btnTodosCamionesActionPerformed

    private void cboporempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboporempresaActionPerformed
        cargar_empresa();
    }//GEN-LAST:event_cboporempresaActionPerformed
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
            java.util.logging.Logger.getLogger(CamionesSQLite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CamionesSQLite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CamionesSQLite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CamionesSQLite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CamionesSQLite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTodosCamiones;
    private javax.swing.JComboBox<String> cboporempresa;
    private javax.swing.JComboBox<String> cboportipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCamiones;
    private javax.swing.JTextField txtdis;
    private javax.swing.JTextField txtemp;
    // End of variables declaration//GEN-END:variables
}
