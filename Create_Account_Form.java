package Mini_Project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Create_Account_Form extends JFrame implements ActionListener{
    JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10;
    JTextField txtf1,txtf2,txtf3,txtf4,txtf5,txtf6,txtf7,txtf8;
    JButton bt1,bt2,bt3,bt4;
    ImageIcon pic;
    JMenuBar mb;
    JMenuItem mi;
    JMenu file;
    JPanel pan;
    public Create_Account_Form()
    {
        setSize(470,630);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Water Billing System");
        Image icn = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_plumbing_40px_1.png");
        setIconImage(icn);
        setLocation(340,40);
        
        pan = new JPanel();
        pan.setBounds(0,0,1500,800);
        pan.setBackground(Color.yellow);
        pan.setLayout(null);
        add(pan);
        mb = new JMenuBar();
        setJMenuBar(mb);
        file = new JMenu("File");
        mb.add(file);
        mi = new JMenuItem("Database");
        file.add(mi);
        mi.addActionListener(this);
        
      lbl1 = new JLabel("****Water Billing System****");
      lbl1.setBounds(50,0,400,50);
      lbl1.setFont(new Font("Times New Roman",Font.BOLD,24));
      pan.add(lbl1);
      
      lbl2 = new JLabel("...Create Account Form...");
      lbl2.setBounds(40,50,250,50);
      lbl2.setFont(new Font("Times New Roman",Font.BOLD,20));
      pan.add(lbl2);
      
      ImageIcon pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_registration_80px.png");
      lbl3 = new JLabel(pic);
      lbl3.setBounds(170,90,100,80);
      pan.add(lbl3);
      
      lbl4 = new JLabel("First Name:");
      lbl4.setBounds(50,180,100,30);
      lbl4.setFont(new Font("Times New Roman",Font.BOLD,16));
      pan.add(lbl4);
      
      lbl5 = new JLabel("Last Name:");
      lbl5.setBounds(50,220,100,30);
      lbl5.setFont(new Font("Times New Roman",Font.BOLD,16));
      pan.add(lbl5);
      
      lbl6 = new JLabel("Email:");
      lbl6.setBounds(50,260,100,30);
      lbl6.setFont(new Font("Times New Roman",Font.BOLD,16));
      pan.add(lbl6);
      
      lbl7 = new JLabel("Address:");
      lbl7.setBounds(50,300,100,30);
      lbl7.setFont(new Font("Times New Roman",Font.BOLD,16));
      pan.add(lbl7);
      
      lbl8 = new JLabel("User Name:");
      lbl8.setBounds(50,340,100,30);
      lbl8.setFont(new Font("Times New Roman",Font.BOLD,16));
      pan.add(lbl8);
      
      lbl9 = new JLabel("Password:");
      lbl9.setBounds(50,380,100,30);
      lbl9.setFont(new Font("Times New Roman",Font.BOLD,16));
      pan.add(lbl9);
      
      lbl10 = new JLabel("Access Level:");
      lbl10.setBounds(50,420,100,30);
      lbl10.setFont(new Font("Times New Roman",Font.BOLD,16));
      pan.add(lbl10);
      
      txtf1 = new JTextField(10);
      txtf1.setBounds(160,180,130,30);
      txtf1.setFont(new Font("Times New Roman",Font.BOLD,13));
      pan.add(txtf1);
      
      txtf2 = new JTextField(10);
      txtf2.setBounds(160,220,130,30);
      txtf2.setFont(new Font("Times New Roman",Font.BOLD,13));
      pan.add(txtf2);
      
      txtf3 = new JTextField(10);
      txtf3.setBounds(160,260,130,30);
      txtf3.setFont(new Font("Times New Roman",Font.BOLD,13));
      pan.add(txtf3);
      
      txtf4 = new JTextField(10);
      txtf4.setBounds(160,300,130,30);
      txtf4.setFont(new Font("Times New Roman",Font.BOLD,13));
      pan.add(txtf4);
      
      txtf5 = new JTextField(10);
      txtf5.setBounds(160,340,130,30);
      txtf5.setFont(new Font("Times New Roman",Font.BOLD,13));
      pan.add(txtf5);
      
      txtf6 = new JTextField(10);
      txtf6.setBounds(160,380,130,30);
      txtf6.setFont(new Font("Times New Roman",Font.BOLD,13));
      pan.add(txtf6);
      
      txtf7 = new JTextField();
      txtf7.setBounds(160,420,130,30);
      txtf7.setFont(new Font("Times New Roman",Font.BOLD,13));
      pan.add(txtf7);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_Add_16px.png");
      bt1 = new JButton("Create");
      bt1.setBounds(80,465,100,30);
      bt1.setIcon(pic);
      pan.add(bt1);
      bt1.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_return_16px.png");
      bt2 = new JButton("Return");
      bt2.setBounds(230,465,100,30);
      bt2.setIcon(pic);
      pan.add(bt2);
      bt2.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_shutdown_16px.png");
      bt3 = new JButton("Exit");
      bt3.setBounds(230,515,100,30);
      bt3.setIcon(pic);
      pan.add(bt3);
      bt3.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_reset_16px.png");
      bt4 = new JButton("Reset");
      bt4.setIcon(pic);
      bt4.setBounds(80,515,100,30);
      pan.add(bt4);
      bt4.addActionListener(this);
      
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource()== bt1)
        {
            try{
                DBConnection db = new DBConnection();
                String fname = txtf1.getText();
                String lname = txtf2.getText();
                String email = txtf3.getText();
                String address = txtf4.getText();
                String username = txtf5.getText();
                String password = txtf6.getText();
                String accesslevel = txtf7.getText();
                String sql = "INSERT INTO login(Firstname,Lastname,Email,Adress,Username,Password,AccessLevel)" + " VALUES ('"+fname+"','"+lname+"','"+email+"','"+address+"','"+username+"','"+password+"','"+accesslevel+"');";
                db.s.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Successfully Created","Water Billing System",JOptionPane.INFORMATION_MESSAGE);
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if(evt.getSource() == bt2)
        {
            dispose();
            new Main_Page();
        }
        if(evt.getSource()== bt3)
        {
            int a = JOptionPane.showConfirmDialog(null, "Are You Sure To Exit");
            if(a == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        }
        if(evt.getSource() == mi)
        {
            new Login_DB().setVisible(true);
        }
        if(evt.getSource() == bt4)
        {
            txtf1.setText("");
            txtf2.setText("");
            txtf3.setText("");
            txtf4.setText("");
            txtf5.setText("");
            txtf6.setText("");
            txtf7.setText("");
        }
    }
    
    public static void main(String args [])
    {
        new Create_Account_Form();
    }
}
