import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
public class h{
    public static void main(String ar[]) {
        xyz obj=new xyz();   
    }
}
class xyz extends JFrame{
    public xyz(){
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                int x=e.getX();
                int y=e.getY();
                System.out.println(x+","+y);
            }
        });
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
