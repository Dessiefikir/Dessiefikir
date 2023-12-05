package Mini_Project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_Page extends JFrame implements ActionListener {
    
    JLabel lb1,lb2,lb3,lb4;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    JPanel pan;
    ImageIcon pic;
    public Main_Page()
    {
       setSize(760,700);
       setVisible(true);
       setLayout(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("Water Billing System");
       Image Icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_plumbing_40px_1.png");
       setIconImage(Icon);
       setLocation(240,10);
       
       pan = new JPanel();
       pan.setBounds(0,0,1500,800);
       pan.setLayout(null);
       pan.setBackground(Color.yellow);
       add(pan);
       
      lb1 = new JLabel("****Water Billing System****");
      lb1.setBounds(150,0,400,50);
      lb1.setFont(new Font("Times New Roman",Font.BOLD,30));
      lb1.setForeground(Color.red);
      pan.add(lb1);
      
      lb2 = new JLabel(".....Main Page.....");
      lb2.setBounds(220,60,250,50);
      lb2.setFont(new Font("Times New Roman",Font.BOLD,30));
      lb2.setForeground(Color.red);
      pan.add(lb2);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_water_100px.png");
      lb3 = new JLabel();
      lb3.setBounds(270,80,200,200);
      lb3.setIcon(pic);
      pan.add(lb3);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_create_24px.png");
      btn1 = new JButton("Create Account For Sales Person");
      btn1.setBounds(40,270,280,40);
      btn1.setIcon(pic);
      btn1.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      pan.add(btn1);
      btn1.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_registration_16px.png");
      btn2 = new JButton("Customer Registration");
      btn2.setBounds(400,270,280,40);
      btn2.setIcon(pic);
      btn2.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      pan.add(btn2);
      btn2.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_cash_in_hand_40px.png");
      btn3 = new JButton("Bill Payment Form");
      btn3.setBounds(40,360,280,40);
      btn3.setIcon(pic);
      btn3.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      pan.add(btn3);
      btn3.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_payment_history_48px.png");
      btn4 = new JButton("Monthly Payment Registration");
      btn4.setBounds(400,360,280,40);
      btn4.setIcon(pic);
      btn4.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      pan.add(btn4);
      btn4.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_shutdown_64px.png");
      btn5 = new JButton("Log Out");
      btn5.setBounds(40,540,280,40);
      btn5.setIcon(pic);
      pan.add(btn5);
      btn5.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      btn5.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_cancel_64px.png");
      btn6 = new JButton("Exit");
      btn6.setBounds(400,540,280,40);
      pan.add(btn6);
      btn6.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      btn6.setIcon(pic);
      btn6.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_database_view_16px.png");
      btn7 = new JButton("Customer Registration DB");
      btn7.setBounds(40,450,280,40);
      pan.add(btn7);
      btn7.setIcon(pic);
      btn7.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      btn7.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_database_view_16px.png");
      btn8 = new JButton("Monthly Payment Registration DB");
      btn8.setBounds(400,450,280,40);
      pan.add(btn8);
      btn8.setIcon(pic);
      btn8.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      btn8.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource() == btn1)
        {
            dispose();
            new Create_Account_Form();
        }
        if(evt.getSource() == btn2)
        {
            dispose();
            new Customer_Registration_Form();
            
        }
        if(evt.getSource() == btn3)
        {
            dispose();
            new Bill_Payment_Form();
        }
        if(evt.getSource() == btn4)
        {
            dispose();
            new Monthly_Payment_Registration();
        }
        if(evt.getSource() == btn5)
        {
            dispose();
            new Login_Form();
            
        }
        if(evt.getSource() == btn6)
        {
            int a = JOptionPane.showConfirmDialog(this, "Are You Sure To Exit?");
            if(a == JOptionPane.YES_OPTION);
            {
                System.exit(0);
            }
        }
        if(evt.getSource() == btn7)
        {
            dispose();
            new Customer_Registration_DB_Table().setVisible(true);
        }
        if(evt.getSource() == btn8)
        {
            dispose();
            new Monthly_Payment_RegistrationDB().setVisible(true);
        }
    }
    
    public static void main(String args [])
    {
       new Main_Page(); 
    }
}
