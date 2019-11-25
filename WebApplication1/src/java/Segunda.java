/*
 * Segunda interfase del programa el cual muestra los nodos y aristas que conforman el nodo seleccionado y además tiene una sección donde se ve lo que contiene
 * el grafo y por otro lado un panel en el cual se muestra el grafo creado 
 */
import java.util.ArrayList;
import java.util.Arrays;
import static javafx.beans.binding.Bindings.and;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.JOptionPane;
/**
 *
 * @author leona
 */
public class Segunda extends javax.swing.JFrame {
    /**
    * Definimos las variables que controlaran las listas en donde se visualizaran las aristas y nodos además el árbol también se define ahí y varias variables más
    */
    public DefaultListModel nodosmodel = new DefaultListModel();
    public DefaultListModel aristasmodel = new DefaultListModel();
    public DefaultMutableTreeNode grafostree = new DefaultMutableTreeNode("Grafo");
    static public int contador;
    public DefaultTreeModel modelo = new DefaultTreeModel(grafostree);
    DefaultMutableTreeNode nodo = new DefaultMutableTreeNode();  
    DefaultMutableTreeNode aristas = new DefaultMutableTreeNode();
    public String name;
    public String [] lista = null;
    
    /**
     *
     */
     
    /**
     * Inicializa los componentes y define un grupo de radiobutton para poder seleccionar solo uno y de agrega un modelo al árbol
     */
    public Segunda() {
        
        initComponents();
        //radio botones para el boton de borrar
        jRadioButton1.setSelected(true);
        jRadioButton2.setSelected(false);
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(jRadioButton1);
        grupo1.add(jRadioButton2);
        
        
        
        jTree1.setModel(modelo);
        
        
    }
    /**
        * Recibe el nombre del grafo que se abrio en la interfase anterior
        */
    public void name(String nombre){
        name= nombre;
        nombrelabel.setText(name);
        nombrelabel.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombrelabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton2 = new javax.swing.JButton();
        IDNODO1 = new javax.swing.JTextField();
        IDNODO2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        BORRARID = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombrelabel.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        nombrelabel.setText("Grafo #");

        jButton1.setText("Crear Nodo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jTree1);

        jButton2.setText("Crear Arista");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        IDNODO1.setText("ID NODO 1");
        IDNODO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDNODO1ActionPerformed(evt);
            }
        });

        IDNODO2.setText("ID NODO 2");

        jButton3.setText("Borrar Todo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Nodos");

        jRadioButton2.setText("Aristas");

        jButton4.setText("Borrar por ID");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        BORRARID.setText("ID");

        jButton5.setText("Visualizar Grafo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jScrollPane3.setViewportView(jList2);

        jLabel2.setText("Nodos");

        jLabel3.setText("Aristas");

        jLabel4.setText("______________________________________________________________________");

        jLabel5.setText("______________________________________________________________________");

        jLabel6.setText("______________________________________________________________________");

        jLabel7.setText("______________________________________________________________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(nombrelabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(BORRARID, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2)
                        .addGap(193, 193, 193)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(54, 54, 54)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDNODO1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(IDNODO2)))
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombrelabel)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDNODO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDNODO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButton3)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(BORRARID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDNODO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDNODO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDNODO1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       /**
        * Crea nodos en el grafo y lo crea a su ves en el res api
        */
        int i=0;
        
        nodosmodel.addElement("Nodo "+contador);
        jList1.setModel(nodosmodel); 
        nodo = new DefaultMutableTreeNode("Nodo "+ contador);
        modelo.insertNodeInto(nodo, grafostree,0);            
        contador++;
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       /**
        * Esta función cera dos listas que posteriormente se pasara a una matriz para lograr exportar el grafo a un archivo csv, un archivo html recibe 
        * ese archivo y separa la matriz en dos listas nodos y grafos para poder crear el grafo que se mostrara en el panel
        */
        String [] nodos = new String [nodosmodel.getSize()];
        String [] aristas = new String [aristasmodel.getSize()];
        
        int i=0;
        while(i<nodosmodel.getSize()){
            nodos[i] = nodosmodel.elementAt(i).toString();
            i++;
        }
        i=0;
        while(i<aristasmodel.getSize()){
            aristas[i] = aristasmodel.elementAt(i).toString();
            i++;
        }
        
        System.out.println(Arrays.toString(nodos));
        System.out.println(Arrays.toString(aristas));
        i=0;
        int j=0;
        int celda =0;
        if (nodosmodel.getSize()<aristasmodel.getSize()){
            celda=aristasmodel.getSize();
        }
        else{ celda=nodosmodel.getSize(); 
        }
        
        
        Object[][] datos = new Object [2][celda];
        
        
            while (j<nodosmodel.getSize()){
                datos[0][j] = nodos[j];
                j++;
            }
            j=0;
            while (j<aristasmodel.getSize()){
                datos[1][j] = aristas[j];
                j++;
            }
        
        i=0;    
        int k=0;
        j=0;
        while(i<aristasmodel.getSize()){
            k=0;
            j=0;
            lista= new String[2];
            while(j<nodosmodel.getSize()){
            if(datos[1][i].toString().contains(datos[0][j].toString())){
                lista[k]= Integer.toString(j) ;
                k++;
                System.out.println("Paso igual");
                }
            j++;
            System.out.println("Paso ciclo");
        }
            
         if (lista[1]== null){
         lista[1] = lista[0];
                 }
         System.out.println("Paso iguialdad");
         datos[1][i]=Arrays.toString(lista);
         
        i++;}
        
        System.out.println(Arrays.toString(datos[0]));
        System.out.println(Arrays.toString(datos[1]));
        
        CrearFicherosExcel pasar=new CrearFicherosExcel();
        pasar.pasar_csv(datos,nodosmodel.getSize(),aristasmodel.getSize());
        
        
        
        
        
        //Visualizar grafo
        SwingBrowser browser = new SwingBrowser();
        browser.loadURL("file:///C:/Users/leona/Desktop/index.html");
        browser.setBounds(1, 1, jPanel1.getWidth() - 1, jPanel1.getHeight() - 1);
        jPanel1.add(browser);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /**
        * Crea aristas en el grafo y lo crea a su ves en el res api con los nodos que se encuenten en las entradas respectivas, revisa que los nodos existan
        */
        int k=0;
        int j=0;
        int i=0;
        while(i<aristasmodel.getSize()){
            if(IDNODO1.getText() == null ? aristasmodel.elementAt(i).toString() == null : IDNODO1.getText().equals(aristasmodel.elementAt(i).toString()) ){
                j=1;
                }
            i++;
            }
        i=0;
        while(i<nodosmodel.getSize()){
            if(IDNODO1.getText() == null ? nodosmodel.elementAt(i).toString() == null : IDNODO1.getText().equals(nodosmodel.elementAt(i).toString()) ){
                j=1;
                }
            i++;
            }
        while(i<aristasmodel.getSize()){
            if(IDNODO2.getText() == null ? aristasmodel.elementAt(i).toString() == null : IDNODO2.getText().equals(aristasmodel.elementAt(i).toString()) ){
                k=1;
                }
            i++;
            }
        i=0;
        while(i<nodosmodel.getSize()){
            if(IDNODO2.getText() == null ? nodosmodel.elementAt(i).toString() == null : IDNODO2.getText().equals(nodosmodel.elementAt(i).toString()) ){
                k=1;
                }
            i++;
            }
        if(j == 1 & k == 1){
            aristasmodel.addElement(IDNODO1.getText()+"-"+IDNODO2.getText());
            jList2.setModel(aristasmodel); 
            aristas = new DefaultMutableTreeNode(IDNODO1.getText()+","+IDNODO2.getText());
            modelo.insertNodeInto(aristas, grafostree,0);    
    }
        else{
            System.out.println("Algún nodo no existe");
            JOptionPane.showMessageDialog(null, "No se puede crear arista, Algún nodo no existe");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /**
        * Se borran los nodos o las aristas dependiendo de cual radiobotton esta seleccionado
        */
        ; 
         if(jRadioButton1.isSelected()){
            nodosmodel.clear();
            jList1.setModel(nodosmodel);
            
            modelo.removeNodeFromParent(nodo);
            
         }
         
         if(jRadioButton2.isSelected()){
            aristasmodel.clear();
            jList2.setModel(aristasmodel); 
            modelo.removeNodeFromParent(aristas);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        /**
        * Borra un nodo o una arista la cual se toma como referencia por su nombre o ID 
        */
        String borrar = BORRARID.getText();
        int i =0;
        
        while(i<nodosmodel.size()){
            if (nodosmodel.elementAt(i).toString() == null ? borrar == null : nodosmodel.elementAt(i).toString().equals(borrar)){
                nodosmodel.removeElementAt(i);
                jList1.setModel(nodosmodel);
            }
            i++;
            
        }
        i=0;
        while(i<aristasmodel.size()){
            if (aristasmodel.elementAt(i).toString() == null ? borrar == null : aristasmodel.elementAt(i).toString().equals(borrar)){
                aristasmodel.removeElementAt(i);
                jList2.setModel(aristasmodel);
                
            }
            i++;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * Función principar que mantiene en un ciclo el cual actualiza la interfase a cada momento
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
            java.util.logging.Logger.getLogger(Segunda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Segunda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Segunda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Segunda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Segunda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BORRARID;
    private javax.swing.JTextField IDNODO1;
    private javax.swing.JTextField IDNODO2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel nombrelabel;
    // End of variables declaration//GEN-END:variables
}
