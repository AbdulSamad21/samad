
import java.awt.Toolkit;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class RepostStudent extends javax.swing.JFrame {

   
    public RepostStudent() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        positive = new javax.swing.JRadioButton();
        negative = new javax.swing.JRadioButton();
        ID = new javax.swing.JTextField();
        NAME = new javax.swing.JTextField();
        pro = new javax.swing.JTextField();
        Sec = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        error3 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 50, 24));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Section");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 50, 24));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Regisration No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, 24));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Department");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, 24));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Report");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 214, 58, 22));

        buttonGroup1.add(positive);
        positive.setText("Positive");
        getContentPane().add(positive, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 213, -1, -1));

        buttonGroup1.add(negative);
        negative.setText("Negative");
        getContentPane().add(negative, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 213, -1, -1));

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IDKeyTyped(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 158, -1));

        NAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEActionPerformed(evt);
            }
        });
        NAME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NAMEKeyTyped(evt);
            }
        });
        getContentPane().add(NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 158, -1));

        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });
        pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                proKeyTyped(evt);
            }
        });
        getContentPane().add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 158, -1));

        Sec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SecKeyTyped(evt);
            }
        });
        getContentPane().add(Sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 158, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 254, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 254, -1, -1));

        error3.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(error3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 170, 20));

        error1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 170, 20));

        error.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 160, 15));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public int addData(String id, String name,String sec,String pro,String status){
       int i=0;
             try
        {

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scdpaper", "root", "");

            Statement san = conn.createStatement();
           i =san.executeUpdate("INSERT into reports (id,name,section,program,status) VALUES ('"+id+"','"+name+"','"+sec+"','"+pro+"','"+status+"')");
            
            JOptionPane.showMessageDialog(rootPane,"Reported  Successfully ");

        return i;
        }
        catch(Exception e)
        {
            String error = e.toString();
            String[] err = error.split(":");
            JOptionPane.showMessageDialog(rootPane,"Sorry could not report  because" + err[1]);
            return i;
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     
        String id = ID.getText();
        String name=NAME.getText() ;
        String sec=Sec.getText();
        String pr=pro.getText();
       String status = null;
        
        if(positive.isSelected())
           status = "positive";
        if(negative.isSelected())
           status = "Negative";
    if(ID.getText().isEmpty() || NAME.getText().isEmpty() || Sec.getText().isEmpty()|| pro.getText().isEmpty()){
       JOptionPane.showMessageDialog(rootPane, "All fields should be entered ");
    }
        else
         addData( id,  name, sec,pr, status);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Student s = new Student();
        s.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IDKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            
                        
            if(c== VK_BACK_SPACE){
           error.setText("");
        }else{
            Toolkit.getDefaultToolkit().beep();
         error.setText("* ID must be Integer");
         evt.consume();}
     
        }
        else
         error.setText("");
    }//GEN-LAST:event_IDKeyTyped

    private void NAMEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NAMEKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
                      
            if(c== VK_BACK_SPACE){
           error1.setText("");
        }else{
            Toolkit.getDefaultToolkit().beep();
         error1.setText("*Name Must Be Character ");
         evt.consume();
            }
        }
        else
         error1.setText("");
    }//GEN-LAST:event_NAMEKeyTyped

    private void SecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SecKeyTyped
        // TODO add your handling code here:
      
    }//GEN-LAST:event_SecKeyTyped

    private void proKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)){
                      
            if(c== VK_BACK_SPACE){
           error3.setText("");
        }else{
            Toolkit.getDefaultToolkit().beep();
         error3.setText("*Program Must Be Character ");
         evt.consume();
            }
        }
        else
         error3.setText("");
    }//GEN-LAST:event_proKeyTyped

    private void proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proActionPerformed

    private void NAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RepostStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField NAME;
    private javax.swing.JTextField Sec;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton negative;
    private javax.swing.JRadioButton positive;
    private javax.swing.JTextField pro;
    // End of variables declaration//GEN-END:variables
}
