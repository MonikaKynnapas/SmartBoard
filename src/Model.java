import java.awt.*;

public class Model {
    private Color color = new Color(255, 255, 255);
    private int Width = 3; // line width default
    public Model() {

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }
}
