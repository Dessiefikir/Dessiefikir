package Mini_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login_Form extends JFrame implements ActionListener{
    JLabel lb1,lb2,lb3,lb4,lb5,lb6;
    JTextField tf1;
    JPasswordField pf1;
    JButton btn1,btn2,btn3;
    JPanel pan;
    JCheckBox cb;
    ImageIcon pic;
    JMenuBar mb;
    JMenuItem mi,mi2;
    JMenu Info;
    public Login_Form()
    {
      
      Image icn = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_plumbing_40px_1.png");
      setIconImage(icn);
      setVisible(true);
      setSize(450,410);
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Water Billing System");
      setLocation(350,130);
   
      mb = new JMenuBar();
      setJMenuBar(mb);
      Info = new JMenu("Information");
      mb.add(Info);
      mi = new JMenuItem("Developers");
      mi.addActionListener(this);
      Info.add(mi);
      
      pan = new JPanel();
      pan.setBounds(0,0,1500,800);
      pan.setLayout(null);
      pan.setBackground(Color.yellow);
      add(pan);
      lb1 = new JLabel("****Water Billing System****");
      lb1.setBounds(50,0,400,50);
      lb1.setFont(new Font("Times New Roman",Font.BOLD,24));
      lb1.setForeground(Color.red);
      pan.add(lb1);
      
      lb2 = new JLabel("...Login Form...");
      lb2.setBounds(40,50,150,50);
      lb2.setFont(new Font("Times New Roman",Font.BOLD,20));
      lb2.setForeground(Color.BLUE);
      pan. add(lb2);
      
      ImageIcon pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_person_80px.png");
      lb3 = new JLabel(pic);
      lb3.setBounds(170,80,100,80);
      pan.add(lb3);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_user_male_16px.png");
      lb4 = new JLabel("User Name:");
      lb4.setBounds(50,165,120,50);
      lb4.setForeground(Color.BLUE);
      lb4.setIcon(pic);
      lb4.setFont(new Font("Times New Roman",Font.BOLD,16));
      pan.add(lb4);
      tf1 = new JTextField(10);
      tf1.setBounds(168,177,135,30);
      tf1.setToolTipText("Enter User Name");
      tf1.setFont(new Font("Times New Roman",Font.BOLD,14));
      pan.add(tf1);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_forgot_password_16px.png");
      lb5 = new JLabel("Password:");
      lb5.setBounds(50,208,120,50);
      lb5.setIcon(pic);
      lb5.setForeground(Color.BLUE);
      lb5.setFont(new Font("Times New Roman",Font.BOLD,16));
      pan.add(lb5);
      pf1 = new JPasswordField(10);
      pf1.setBounds(168,220,135,30);
      pf1.setToolTipText("Enter Password");
      pf1.setFont(new Font("Times New Roman",Font.BOLD,14));
      pan.add(pf1);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_login_16px.png");
      btn1 = new JButton("Login");
      btn1.setBounds(50,280,90,40);
      btn1.setIcon(pic);
      btn1.setFont(new Font("Times New Roman",Font.BOLD,12));
      btn1.setForeground(Color.blue);
      pan.add(btn1);
      btn1.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_clear_formatting_16px.png");
      btn2 = new JButton("Clear");
      btn2.setBounds(170,280,90,40);
      btn2.setIcon(pic);
      btn2.setFont(new Font("Times New Roman",Font.BOLD,12));
      btn2.setForeground(Color.black);
      pan.add(btn2);
      btn2.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_shutdown_16px.png");
      btn3 = new JButton("Exit");
      btn3.setBounds(290,280,90,40);
      btn3.setIcon(pic);
      btn3.setFont(new Font("Times New Roman",Font.BOLD,12));
      btn3.setForeground(Color.red);
      pan.add(btn3);
      btn3.addActionListener(this);
      
      cb = new JCheckBox();
      cb.setBounds(305,225,21,20);
      cb.setToolTipText("Show Password");
      pan.add(cb);
      cb.addActionListener(this);
    }
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource() == btn1)
        {
            try {
            DBConnection db = new DBConnection();
            String uname = tf1.getText();
            String password = pf1.getText();
            String sql = "select * from login where Username = '"+uname+"' and Password = '"+password+"'";
            ResultSet rs = db.s.executeQuery(sql);
            if(rs.next())
            {
                String a = rs.getString("AccessLevel");
                if(a.equals("admin"))
                {
                JOptionPane.showMessageDialog(null,"|-----WellCome Admin----|","Water Billing System",JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Main_Page();
                }
                else
                {
                JOptionPane.showMessageDialog(null,"|-----WellCome Sales Person----|","Water Billing System",JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Main_Page2(); 
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"|******Error*****|","Water Billing System",JOptionPane.ERROR_MESSAGE);
            }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        if(evt.getSource() == btn2)
        {
            tf1.setText("");
            pf1.setText("");
        }
        if(evt.getSource() == btn3)
        {
            int a = JOptionPane.showConfirmDialog(null,"Are You Sure To Exit?");
            if(a == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        }
        if(evt.getSource()== cb)
        {
            if(cb.isSelected())
            {
                pf1.setEchoChar((char)0);
            }
            else
            {
                pf1.setEchoChar('*');
            }
        }
        if(evt.getSource() == mi)
        {
            new Developers().setVisible(true);
        }
    }
    public static void main(String args[])
    {
         
       new Login_Form(); 
    }
      
}
