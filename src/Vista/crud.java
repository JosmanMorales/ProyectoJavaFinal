
package Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
public class crud extends JFrame implements ActionListener{
    
    
    
    users mod;
    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    private TableRowSorter trsfiltro;
    
    
    /**
     * Creates new form crud
     */
    
    LoginForm fl = new LoginForm();
    public crud() {
        initComponents();
        
    }
    
     public void insertarDatos (){
        try {
            String Query = "INSERT INTO producto (codigoProducto,nombreProducto,precioUnitario,cantidadProducto,fechaVencimiento) VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(Query);
            ps.setString(1, CodigoProducto.getText());
            ps.setString(2, NombreProducto.getText());
            ps.setString(3, PrecioUnitario.getText());
            ps.setString(4, CantidadProducto.getText());
            ps.setString(5, FechaVencimiento.getText());
            ps.execute();
            System.out.println("Datos Guardados correctamente.");
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudieron guardar los datos."+ e.getMessage());
            
        }
    }
   
     
      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CodigoProducto = new javax.swing.JTextField();
        NombreProducto = new javax.swing.JTextField();
        PrecioUnitario = new javax.swing.JTextField();
        CantidadProducto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FechaVencimiento = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setText("Codigo Producto");

        jLabel2.setText("Nombre Producto");

        PrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioUnitarioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio Unitario");

        jLabel4.setText("Cantidad Producto");

        jLabel5.setText("Fecha Vencimiento");

        FechaVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaVencimientoActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setText("Buscar Codigo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 102));
        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setText("Insertar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton6.setBackground(new java.awt.Color(255, 204, 51));
        jButton6.setText("Mostrar Datos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 204, 255));
        jButton7.setText("Buscar Nombre");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/bill.png"))); // NOI18N
        jButton8.setText("Reporte");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/invoice.png"))); // NOI18N
        jButton9.setText("Factura");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/drink-water.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/switch (1).png"))); // NOI18N
        jButton10.setText("Salir");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton7)))
                                        .addGap(229, 229, 229))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8)
                                        .addGap(45, 45, 45))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PrecioUnitario)
                                    .addComponent(NombreProducto)
                                    .addComponent(CodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel5)
                                                    .addComponent(FechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel4)
                                                .addComponent(CantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(9, 9, 9)
                                .addComponent(PrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioUnitarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    limpiar();
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FechaVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaVencimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaVencimientoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     insertarDatos();
        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        cargarTabla();
   
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscar();
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        actualizar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        buscar2();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        mostrarReporte();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        generarFactura();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crud().setVisible(true);
            }
        });
    }
    
    
    public void cargarTabla(){
        String [] encabezado = {"codigoProducto", "nombreProducto", "precioUnitario", "cantidadProducto","fechaVencimiento"};
        String [] contRegistro = new String[10];
        DefaultTableModel modelo = new DefaultTableModel(null, encabezado);
        String Query = ("select * from producto");
        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(Query);
               
            while(rs.next()){
               
                contRegistro[0] = rs.getString("codigoProducto");
                contRegistro[1] = rs.getString("nombreProducto");
                contRegistro[2] = rs.getString("precioUnitario");
                contRegistro[3] = rs.getString("cantidadProducto");
                contRegistro[4] = rs.getString("fechaVencimiento");
                modelo.addRow(contRegistro);
            }

            tabla.setModel(modelo);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
   public void buscar() {
    try {
        // Corrige la consulta SQL agregando el operador de comparación "=" y el marcador de posición "?"
        ps = con.prepareStatement("SELECT nombreProducto, precioUnitario, cantidadProducto, fechaVencimiento FROM producto WHERE codigoProducto = ?");
        ps.setString(1, CodigoProducto.getText()); // Coloca el valor del JTextField CodigoProducto en el primer marcador de posición
        rs = ps.executeQuery();

        if (rs.next()) {
            // Llena los JTextFields con los datos obtenidos de la base de datos
            NombreProducto.setText(rs.getString("nombreProducto"));
            PrecioUnitario.setText(rs.getString("precioUnitario"));
            CantidadProducto.setText(rs.getString("cantidadProducto"));
            FechaVencimiento.setText(rs.getString("fechaVencimiento"));
        } else {
            JOptionPane.showMessageDialog(null, "No existe ningún producto con ese código!");
        }

    } catch (Exception e) {
        System.err.println("Error al realizar la búsqueda: " + e);
        JOptionPane.showMessageDialog(null, "Error al realizar la búsqueda: " + e.getMessage());
    }
}
   
   public void buscar2(){
    try {
        // Corrige la consulta SQL agregando el operador de comparación "=" y el marcador de posición "?"
        ps = con.prepareStatement("SELECT codigoProducto, precioUnitario, cantidadProducto, fechaVencimiento FROM producto WHERE nombreProducto = ?");
        ps.setString(1, NombreProducto.getText()); // Coloca el valor del JTextField CodigoProducto en el primer marcador de posición
        rs = ps.executeQuery();

        if (rs.next()) {
            // Llena los JTextFields con los datos obtenidos de la base de datos
            CodigoProducto.setText(rs.getString("codigoProducto"));
            PrecioUnitario.setText(rs.getString("precioUnitario"));
            CantidadProducto.setText(rs.getString("cantidadProducto"));
            FechaVencimiento.setText(rs.getString("fechaVencimiento"));
        } else {
            JOptionPane.showMessageDialog(null, "No existe ningún producto con ese código!");
        }

    } catch (Exception e) {
        System.err.println("Error al realizar la búsqueda: " + e);
        JOptionPane.showMessageDialog(null, "Error al realizar la búsqueda: " + e.getMessage());
    }
}
  public void eliminar() {
    try {
        
        String codigo = CodigoProducto.getText();        
        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa el código del producto a eliminar.");
            return;
        }      
        String Query = "DELETE FROM producto WHERE codigoProducto = ?";              
        PreparedStatement ps = con.prepareStatement(Query);
        ps.setString(1, codigo);         
        int num = ps.executeUpdate();       
        if (num > 0) {
            System.out.println("Se eliminó el producto con código: " + codigo);
            JOptionPane.showMessageDialog(null, "Producto eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún producto con ese código.");
        }
        
    } catch (Exception e) {
        System.out.println("ERROR al eliminar el producto.");
        JOptionPane.showMessageDialog(null, "ERROR, no se pudo eliminar el producto. " + e.getMessage());
    }
}
  
    public void actualizar() {
    int rowSelect = tabla.getSelectedRow();  // Obtener la fila seleccionada en la tabla
    if (rowSelect == -1) {  // Verificar que se haya seleccionado una fila
        JOptionPane.showMessageDialog(null, "Por favor selecciona un producto de la tabla para actualizar.");
        return;
    }

    try {
        // Consulta SQL para actualizar
        String Query = "UPDATE producto SET nombreProducto = ?, precioUnitario = ?, cantidadProducto = ?, fechaVencimiento = ? WHERE codigoProducto = ?";
        PreparedStatement ps = con.prepareStatement(Query);

        // Obtener el valor de "codigoProducto" desde la tabla o un JTextField
        String codigoProducto = (String) tabla.getValueAt(rowSelect, 0); // Suponiendo que el código está en la primera columna

        // Establecer los valores en el PreparedStatement
        ps.setString(1, NombreProducto.getText());          // Establecer nombreProducto
        ps.setDouble(2, Double.parseDouble(PrecioUnitario.getText())); // Establecer precioUnitario, convirtiéndolo a double
        ps.setInt(3, Integer.parseInt(CantidadProducto.getText()));    // Establecer cantidadProducto, convirtiéndolo a int
        ps.setString(4, FechaVencimiento.getText());         // Establecer fechaVencimiento
        ps.setString(5, codigoProducto);                     // Establecer código del producto en la condición WHERE

        // Ejecutar la actualización
        int rowsUpdated = ps.executeUpdate();

        // Comprobar si se realizó la actualización
        if (rowsUpdated > 0) {
            System.out.println("Datos actualizados");
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente.");
            
            
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún producto con el código proporcionado.");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR, no se actualizaron los datos: " + e.getMessage());
    }
}

   public void limpiar(){
        CodigoProducto.setText(""); 
        NombreProducto.setText(""); 
        PrecioUnitario.setText(""); 
        CantidadProducto.setText(""); 
        FechaVencimiento.setText(""); 
    }
   
   
   public void mostrarReporte() {
    StringBuilder reporte = new StringBuilder();
    String Query = "SELECT * FROM producto";

    try {
        Statement st = con.createStatement();
        rs = st.executeQuery(Query);

        // Agregar encabezado al reporte
        reporte.append("Reporte de Productos:\n");
        reporte.append("--------------------------------------------------------------------------\n");
        reporte.append(String.format("%-15s %-20s %-15s %-15s %-15s\n", 
            "codigoProducto", "nombreProducto", "precioUnitario", "cantidadProducto", "fechaVencimiento"));
        reporte.append("--------------------------------------------------------------------------\n");

        // Agregar cada registro al reporte
        while (rs.next()) {
            String codigoProducto = rs.getString("codigoProducto");
            String nombreProducto = rs.getString("nombreProducto");
            String precioUnitario = rs.getString("precioUnitario");
            String cantidadProducto = rs.getString("cantidadProducto");
            String fechaVencimiento = rs.getString("fechaVencimiento");

            reporte.append(String.format("%-15s %-20s %-15s %-15s %-15s\n", 
                codigoProducto, nombreProducto, precioUnitario, cantidadProducto, fechaVencimiento));
        }

        // Mostrar el reporte en un JOptionPane
        JTextArea textArea = new JTextArea(reporte.toString());
        textArea.setEditable(false);
        JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Reporte de Productos", JOptionPane.INFORMATION_MESSAGE);

    } catch (SQLException e) {
        System.err.println("Error al generar el reporte: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error al generar el reporte: " + e.getMessage());
    }
}
   
   public void generarFactura() {
    String nombreEmpresa = "Purificadora Fuente Bella";
    String direccionEmpresa = "Av. Central, Ciudad Guatemala";
    String correoEmpresa = "contacto@fuente-bella.com";
    String telefonoEmpresa = "(502) 4566-7890";
    
    StringBuilder factura = new StringBuilder();
    factura.append("-------------------------------------------------\n");
    factura.append("                 " + nombreEmpresa + "\n");
    factura.append("              Dirección: " + direccionEmpresa + "\n");
    factura.append("              Correo: " + correoEmpresa + "\n");
    factura.append("              Teléfono: " + telefonoEmpresa + "\n");
    factura.append("-------------------------------------------------\n\n");
    factura.append("Detalles del Producto:\n");
    factura.append("Código Producto: " + CodigoProducto.getText() + "\n");
    factura.append("Nombre Producto: " + NombreProducto.getText() + "\n");
    factura.append("Precio Unitario: " + PrecioUnitario.getText() + "\n");
    factura.append("Cantidad: " + CantidadProducto.getText() + "\n");
    factura.append("Fecha Vencimiento: " + FechaVencimiento.getText() + "\n");
    factura.append("-------------------------------------------------\n");

    double precioUnitario = Double.parseDouble(PrecioUnitario.getText());
    int cantidad = Integer.parseInt(CantidadProducto.getText());
    double total = precioUnitario * cantidad;

    factura.append(String.format("Total a Pagar: %.2f\n", total));
    factura.append("-------------------------------------------------\n");
    factura.append("             Gracias por su preferencia\n");
    factura.append("-------------------------------------------------\n");

    JTextArea textArea = new JTextArea(factura.toString());
    textArea.setEditable(false);
    JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Factura de Compra", JOptionPane.INFORMATION_MESSAGE);
}

   
   
   
   
   
   
   
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantidadProducto;
    private javax.swing.JTextField CodigoProducto;
    private javax.swing.JTextField FechaVencimiento;
    private javax.swing.JTextField NombreProducto;
    private javax.swing.JTextField PrecioUnitario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
