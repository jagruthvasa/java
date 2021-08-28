// a) Create an interface containing 3 radio buttons named line, rectangle and oval. Based on the 
// radio button selected, allow user to fill lines, rectangles or ovals as per the locations selected 
// by the user.

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class h extends MouseMotionAdapter implements ItemListener {
    JFrame f;
    ButtonGroup group;
    JRadioButton jrb1, jrb2, jrb3;
    JLabel jl;
    String msg = "";
    int x, y, x1, y1;
    int flag = 0;
    h() {
        f = new JFrame();
        group = new ButtonGroup();
        jrb1 = new JRadioButton("Line");
        jrb2 = new JRadioButton("Rectangle");
        jrb3 = new JRadioButton("Oval");
        group.add(jrb1);
        group.add(jrb2);
        group.add(jrb3);
        jrb1.addItemListener(this);
        jrb2.addItemListener(this);
        jrb3.addItemListener(this);
        f.add(jrb1); f.add(jrb2); f.add(jrb3);
        jl = new JLabel();
        f.add(jl);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                x = e.getX(); y = e.getY();
                Graphics g = f.getGraphics();
                if(flag == 1) {
                    g.drawLine(x, y, 250, 250);
                } else if(flag == 2) {
                    g.drawRect(x, y, 50, 100);
                } else if(flag == 3) {
                    g.drawOval(x, y, 150, 200);
                }
            }   
        });
        f.addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
                jl.setText("Mouse currently at x: " + x1 + " & y: " + y1);
            }
        });
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == jrb1) {
            flag = 1;
        } else if(e.getSource() == jrb2) {
            flag = 2;
        } else if(e.getSource() == jrb3) {
            flag = 3;
        }
    }

    public static void main(String[] args) {
        new h();
    }
}
