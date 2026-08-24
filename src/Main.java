import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main extends JPanel {
    private BufferedImage uma;
    private double ticks = 0; // timer

    public Main() {
        try {
            uma = ImageIO.read(new File("src/images/doto.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Bucle de animación: Se dispara cada 16 milisegundos (aprox. 60 FPS)
        Timer timer = new Timer(16, e -> {
            ticks++;
            repaint(); // Solicita a paintComponent que se vuelva a ejecutar
        });
        timer.start();
    }

    public static void main(String[] args) {
        int height = 1080;
        int width = 1920;
        JFrame frame = new JFrame("uma shii");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);

        frame.add(new Main());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);

        if (uma != null) {
            Graphics2D g2d = (Graphics2D) g;

            AffineTransform t = g2d.getTransform();

            int meisho = uma.getWidth();
            int doto = uma.getHeight();

            double x = 400 + meisho;
            double y = 510 + doto;

            g2d.translate(x, y);

            double spd = 0.1;

            double shearX = 0.2 * Math.sin(ticks * spd);
            double scaleY = 1.0 - 0.15 * Math.cos(2 * ticks * spd);
            double scaleX = 1.0 + 0.05 * Math.cos(2 * ticks * spd);

            g2d.shear(shearX, 0);
            g2d.scale(scaleX, scaleY);

            g2d.drawImage(uma, -meisho / 2, -doto, this);
            g2d.setTransform(t);
        }
    }
}
