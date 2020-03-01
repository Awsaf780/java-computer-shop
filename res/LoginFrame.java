
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

public class LoginFrame extends javax.swing.JFrame implements Serializable{

    static Person[] persons = new Person[10];
    
    static Vector v;
    static String[] transaction = new String[100];
    static Person choice = new Person("ADMIN", "50", "Trans", "choice", "12345");
    
    static ObjectInputStream ois1, ois2;
    static DataInputStream dis1, dis2;
    static FileReader fr;
    static ObjectOutputStream oos1, oos2;
    public LoginFrame() 
    {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("boy.png")));
    }
    LoginFrame(Vector v)
    {
        this.v = v;
        initComponents();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("boy.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        forgot = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(LoginFrame.class.getResource("online-shop (1).png")));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 0));
        jLabel4.setText("Welcome Back!");

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 0));
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Password");

        login.setBackground(new java.awt.Color(153, 0, 0));
        login.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        forgot.setFont(new java.awt.Font("DejaVu Sans", 2, 10)); // NOI18N
        forgot.setForeground(new java.awt.Color(204, 0, 0));
        forgot.setText("Forgot Password?");
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                forgotMouseReleased(evt);
            }
        });

        signup.setBackground(new java.awt.Color(153, 0, 0));
        signup.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign Up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(signup)
                            .addGap(18, 18, 18)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(forgot))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel4)
                .addGap(66, 66, 66)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(forgot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(signup))
                .addGap(31, 31, 31))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/online-shop (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COMPUTER SHOP");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MANAGER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(557, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void forgotMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseReleased
       
        JOptionPane.showMessageDialog(null, "This Feature will be added soon", "Upcoming", -1);
        
    }//GEN-LAST:event_forgotMouseReleased

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        String user, pass;
        
        user = username.getText();
        pass = password.getText();
        
        String send_user, send_age, send_gender, send_pass;
        Person p1, p2;
        
        boolean valid = false;
        
        if(user.equals("ADMIN"))
        {
            Admin admin = new Admin(v);
            admin.setVisible(true);
            admin.setResizable(false);
            this.setVisible(false);
        }
        else{
        for(int i=0; i<v.size(); i++)
        {
            p1 = (Person) v.elementAt(i);
            
            if(user.equals(p1.getUsername()) && pass.equals(p1.getPassword()))
            {
                p2 = new Person(p1.getName(), p1.getAge(), p1.getGender(),p1.getUsername(), p1.getPassword());
                this.setVisible(false);
                MainFrame mf = new MainFrame(p2, v, transaction);
                mf.setVisible(true);
                mf.setResizable(false);
                
                valid = true;
            }
        }
        
        if(valid == false)
        {
            username.setText("");
            password.setText("");
            JOptionPane.showMessageDialog(null, "Invalid Username/Password", "Error", -1);
        }
        }
        
    }//GEN-LAST:event_loginActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
       String user, pass;
        
        user = username.getText();
        pass = password.getText();
        
        String send_user, send_age, send_gender, send_pass;
        Person p1, p2;
        
        boolean valid = false;
        
        
        for(int i=0; i<v.size(); i++)
        {
            p1 = (Person) v.elementAt(i);
            
            if(user.equals(p1.getUsername()) && pass.equals(p1.getPassword()))
            {
                p2 = new Person(p1.getName(), p1.getAge(), p1.getGender(),p1.getUsername(), p1.getPassword());
                this.setVisible(false);
                MainFrame mf = new MainFrame(p2, v, transaction);
                mf.setVisible(true);
                mf.setResizable(false);
                
                valid = true;
            }
        }
        
        if(valid == false)
        {
            username.setText("");
            password.setText("");
            JOptionPane.showMessageDialog(null, "Invalid Username/Password", "Error", -1);
        }
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
       String user, pass;
        
        user = username.getText();
        pass = password.getText();
        
        String send_user, send_age, send_gender, send_pass;
        Person p1, p2;
        
        boolean valid = false;
            
        
        
        for(int i=0; i<v.size(); i++)
        {
            p1 = (Person) v.elementAt(i);
            
            if(user.equals(p1.getUsername()) && pass.equals(p1.getPassword()))
            {
                p2 = new Person(p1.getName(), p1.getAge(), p1.getGender(),p1.getUsername(), p1.getPassword());
                this.setVisible(false);
                MainFrame mf = new MainFrame(p2, v, transaction);
                mf.setVisible(true);
                mf.setResizable(false);
                
                valid = true;
            }
        }
        
        if(valid == false)
        {
            username.setText("");
            password.setText("");
            JOptionPane.showMessageDialog(null, "Invalid Username/Password", "Error", -1);
        }
        
    }//GEN-LAST:event_usernameActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        
        if(v.size()<=10)
        {
        Registration rg = new Registration(persons, v);
        rg.setVisible(true);
        rg.setResizable(false);
        //this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No More Space Available. Sorry!");
        }
        
        
        
    }//GEN-LAST:event_signupActionPerformed

    public static void main(String args[])  throws IOException, FileNotFoundException, ClassNotFoundException{
        v = new Vector();
        //v.add(choice);
        //oos1  = new ObjectOutputStream(new FileOutputStream("data.txt"));
        //oos1.writeObject(v);
        //oos1.close();
        
        File f = new File("data.txt");
        
        ois1  = new ObjectInputStream(new FileInputStream(f));
        
        
        
        try
        {
            while(true)
            {
                v = (Vector) ois1.readObject();
            }
        }
        catch(EOFException e)
        {
            
        }
        ois1.close();
        
        
        for(int i=0; i<v.size(); i++)
        {
            persons[i] = (Person) v.elementAt(i);
            System.out.println(persons[i].getUsername() + " " + persons[i].getPassword());
            
        }
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgot;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signup;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
