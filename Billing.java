import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Billing extends javax.swing.JFrame {

    int i=0;
    float total=0;
    DefaultTableModel mod;
    public Billing(String s) {
        initComponents();
        ll1.setText(s);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf = new javax.swing.JTextArea();
        b4 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        ll = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        b6 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        l6 = new javax.swing.JLabel();
        ll1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        bsearch = new javax.swing.JButton();
        d2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        l2.setText("Enter Name");

        t1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        l1.setText("ID");

        t2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ob_browser.gif"))); // NOI18N
        b1.setText("Verify");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr.No", "Product Name", "Quantity", "Price"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        tf.setColumns(20);
        tf.setRows(5);
        jScrollPane2.setViewportView(tf);

        b4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        b4.setText("Print");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        b3.setText("Clear");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        b5.setText("Genrate Bill");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        ll.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N

        l3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        l3.setText("Product Name");

        t3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        l4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        l4.setText("Quantity");

        t4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        l5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        l5.setText("Price");

        t5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        b6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        b6.setText("Update");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        b2.setText("Add To List");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vertical_close.png"))); // NOI18N
        b7.setText("Remove");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        b8.setText("Delete");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        l6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        l6.setText("ID");

        ll1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Police Canteen Of");

        d1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        d1.setText("Date");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Time");

        time.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        bsearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ob_browser.gif"))); // NOI18N
        bsearch.setText("Search");
        bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearchActionPerformed(evt);
            }
        });

        d2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        d2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d2ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo231.png"))); // NOI18N
        jLabel3.setAutoscrolls(true);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Register Police");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bsearch)
                            .addGap(39, 39, 39))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(b7)
                                    .addGap(80, 80, 80)
                                    .addComponent(b1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addComponent(ll, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(b8)
                                .addGap(150, 150, 150)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(191, 191, 191)
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ll1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l1))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(b1)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsearch)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(465, 465, 465))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(ll1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3)
                            .addComponent(b8)
                            .addComponent(b5))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        try{
            tf.print();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        int c = mod.getRowCount();
        i=0;
        for(int j = c - 1 ; j >= 0 ; j--)
        {
            mod.removeRow(i);
        }
        id.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        tf.setVisible(true);
        b4.setVisible(true);
      
       java.util.Date d = new Date();
       String s1,s2,s3,s6;
       s6=d2.getText();
       java.sql.Date sqld = null;
       int s4;
       long ms = 0;
       Connection con;
       PreparedStatement ps;
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       String date1 = sdf.format(d);
        try {
            java.util.Date date4 = sdf.parse(s6);
            ms = date4.getTime();
            sqld = new java.sql.Date(ms);
        } catch (ParseException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }
       SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm");
       String time2 = sdf1.format(d);

        tf.setText(" ---------------------------------------------------------------------------------------\n" +
"	   Police Canteen Of " +ll1.getText()+"\n"+
"---------------------------------------------------------------------------------------\nDate       \t\t"+date1+"\nId-\t\t"+ t1.getText()+"\n"+"Name-       \t\t"+t2.getText()+"\n---------"
                + "------------------------------------------------------------------------------\n"+"Sr.No      Product Name\tQuantity\tPrice\n");
        int Row = mod.getRowCount();
        int col = mod.getColumnCount();
        float qty,price;
        total=0;
        for(int i = 0 ; i < Row ; i++)
        {
            qty = Float.parseFloat((String) mod.getValueAt(i, 2));
            price = Float.parseFloat((String)mod.getValueAt(i, 3));
            total = total+(qty*price);
        }
        Object[][] obj = new Object[Row][col];
        s6 = ll1.getText();
        
        String s7=ll1.getText();
        int k=0;
        for(int a=0;a<Row;a++)
        { 
            k++;
            tf.append(k+"\t");
            s1 = (String) mod.getValueAt(a, 1);
             s2 = (String)mod.getValueAt(a, 3);
             s3 = (String)mod.getValueAt(a, 2);
             s4 = Integer.parseInt(t1.getText());
            try {
                Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DB",
            "postgres", "123");
            ps = con.prepareStatement("insert into bill values(?,?,?,?,?,?)");
            ps.setString(1, s7);
            ps.setInt(2,s4);
            ps.setString(3,s1);
            ps.setString(4, s2);
            ps.setString(5, s3);
            ps.setDate(6, sqld);
            int res=ps.executeUpdate();
            if(res>0)
            {
                ll.setText("Save");
            }
            else
            {
                ll.setText("Not Save");
            }
            
        }catch(Exception e){tf.setText(e.getMessage());}
        finally{
            ll.setText("Data save");
        }
            for(int b = 1 ; b < col  ; b++)
            {
               obj[a][b] = mod.getValueAt(a, b);
               tf.append((String)obj[a][b]+"\t");
            }
            tf.append("\n");
        }
        tf.setText(tf.getText()+"\n---------------------------------------------------------------------------------------"+
                "\n\t\t\tTotal="+total);
         tf.setText(tf.getText()+"\n---------------------------------------------------------------------------------------\n\t   Thank You ...!! Visit Again ...!!");
    }//GEN-LAST:event_b5ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       String s1 = t1.getText();
       String s2 = t2.getText();
       String s3 = ll1.getText();
       Connection con;
        Statement stmt;
        ResultSet rs;
        try {
           try {
               Class.forName("org.postgresql.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
           }
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DB",
            "postgres", "123");
            stmt = con.createStatement();
            rs=stmt.executeQuery("select * from police");
            while(rs.next())
            {
                if(s3.equals(rs.getString(1)) && s1.equals(rs.getString(2)) && s2.equals(rs.getString(3)))
                {
                    Date d = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    String date1= sdf.format(d);
                    SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss");
                    String time2 = sdf1.format(d);
                    d2.setText(""+date1);
                    time.setText(time2);
                    ll.setText("Find");
                    JOptionPane.showMessageDialog(this,"Person Find ...!");
                    l3.setVisible(true);
                    t3.setVisible(true);
                    l4.setVisible(true);
                    t4.setVisible(true);
                    l5.setVisible(true);
                    t5.setVisible(true);
                    b6.setVisible(true);
                    b2.setVisible(true);
                    id.setVisible(false);
                    l6.setVisible(false);
                    
                }
                }
        } catch (SQLException ex){
        ll.setText("Field");
                JOptionPane.showMessageDialog(this,"Person Not Find ...!");
                t3.setVisible(false);
                t4.setVisible(false);
                t5.setVisible(false);
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        
    }//GEN-LAST:event_t1ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
    int i = table.getSelectedRow();
    if(i>=0)
    {
        mod.setValueAt(id.getText(), i, 0);
        mod.setValueAt(t3.getText(), i, 1);
        mod.setValueAt(t4.getText(), i, 2);
        mod.setValueAt(t5.getText(), i, 3);
                
    }else{
        JOptionPane.showMessageDialog(null, "Error");
    }
    }//GEN-LAST:event_b6ActionPerformed

    @SuppressWarnings("empty-statement")
    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
    if(t3.getText().equals("")||t4.getText().equals("")||t5.getText().equals(""))  
    {
        JOptionPane.showMessageDialog(this,"Please Enter All Data !");
    }else{
        i++;
        
       String s;
        s = String.valueOf(i);
       String s3 = t3.getText();
       String s4 = t4.getText();
       String s5 = t5.getText();
       String data[] = {s,s3,s4,s5};
       mod = (DefaultTableModel)table.getModel();
       mod.addRow(data);
        JOptionPane.showMessageDialog(this,"Added Successfully...!");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        id.setVisible(false);
        l6.setVisible(false);
        b3.setVisible(true);
        b8.setVisible(true);
        b5.setVisible(true);
    }
    }//GEN-LAST:event_b2ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        int c = mod.getRowCount();
        for(int i = c - 1 ; i >= 0 ; i--)
        {
            mod.removeRow(i);
        }
        total=0;
        i = 0;
        t1.setText("");
        t2.setText("");
        tf.setText("");
        tf.setVisible(true);
        b3.setVisible(false);
        b5.setVisible(false);
        b8.setVisible(false);
        l6.setVisible(false);
        id.setVisible(false);
        l3.setVisible(false);
        t3.setVisible(false);
        b4.setVisible(true);
        l4.setVisible(false);
        t4.setVisible(false);
        l5.setVisible(false);
        t5.setVisible(false);
        b6.setVisible(false);
        b2.setVisible(false);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if(table.getSelectedRow()!= -1)
        {
            int c = table.getSelectedRow();
            mod.removeRow(c);
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        id.setVisible(true);
        l6.setVisible(true);
        int selectedRow = table.getSelectedRow();
        id.setText(mod.getValueAt(selectedRow,0).toString());
        t3.setText(mod.getValueAt(selectedRow,1).toString());
        t4.setText(mod.getValueAt(selectedRow,2).toString());
        t5.setText(mod.getValueAt(selectedRow,3).toString());
        
    }//GEN-LAST:event_tableMouseClicked

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t4ActionPerformed

    @SuppressWarnings({"empty-statement", "IncompatibleEquals"})
    private void bsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsearchActionPerformed
        java.util.Date dd;
        SimpleDateFormat sdf;
        String date8;
        total=0;
        String id= t1.getText();
        String district=ll1.getText();
        String name=t2.getText();
        String date= d2.getText();
        Connection con;
        Statement stmt;
        ResultSet rs;
        String s3,s4,s5;
        int s=0;
        String s1;
         try {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
            }
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DB",
            "postgres", "123");
            stmt = con.createStatement();
            rs=stmt.executeQuery("select police.district,police.pid,police.pname,bill.bill_date,pro,pri,qty from bill inner join police on bill.id=police.pid");
            tf.setText("---------------------------------------------------------------------------------------\n\t   Police Canteen Of "+ll1.getText()+"\n---------------------------------------------------------------------------------------\nDate       \t\t"+date+"\nId-\t\t"+ t1.getText()+"\n"+"Name-       \t\t"+t2.getText()+"\n---------"
                + "------------------------------------------------------------------------------\n"+"Sr.No        Product Name\tQuantity\tPrice\n");
            while(rs.next())
            {
               dd = (java.sql.Date)rs.getDate(4);
               sdf = new SimpleDateFormat("dd/MM/yyyy");
               date8 = sdf.format(dd);
                if(date.equals(date8) && district.equals(rs.getString(1)) &&  name.equals(rs.getString(3)) && id.equals(rs.getString(2)))
                {
                    s++;
                    s1 = String.valueOf(s);
                    s3 = rs.getString(5);
                    s4 = rs.getString(6);
                    s5 = rs.getString(7);
                    total = total+(Float.parseFloat(rs.getString(6))*(Float.parseFloat(rs.getString(7)))) ;
                    tf.append(s1+"\t"+s3+"\t"+s4+"\t"+s5+"\n");
                }
            } 
            tf.append(tf.getText()+"---------------------------------------------------------------------------------------"+
                "\n\t\t\tTotal="+total+"\n");
         tf.append(tf.getText()+"\n---------------------------------------------------------------------------------------\n\t   Thank You ...!! Visit Again ...!!");
            }catch(NumberFormatException | SQLException e){JOptionPane.showMessageDialog(this,e.getMessage());}
    }//GEN-LAST:event_bsearchActionPerformed

    private void d2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegisterPolice b =  new RegisterPolice(ll1.getText());
    b.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    public javax.swing.JButton b2;
    public javax.swing.JButton b3;
    public javax.swing.JButton b4;
    public javax.swing.JButton b5;
    public javax.swing.JButton b6;
    private javax.swing.JButton b7;
    public javax.swing.JButton b8;
    private javax.swing.JButton bsearch;
    private javax.swing.JLabel d1;
    private javax.swing.JTextField d2;
    public javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    public javax.swing.JLabel l3;
    public javax.swing.JLabel l4;
    public javax.swing.JLabel l5;
    public javax.swing.JLabel l6;
    private javax.swing.JLabel ll;
    private javax.swing.JLabel ll1;
    public javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    public javax.swing.JTextField t3;
    public javax.swing.JTextField t4;
    public javax.swing.JTextField t5;
    public javax.swing.JTable table;
    public javax.swing.JTextArea tf;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    private String getValueAt(int a, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
