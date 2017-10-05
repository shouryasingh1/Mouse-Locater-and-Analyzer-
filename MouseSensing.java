import java.awt.*;
import java.awt.event.*;
public class MouseSensing implements MouseMotionListener, MouseListener
{
private Frame f;
private TextField tf;
public MouseSensing()
{
f=new Frame("Pachi <3");
tf=new TextField(30);
}
public void launchFrame()
{
Label label=new Label("CLICK AND DRAG THE MOUSE");
f.add(label, BorderLayout.NORTH);
f.add(tf, BorderLayout.SOUTH);
f.addMouseMotionListener(this);
f.addMouseListener(this);
f.setSize(300, 200);
f.setVisible(true);
}
public void mouseDragged(MouseEvent e)
{
String s="Mouse Dragging: X="+e.getX()+"Y="+e.getY();
tf.setText(s);
}
public void mouseEntered(MouseEvent e)
{
String s="The Mouse Has Entered the Frame";
tf.setText(s);
}
public void mouseExited(MouseEvent e)
{
String s="The Mouse Has Left The Frame";
tf.setText(s);
}
public void mouseMoved(MouseEvent e)
{
}
public void mousePressed(MouseEvent e)
{
}
public void mouseClicked(MouseEvent e)
{
}
public void mouseReleased(MouseEvent e)
{
}
public static void main(String args[])
{
MouseSensing two=new MouseSensing();
two.launchFrame();
}
}




 
