import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Smart Board");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 400));

        Model model = new Model();
        View view = new View(frame, model);
        new Controller(view); // version 2 btnSave to work

        frame.pack();
        frame.setLocationRelativeTo(null); // center screen
        frame.setVisible(true);
    }
}
