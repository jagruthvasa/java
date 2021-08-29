import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class l{
    public static void main(String ar[]){
        add obj=new add();
    }
}
class add extends JFrame implements ActionListener{
    JFrame f;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3;
    public add() {
        f = new JFrame();
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("+");
        b2=new JButton("-");
        b3=new JButton("*");
        b4=new JButton("/");


        l1=new JLabel("1st Number");
        l2=new JLabel("2nd Number");
        l3=new JLabel("Result");
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int value=0;
        if(ae.getSource()==b1){
            value=num1+num2;
        }
        if(ae.getSource()==b2){
            value=num1-num2;
        }
        if(ae.getSource()==b3){
            value=num1*num2;
        }
        if(ae.getSource()==b4){
            value=num1/num2;
        }
        l3.setText(value+"");
    }
}
