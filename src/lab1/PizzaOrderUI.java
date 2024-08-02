package lab1;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class PizzaOrderUI extends Frame {
    private TextField customerNameField;
    private Choice pizzaSizeChoice;
    private List toppingsList;
    private TextArea orderTextArea;
    private Button enterButton;
    private ArrayList<Pizza> pizzaOrders;

    public PizzaOrderUI() {
        pizzaOrders = new ArrayList<>();
        setLayout(new FlowLayout());

        add(new Label("Customer Name:"));
        customerNameField = new TextField(20);
        add(customerNameField);

        add(new Label("Pizza Size:"));
        pizzaSizeChoice = new Choice();
        pizzaSizeChoice.add("Small");
        pizzaSizeChoice.add("Medium");
        pizzaSizeChoice.add("Large");
        add(pizzaSizeChoice);

        add(new Label("Toppings:"));
        toppingsList = new List(4, true);
        toppingsList.add("Cheese");
        toppingsList.add("Pepperoni");
        toppingsList.add("Mushrooms");
        toppingsList.add("Onions");
        add(toppingsList);

        enterButton = new Button("Enter");
        enterButton.addActionListener(new ButtonHandler());
        add(enterButton);

        orderTextArea = new TextArea(10, 50);
        add(orderTextArea);

        setTitle("Pizza Order Form");
        setSize(600, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new PizzaOrderUI();
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String customerName = customerNameField.getText();
            String pizzaSize = pizzaSizeChoice.getSelectedItem();
            String[] toppings = toppingsList.getSelectedItems();
            String toppingsStr = String.join(", ", toppings);

            Pizza pizza = new Pizza(customerName, pizzaSize, toppingsStr);
            pizzaOrders.add(pizza);
            orderTextArea.append(pizza.toString() + "\n");
        }
    }
}
