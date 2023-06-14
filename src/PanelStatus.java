import javax.swing.*;
import java.awt.*;

public class PanelStatus extends JPanel {
    private JLabel lblMouse;
    private JLabel lblColor;

    public PanelStatus(Model model) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(new Color(150, 155, 150));

        lblMouse = new JLabel("X: 0, Y: =");

        lblColor = new JLabel("Color");
        lblColor.setBackground(model.getColor());
        lblColor.setForeground(model.getColor()); // text color
        lblColor.setOpaque(true); // for background color change

        add(lblMouse);
        add(lblColor);
    }

    public JLabel getLblMouse() {
        return lblMouse;
    }

    public JLabel getLblColor() {
        return lblColor;
    }
}
