import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SimpleGUI extends JFrame {
    private int width = 600;
    private int height = 600;
    private Image img;

    public SimpleGUI() {
        setSize(width, height);
        setTitle("File Monitor:D");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void loadImage(String src) {
        img = new ImageIcon(src).getImage();
    }

    public void drawIcon() {
        Graphics graphics = getGraphics();
        graphics.drawImage(img, 0, 0, width, height, null);
    }
}
