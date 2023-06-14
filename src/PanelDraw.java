import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class PanelDraw extends JPanel implements MouseMotionListener {

    private Model model;
    private View view;
    private int x1;
    private int y1;
    private boolean start = true;
    private ArrayList<Line> lines = new ArrayList<>();

    public PanelDraw(Model model, View view) {
        this.model = model;
        this.view = view;

        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        // Nicer lines
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Drawing background color
        setBackground(new Color(137, 162, 91));
        // g2d.drawLine(10, 10, 100, 100);
        for (Line line : lines) {
            g2d.setColor(line.getColor());
            g2d.setStroke(new BasicStroke(line.getWidth())); // Line width
            g2d.drawLine(line.getX1(), line.getY1(), line.getX2(), line.getY2());
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = x1;
        int y = y1;
        x1 = e.getX();
        y1 = e.getY();
        if (start) {
            x = x1;
            y = y1;
            start = false;
        }
        lines.add(new Line(x, y, x1, y1, model.getColor(), model.getWidth()));
        showMousePosition(e.getX(), e.getY());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        start = true;
        // System.out.println(e.getX() + " " + e.getX()); // Test
        showMousePosition(e.getX(), e.getY());
    }

    public ArrayList<Line> getLines() {
        return lines;
    }
    private void showMousePosition(int mouseX, int mouseY) {
        view.getLblMouse().setText("X: " + mouseX + "Y: " + mouseY);
    }
}
