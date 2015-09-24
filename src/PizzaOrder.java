/**
 * Created by Chad Reddick on 9/24/2015.
 */
import javax.swing.*;


public class PizzaOrder extends JFrame
{
    private JPanel panel;
    private JLabel titleLabel;
    private final int WINDOW_WIDTH = 350;
    private final int WINDOW_HEIGHT = 250;

    public PizzaOrder()
    {

        setTitle("PIZZA");

        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        //derp

        setVisible(true);
    }

    public void buildPanel()
    {
        titleLabel = new JLabel("Hello There");

        panel = new JPanel();

        panel.add(titleLabel);
    }
}