
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Inventory extends javax.swing.JFrame {
    
    DefaultListModel dlm = new DefaultListModel();
    ObjectOutputStream oos;
    FileOutputStream fos;
    DataOutputStream dos;
    
    Person p;

    String[] transaction = new String[100];
    
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    
    double total_price = 0;
    
    int id;
    
    int sum_intel = 50000;
    int sum_hp = 55000;
    int sum_mac = 70000;
    
    int sum_mouse = 650;
    int sum_keyboard = 890;
    int sum_harddrive = 4500;
    int sum_ram = 1200;
    int sum_graphics = 7300;

    public Inventory() {
        
        
        initComponents();
    }

    Inventory(String[] transaction, Person p) throws FileNotFoundException, IOException {
        
        this.p = p;
        File t = new File("id.txt");
        
        DataInputStream dis = new DataInputStream(new FileInputStream(t));
        
        id = dis.readInt();
        
        dos = new DataOutputStream(new FileOutputStream(t));
        
        id++;
        dos.writeInt(id);
        dos.close();
        
        
        this.transaction = transaction;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        desktop_list = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        desktop_price = new javax.swing.JTextField();
        desktop_quantity = new javax.swing.JTextField();
        desktop_add = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        component_add = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        component_list = new javax.swing.JList<>();
        component_quantity = new javax.swing.JTextField();
        component_price = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        transcript = new javax.swing.JTextArea();
        confirm = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        cart = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        paid_amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        total_price_display = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        desktop_list.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        desktop_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Apple Mac", "Intel PC", "HP PC" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        desktop_list.setSelectedIndex(0);
        desktop_list.setSelectionBackground(new java.awt.Color(153, 0, 0));
        desktop_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desktop_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(desktop_list);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Price");

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Quantity");

        desktop_price.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        desktop_price.setText("0.00");

        desktop_quantity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        desktop_quantity.setText("1");
        desktop_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desktop_quantityActionPerformed(evt);
            }
        });
        desktop_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                desktop_quantityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                desktop_quantityKeyReleased(evt);
            }
        });

        desktop_add.setBackground(new java.awt.Color(153, 0, 0));
        desktop_add.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        desktop_add.setForeground(new java.awt.Color(255, 255, 255));
        desktop_add.setText("Add");
        desktop_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desktop_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desktop_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(desktop_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(desktop_price, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desktop_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(desktop_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(desktop_add)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Desktop PC", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Price");

        component_add.setBackground(new java.awt.Color(153, 0, 0));
        component_add.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        component_add.setForeground(new java.awt.Color(255, 255, 255));
        component_add.setText("Add");
        component_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                component_addActionPerformed(evt);
            }
        });

        component_list.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        component_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mouse", "Keyboard", "Hard Drive", "RAM", "Graphics Card" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        component_list.setSelectedIndex(0);
        component_list.setSelectionBackground(new java.awt.Color(153, 0, 0));
        component_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                component_listMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(component_list);

        component_quantity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        component_quantity.setText("1");
        component_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                component_quantityActionPerformed(evt);
            }
        });
        component_quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                component_quantityKeyReleased(evt);
            }
        });

        component_price.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        component_price.setText("0.00");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(component_add, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(component_price, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(component_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(component_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(component_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(component_add)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Components", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print and Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        transcript.setColumns(20);
        transcript.setRows(5);
        jScrollPane5.setViewportView(transcript);

        confirm.setBackground(new java.awt.Color(153, 0, 0));
        confirm.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        cart.setModel(dlm);
        cart.setSelectionBackground(new java.awt.Color(153, 0, 0));
        jScrollPane6.setViewportView(cart);

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("Paid Amount");

        paid_amount.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        paid_amount.setText("0");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Total Price");

        total_price_display.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        total_price_display.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirm, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(paid_amount))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_price_display, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(total_price_display, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paid_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jScrollPane5))
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(confirm))
                .addGap(33, 33, 33))
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Inventory");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1084, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        
        double paid = Double.parseDouble(paid_amount.getText());
        
        if(paid < total_price)
        {
            JOptionPane.showMessageDialog(null, "Invalid Amount Paid");
        }
        else
        {
            transcript.append("Transaction ID : " + id++);
            //transcript.append("\n"+ dateFormat.format(date));
            
            transcript.append("\n\nThank You for Shopping\n\n");
            transcript.append("Items bought\n");
            transcript.append("_____________________\n\n");
        
        String[] s = new String[dlm.capacity()];
                dlm.copyInto(s);
                
                for(int i=0; i<dlm.size(); i++)
                {
                    transcript.append(s[i] + "\n");
                }
            transcript.append("_____________________");
                
        transcript.append("\n\nTotal Price    = "+ total_price+ " BDT");
        transcript.append("\nAmount Paid = "+ paid+ " BDT");
        
        transcript.append("\n\nChange Cash = "+ (paid - total_price) + " BDT\n\n\n");
        }

        
    }//GEN-LAST:event_confirmActionPerformed

    private void desktop_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desktop_addActionPerformed

        
        if(desktop_list.getSelectedValue().equals("Intel PC"))
        {
            int a = Integer.parseInt(desktop_quantity.getText());
            desktop_price.setText(Integer.toString(sum_intel*a));
        }
        else if(desktop_list.getSelectedValue().equals("HP PC"))
        {
            int a = Integer.parseInt(desktop_quantity.getText());
            desktop_price.setText(Integer.toString(sum_hp*a));
        }
        else if(desktop_list.getSelectedValue().equals("Apple Mac"))
        {
            int a = Integer.parseInt(desktop_quantity.getText());
            desktop_price.setText(Integer.toString(sum_mac*a));
        }
        
        
        double p = Double.parseDouble(desktop_price.getText());
        double q = Double.parseDouble(desktop_quantity.getText());

        total_price += p*q;
        total_price_display.setText(Double.toString(total_price));

        dlm.addElement("["+desktop_quantity.getText()+"]"+" "+ desktop_list.getSelectedValue());

        cart.setModel(dlm);

    }//GEN-LAST:event_desktop_addActionPerformed

    private void desktop_quantityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_desktop_quantityKeyPressed

    }//GEN-LAST:event_desktop_quantityKeyPressed

    private void desktop_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desktop_listMouseClicked

        if(desktop_list.getSelectedValue().equals("Intel PC"))
        {
            desktop_price.setText(Integer.toString(sum_intel));
        }
        else if(desktop_list.getSelectedValue().equals("HP PC"))
        {

            desktop_price.setText(Integer.toString(sum_hp));
        }
        else if(desktop_list.getSelectedValue().equals("Apple Mac"))
        {

            desktop_price.setText(Integer.toString(sum_mac));
        }

    }//GEN-LAST:event_desktop_listMouseClicked

    private void component_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_component_listMouseClicked
        
        if(component_list.getSelectedValue().equals("Mouse"))
        {
            component_price.setText(Integer.toString(sum_mouse));
        }
        else if(component_list.getSelectedValue().equals("Keyboard"))
        {
            component_price.setText(Integer.toString(sum_keyboard));
        }
        else if(component_list.getSelectedValue().equals("Hard Drive"))
        {
            component_price.setText(Integer.toString(sum_harddrive));
        }
        else if(component_list.getSelectedValue().equals("RAM"))
        {
            component_price.setText(Integer.toString(sum_ram));
        }
        else if(component_list.getSelectedValue().equals("Graphics Card"))
        {
            component_price.setText(Integer.toString(sum_graphics));
        }
        
        
    }//GEN-LAST:event_component_listMouseClicked

    private void component_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_component_addActionPerformed
        
        if(component_list.getSelectedValue().equals("Mouse"))
        {
            int a = Integer.parseInt(component_quantity.getText());
            component_price.setText(Integer.toString(sum_mouse*a));
        }
        else if(component_list.getSelectedValue().equals("Keyboard"))
        {
            int a = Integer.parseInt(component_quantity.getText());
            component_price.setText(Integer.toString(sum_keyboard*a));
        }
        else if(component_list.getSelectedValue().equals("Hard Drive"))
        {
            int a = Integer.parseInt(component_quantity.getText());
            component_price.setText(Integer.toString(sum_harddrive*a));
        }
        else if(component_list.getSelectedValue().equals("RAM"))
        {
            int a = Integer.parseInt(component_quantity.getText());
            component_price.setText(Integer.toString(sum_ram*a));
        }
        else if(component_list.getSelectedValue().equals("Graphics Card"))
        {
            int a = Integer.parseInt(component_quantity.getText());
            component_price.setText(Integer.toString(sum_graphics*a));
        }
        
        double p = Double.parseDouble(component_price.getText());
        double q = Double.parseDouble(component_quantity.getText());

        total_price += p*q;
        total_price_display.setText(Double.toString(total_price));

        dlm.addElement("["+component_quantity.getText()+"]"+" "+ component_list.getSelectedValue());

        cart.setModel(dlm);
        
    }//GEN-LAST:event_component_addActionPerformed

    private void component_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_component_quantityKeyReleased
    
    }//GEN-LAST:event_component_quantityKeyReleased

    private void desktop_quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_desktop_quantityKeyReleased
        
    }//GEN-LAST:event_desktop_quantityKeyReleased

    private void desktop_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desktop_quantityActionPerformed
       if(desktop_list.getSelectedValue().equals("Intel PC"))
        {
            int a = Integer.parseInt(desktop_quantity.getText());
            desktop_price.setText(Integer.toString(sum_intel*a));
        }
        else if(desktop_list.getSelectedValue().equals("HP PC"))
        {
            int a = Integer.parseInt(desktop_quantity.getText());
            desktop_price.setText(Integer.toString(sum_hp*a));
        }
        else if(desktop_list.getSelectedValue().equals("Apple Mac"))
        {
            int a = Integer.parseInt(desktop_quantity.getText());
            desktop_price.setText(Integer.toString(sum_mac*a));
        }
    }//GEN-LAST:event_desktop_quantityActionPerformed

    private void component_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_component_quantityActionPerformed
        if(component_list.getSelectedValue().equals("Mouse"))
        {
            int a = Integer.parseInt(component_quantity.getText());
            component_price.setText(Integer.toString(sum_mouse*a));
        }
        else if(component_list.getSelectedValue().equals("Keyboard"))
        {
            int a = Integer.parseInt(component_quantity.getText());
            component_price.setText(Integer.toString(sum_keyboard*a));
        }
        else if(component_list.getSelectedValue().equals("Hard Drive"))
        {
            int a = Integer.parseInt(component_quantity.getText());
            component_price.setText(Integer.toString(sum_harddrive*a));
        }
        else if(component_list.getSelectedValue().equals("RAM"))
        {
            int a = Integer.parseInt(component_quantity.getText());
            component_price.setText(Integer.toString(sum_ram*a));
        }
        else if(component_list.getSelectedValue().equals("Graphics Card"))
        {
            int a = Integer.parseInt(component_quantity.getText());
            component_price.setText(Integer.toString(sum_graphics*a));
        }
    }//GEN-LAST:event_component_quantityActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int i;
        for(i=0; transaction[i] != null; i++)
        {
            
        }
        transaction[i] = transcript.getText();
        
        
        try 
        {
            File f = new File("transaction.txt");
            fos = new FileOutputStream(f);
            dos = new DataOutputStream(fos);
            
            for(int j=0; transaction[j] != null; j++)
            {
                dos.writeUTF("\n");
                dos.writeUTF(transaction[j]);
            }
            
            dos.close();
            
            JOptionPane.showMessageDialog(null, "Transaction Saved");
            this.setVisible(false);
            //MainFrame mf = new MainFrame(transaction, p);
            //mf.setVisible(true);
            //mf.setResizable(false);
            
        } 
        
        catch (IOException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error Ocurred");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> cart;
    private javax.swing.JButton component_add;
    private javax.swing.JList<String> component_list;
    private javax.swing.JTextField component_price;
    private javax.swing.JTextField component_quantity;
    private javax.swing.JButton confirm;
    private javax.swing.JButton desktop_add;
    private javax.swing.JList<String> desktop_list;
    private javax.swing.JTextField desktop_price;
    private javax.swing.JTextField desktop_quantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField paid_amount;
    private javax.swing.JTextField total_price_display;
    private javax.swing.JTextArea transcript;
    // End of variables declaration//GEN-END:variables
}
