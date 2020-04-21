package software;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class Member extends JFrame implements  ActionListener
{
    JPanel b1,b2,b3;
    Member()
    {
     super("Member List");
     setSize(1920,1030);
     Font f1=new Font("Calibri", Font.BOLD ,20);
     setExtendedState(JFrame.MAXIMIZED_HORIZ);
     setResizable(false);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        ImageIcon i1=new ImageIcon("C:\\Users\\Shyam\\Downloads\\31.jpg");
        Image img=i1.getImage();
        Image temp=img.getScaledInstance(1 ,1, Image.SCALE_DEFAULT);
        JLabel j1=new JLabel(i1);
 
       JTabbedPane t1 = new JTabbedPane();
        t1.setSize(1900,1000);

    b1 = new JPanel();
    b2 = new JPanel();
    b3= new JPanel();
   
    t1.setFont(f1);
    t1.addTab("Staff", b1);
    t1.addTab("Staff Details ", b2);
    t1.addTab("Teaching Staff", b3);
    
    b1.setLayout(new BorderLayout());
    b2.setLayout(new BorderLayout());
    
    b1.add(j1);

add(t1);

setVisible(true);
    
    }
    
    public static void main(String s[])
    {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
