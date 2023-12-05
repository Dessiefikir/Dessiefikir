package Mini_Project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bill_Payment_Form extends JFrame implements ActionListener {
    JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lb16,lb17,lb18;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16;
    JButton btn1,btn2,btn3,btn4,btn5,btn6;
    JTextArea txtarea;
    ImageIcon pic;
    JPanel pan;
    
    public Bill_Payment_Form()
    {
       setLayout(null);
       setSize(1195,500);
       setVisible(true);
       Image icn = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_plumbing_40px_1.png");
       setIconImage(icn);
       setTitle("Water Billing System");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocation(100,100);
       
       pan = new JPanel();
       pan.setBounds(0,0,1500,800);
       pan.setLayout(null);
       pan.setBackground(Color.yellow);
       add(pan);
       
      lb1 = new JLabel("****Water Billing System****");
      lb1.setBounds(100,0,400,50);
      lb1.setFont(new Font("Times New Roman",Font.BOLD,24));
      pan.add(lb1);
      
      lb2 = new JLabel("...Bill Payment Form...");
      lb2.setBounds(50,45,250,50);
      lb2.setFont(new Font("Times New Roman",Font.BOLD,20));
      pan.add(lb2);
      
      lb3 = new JLabel("Counter TagNo:");
      lb3.setBounds(40,100,110,30);
      lb3.setFont(new Font("Times New Roman",Font.BOLD,15));
      pan.add(lb3);
      
      tf1 = new JTextField();
      tf1.setBounds(160,100,130,30);
      tf1.setFont(new Font("Times New Roman",Font.BOLD,15));
      tf1.setToolTipText("Enter Counter Tag Number");
      pan.add(tf1);
      tf1.addKeyListener(new KeyListener()
      {
         public void keyPressed(KeyEvent evt) {  
         int key = evt.getKeyCode();
         if(key == KeyEvent.VK_ENTER)
         {
             DBConnection db = new DBConnection();
            try{
                String sql = "select * from customerregistration where CounterTagNo = '"+tf1.getText()+"'";
                ResultSet rs = db.s.executeQuery(sql);
                if (rs.next())
                {
                   String a1 = rs.getString("CustomerFullName");
                   tf2.setText(a1);
                   String a2 = rs.getString("Sex");
                   tf3.setText(a2);
                   String a3 = rs.getString("PhoneNumber");
                   tf4.setText(a3);
                   String a4 = rs.getString("SurroundingCity");
                   tf5.setText(a4);
                   String a5 = rs.getString("Locality");
                   tf6.setText(a5);
                   String a6 = rs.getString("Village");
                   tf7.setText(a6);
                   String a7 = rs.getString("HouseNumber");
                   tf8.setText(a7);
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "There is No Customer In This TagNo\n....ERROR....","Water Billing System",JOptionPane.ERROR_MESSAGE);  
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "There is No Customer In This TagNo\n....ERROR....","Water Billing System",JOptionPane.ERROR_MESSAGE);
            }
         }
    }  
         public void keyReleased(KeyEvent e) {  
        
    }  
         public void keyTyped(KeyEvent e) {  
         
    }  
      }
      );
      
      btn1 = new JButton("Go");
      btn1.setBounds(300,100,50,30);
      btn1.addActionListener(this);
      pan.add(btn1);
      
      
      lb4 = new JLabel("Payment Month:");
      lb4.setBounds(400,100,110,30);
      lb4.setFont(new Font("Times New Roman",Font.BOLD,15));
      pan.add(lb4);
      
      tf16 = new JTextField();
      tf16.setBounds(520,100,130,30);
      tf16.setFont(new Font("Times New Roman",Font.BOLD,15));
      tf16.setToolTipText("Enter Payment Month");
      pan.add(tf16);
      
      lb5 = new JLabel("Customer's Full Name:");
      lb5.setBounds(40,150,130,30);
      lb5.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb5);
      
      lb6 = new JLabel("Sex:");
      lb6.setBounds(40,180,100,30);
      lb6.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb6);
      
      lb7 = new JLabel("Phone No:");
      lb7.setBounds(40,210,100,30);
      lb7.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb7);
      
      lb8 = new JLabel("Surrounding City:");
      lb8.setBounds(40,240,120,30);
      lb8.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb8);
      
      lb9 = new JLabel("Locality/Kebele:");
      lb9.setBounds(40,270,120,30);
      lb9.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb9);
      
      lb10 = new JLabel("Village:");
      lb10.setBounds(40,300,120,30);
      lb10.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb10);
      
      lb11 = new JLabel("House No:");
      lb11.setBounds(40,330,120,30);
      lb11.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb11);
      
      tf2 = new JTextField();
      tf2.setBounds(190,155,140,25);
      tf2.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf2);
      
      tf3 = new JTextField();
      tf3.setBounds(190,185,140,25);
      tf3.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf3);
      
      tf4 = new JTextField();
      tf4.setBounds(190,215,140,25);
      tf4.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf4);
      
      tf5 = new JTextField();
      tf5.setBounds(190,245,140,25);
      tf5.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf5);
      
      tf6 = new JTextField();
      tf6.setBounds(190,275,140,25);
      tf6.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf6);
      
      tf7 = new JTextField();
      tf7.setBounds(190,305,140,25);
      tf7.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf7);
      
      tf8 = new JTextField();
      tf8.setBounds(190,335,140,25);
      tf8.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf8);
      
      lb12 = new JLabel("Date Of Payment:");
      lb12.setBounds(400,150,120,30);
      lb12.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb12);
      
      tf9 = new JTextField();
      tf9.setBounds(520,155,140,25);
      tf9.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf9);
      
      lb13 = new JLabel("Last Reading:");
      lb13.setBounds(400,180,120,30);
      lb13.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb13);
      
      tf10 = new JTextField();
      tf10.setBounds(520,185,140,25);
      tf10.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf10);
      
      lb14 = new JLabel("Current Reading:");
      lb14.setBounds(400,210,120,30);
      lb14.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb14);
      
      tf11 = new JTextField();
      tf11.setBounds(520,215,140,25);
      tf11.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf11);
      
      lb15 = new JLabel("Unit/MeterCube:");
      lb15.setBounds(400,240,120,30);
      lb15.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb15);
      
      tf12 = new JTextField();
      tf12.setBounds(520,245,140,25);
      tf12.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf12);
     
      lb16 = new JLabel("Monthly Payment:");
      lb16.setBounds(400,270,120,30);
      lb16.setFont(new Font("Times New Roman",Font.BOLD,12));  
      pan.add(lb16);
      
      tf13 = new JTextField();
      tf13.setBounds(520,275,140,25);
      tf13.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf13);
      
      lb17 = new JLabel("Tax:");
      lb17.setBounds(400,300,120,30);
      lb17.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb17);
      
      tf14 = new JTextField();
      tf14.setBounds(520,305,140,25);
      tf14.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf14);
      
      lb18 = new JLabel("Total Payment:");
      lb18.setBounds(400,335,120,30);
      lb18.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(lb18);
      
      tf15 = new JTextField();
      tf15.setBounds(520,335,140,25);
      tf15.setFont(new Font("Times New Roman",Font.BOLD,12));
      pan.add(tf15);
      
      txtarea = new JTextArea();
      txtarea.setBounds(700,0,480,500);
      txtarea.setFont(new Font("Times New Roman",Font.BOLD,15));
      pan.add(txtarea);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_cash_in_hand_40px.png");
      btn2 = new JButton("Pay");
      btn2.setBounds(40,380,100,30);
      btn2.setIcon(pic);
      btn2.addActionListener(this);
      pan.add(btn2);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_invoice_16px.png");
      btn3 = new JButton("Recipt");
      btn3.setBounds(180,380,100,30);
      btn3.setIcon(pic);
      btn3.addActionListener(this);
      pan.add(btn3);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_print_26px.png");
      btn4 = new JButton("Print");
      btn4.setBounds(320,380,100,30);
      btn4.setIcon(pic);
      btn4.addActionListener(this);
      pan.add(btn4);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_return_16px.png");
      btn5 = new JButton("Return");
      btn5.setBounds(460,380,100,30);
      btn5.setIcon(pic);
      btn5.addActionListener(this);
      pan.add(btn5);
      
      pic = new ImageIcon("C:\\Users\\Thomas\\Documents\\NetBeansProjects\\Water Billing System\\src\\Mini_Project\\Images\\icons8_reset_16px.png");
      btn6 = new JButton("Reset");
      btn6.setIcon(pic);
      btn6.setBounds(595,380,100,30);
      btn6.addActionListener(this);
      pan.add(btn6);
      calander();
      editable();
    }
    
    public void actionPerformed(ActionEvent evt)
    {
        if(evt.getSource() == btn1)
        {
            DBConnection db = new DBConnection();
            try{
                String sql = "select * from customerregistration where CounterTagNo = '"+tf1.getText()+"'";
                ResultSet rs = db.s.executeQuery(sql);
                if (rs.next())
                {
                   String a1 = rs.getString("CustomerFullName");
                   tf2.setText(a1);
                   String a2 = rs.getString("Sex");
                   tf3.setText(a2);
                   String a3 = rs.getString("PhoneNumber");
                   tf4.setText(a3);
                   String a4 = rs.getString("SurroundingCity");
                   tf5.setText(a4);
                   String a5 = rs.getString("Locality");
                   tf6.setText(a5);
                   String a6 = rs.getString("Village");
                   tf7.setText(a6);
                   String a7 = rs.getString("HouseNumber");
                   tf8.setText(a7);
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "There is No Customer In This TagNo\n....ERROR....","Water Billing System",JOptionPane.ERROR_MESSAGE);  
                }
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "There is No Customer In This TagNo\n....ERROR....","Water Billing System",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(evt.getSource()==btn2)
        {
            payment();
            
        }
        if(evt.getSource()== btn3)
        {
            try {
                recipt();
            } catch (Exception ex) {
                Logger.getLogger(Bill_Payment_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(evt.getSource()== btn4)
        {
            print();
        }
        if(evt.getSource()==btn5)
        {
            dispose();
            new Main_Page2();
        }
        if(evt.getSource()==btn6)
        {
            clear();
        }
    }
    public void payment()
    {
        Double constant = 0.95;
        Double unit;
        Double tax;
        Double monthlypayment;
        Double totalpayment;
        try{
            DBConnection db = new DBConnection();
            String sql = "select * from payment where CounterTagNo = '"+tf1.getText()+"' and Month = '"+tf16.getText()+"'";
            ResultSet rs = db.s.executeQuery(sql);
            if(rs.next())
            {
             int a = rs.getInt("LastReading");
             tf10.setText(""+a);
             int b = rs.getInt("CurrentReading");
             tf11.setText(""+b);
             
             Double aa = Double.parseDouble(tf10.getText());
             Double bb = Double.parseDouble(tf11.getText());
             
             unit = bb - aa;
             tf12.setText(unit.toString());
             monthlypayment = unit * constant;
             tax = (monthlypayment * 5)/100;
             totalpayment = monthlypayment + tax;
             
             tf13.setText(monthlypayment.toString());
             tf14.setText(tax.toString());
             tf15.setText(totalpayment.toString());
            }
            else
            {
                JOptionPane.showMessageDialog(null,"There Is Something Wrong\nPlease Check Payment Month and Counter TagNo","Water Billing System",JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e)
          {
           JOptionPane.showMessageDialog(null,"There Is Something Wrong\nContact The Administrator","Water Billing System",JOptionPane.ERROR_MESSAGE);
          }
     }
    public void calander()
    {
        Calendar cc = new GregorianCalendar(); 
                int month = cc.get(Calendar.MONTH);
                int year = cc.get(Calendar.YEAR);
                int day = cc.get(Calendar.DAY_OF_MONTH);
                tf9.setText("     "+day+" - "+month+" - "+year);
    }
    public void editable()
    {
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
        tf5.setEditable(false);
        tf6.setEditable(false);
        tf7.setEditable(false);tf8.setEditable(false);tf9.setEditable(false);tf10.setEditable(false);tf11.setEditable(false);
        tf12.setEditable(false);tf13.setEditable(false);tf14.setEditable(false);tf15.setEditable(false);txtarea.setEditable(false);
    }
    public void recipt() throws Exception
    {
        DBConnection db = new DBConnection();
        String sql = "select * from payment where CounterTagNo= '"+tf1.getText()+"'"+"and Month ='"+tf16.getText()+"'";
        ResultSet rs = db.s.executeQuery(sql);
       
        if(rs.next())
        {
            String a = rs.getString("Status");
        if(a.equals("paid"))
        {
            JOptionPane.showMessageDialog(rootPane,"Already Paid","Water Billing System",JOptionPane.INFORMATION_MESSAGE);
        }
       else
        {
        txtarea.setText(".........................Water Billing System...................\n"
                + "\n........Bill Payment Recipt....."
                +"\n\nDate Of Payment:"+tf9.getText()+" GC"
                +"\n--------------------------------------------------------------"
                +"\nCounter TagNo:\t"+tf1.getText()
                +"\nCustomer FullName:\t"+tf2.getText()
                +"\nSex:\t\t"+tf3.getText()
                +"\nPhone Number:\t"+tf4.getText()
                +"\nSurrounding City:\t"+tf5.getText()
                +"\nLocality:\t\t"+tf6.getText()
                +"\nVillage:\t\t"+tf7.getText()
                +"\nHouse Number:\t"+tf8.getText()
                +"\n-----------------------------"
                +"\nLast Reading:\t"+tf10.getText()
                +"\nCurrent Reading:\t"+tf11.getText()
                +"\nUnit/MeterCube:\t"+tf12.getText()
                +"\n-----------------------------"
                +"\nMonthly Payment:\t"+tf13.getText()
                +"\nTax:\t\t"+tf14.getText()
                +"\nTotal Payment:\t"+tf15.getText());
        String pay = "update payment set Status = ? where CounterTagNo = ?";
        PreparedStatement pst = db.c.prepareStatement(pay);
        pst.setString(1,"paid");
        pst.setString(2, tf1.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(rootPane,"paid","Water Billing System",JOptionPane.INFORMATION_MESSAGE);
        pst.close();
        }
    }
    }
    public void print()
    {
        try {
            Boolean print = txtarea.print();
            if(print)
            {
                JOptionPane.showMessageDialog(null,".....Success.....","",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,".....Error.....","",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (PrinterException ex) {
            Logger.getLogger(Bill_Payment_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void clear()
    {
        tf1.setText("");
        tf2.setText("");tf3.setText("");tf4.setText("");tf5.setText("");tf6.setText("");tf7.setText("");tf8.setText("");
        tf10.setText("");tf11.setText("");tf12.setText("");tf13.setText("");tf14.setText("");tf15.setText("");
        txtarea.setText("");
    }
    public static void main(String args[])
    {
        new Bill_Payment_Form();
    }
}
