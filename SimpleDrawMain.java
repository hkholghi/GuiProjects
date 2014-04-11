import java.awt.*;
import javax.swing.*;

/**
 * This class uses the MyDrawPanel and draws on a panel in a frame.
 * 
 * @author (Hoss) 
 * @version (Version 1)
 */
public class SimpleDrawMain
{
    public static void main(String[] args){
        JFrame frame = new JFrame("Draw a Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        SimpleDraw gui = new SimpleDraw();
        contentPane.add(gui);
        
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
