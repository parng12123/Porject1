
package soul_eater_v1;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ghost {
    public ImageIcon im = new ImageIcon(this.getClass().getResource("g1.png"));
    public ImageIcon imb = new ImageIcon(this.getClass().getResource("g2.png"));
    
    public int x = 900;
    public int y = 520;
    public int m2x = 0;
    public int m2y = 100;
    public int count = 0;
    public int hp = 50;
    public int daman = 10;
    public int distanceP;
    
    public boolean alive = true;
    public boolean back = false;
    
    ghost(){
        
    }
}
