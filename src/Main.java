import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    public static void HelloWorld(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        int height = 1080;
        int width = 1920;
        JFrame frame = new JFrame("uma shii");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);

        frame.add(new Main());
        frame.setVisible(true);
    }

    // ts draws
    @Override
    protected void paintComponent(Graphics g) {
        int height = 1080;
        int width = 1920;

        // Made sum
        super.paintComponent(g);

        g.setColor(new Color(34, 139, 34));
        g.fillRect(0, 0, width, height);

        g.setColor(Color.PINK);
        g.fillOval(100, 200, 40, 40);
    }
}
