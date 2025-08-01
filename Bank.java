import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bank extends javax.swing.JFrame {
LinkedList list= new LinkedList();
   
    public Bank() {
        initComponents();
        
        checkFileName();
        readFile();
    }
  
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cnic = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        doposit = new javax.swing.JTextField();
        cnic1 = new javax.swing.JTextField();
        deposit1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataDis = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("SZABIST BANK");

        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(1048, Short.MAX_VALUE)
                .addComponent(jButton4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CNIC");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Initial Deposit");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Deposit Amount");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("CNIC");

        doposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dopositActionPerformed(evt);
            }
        });

        deposit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Deposit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        dataDis.setColumns(20);
        dataDis.setFont(new java.awt.Font("Courier New", 1, 14));
        dataDis.setRows(5);
        jScrollPane1.setViewportView(dataDis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(doposit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cnic, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(110, 110, 110)
                        .addComponent(cnic1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deposit1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(cnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(doposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deposit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1125, 677));
        setLocationRelativeTo(null);
    }

    private void dopositActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void deposit1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        if(list.isExist(cnic1.getText())){
                 dataDis.setText(list.CnicInfo(cnic1.getText()));
        }
        
        else{
             JOptionPane.showMessageDialog(null,"CNIC Not Exist!");
             dataDis.setText("");
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

 if(list.isExist(cnic1.getText())){
            try{
            
           double amount =Double.parseDouble(deposit1.getText());
           
           if(amount<0){
               JOptionPane.showMessageDialog(null, "Amount not be Negatve !");
           return ;
           }
            dataDis.setText(list.Deposit(cnic1.getText(),amount));
          dataDis.setText(list.CnicInfo(cnic1.getText()));        

writeFile(list.allData());
          JOptionPane.showMessageDialog(null, "Successfully Updated!");
            }
            
            catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Please Enter Valid amount");
            }
        }
        
        else{
             JOptionPane.showMessageDialog(null,"CNIC Not Exist!");
             dataDis.setText("");
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

     this.setVisible(false);
     new Home().setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    
        if(list.isExist(cnic.getText())){
             JOptionPane.showMessageDialog(null,"CNIC already Exist!");
        }
        
        else if(cnic.getText().equals("")|| name.getText().equals("")||doposit.getText().equals("")){
             JOptionPane.showMessageDialog(null,"All the Feilds Required !");
        }
        
        else if(checkCNIC(cnic.getText())){
        
        Random rand  = new Random();
     int pin =(int) Math.floor(Math.random()*(9999-1000+1)+1000);
       int c1,c2,c3,c4;
       
       do{
        c1 = (int) Math.floor(Math.random()*(9999-1000+1)+1000);
        c2 = (int) Math.floor(Math.random()*(9999-1000+1)+1000);
        c3 = (int) Math.floor(Math.random()*(9999-1000+1)+1000);
        c4 = (int) Math.floor(Math.random()*(9999-1000+1)+1000); 
       }
       while (list.check(c1+" "+c2+" "+c3+" "+c4));
       
       
      int a1 = (int) Math.floor(Math.random()*(999999-100000+1)+100000);
      int a2 = (int) Math.floor(Math.random()*(999999-100000+1)+100000);
       
      try{
          double amount= Double.parseDouble(doposit.getText());
          if(amount<0){
          JOptionPane.showMessageDialog(null, "Amount not be Negative !  ");
          return ;
          }
          
          list.insert(new Customer(cnic.getText(),name.getText(),amount,pin,"PK00SZABIST"+a1+""+a2,c1+" "+c2+" "+c3+" "+c4));
      
         writeFile(list.allData());
       JOptionPane.showMessageDialog(null,"Coustomer is Registerd Successfully !\nAccount Number = "+"PK00SZABIST"+a1+""+a2);
       name.setText("");
       cnic.setText("");
       doposit.setText("");
      
      }
      catch(Exception e){
           JOptionPane.showMessageDialog(null, "Enter valid amount !  ");
      }
     }
        
        else{
       JOptionPane.showMessageDialog(null,"CNIC must be 13 digits");
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bank().setVisible(true);
            }
        });
    }

    private javax.swing.JTextField cnic;
    private javax.swing.JTextField cnic1;
    private javax.swing.JTextArea dataDis;
    private javax.swing.JTextField deposit1;
    private javax.swing.JTextField doposit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;

    private void writeFile(String data) {
    try {
      FileWriter myWriter = new FileWriter("data.txt");
      myWriter.write(data);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    }
    private boolean checkCNIC(String text) {
        if(text.length()==13){
            boolean ret=false;
            for(int i=0;i<text.length();i++){
                
                 if(text.charAt(i)>=48 && text.charAt(i)<=57){
                    ret=true;
                 }
                 else{
                 ret=false;
                 break;
                 }
            }
            return ret;
        }
        else{
        return false;
        }
    }

    private void readFile() {
       try {
      File myObj = new File("data.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if(data.length()>5){
          String[] cus= data.split(";");
          
         // cnic+";"+name+";"+ balance+";"+pin+ ";" + accountNo + ";"+card
         list.insert(new Customer(cus[0],cus[1],Double.parseDouble(cus[2]),Integer.parseInt(cus[3]),cus[4],cus[5]));
        
        }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }

    private void checkFileName() {
        try {
      File myObj = new File("data.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}