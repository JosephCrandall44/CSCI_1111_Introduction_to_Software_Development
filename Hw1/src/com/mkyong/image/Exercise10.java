package com.mkyong.image;
 
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class Exercise10 
{	
    public static void main( String[] args )
    {
    	Image image = null;
        try {
            URL url = new URL("http://home.gwu.edu/~srdaly/images/seh_building.jpg");
            image = ImageIO.read(url);
        } catch (IOException e) {
        	e.printStackTrace();
        }
 
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);
    }
}
