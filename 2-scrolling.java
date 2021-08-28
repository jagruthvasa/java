import javax.swing.*;
import java.awt.*;
/* <applet code = a.java width = 400 height = 200></applet> */

public class a extends JApplet implements Runnable
{
  String msg="Welcome to Java programming....";
  int x = 0, y = 100;
  boolean flag = false;
  Thread t = null;
  public void init()
  {
    t = new Thread(this);
    t.start();
  }
  public void run()
  {
    while(true)
    {
      if(x == 220) flag = true;
      else if(x == 0) flag = false;
      if(flag) {
        x -= 1;
      } else {
        x += 1;
      }
      repaint();
      try {
        Thread.sleep(30);
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  public void paint(Graphics g)
  {
    g.setColor(Color.white);
    g.fillRect(0, 0, 400, 200);
    g.setColor(Color.blue);
    g.drawString(msg, x, y);
  }
}
