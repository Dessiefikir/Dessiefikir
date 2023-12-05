package Mini_Project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Monthly_Payment_Registration_DBGuid extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    JButton btn1,btn2;
    JPanel pan;
  public Monthly_Payment_Registration_DBGuid()
  {
      setSize(550,200);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Water Billing System");
      Image icn = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_plumbing_40px_1.png");
      setIconImage(icn);
      setLayout(null);
      setLocation(200,80); 
      pan = new JPanel();
       pan.setBounds(0,0,1500,800);
       pan.setLayout(null);
       pan.setBackground(Color.blue);
       add(pan);
      
      l1 = new JLabel("Counter TagNo");
      l1.setBounds(20,30,110,30);
      l1.setFont(new Font("Times New Roman",Font.BOLD,15));
      pan.add(l1);
      
      l2 = new JLabel("Last Read");
      l2.setBounds(160,30,100,30);
      l2.setFont(new Font("Times New Roman",Font.BOLD,15));
      pan.add(l2);
      
      l3 = new JLabel("Current Read");
      l3.setBounds(290,30,100,30);
      l3.setFont(new Font("Times New Roman",Font.BOLD,15));
      pan.add(l3);
      
      l4 = new JLabel("Month");
      l4.setBounds(430,30,100,30);
      l4.setFont(new Font("Times New Roman",Font.BOLD,15));
      pan.add(l4);
      
      tf1 = new JTextField();
      tf1.setBounds(20,60,100,30);
      tf1.setFont(new Font("Times New Roman",Font.BOLD,15));
      tf1.setEditable(false);
      pan.add(tf1);
      
      tf2 = new JTextField();
      tf2.setBounds(150,60,100,30);
      tf2.setFont(new Font("Times New Roman",Font.BOLD,15));
      tf2.setEditable(false);
     pan. add(tf2);
      
      tf3 = new JTextField();
      tf3.setBounds(280,60,100,30);
      tf3.setFont(new Font("Times New Roman",Font.BOLD,15));
      tf3.setEditable(false);
      pan.add(tf3);
      
      tf4 = new JTextField();
      tf4.setBounds(410,60,100,30);
      tf4.setFont(new Font("Times New Roman",Font.BOLD,15));
      tf4.setEditable(false);
      pan.add(tf4);
      
      tf5 = new JTextField();
      tf5.setBounds(20,120,120,30);
      tf5.setFont(new Font("Times New Roman",Font.BOLD,15));
      tf5.setToolTipText("Enter Counter TagNo");
      pan.add(tf5);
      tf5.requestFocus();
      tf5.addKeyListener(new KeyAdapter()
      {
              public void keyPressed(KeyEvent e)
              {
                  int key = e.getKeyCode();
                  if(key == KeyEvent.VK_RIGHT)
                  {
                      tf6.requestFocus();
                  }
              }
              
      }
      );
      
      tf6 = new JTextField();
      tf6.setBounds(160,120,120,30);
      tf6.setFont(new Font("Times New Roman",Font.BOLD,15));
      tf6.setToolTipText("Enter Month");
      pan.add(tf6);
      tf6.addKeyListener(new KeyAdapter()
      {
              public void keyPressed(KeyEvent e)
              {
                  int key = e.getKeyCode();
                  if(key == KeyEvent.VK_LEFT)
                  {
                      tf5.requestFocus();
                  }
              }
              
      }
      );
      
      btn1 = new JButton("Search");
      btn1.setBounds(300,120,100,30);
      btn1.setFont(new Font("Times New Roman",Font.BOLD,15));
      pan.add(btn1);
      btn1.addActionListener(this);
      
      btn2 = new JButton("Clear");
      btn2.setBounds(410,120,100,30);
      btn2.setFont(new Font("Times New Roman",Font.BOLD,15));
      pan.add(btn2);
      btn2.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent evt)
  {
      if (evt.getSource()==btn1)
      {
          DBConnection db = new DBConnection();
          try{
             
        String sql = "select * from payment where CounterTagNo = '"+tf5.getText()+"' and Month = '"+tf6.getText()+"'";
        ResultSet rs = db.s.executeQuery(sql);
        if(rs.next())
        {
        String tagno = rs.getString("CounterTagNo");
        String Ld = rs.getString("LastReading");
        String Cd = rs.getString("CurrentReading");
        String mon = rs.getString("Month");
        
        tf1.setText(tagno);
        tf2.setText(Ld);
        tf3.setText(Cd);
        tf4.setText(mon);
        
        }
        else
        {
          JOptionPane.showMessageDialog(this, "Please Enter Correct Counter TagNo and Month","Error",JOptionPane.ERROR_MESSAGE);  
        }
      }catch(Exception e)
      {
         JOptionPane.showMessageDialog(this, "Please Enter Counter TagNo and Month","Error",JOptionPane.ERROR_MESSAGE);
      }
     }
      if(evt.getSource() == btn2)
      {
          tf1.setText("");
          tf2.setText("");
          tf3.setText("");
          tf4.setText("");
          tf5.setText("");
          tf5.requestFocus();
      }
 }
  public static void main(String args[])
  {
    new Monthly_Payment_Registration_DBGuid();  
  }
}
