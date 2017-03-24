import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.awt.Label;
import java.awt.Point;

/*class ImagePanel extends JComponent {
    private Image image;
    public ImagePanel(Image image) {
        this.image = image;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
*/

@SuppressWarnings("unused")
public class GuiDesign {
    public static Point[] coords = new Point[3]; 
    public int count = 0;
    public static int[] colors = new int[3]; 
    public static int selectedColor =0;
    public int count2 = 0;
	private JFrame frame;
	private JTextField txtUsername;
	
	public static int passShape =0;
	public static int[] passColors = new int[3];
	public static Point[] passCoords = new Point[3];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					GuiDesign window = new GuiDesign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		/*try{
			BufferedImage img = ImageIO.read(new File("Board2.png"));
			System.out.println("Meow");
			ImagePanel imagePanel = new ImagePanel(img);
			frame.setContentPane(imagePanel);
			}catch(Exception e){
				System.out.println(e);
			}*/
		frame.getContentPane().setBackground(SystemColor.control);
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBounds(100, 100, 521, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		
		
		
		txtUsername = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, txtUsername, -26, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayPassword();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnLogIn, 269, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnLogIn, -54, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtUsername, -6, SpringLayout.NORTH, btnLogIn);
		frame.getContentPane().add(btnLogIn);
		
		JButton button = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, button, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, button, 32, SpringLayout.NORTH, frame.getContentPane());
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		
		frame.getContentPane().add(button);
	
		JButton button_1 = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, button_1, 0, SpringLayout.NORTH, button);
		springLayout.putConstraint(SpringLayout.WEST, button_1, 6, SpringLayout.EAST, button);
		springLayout.putConstraint(SpringLayout.SOUTH, button_1, -321, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, button_2, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, button_2, 0, SpringLayout.SOUTH, button);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, button_3, 0, SpringLayout.NORTH, button);
		springLayout.putConstraint(SpringLayout.WEST, button_3, 6, SpringLayout.EAST, button_2);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, button_4, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, button_4, 6, SpringLayout.EAST, button_3);
		springLayout.putConstraint(SpringLayout.SOUTH, button_4, 0, SpringLayout.SOUTH, button);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, button_5, 38, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, button_5, -293, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, button_5, -171, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, button, 0, SpringLayout.WEST, button_5);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, button_6, 38, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, button_6, 6, SpringLayout.EAST, button_5);
		springLayout.putConstraint(SpringLayout.SOUTH, button_6, 0, SpringLayout.SOUTH, button_5);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, button_7, 38, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, button_7, 0, SpringLayout.SOUTH, button_5);
		springLayout.putConstraint(SpringLayout.EAST, button_7, 0, SpringLayout.EAST, button_2);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("");
		springLayout.putConstraint(SpringLayout.SOUTH, button_3, -6, SpringLayout.NORTH, button_8);
		springLayout.putConstraint(SpringLayout.NORTH, button_8, 38, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, button_8, 6, SpringLayout.EAST, button_7);
		springLayout.putConstraint(SpringLayout.SOUTH, button_8, 0, SpringLayout.SOUTH, button_5);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, button_9, 6, SpringLayout.SOUTH, button_4);
		springLayout.putConstraint(SpringLayout.WEST, button_9, 0, SpringLayout.WEST, button_4);
		frame.getContentPane().add(button_9);
		
		JTextArea txtrUsername = new JTextArea();
		springLayout.putConstraint(SpringLayout.WEST, txtrUsername, 0, SpringLayout.WEST, btnLogIn);
		springLayout.putConstraint(SpringLayout.SOUTH, txtrUsername, -6, SpringLayout.NORTH, txtUsername);
		txtrUsername.setBackground(SystemColor.menu);
		txtrUsername.setText("Username");
		txtrUsername.setEditable(false);
		frame.getContentPane().add(txtrUsername);
		
		JButton button_10 = new JButton("");
		springLayout.putConstraint(SpringLayout.NORTH, button_10, 83, SpringLayout.NORTH, frame.getContentPane());
		button_10.setBackground(Color.RED);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectedColor = 1;
				
					
			}
		});
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 2;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, button_2, 0, SpringLayout.EAST, button_11);
		springLayout.putConstraint(SpringLayout.NORTH, button_11, 83, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, button_10, 1, SpringLayout.SOUTH, button_11);
		button_11.setBackground(Color.GREEN);
		springLayout.putConstraint(SpringLayout.EAST, button_10, -6, SpringLayout.WEST, button_11);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 3;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_12, 83, SpringLayout.NORTH, frame.getContentPane());
		button_12.setBackground(Color.BLUE);
		springLayout.putConstraint(SpringLayout.EAST, button_11, -6, SpringLayout.WEST, button_12);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 4;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, button_9, -23, SpringLayout.NORTH, button_13);
		springLayout.putConstraint(SpringLayout.NORTH, button_13, 83, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, button_13, 456, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, button_12, -6, SpringLayout.WEST, button_13);
		button_13.setBackground(Color.YELLOW);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 5;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_14, 9, SpringLayout.SOUTH, button_10);
		springLayout.putConstraint(SpringLayout.WEST, button_14, 0, SpringLayout.WEST, button_10);
		springLayout.putConstraint(SpringLayout.EAST, button_14, 0, SpringLayout.EAST, button_10);
		button_14.setBackground(Color.CYAN);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 6;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_15, 117, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, button_15, -71, SpringLayout.NORTH, txtrUsername);
		springLayout.putConstraint(SpringLayout.SOUTH, button_11, -10, SpringLayout.NORTH, button_15);
		springLayout.putConstraint(SpringLayout.SOUTH, button_14, 0, SpringLayout.SOUTH, button_15);
		springLayout.putConstraint(SpringLayout.WEST, button_15, -33, SpringLayout.EAST, button_11);
		springLayout.putConstraint(SpringLayout.EAST, button_15, 0, SpringLayout.EAST, button_11);
		button_15.setBackground(Color.BLACK);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 7;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, button_12, -10, SpringLayout.NORTH, button_16);
		springLayout.putConstraint(SpringLayout.NORTH, button_16, 117, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, button_16, 0, SpringLayout.WEST, button_12);
		springLayout.putConstraint(SpringLayout.SOUTH, button_16, 0, SpringLayout.SOUTH, button_14);
		button_16.setBackground(Color.WHITE);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 8;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, button_13, -9, SpringLayout.NORTH, button_17);
		springLayout.putConstraint(SpringLayout.NORTH, button_17, 0, SpringLayout.NORTH, button_14);
		springLayout.putConstraint(SpringLayout.WEST, button_17, 0, SpringLayout.WEST, button_13);
		springLayout.putConstraint(SpringLayout.SOUTH, button_17, 0, SpringLayout.SOUTH, button_14);
		button_17.setBackground(Color.GRAY);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 9;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_18, 9, SpringLayout.SOUTH, button_14);
		springLayout.putConstraint(SpringLayout.WEST, button_18, 0, SpringLayout.WEST, button_10);
		springLayout.putConstraint(SpringLayout.SOUTH, button_18, 34, SpringLayout.SOUTH, button_14);
		button_18.setBackground(Color.PINK);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 10;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_19, 0, SpringLayout.NORTH, button_18);
		springLayout.putConstraint(SpringLayout.SOUTH, button_19, 0, SpringLayout.SOUTH, button_18);
		springLayout.putConstraint(SpringLayout.EAST, button_19, 0, SpringLayout.EAST, button_11);
		button_19.setBackground(Color.MAGENTA);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 11;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_20, 0, SpringLayout.NORTH, button_18);
		springLayout.putConstraint(SpringLayout.WEST, button_20, 0, SpringLayout.WEST, button_12);
		springLayout.putConstraint(SpringLayout.SOUTH, button_20, 0, SpringLayout.SOUTH, button_18);
		button_20.setBackground(new Color(255, 153, 0));
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedColor = 12;
				
					
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, button_21, 0, SpringLayout.NORTH, button_18);
		springLayout.putConstraint(SpringLayout.WEST, button_21, 0, SpringLayout.WEST, button_13);
		springLayout.putConstraint(SpringLayout.SOUTH, button_21, 0, SpringLayout.SOUTH, button_18);
		button_21.setBackground(new Color(153, 102, 51));
		frame.getContentPane().add(button_21);
		
		JButton buttonB5 = new JButton("");
		buttonB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(2,5);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, buttonB5, 97, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(buttonB5);
		
		JButton buttonA5 = new JButton("");
		buttonA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(1,5);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonA5, 35, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, buttonA5, -443, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, buttonB5, 29, SpringLayout.EAST, buttonA5);
		springLayout.putConstraint(SpringLayout.NORTH, buttonA5, 97, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonA5, 0, SpringLayout.SOUTH, buttonB5);
		frame.getContentPane().add(buttonA5);
		
		JButton buttonC5 = new JButton("");
		buttonC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(3,5);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonC5, 146, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, buttonC5, -332, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, buttonB5, -32, SpringLayout.WEST, buttonC5);
		springLayout.putConstraint(SpringLayout.NORTH, buttonC5, 97, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonC5, 0, SpringLayout.SOUTH, buttonB5);
		frame.getContentPane().add(buttonC5);
		
		JButton buttonD5 = new JButton("");
		buttonD5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(4,5);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, buttonD5, 97, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, buttonD5, 43, SpringLayout.EAST, buttonC5);
		springLayout.putConstraint(SpringLayout.SOUTH, buttonD5, 0, SpringLayout.SOUTH, buttonB5);
		frame.getContentPane().add(buttonD5);
		
		JButton buttonE5 = new JButton("");
		buttonE5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(5,5);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonE5, 270, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, buttonE5, -44, SpringLayout.WEST, button_10);
		springLayout.putConstraint(SpringLayout.EAST, buttonD5, -31, SpringLayout.WEST, buttonE5);
		springLayout.putConstraint(SpringLayout.NORTH, buttonE5, 97, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonE5, 0, SpringLayout.SOUTH, buttonB5);
		frame.getContentPane().add(buttonE5);
		
		JButton buttonA4 = new JButton("");
		buttonA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(1,4);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, buttonA4, 29, SpringLayout.SOUTH, buttonA5);
		springLayout.putConstraint(SpringLayout.WEST, buttonA4, 0, SpringLayout.WEST, buttonA5);
		springLayout.putConstraint(SpringLayout.SOUTH, buttonA4, 0, SpringLayout.SOUTH, button_18);
		frame.getContentPane().add(buttonA4);
		
		JButton buttonB4 = new JButton("");
		buttonB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(2,4);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, buttonB4, 151, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, buttonB4, 89, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonB4, 0, SpringLayout.SOUTH, button_18);
		springLayout.putConstraint(SpringLayout.EAST, buttonB4, 0, SpringLayout.EAST, buttonB5);
		frame.getContentPane().add(buttonB4);
		
		JButton buttonC4 = new JButton("");
		buttonC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(3,4);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonC4, 32, SpringLayout.EAST, buttonB4);
		springLayout.putConstraint(SpringLayout.EAST, buttonA4, -86, SpringLayout.WEST, buttonC4);
		springLayout.putConstraint(SpringLayout.NORTH, buttonC4, 151, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonC4, 0, SpringLayout.SOUTH, button_18);
		frame.getContentPane().add(buttonC4);
		
		JButton buttonD4 = new JButton("");
		buttonD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(4,4);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, buttonC4, -43, SpringLayout.WEST, buttonD4);
		springLayout.putConstraint(SpringLayout.NORTH, buttonD4, 151, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, buttonD4, 214, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonD4, 0, SpringLayout.SOUTH, button_18);
		springLayout.putConstraint(SpringLayout.EAST, buttonD4, 0, SpringLayout.EAST, buttonD5);
		frame.getContentPane().add(buttonD4);
		
		JButton buttonE4 = new JButton("");
		buttonE4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(5,4);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonE4, 270, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, buttonE4, 0, SpringLayout.NORTH, button_18);
		springLayout.putConstraint(SpringLayout.SOUTH, buttonE4, 0, SpringLayout.SOUTH, button_18);
		springLayout.putConstraint(SpringLayout.EAST, buttonE4, -44, SpringLayout.WEST, button_18);
		frame.getContentPane().add(buttonE4);
		
		JButton buttonA3 = new JButton("");
		buttonA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(1,3);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, buttonA3, 210, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, buttonA3, 35, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(buttonA3);
		
		JButton buttonB3 = new JButton("");
		buttonB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(2,3);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonB3, 89, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonB5, -88, SpringLayout.NORTH, buttonB3);
		springLayout.putConstraint(SpringLayout.EAST, buttonA3, -29, SpringLayout.WEST, buttonB3);
		springLayout.putConstraint(SpringLayout.NORTH, buttonB3, 210, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonB3, 0, SpringLayout.SOUTH, txtrUsername);
		frame.getContentPane().add(buttonB3);
		
		JButton buttonC3 = new JButton("");
		buttonC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(3,3);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonC3, 146, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, buttonB3, -32, SpringLayout.WEST, buttonC3);
		springLayout.putConstraint(SpringLayout.NORTH, buttonC3, 210, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonC3, 0, SpringLayout.SOUTH, txtrUsername);
		frame.getContentPane().add(buttonC3);
		
		JButton buttonD3 = new JButton("");
		buttonD3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(4,3);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, buttonC3, -43, SpringLayout.WEST, buttonD3);
		springLayout.putConstraint(SpringLayout.NORTH, buttonD3, -3, SpringLayout.NORTH, txtrUsername);
		springLayout.putConstraint(SpringLayout.WEST, buttonD3, 214, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonD3, 0, SpringLayout.SOUTH, txtrUsername);
		springLayout.putConstraint(SpringLayout.EAST, buttonD3, 0, SpringLayout.EAST, buttonD5);
		frame.getContentPane().add(buttonD3);
		
		JButton buttonE3 = new JButton("");
		buttonE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(5,3);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, buttonE3, 0, SpringLayout.NORTH, txtrUsername);
		springLayout.putConstraint(SpringLayout.WEST, buttonE3, 270, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonE3, 3, SpringLayout.SOUTH, txtrUsername);
		springLayout.putConstraint(SpringLayout.EAST, buttonE3, 0, SpringLayout.EAST, buttonE5);
		frame.getContentPane().add(buttonE3);
		
		JButton buttonA2 = new JButton("");
		buttonA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(1,2);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, buttonA3, -34, SpringLayout.NORTH, buttonA2);
		springLayout.putConstraint(SpringLayout.NORTH, buttonA2, 0, SpringLayout.NORTH, btnLogIn);
		springLayout.putConstraint(SpringLayout.WEST, buttonA2, 35, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonA2, 0, SpringLayout.SOUTH, btnLogIn);
		frame.getContentPane().add(buttonA2);
		
		JButton buttonB2 = new JButton("");
		buttonB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(2,2);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonB2, 89, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, buttonA2, -29, SpringLayout.WEST, buttonB2);
		springLayout.putConstraint(SpringLayout.NORTH, buttonB2, 269, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonB2, 0, SpringLayout.SOUTH, btnLogIn);
		frame.getContentPane().add(buttonB2);
		
		JButton buttonC2 = new JButton("");
		buttonC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(3,2);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonC2, 146, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, buttonB2, -32, SpringLayout.WEST, buttonC2);
		springLayout.putConstraint(SpringLayout.NORTH, buttonC2, 0, SpringLayout.NORTH, btnLogIn);
		springLayout.putConstraint(SpringLayout.SOUTH, buttonC2, 0, SpringLayout.SOUTH, btnLogIn);
		frame.getContentPane().add(buttonC2);
		
		JButton buttonD2 = new JButton("");
		buttonD2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(4,2);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, buttonC2, -43, SpringLayout.WEST, buttonD2);
		springLayout.putConstraint(SpringLayout.NORTH, buttonD2, 269, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, buttonD2, 214, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonD2, 0, SpringLayout.SOUTH, btnLogIn);
		springLayout.putConstraint(SpringLayout.EAST, buttonD2, 0, SpringLayout.EAST, buttonD5);
		frame.getContentPane().add(buttonD2);
		
		JButton buttonE2 = new JButton("");
		buttonE2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(5,2);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, buttonE2, 0, SpringLayout.NORTH, btnLogIn);
		springLayout.putConstraint(SpringLayout.WEST, buttonE2, 270, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonE2, 0, SpringLayout.SOUTH, btnLogIn);
		springLayout.putConstraint(SpringLayout.EAST, buttonE2, 0, SpringLayout.EAST, buttonE5);
		frame.getContentPane().add(buttonE2);
		
		JButton buttonA1 = new JButton("");
		buttonA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(1,1);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, buttonA1, 34, SpringLayout.SOUTH, buttonA2);
		springLayout.putConstraint(SpringLayout.WEST, buttonA1, 35, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonA1, 0, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(buttonA1);
		
		JButton buttonB1 = new JButton("");
		buttonB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(2,1);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonB1, 89, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, buttonA1, -29, SpringLayout.WEST, buttonB1);
		springLayout.putConstraint(SpringLayout.NORTH, buttonB1, 34, SpringLayout.SOUTH, buttonB2);
		springLayout.putConstraint(SpringLayout.SOUTH, buttonB1, 0, SpringLayout.SOUTH, buttonA1);
		frame.getContentPane().add(buttonB1);
		
		JButton buttonC1 = new JButton("");
		buttonC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(3,1);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, buttonC1, 146, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, buttonB1, -32, SpringLayout.WEST, buttonC1);
		springLayout.putConstraint(SpringLayout.NORTH, buttonC1, 34, SpringLayout.SOUTH, buttonC2);
		springLayout.putConstraint(SpringLayout.SOUTH, buttonC1, 0, SpringLayout.SOUTH, buttonA1);
		frame.getContentPane().add(buttonC1);
		
		JButton buttonD1 = new JButton("");
		buttonD1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(4,1);
				if(count<2)
					count++;
			}else
				System.out.println("Please choose a color first");
				
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, buttonC1, -43, SpringLayout.WEST, buttonD1);
		springLayout.putConstraint(SpringLayout.NORTH, buttonD1, 0, SpringLayout.NORTH, buttonA1);
		springLayout.putConstraint(SpringLayout.WEST, buttonD1, 214, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonD1, 0, SpringLayout.SOUTH, buttonA1);
		springLayout.putConstraint(SpringLayout.EAST, buttonD1, 0, SpringLayout.EAST, buttonD5);
		frame.getContentPane().add(buttonD1);
		
		JButton buttonE1 = new JButton("");
		buttonE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectedColor!=0){
				colors[count]=selectedColor; coords[count] = new Point(5,1);
				if(count<2)
					count++;
				}else
					System.out.println("Please choose a color first");
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, buttonE1, 328, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, buttonE1, 270, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, buttonE1, 0, SpringLayout.SOUTH, buttonA1);
		springLayout.putConstraint(SpringLayout.EAST, buttonE1, 0, SpringLayout.EAST, buttonE5);
		frame.getContentPane().add(buttonE1);
	}
	
	public static void displayPassword(){
		for(int i = 0; i<3; i++){
			//Arrays.sort(colors); 
			//System.out.print(colors[i] + " ");
			//System.out.println(coords[i]);
			generatePass();
			System.out.println(IntStream.of(passColors).anyMatch(x -> x == colors[0]));
		}
		
		
	}
	
	public static void generatePass(){
		
		int shape = 1 + (int)(Math.random() * 10); 
		int[] color1 = new int[3];			
		color1[0]=	1 + (int)(Math.random() * 12); 
		color1[1]=	1 + (int)(Math.random() * 12); 
		color1[2]=	1 + (int)(Math.random() * 12); 
		int randomNumX = 1 + (int)(Math.random() * 5); 
		int randomNumY = 1 + (int)(Math.random() * 5); 
		Point[] coords = new Point[3];				
		coords[0]=new Point(randomNumX,randomNumY);
		coords[1] = new Point(randomNumX,randomNumY);
		coords[2] = new Point(randomNumX,randomNumY);
		
		while(coords[0].equals(coords[1])){
		int randomNumX1 = 1 + (int)(Math.random() * 5); 
		int randomNumY1 = 1 + (int)(Math.random() * 5); 
		coords[1] = new Point(randomNumX1,randomNumY1);
		}
		
		while(coords[0].equals(coords[2]) || coords[1].equals(coords[2])){
			int randomNumX2 = 1 + (int)(Math.random() * 5); 
			int randomNumY2 = 1 + (int)(Math.random() * 5); 
			coords[2] = new Point(randomNumX2,randomNumY2);
		}
		passShape = shape;
		passColors[0] = color1[0];
		passColors[1] = color1[1];
		passColors[2] = color1[2];
		passCoords[0] = coords[0];
		passCoords[1] = coords[1];
		passCoords[2] = coords[2];

		
	}
	
	public static boolean checkPass(){
		boolean success = true;
		Point[] passCordsCopy = new Point[3];
		System.arraycopy(passCoords, 0, passCordsCopy, 0, passCoords.length );
		if(contains(passCordsCopy,coords[0]) == -1)
		
		
		
		success = Arrays.asList(passColors).contains(colors[0]);
		
		return false;
	
	}
	
	public static < E >  int contains(E[] inputArray, E value){
		int counter =0;
		for(E element : inputArray) {
			if(value.equals(element))
				return counter;
			counter++;
		}
		
	return -1;	
	}
	
}
