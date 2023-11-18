import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JTextField;
import javax.swing.JButton;

public class RestaurantFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField burgerField;
	private JTextField fishChipsField;
	private JTextField donnerKebabsField;
	private JTextField waterField;
	private JTextField colaField;
	private JTextField tangoField;
	private JTextField foodCostField;
	private JTextField drinkCostField;
	private JTextField totalCostField;
	
	private final double burgerPrice = 4.00;
	private final double fishChipsPrice = 7.00;
	private final double donnerKebabsPrice = 5.00;
	
	private final double waterPrice = 1.00;
	private final double colaPrice = 1.50;
	private final double tangoPrice = 1.50;
	
	
	private JTextArea billTextArea;
	private JButton totalButton;
	private JButton printReceiptButton;
	
	private DecimalFormat df = new DecimalFormat("0.00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantFrame frame = new RestaurantFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RestaurantFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 723, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel foodLabel = new JLabel("Food");
		foodLabel.setFont(new Font("Rockwell Nova", Font.ITALIC, 16));
		foodLabel.setHorizontalAlignment(SwingConstants.CENTER);
		foodLabel.setBounds(26, 53, 191, 28);
		contentPane.add(foodLabel);
		
		JLabel burgerLabel = new JLabel("Burger Meal \u00A34.00");
		burgerLabel.setBounds(21, 92, 138, 28);
		contentPane.add(burgerLabel);
		
		burgerField = new JTextField();
		burgerLabel.setLabelFor(burgerField);
		burgerField.setBounds(169, 92, 42, 28);
		contentPane.add(burgerField);
		burgerField.setColumns(10);
		burgerField.setText("0");
		
		JLabel fishChipsLabel = new JLabel("Fish and Chips \u00A37.00");
		fishChipsLabel.setBounds(21, 131, 138, 28);
		contentPane.add(fishChipsLabel);
		
		JLabel donnerKebabsLabel = new JLabel("Donner Kebabs \u00A35.00");
		donnerKebabsLabel.setBounds(21, 170, 138, 28);
		contentPane.add(donnerKebabsLabel);
		
		fishChipsField = new JTextField();
		fishChipsField.setColumns(10);
		fishChipsField.setBounds(169, 131, 42, 28);
		contentPane.add(fishChipsField);
		fishChipsField.setText("0");
		
		donnerKebabsField = new JTextField();
		donnerKebabsField.setColumns(10);
		donnerKebabsField.setBounds(169, 170, 42, 28);
		contentPane.add(donnerKebabsField);
		donnerKebabsField.setText("0");
		
		JLabel drinksLabel = new JLabel("Drinks");
		drinksLabel.setHorizontalAlignment(SwingConstants.CENTER);
		drinksLabel.setFont(new Font("Rockwell Nova", Font.ITALIC, 16));
		drinksLabel.setBounds(21, 209, 191, 28);
		contentPane.add(drinksLabel);
		
		JLabel waterLabel = new JLabel("Water bottle \u00A31.00");
		waterLabel.setBounds(21, 248, 138, 28);
		contentPane.add(waterLabel);
		
		waterField = new JTextField();
		waterField.setColumns(10);
		waterField.setBounds(169, 248, 42, 28);
		contentPane.add(waterField);
		waterField.setText("0");
		
		JLabel colaLabel = new JLabel("Coca Cola \u00A31.50");
		colaLabel.setBounds(21, 287, 138, 28);
		contentPane.add(colaLabel);
		
		JLabel tangoLabel = new JLabel("Tango \u00A31.50");
		tangoLabel.setBounds(21, 326, 138, 28);
		contentPane.add(tangoLabel);
		
		colaField = new JTextField();
		colaField.setColumns(10);
		colaField.setBounds(169, 287, 42, 28);
		contentPane.add(colaField);
		colaField.setText("0");
		
		tangoField = new JTextField();
		tangoField.setColumns(10);
		tangoField.setBounds(169, 326, 42, 28);
		contentPane.add(tangoField);
		tangoField.setText("0");
		
		JLabel foodCostLabel = new JLabel("Food Cost:");
		foodCostLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		foodCostLabel.setBounds(21, 399, 100, 28);
		contentPane.add(foodCostLabel);
		
		foodCostField = new JTextField();
		foodCostField.setColumns(10);
		foodCostField.setBounds(131, 399, 80, 28);
		contentPane.add(foodCostField);
		
		JLabel drinkCostLabel = new JLabel("Drink Cost:");
		drinkCostLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		drinkCostLabel.setBounds(21, 438, 100, 28);
		contentPane.add(drinkCostLabel);
		
		JLabel totalCostLabel = new JLabel("Total Cost:");
		totalCostLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		totalCostLabel.setBounds(21, 477, 100, 28);
		contentPane.add(totalCostLabel);
		
		drinkCostField = new JTextField();
		drinkCostField.setColumns(10);
		drinkCostField.setBounds(131, 438, 80, 28);
		contentPane.add(drinkCostField);
		
		totalCostField = new JTextField();
		totalCostField.setColumns(10);
		totalCostField.setBounds(131, 477, 80, 28);
		contentPane.add(totalCostField);
		
		billTextArea = new JTextArea();
		billTextArea.setBounds(413, 131, 239, 335);
		contentPane.add(billTextArea);
		
		totalButton = new JButton("Total");
		totalButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		totalButton.setBounds(221, 477, 89, 28);
		contentPane.add(totalButton);
		totalButton.addActionListener(this);
		
		printReceiptButton = new JButton("Print Receipt");
		printReceiptButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		printReceiptButton.setBounds(412, 477, 116, 28);
		contentPane.add(printReceiptButton);
		printReceiptButton.addActionListener(this);
		
		JLabel restaurantLabel = new JLabel("Shery's Restaurant");
		restaurantLabel.setFont(new Font("Gill Sans Nova Light", Font.BOLD | Font.ITALIC, 27));
		restaurantLabel.setHorizontalAlignment(SwingConstants.CENTER);
		restaurantLabel.setBounds(227, 11, 425, 70);
		contentPane.add(restaurantLabel);
	}
	
	public int getCount(JTextField field) {
		int count = Integer.parseInt(field.getText());
		return count;
	}
	
	public double getFoodTotal() {
		double total = getCount(burgerField) * burgerPrice
				+ getCount(fishChipsField) * fishChipsPrice
		        + getCount(donnerKebabsField) * donnerKebabsPrice;
		return total;
	}
	
	public double getDrinkTotal() {
		double total = getCount(waterField) * waterPrice
				+ getCount(colaField) * colaPrice
				+ getCount(tangoField) * tangoPrice;
		return total;
	}
	
	public double getTotal() {
		double total = getFoodTotal() + getDrinkTotal();
		return total;
	}
	
	public void printReceipt() {
		billTextArea.setText("========================" + "\n"
				+ "Food total: £" + df.format(getFoodTotal()) + "\n"
				+ "Drink total: £" + df.format(getDrinkTotal()) + "\n"
				+ "Total: £" + df.format(getTotal()) + "\n"
				+ "========================" + "\n"
				);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==totalButton) {
			foodCostField.setText(df.format(getFoodTotal()) + "");
			drinkCostField.setText(df.format(getDrinkTotal()) + "");
			totalCostField.setText(df.format(getTotal()) + "");
		}
		if (e.getSource()==printReceiptButton) {
			printReceipt();
		}
		
	}
}
