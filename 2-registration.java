import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class k{
    public static void main(String ar[]){
        new abc();
    }
}
class abc extends JFrame implements ActionListener,ItemListener{
    JTextField t;
    JComboBox c;
    JRadioButton r1,r2;
    JButton b;
    JLabel l;
    JTextArea ta;
    ButtonGroup bg;
    String year="";
    String gender="";
    abc(){
        t=new JTextField(20);
        l=new JLabel("Name");
        b=new JButton("Submit");
        bg=new ButtonGroup();
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        ta=new JTextArea(10,30);
        bg.add(r1);
        bg.add(r2);
        c=new JComboBox();
        for(int i=1996;i<=2010;i++){
            c.addItem(Integer.toString(i));
        }
        b.addActionListener(this);
        c.addItemListener(this);
        r1.addItemListener(this);
        r2.addItemListener(this);
        add(l);
        add(t);
        add(r1);
        add(r2);
        add(c);
        add(b);
        add(ta);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            String name=t.getText();
            ta.setText("Name:"+name+"\nGender:"+gender+"\nYear:"+year);
        }
    }
    public void itemStateChanged(ItemEvent ie){
        year = String.valueOf(c.getSelectedItem());
        if(ie.getSource()==r1){
            gender = r1.getText();
        }
        if(ie.getSource()==r2){
            gender = r2.getText();
        }
    }
}
