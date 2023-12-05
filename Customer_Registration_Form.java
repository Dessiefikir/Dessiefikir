package Mini_Project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Customer_Registration_Form extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton b1,b2,b3,b4,b5,b6;
    ImageIcon pic;
    JPanel pan;
    public Customer_Registration_Form()
    {
      setSize(750,550);
      setVisible(true);
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      Image icn = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_plumbing_40px_1.png");
      setIconImage(icn);
      setTitle("Water Billing System");
      setLocation(240,70);
      
       pan = new JPanel();
       pan.setBounds(0,0,1500,800);
       pan.setLayout(null);
       pan.setBackground(Color.yellow);
       add(pan);
      
      l1 = new JLabel("****Water Billing System****");
      l1.setBounds(130,0,550,50);
      l1.setFont(new Font("Times New Roman",Font.BOLD,30));
      pan.add(l1);
      
      l2 = new JLabel("|...Customer Registration Form...|");
      l2.setBounds(40,50,300,50);
      l2.setFont(new Font("Times New Roman",Font.BOLD,20));
      pan.add(l2);
      
      ImageIcon pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_registration_80px.png");
      l3 = new JLabel(pic);
      l3.setBounds(250,100,100,80);
      pan.add(l3);
      
      l4 = new JLabel("Counter Tag No:");
      l4.setBounds(40,190,100,30);
      l4.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(l4);
      
      l5 = new JLabel("Customer's Full Name:");
      l5.setBounds(40,230,130,30);
      l5.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(l5);
      
      l6 = new JLabel("Sex:");
      l6.setBounds(40,270,100,30);
      l6.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(l6);
      
      l7 = new JLabel("Phone No:");
      l7.setBounds(40,310,100,30);
      l7.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(l7);
      
      l8 = new JLabel("Surrounding City:");
      l8.setBounds(400,190,120,30);
      l8.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(l8);
      
      l9 = new JLabel("Locality/Kebele:");
      l9.setBounds(400,230,120,30);
      l9.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(l9);
      
      l10 = new JLabel("Village:");
      l10.setBounds(400,270,120,30);
      l10.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(l10);
      
      l11 = new JLabel("House No:");
      l11.setBounds(400,310,120,30);
      l11.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(l11);
      
      t1 = new JTextField();
      t1.setBounds(190,190,140,25);
      t1.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t1);
      
      t2 = new JTextField();
      t2.setBounds(190,230,140,25);
      t2.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t2);
      
      t3 = new JTextField();
      t3.setBounds(190,270,140,25);
      t3.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t3);
      
      t4 = new JTextField();
      t4.setBounds(190,310,140,25);
      t4.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t4);
      
      t5 = new JTextField();
      t5.setBounds(510,190,140,25);
      t5.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t5);
      
      t6 = new JTextField();
      t6.setBounds(510,230,140,25);
      t6.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t6);
      
      t7 = new JTextField();
      t7.setBounds(510,270,140,25);
      t7.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t7);
      
      t8 = new JTextField();
      t8.setBounds(510,310,140,25);
      t8.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t8);
     
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_registered_trademark_24px.png");
      b1 = new JButton("Register");
      b1.setBounds(70,380,120,40);
      b1.setIcon(pic);
      b1.addActionListener(this);
      pan.add(b1);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_broom_24px.png");
      b2 = new JButton("Clear");
      b2.setBounds(250,380,100,40);
      b2.setIcon(pic);
      b2.addActionListener(this);
      pan.add(b2);
     
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_return_16px.png");
      b3 = new JButton("Return");
      b3.setBounds(400,380,100,40);
      b3.setIcon(pic);
      b3.addActionListener(this);
      pan.add(b3);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_shutdown_16px.png");
      b4 = new JButton("Exit");
      b4.setBounds(550,380,120,40);
      b4.setIcon(pic);
      b4.addActionListener(this);
      pan.add(b4);
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource() == b1)
        {
            try{
                
                DBConnection db = new DBConnection();
                String tagno = t1.getText();
                String customername = t2.getText();
                String sex = t3.getText();
                String phoneno = t4.getText();
                String city = t5.getText();
                String locality = t6.getText();
                String village = t7.getText();
                String houseno = t8.getText();
                String sql = "INSERT INTO CustomerRegistration(CounterTagNo,CustomerFullName,Sex,PhoneNumber,SurroundingCity,Locality,Village,HouseNumber)"+ "VALUES('"+tagno+"','"+customername+"','"+sex+"','"+phoneno+"','"+city+"','"+locality+"','"+village+"','"+houseno+"');";
                if(tagno.equals("")||customername.equals("")||sex.equals("")||phoneno.equals("")||city.equals("")||locality.equals("")||village.equals("")||houseno.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Fill All The Datas", "", JOptionPane.ERROR);
                }
                else
                {
                db.s.execute(sql);
                JOptionPane.showMessageDialog(null,"*****Customer Added*****","Water Billing System",JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Something Error","Water Billing System",JOptionPane.ERROR_MESSAGE);
            }
        }
       if(evt.getSource() == b2 )
       {
           t1.setText("");
           t2.setText("");
           t3.setText("");
           t4.setText("");t5.setText("");t6.setText("");t7.setText("");t8.setText("");
           
       }
       if(evt.getSource() == b3)
       {
           dispose();
           new Main_Page();
       }
       if(evt.getSource() == b4)
       {
           int a = JOptionPane.showConfirmDialog(null, "Are you sure to exit?");
           if(a == JOptionPane.YES_OPTION)
           {
               System.exit(0);
           }
       }
        
    }
    
    public static void main(String args [])
    {
        new Customer_Registration_Form();
    }
}
