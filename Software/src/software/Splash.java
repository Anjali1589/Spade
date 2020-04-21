package software;
 import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.*;
public class Splash
{
    public static void main(String s[]){
        Frame f = new Frame("WELOCOME TO SYSTEM"); 
        f.setVisible(true); 
        int i;
        int x=1;
        for(i=2;i<=600;i+=4,x+=1){
            f.setLocation((500-((i+x)/2) ),330-(i/2));
            f.setSize(i+3*x,i+x/2);
            
            try{
                Thread.sleep(10);
            }catch(Exception e) { }
        }
    }
}
class Frame extends JFrame implements Runnable{
    Thread t1;
    Frame(String s){
        super(s);
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("software/picture/12.png"));
        Image i1 = c1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel m1 = new JLabel(i2);
        add(m1);
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(5000);
            this.setVisible(false);
            login f1 = new login();
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
}
