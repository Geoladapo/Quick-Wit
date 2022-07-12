import javax.swing.*;
import java.awt.*;

public class AreaWindow2 extends JFrame {
    private JLabel lenghtL, breadthL, areaL, perimeterL;
    private JTextField lenghtTF, breadthTF;
    private JTextField areaTF, perimeterTF;
    private JButton computeB, clearB, exitB;
    public AreaWindow2() {
        super("AREA & PERIMETER OF A RECTANGLE");
        setSize(400, 300);
        Container c = getContentPane();
        setLayout(new GridLayout(3, 2, 5, 15));
        lenghtL = new JLabel("Lenght: ");
        breadthL = new JLabel("Breadth: ");
        areaL = new JLabel("Area: ");
        perimeterL = new JLabel("Perimeter: ");
        lenghtTF = new JTextField(5);
        breadthTF = new JTextField(5);
        areaTF = new JTextField(7);
        perimeterTF = new JTextField(7);
        computeB = new JButton("Compute");
        clearB = new JButton("Clear");
        exitB = new JButton("Exit");

//        add component to pane c
        add(lenghtL); add(lenghtTF); add(breadthL);
        add(breadthTF); add(areaL); add(areaTF);
        add(perimeterL); add(perimeterTF); add(computeB);
        add(clearB); add(exitB);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        AreaWindow2 win2 = new AreaWindow2();
    }
}
