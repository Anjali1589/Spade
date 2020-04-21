package software;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
class login extends JFrame implements ActionListener
{
    
      JButton b1,b2;
    login()
    {
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setResizable(false);
        setSize(900,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon i1=new ImageIcon("C:\\Users\\Shyam\\Downloads\\21.jpg");
        Image img=i1.getImage();
        Image temp=img.getScaledInstance(900, 700, Image.SCALE_SMOOTH);
        JLabel j1=new JLabel("",i1,JLabel.CENTER);
        j1.setBounds(0,0,900,700);
        j1.setVisible(true);
        add(j1);
        
        
        JPanel p4=new JPanel();
        p4.setBounds(30, 200, 200, 230);
        p4.setBackground(new Color(0,0,0,30));
        
        p4.setSize(230,230);
       
        ImageIcon I1 = new ImageIcon("C:\\Users\\Shyam\\Downloads\\7.jpg");
        Image I2 = I1.getImage();
        Image I4=I2.getScaledInstance(230,230,Image.SCALE_SMOOTH);
        JLabel L3=new JLabel("", I1,JLabel.CENTER);
        L3.setBounds(50, 200, 170, 290);
        p4.add(L3);
        
        
        Font f=new Font("Serif",Font.BOLD,60);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(0,0,0,30));
        p1.setBounds(0, 0, 900, 100);
        JLabel j2=new JLabel("ADMIN LOGIN");
        j2.setForeground(Color.WHITE);
        j2.setBounds(200,100 ,400,100);
        j2.setFont(f);
        p1.add(j2);
        p1.setVisible(true);
      
        Font f2=new Font("Serif",Font.BOLD,20);
        
        JPanel l=new JPanel();
        l.setLayout(null);
        l.setSize(450,400);
        l.setBackground(new Color(0,0,0,30));
        l.setBounds(340, 170, 450, 400);
        
       JLabel L1,L2;
        L1 = new JLabel("Username");
        L1.setBounds(60,100,100,30);
        L1.setForeground(Color.WHITE);
        L1.setFont(f2);
        l.add(L1);
        
        L2 = new JLabel("Password");
        L2.setBounds(60,170,100,30);
        L2.setForeground(Color.WHITE);
        L2.setFont(f2);
        l.add(L2);
 
        JTextField t1,t2;
        t1=new JTextField();
        t1.setBounds(170,100,180,30);
        l.add(t1);

        t2=new JPasswordField();
        t2.setBounds(170,170,180,30);
        l.add(t2);
        
      
        b1 = new JButton("Login");
        b1.setBounds(60,260,140,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setForeground(Color.black);
        l.add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(240,260,140,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setForeground(Color.black);
        l.add(b2);
   
      add(l);
     
      j1.add(p4);
        j1.add(p1);
        j1.add(l);
         add(j1);
       setLocationRelativeTo(null);
       setLayout(null);
       setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae)
   {
    if(ae.getSource()==b1)
            {
                Project P=  new Project();
                setVisible(false);
            }
     if(ae.getSource()==b2)
            {
                System.exit(0);
            }
    }
    public static void main(String s[])
    {
        new login();
    }

    
    

}