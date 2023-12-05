package Mini_Project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_Page2 extends JFrame implements ActionListener {
    
    JLabel lb1,lb2,lb3,lb4;
    JButton btn1,btn2,btn3,btn4,btn5,btn6;
    JPanel pan;
    ImageIcon pic;
    public Main_Page2()
    {
       setSize(700,600);
       setVisible(true);
       setLayout(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setTitle("Water Billing System");
       Image Icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_plumbing_40px_1.png");
       setIconImage(Icon);
       setLocation(280,40);
       
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
      
    
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_cash_in_hand_40px.png");
      btn3 = new JButton("Bill Payment Form");
      btn3.setBounds(200,250,280,40);
      btn3.setIcon(pic);
      btn3.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      pan.add(btn3);
      btn3.addActionListener(this);
      
     
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_shutdown_64px.png");
      btn5 = new JButton("Log Out");
      btn5.setBounds(200,350,280,40);
      btn5.setIcon(pic);
      pan.add(btn5);
      btn5.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      btn5.addActionListener(this);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_cancel_64px.png");
      btn6 = new JButton("Exit");
      btn6.setBounds(200,450,280,40);
      pan.add(btn6);
      btn6.setFont(new Font("Times New Roman",Font.BOLD+Font.ITALIC,14));
      btn6.setIcon(pic);
      btn6.addActionListener(this);
    
    }
   
    
    public void actionPerformed(ActionEvent evt)
    {
       
       
        if(evt.getSource() == btn3)
        {
            dispose();
            new Bill_Payment_Form();
        }
        
        if(evt.getSource() == btn5)
        {
            dispose();
            new Login_Form();
            
        }
        if(evt.getSource() == btn6)
        {
            int a = JOptionPane.showConfirmDialog(null, "Are You Sure To Exit?");
            if(a == JOptionPane.YES_OPTION);
            {
                System.exit(0);
            }
        }
    }
    
    public static void main(String args [])
    {
       new Main_Page2(); 
    }
}
