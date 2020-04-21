package software;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Project extends JFrame implements ActionListener 
{
 Project()
 {
     
     super("WELCOME ADMIN");
     setSize(1920,1030);
      Font f3=new Font("Calibri", Font.BOLD ,90);
     Font f1=new Font("Calibri", Font.BOLD ,20);
     Font f2=new Font("Serif",Font.BOLD,20);
     setExtendedState(JFrame.MAXIMIZED_HORIZ);
     setResizable(false);
     setLayout(null);
       
     
        
       //ImageIcon i1=new ImageIcon("C:\\Users\\Shyam\\Downloads\\32.jpg");
        ImageIcon i1=new ImageIcon("C:\\Users\\Shyam\\Downloads\\30.jpg");
        Image img=i1.getImage();
        Image temp=img.getScaledInstance(900,10, Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(img);
        JLabel j1=new JLabel(i2);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        
         JPanel p4=new JPanel(); 
         p4.setBounds(450,100,1000,100);
         p4.setBackground(new Color(0,0,0,60));
         j1.add(p4);
        JLabel l1=new JLabel("HOME PAGE");
        l1.setBounds(300,300,400,60);
        l1.setForeground(Color.GREEN);
        l1.setFont(f3);
        p4.add(l1);
        
    JMenuBar m1=new JMenuBar();
    JMenu mm1=new JMenu("ACCOUNT");
     mm1.setFont(f1);
     JMenuItem m2=new JMenuItem("Students");
     JMenuItem m3=new JMenuItem("Staff");
     mm1.add(m2);
     mm1.add(m3);
     m2.setFont(f2);
     m3.setFont(f2);
     mm1.setBackground(Color.WHITE);
     mm1.setForeground(Color.blue);
     
    
    mm1.addActionListener((ActionListener) this);
    mm1.setLayout(new BorderLayout());
    JMenu mm2=new JMenu("MEMBERS");
    mm2.setFont(f1);
    mm2.setBackground(Color.WHITE);
    mm2.addActionListener(this);
    JMenuItem m4=new JMenuItem("Students Details");
    JMenuItem m5=new JMenuItem("Staff Details");
    m4.setFont(f2);
    m5.setFont(f2);
    mm2.add(m4);
    mm2.add(m5);
   
     
     mm2.setForeground(Color.blue);
     JMenu mm3=new JMenu("INFRASTRUCTUTE");
     mm3.setFont(f1);
     mm3.setBackground(Color.WHITE);
     mm3.addActionListener(this);
    JMenuItem m6=new JMenuItem("Teacher Requirements");
    JMenuItem m7=new JMenuItem("House Keeping Requirements");
    JMenu m16=new JMenu("Resources");
    JMenuItem m15=new JMenuItem("Bus Expense");
    JMenuItem m17=new JMenuItem("Electricity");
    JMenuItem m18=new JMenuItem("Bill Board Band");
    JMenuItem m19=new JMenuItem("Daily Expenditure");
        m16.setFont(f2);
        m17.setFont(f2);
        m18.setFont(f2);
        m19.setFont(f2);
        m6.setFont(f2);
        m7.setFont(f2);
        m15.setFont(f2);
    mm3.add(m6);
    mm3.add(m7);
    mm3.add(m16);
     m16.add(m15);
     m16.add(m17);
     m16.add(m18);
     m16.add(m19);
    mm3.setForeground(Color.blue);
     
     JMenu mm4=new JMenu("TRANSPORTATION");
     mm4.setFont(f1);
     mm4.setBackground(Color.WHITE);
     mm4.addActionListener(this);
    JMenuItem m8=new JMenuItem("Driver Details");
    JMenuItem m9=new JMenuItem("GPS");
    JMenu m12=new JMenu("Bus ");
    JMenuItem m13=new JMenuItem("Student");
    JMenuItem m14=new JMenuItem("Staff");
    m8.setFont(f2);
    m9.setFont(f2);
    m12.setFont(f2);
    m13.setFont(f2);
    m14.setFont(f2);
    
    mm4.add(m8);
    mm4.add(m9);
    mm4.add(m12);
    m12.add(m13);
    m12.add(m14);
     mm4.setForeground(Color.blue); 
    
    
      
     JMenu mm5=new JMenu("SECURITY");
     mm5.setFont(f1);
     mm5.setBackground(Color.WHITE);
     mm5.addActionListener(this);
    JMenuItem m10=new JMenuItem("CCTV");
     m10.setFont(f2);
    mm5.add(m10);
    mm5.setForeground(Color.blue);
    
   JMenu mm6=new JMenu("ABOUT_US");
     mm6.setFont(f1);
     mm6.setBackground(Color.WHITE);
     mm6.addActionListener(this);
     mm6.setForeground(Color.blue);
    
     JMenu mm7=new JMenu("CONTACT_US");
     mm7.setFont(f1);
     mm7.setBackground(Color.WHITE);
     mm7.addActionListener(this);
     mm7.setForeground(Color.blue);
     
     JMenu mm8=new JMenu("EXIT");
     mm8.setFont(f1);
     mm8.setBackground(Color.WHITE);
     mm8.addActionListener(this);
     mm8.setForeground(Color.blue);
     
     JMenu mm9=new JMenu("HOME");
     mm9.setFont(f1);
     mm9.setBackground(Color.WHITE);
     mm9.addActionListener(this);
     mm9.setForeground(Color.blue);
     
     m1.add(mm9);
     m1.add(mm1);
     m1.add(mm2);
     m1.add(mm3);
     m1.add(mm4);
     m1.add(mm5);
     m1.add(mm6);
     m1.add(mm7);
     m1.add(mm8);
   
    // setJMenuBar(m1);
   setLayout(new FlowLayout());
     add(j1);
     setJMenuBar(m1);
     
      
        setVisible(true);

     
         
     
 }
    public void actionPerformed(ActionEvent ae)
     {
         String str=ae.getActionCommand();
         if(str.equals("Students"))
         {
             Student st=new Student();
             st.setVisible(true);
             
         }
         if(str.equals("Staff"))
         {
          new Staff().setVisible(true);   
         }
         if(str.equals("Bus"))
         {
             new Bus().setVisible(true);
         }
         if(str.equals("EXIT"))
         {
             System.exit(0);
         }
     }
     
     
     
 
 public static void main(String s[])
 {
  new Project();   
 }
    
}
