package discretestructureproject3;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Discrete extends javax.swing.JFrame {

    public static int N;
public static Stack<Integer>[] tower = new Stack[4]; 

    void toh(int n){
         for (int d = n; d > 0; d--)
             tower[1].push(d);
         display();
         move(n, 1, 2, 3);         
     }
    
    void move(int n, int a, int b, int c)
     {
         if (n > 0)
         {
             move(n-1, a, c, b);     
             int d = tower[a].pop();                                             
             tower[c].push(d);
             display();                   
             move(n-1, b, a, c);     
         }         
     }
    
    void display()
     {
         for(int i = N - 1; i >= 0; i--)
         {
             String d1 = " ", d2 = " ", d3 = " ";
             try
             {
                 d1 = String.valueOf(tower[1].get(i));
             }
             catch (Exception e){
             }    
             try
             {
                 d2 = String.valueOf(tower[2].get(i));
             }
             catch(Exception e){
             }
             try
             {
                 d3 = String.valueOf(tower[3].get(i));
             }
             catch (Exception e){
             }
              
             jTextArea1.setText(jTextArea1.getText()+  "---------------"+ "\n" + " " +d1+ "  |  " +d2+ "  |  " +d3+ "\n" ); 
             
         }
         
     }
    
     public static List<String> sierpinski(int a)
    {
        List<String> down = Arrays.asList("*");
        String space = " ";
        for (int i = 0; i < a; i++) {
            List<String> newDown = new ArrayList<String>();
            for (String x : down)
                newDown.add(space + x + space);
            for (String x : down)
                newDown.add(x + " " + x);
 
            down = newDown;
            space += space;
        }
        return down;
    }
    
    public String Ceasar(String msg){
    String s = "";
    int len = msg.length();
    for(int x = 0; x < len; x++){
        char c = (char)(msg.charAt(x)+3);
        if (c > 'z')
            s += (char)(msg.charAt(x) - (26-3));
        else
            s += (char)(msg.charAt(x) + 3);
    }
    return s;
}
     
    public Discrete() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/d3.png"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Problem 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Problem 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Problem 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Problem 3", "Diamond Boxes", "Square Spiral" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea1.setText(null);
        int num=Integer.parseInt(JOptionPane.showInputDialog("Enter number of disks : "));
         tower[1] = new Stack<Integer>();
         tower[2] = new Stack<Integer>();
         tower[3] = new Stack<Integer>();
         N = num;
         toh(num);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jTextArea1.setText(null);
        int n=Integer.parseInt(JOptionPane.showInputDialog("Enter the Value : "));      
        for (String x : sierpinski(n)){
            jTextArea1.setText(jTextArea1.getText() + "\n" +x);
        }
               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex()==1 ) {
                jTextArea1.setText(null);
        int b=Integer.parseInt(JOptionPane.showInputDialog("Enter the Value : (ideal value is 200) "));
        Graphics g = jTextArea1.getGraphics();
            for (int i = 0; i < 1; i++) {
            g.drawLine(0, 0, b, 0);       
            g.drawLine(b, 0, b, b);      
            g.drawLine(0, b, b, b);     
            g.drawLine(0, 0, 0, b);        
            
            g.drawLine(b/2, 0, b, b/2);        
            g.drawLine(b, b/2, b/2, b);     
            g.drawLine(0, b/2, b/2, b);     
            g.drawLine(b/2, 0, 0, b/2);     
            
            g.drawLine(b/4, b/4, b/4*3, b/4);      
            g.drawLine(b/4*3, b/4, b/4*3, b/4*3);   
            g.drawLine(b/4, b/4*3, b/4*3, b/4*3);      
            g.drawLine(b/4, b/4, b/4, b/4*3);       
            
            g.drawLine(b/2, b/4, b/4*3, b/2);       
            g.drawLine(b/4*3, b/2, b/2, b/4*3);      
            g.drawLine(b/4, b/2, b/2, b/4*3);     
            g.drawLine(b/4, b/2, b/2, b/4);      
            
            
            g.drawLine(b/8*3, b/8*3, b/8*5, b/8*3);       
            g.drawLine(b/8*5, b/8*3, b/8*5, b/8*5);     
            g.drawLine(b/8*3, b/8*5, b/8*5, b/8*5);      
            g.drawLine(b/8*3, b/8*3, b/8*3, b/8*5); 
            }

                }
             else if (jComboBox1.getSelectedIndex()==2) {
                  jTextArea1.setText(null);
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter the Value : (ideal value is 20)"));
         Graphics g = jTextArea1.getGraphics();
         int n=a*10*2;
        for (int i = 0; i < a; i++) {
            g.drawLine(      10*i,   10 + 10*i, n - 10*i,  10 + 10*i); 
            g.drawLine(n - 10*i,   10 + 10*i, n - 10*i, n - 10*i);  
            g.drawLine( 10 + 10*i,  n - 10*i, n - 10*i, n - 10*i); 
            g.drawLine( 10 + 10*i,   20 + 10*i,  10 + 10*i, n - 10*i);  
        }
                
                

                }
            
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextArea1.setText(null);
        String message=JOptionPane.showInputDialog("Enter text here : ");
        Discrete d1=new Discrete();
        jTextArea1.setText(d1.Ceasar(message));
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Discrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Discrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Discrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Discrete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Discrete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
