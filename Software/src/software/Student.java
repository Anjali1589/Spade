package software;
import java.awt.*;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
public class Student extends JFrame implements  ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
Student()
{
 super("Students Details");
 setSize(1930,1020);
 setLayout(null);
 setExtendedState(JFrame.MAXIMIZED_HORIZ);
 setResizable(false);
 
        ImageIcon i1=new ImageIcon("C:\\Users\\Shyam\\Downloads\\29.jpg");
        Image img=i1.getImage();
        Image temp=img.getScaledInstance(1 ,1, Image.SCALE_DEFAULT);
        JLabel j1=new JLabel(i1);
        j1.setBounds(0,1,1400,750);
        
        
        JPanel p1=new JPanel();
        p1.setBounds(10,70,270,440);
        p1.setBackground(new Color(0,0,0,34));
        p1.setLayout(null);
       
 b1=new JButton("Students Details");
 b1.setBounds(20,40,230,40);
 b1.setLayout(new GridLayout());

 b2=new JButton("Fee Details");
 b2.setBounds(20,80,230,40);
  b2.setLayout(new GridLayout());

 b3=new JButton("Acedemic Details");
 b3.setBounds(20,120,230,40);
  b3.setLayout(new GridLayout());

 b4=new JButton("Class/Section");
 b4.setBounds(20,160,230,40);
  b4.setLayout(new GridLayout());

 b5=new JButton("Number of Student Subject");
 b5.setBounds(20,200,230,40);
  b5.setLayout(null);
 
 b6=new JButton("Number of Student non Subject");
 b6.setBounds(20,240,230,40);
  b6.setLayout(null);
 
 b7=new JButton("Accomodation");
 b7.setBounds(20,280,230,40);
  b7.setLayout(null);


 b8=new JButton("Security");
 b8.setBounds(20,320,230,40);
  b8.setLayout(null);

 b9=new JButton("Back");
 b9.setBounds(20,360,230,40);
  b9.setLayout(null);
 
 
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
j1.add(p1);
add(j1);
setVisible(true);

}
 public void actionPerformed(ActionEvent ae)
{

}
public static void main(String s[])
   {
       new Student();
   }
}
