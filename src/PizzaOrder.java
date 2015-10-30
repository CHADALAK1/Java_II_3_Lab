/**
 * Created by Chad Reddick on 9/24/2015.
 */
import javax.swing.*;
import java.awt.event.*;


public class PizzaOrder extends JFrame
{
    private JPanel panel;
    private JLabel titleLabel;
    private JButton calcButton;
    private double totalTransaction = 0;

    /*
    Create and Initialize the Toppings names and prices
     */
    private Toppings Anchovies = new Toppings("Anchovies", 0.75);
    private Toppings Bacon = new Toppings("Bacon", 0.95);
    private Toppings BuffaloChicken = new Toppings("Buffalo Chicken", 1.00);
    private Toppings CanadianBacon = new Toppings("Canadian Bacon", 1.00);
    private Toppings ExtraCheese = new Toppings("Extra Cheese", 0.65);
    private Toppings Mushrooms = new Toppings("Mushrooms", 0.55);
    private Toppings OlivesG = new Toppings("Olives{Green}", 0.60);
    private Toppings Onions = new Toppings("Onions", 0.45);
    private Toppings PeppersG = new Toppings("Peppers{Green}", 0.50);
    private Toppings Pepperoni = new Toppings("Pepperoni", 1.00);
    private Toppings Pineapple = new Toppings("Pineapple", 0.60);
    private Toppings Sausage = new Toppings("Sausage", 1.10);
    private Toppings Spinach = new Toppings("Spinach", 0.50);
    /* */

    /*
    Create Arrays of the following:
    Array of JCheckBoxes(Initialize the size)
    Array of Toppings(Initialize from start)
     */
    private JCheckBox[] cbArray = new JCheckBox[14];
    private Toppings[] cbToppings = new Toppings[] {Anchovies, Bacon, BuffaloChicken, CanadianBacon, ExtraCheese, Mushrooms, OlivesG, Onions, PeppersG, Pepperoni, Pineapple, Sausage, Spinach};
    private final int WINDOW_WIDTH = 350;
    private final int WINDOW_HEIGHT = 250;

    public PizzaOrder()
    {

        setTitle("PIZZA");

        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();

        add(panel);

        setVisible(true);
    }

    public void buildPanel()
    {
        titleLabel = new JLabel("Hello There");

        panel = new JPanel();

        panel.add(titleLabel);

        for(int i=0; i<13; i++)
        {
            try
            {
                cbArray[i] = new JCheckBox(cbToppings[i].getName());
                panel.add(cbArray[i]);
            }
            catch(NullPointerException E)
            {
                System.out.println("OUCH");
            }
        }

        calcButton = new JButton("Total");
        calcButton.addActionListener(new CalcButtonListener());

        panel.add(calcButton);
    }


    //Total Button action listener so the button does something
    private class CalcButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            for(int i = 0; i < 13; i++)
            {
                if(cbArray[i].isSelected())
                {
                    totalTransaction += cbToppings[i].getPrice();
                }
                else
                {

                }
            }

            System.out.println(totalTransaction);
        }
    }
}