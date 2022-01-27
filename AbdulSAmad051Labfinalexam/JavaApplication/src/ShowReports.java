
import java.awt.Toolkit;
import static java.awt.event.KeyEvent.VK_BACK_SPACE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ShowReports extends javax.swing.JFrame {

    
    public ShowReports() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        stu_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg No", "Name", "Class", "Section", "Report"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        stu_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_idActionPerformed(evt);
            }
        });
        stu_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stu_idKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reg No");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 14)); // NOI18N
        jButton3.setText("Check");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");

        error.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stu_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public Boolean nullCheck() {

       PreparedStatement stmt = null;
       ResultSet rs = null;
       String qry = "SELECT * From reports ";
       

       try {
           Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/scdpaper","root",""); 
            stmt = (PreparedStatement) conn.prepareStatement(qry);
            rs =  stmt.executeQuery();
            int count = 0;
            while(rs.next()){
               count++;
            }
            if(count == 0){ 
               return true;
            }else
                return false;
            
       } catch (SQLException ex) {
             System.out.println("Error : " + ex);
        return true;
       }
 }
public void search()
{
DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        table.setRowCount(0);
            try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scdpaper", "root", "");
        Statement san = conn.createStatement();
        String st_id = String.valueOf(stu_id.getText());
        String query = "select r.id,r.name,r.section,r.program,r.status from reports r where r.id = "+st_id+";";
        ResultSet rs =  san.executeQuery(query);
       
        while(rs.next())
        {
        String id = String.valueOf(rs.getInt("id"));
        String name =  rs.getString("name");
        String program =  rs.getString("program");
        String section =  rs.getString("section");
        String status =  rs.getString("status");
        
        String [] tbData = {id,name,program,section,status};
       
        table.addRow(tbData);
        }
        }
        catch(Exception e)
        {
            String error = e.toString();
            String[] err = error.split(":");
            JOptionPane.showMessageDialog(rootPane,"Error because" + err[1]);
        }
        

}

    private void stu_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stu_idKeyTyped
       
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {

            if (c == VK_BACK_SPACE) {
                error.setText("");
            } else {
                Toolkit.getDefaultToolkit().beep();
                error.setText("*Roll no must be Integer");
                evt.consume();
            }
        } else {
            error.setText("");
        }
    }//GEN-LAST:event_stu_idKeyTyped
  public boolean checks_student(String id){
     {
    try {
            
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/scdpaper","root",""); 
            PreparedStatement ps = con.prepareCall("select * from reports where id='"+id+"';");
            
            ResultSet rs = ps.executeQuery();
         if(rs.next())
         {  return true;}
         else
             return false;

        
        
        } catch (Exception ex) {
            String error = ex.toString();
            String[] err = error.split(":");
            JOptionPane.showMessageDialog(rootPane,"Error because" + err[1]);
        return false;
        }
    
     }   
     }
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String id= stu_id.getText();
        boolean boo_chk =checks_student(id) ;

        if( !boo_chk )
        {

            JOptionPane.showMessageDialog(rootPane,"Student with this id does not exists ");
            stu_id.setText("");

        }
        else{
            if(stu_id.getText().isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Please Enter Student ID to Search");
            else
            {
                if(nullCheck()){
                    JOptionPane.showMessageDialog(null, "No entries available in database to show ", "Empty Database", JOptionPane.INFORMATION_MESSAGE);
                    stu_id.setText("");
                }
                else{
                    search();
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
 public void Table() {
     DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
     table.setRowCount(0); 
     if(nullCheck())
    {
      JOptionPane.showMessageDialog(null, "No entries available in database to show ", "Empty Database", JOptionPane.INFORMATION_MESSAGE);
    }
    else{
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scdpaper", "root", "");
            Statement san = conn.createStatement();
            String query = "select * from reports";
            ResultSet rs =  san.executeQuery(query);
            while(rs.next())
            {
                String stu_roll = String.valueOf(rs.getInt("id"));
                String stu_name = rs.getString("name");
                String stu_program =  rs.getString("program");
                String stu_section =  rs.getString("section");
                String stu_status =  rs.getString("status");
                
                String [] tbData = {stu_roll,stu_name,stu_program,stu_section,stu_status};

               
                table.addRow(tbData);
            }
        }
        catch(Exception e)
        {
            String error = e.toString();
            String[] err = error.split(":");
            JOptionPane.showMessageDialog(rootPane,"Error because" + err[1]);
        }
    }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Table();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void stu_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stu_idActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField stu_id;
    // End of variables declaration//GEN-END:variables
}
