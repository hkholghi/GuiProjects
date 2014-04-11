import java.awt.*;
import javax.swing.*;

/**
 * This class draws an orange rectanle
 * 
 * @author (Hoss) 
 * @version (Version 1)
 */
public class SimpleDraw extends JPanel
{
    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(20, 50, 100, 100);
    }
}
