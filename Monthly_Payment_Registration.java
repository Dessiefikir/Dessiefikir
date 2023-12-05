package Mini_Project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Monthly_Payment_Registration extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4,b5;
    ImageIcon pic;
    JPanel pan;
    public Monthly_Payment_Registration()
    {
        setSize(600,500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Water Billing System");
        Image icn = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_plumbing_40px_1.png");
        setIconImage(icn);
        setLocation(270,80);
        
       pan = new JPanel();
       pan.setBounds(0,0,1500,800);
       pan.setLayout(null);
       pan.setBackground(Color.yellow);
       add(pan);
       
      l1 = new JLabel("****Water Billing System****");
      l1.setBounds(100,0,400,50);
      l1.setFont(new Font("Times New Roman",Font.BOLD,24));
      pan.add(l1);
      
      l2 = new JLabel("...Monthly Payment Registration...");
      l2.setBounds(50,45,400,50);
      l2.setFont(new Font("Times New Roman",Font.BOLD,20));
      pan.add(l2);
      
      l3 = new JLabel("Counter TagNo:");
      l3.setBounds(40,150,100,30);
      l3.setFont(new Font("Times New Roman",Font.BOLD,14));
      pan.add(l3);
      
      l4 = new JLabel("Last Reading:");
      l4.setBounds(40,200,120,30);
      l4.setFont(new Font("Times New Roman",Font.BOLD,14));
      pan.add(l4);
      
      l5 = new JLabel("Current Reading:");
      l5.setBounds(40,250,120,30);
      l5.setFont(new Font("Times New Roman",Font.BOLD,14));
      pan.add(l5);
      
      l6 = new JLabel("Payment Month:");
      l6.setBounds(40,300,120,30);
      l6.setFont(new Font("Times New Roman",Font.BOLD,14));
      pan.add(l6);
      
      t1 = new JTextField();
      t1.setBounds(180,150,140,30);
      t1.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t1);
      t1.addKeyListener(new KeyListener()
      {
         public void keyPressed(KeyEvent evt) {  
            int key = evt.getKeyCode();
            if(key == KeyEvent.VK_ENTER)
            {
          try{
          DBConnection db = new DBConnection();
          String sql = "select * from customerregistration where CounterTagNo = '"+t1.getText()+"'";
          ResultSet rs = db.s.executeQuery(sql);
            
          if(rs.next())
          {
              enable();
          }
          else
          {
             JOptionPane.showMessageDialog(null,"There Is No Customer\nIn This Tag Number","Water Billing System",JOptionPane.ERROR_MESSAGE); 
          }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"There Is No Customer\nIn This Tag Number","Water Billing System",JOptionPane.ERROR_MESSAGE);
            }
            }
         }    
         public void keyReleased(KeyEvent e) {  
        
    }  
         public void keyTyped(KeyEvent e) {  
         
    }  
      }
      );

      
      t2 = new JTextField();
      t2.setBounds(180,200,140,30);
      t2.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t2);
      
      t3 = new JTextField();
      t3.setBounds(180,250,140,30);
      t3.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t3);
      
      t4 = new JTextField();
      t4.setBounds(180,300,140,30);
      t4.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(t4);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_registered_trademark_24px.png");
      b1 = new JButton("Register");
      b1.setBounds(50,360,110,30);
      b1.setIcon(pic);
      b1.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      pan.add(b1);
      b1.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_reset_16px.png");
      b2 = new JButton("Reset");
      b2.setBounds(180,360,100,30);
      b2.setIcon(pic);
      b2.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      pan.add(b2);
      b2.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_return_16px.png");
      b3 = new JButton("Return");
      b3.setBounds(350,360,100,30);
      b3.setIcon(pic);
      b3.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      pan.add(b3);
      b3.addActionListener(this);
      
      b4 = new JButton("Go");
      b4.setBounds(330,150,50,30);
      pan.add(b4);
      b4.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_info_16px.png");
      b5 = new JButton("Help");
      b5.setBounds(460,360,100,30);
      b5.setIcon(pic);
      pan.add(b5);
      b5.addActionListener(this);
      
      disable();
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_water_80px.png");
      l7 = new JLabel();
      l7.setBounds(400,0,200,200);
      l7.setIcon(pic);
      pan.add(l7);
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource() == b4)
        {
            try{
          DBConnection db = new DBConnection();
          String sql = "select * from customerregistration where CounterTagNo = '"+t1.getText()+"'";
          ResultSet rs = db.s.executeQuery(sql);
            
          if(rs.next())
          {
              enable();
          }
          else
          {
             JOptionPane.showMessageDialog(null,"There Is No Customer\nIn This Tag Number","",JOptionPane.ERROR_MESSAGE); 
          }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"There Is No Customer\nIn This Tag Number","",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(evt.getSource()== b1)
        {
          register();  
        }
        if(evt.getSource()== b2)
        {
            reset();
        }
        if(evt.getSource()== b3)
        {
            exit();
        }
        if(evt.getSource() == b5)
        {
            new Monthly_Payment_Registration_DBGuid().setVisible(true);
        }
    }
    
    public void register()
    {
        DBConnection db = new DBConnection();
        
        try{
            String tagno = t1.getText();
            String month = t4.getText();
            String a= "";
            int last = Integer.parseInt(t2.getText());
            int current = Integer.parseInt(t3.getText());
            
            String sql = "INSERT INTO payment (CounterTagNo,LastReading,CurrentReading,Month,Status)"+ "VALUES ('"+tagno+"','"+last+"','"+current+"','"+month+"','"+a+"');";
            
            if(tagno.equals("") || month.equals(""))
            { 
               JOptionPane.showMessageDialog(null,"Please Fill All The Datas","Water Billing System",JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                db.s.execute(sql);
                JOptionPane.showMessageDialog(null,"Successfully Registerd","Water Billing System",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Please Fill All The Datas","Water Billing System",JOptionPane.ERROR_MESSAGE);  
        }
    }
    
    public void reset()
    {
        t1.setText("");t2.setText("");t3.setText("");//t4.setText("");
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
    }
    public void exit()
    {
       /* int a = JOptionPane.showConfirmDialog(null, "Are You Sure To Exit?");
        if(a == JOptionPane.YES_OPTION);
        {
            System.exit(0);
        }*/
        dispose();
        new Main_Page();
    }
    public void disable()
    {
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
    }
    public void enable()
    {
        t2.setEnabled(true);
        t3.setEnabled(true);
        t4.setEnabled(true);
    }
    
    public static void main(String args [])
    {
      new Monthly_Payment_Registration();  
    }
    
}
