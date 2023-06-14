import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {
    private PanelDraw panelDraw;
    private PanelTop panelTop;
    // TASK: Self do PanelStatus with two label lblMouse, lblColor
    // JPanel Background color (150, 155, 150)
    private PanelStatus panelStatus;
    public View(JFrame frame, Model model) {
        panelDraw = new PanelDraw(model, this);
        panelTop = new PanelTop(model, this, panelDraw);
        panelStatus = new PanelStatus(model); // Crate object

        frame.add(panelTop, BorderLayout.NORTH);
        frame.add(panelDraw, BorderLayout.CENTER);
        frame.add(panelStatus, BorderLayout.PAGE_END); // place object
    }
    public void registerButtonSave(ActionListener al) {
        panelTop.getBtnSave().addActionListener(al);
    }

    public PanelDraw getPanelDraw() {
        return panelDraw;
    }
    public JLabel getLblMouse() {
        return panelStatus.getLblMouse();
    }

    public JLabel getLblColor() {
        return panelStatus.getLblColor();
    }
}
