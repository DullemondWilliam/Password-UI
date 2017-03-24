import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;

public class GUIWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIWindow window = new GUIWindow();
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
	public GUIWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 819, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane.setRightComponent(splitPane_1);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setLeftComponent(splitPane_2);
		
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_2.setRightComponent(splitPane_3);
		
		JSplitPane splitPane_4 = new JSplitPane();
		splitPane_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_3.setRightComponent(splitPane_4);
		
		JSplitPane splitPane_5 = new JSplitPane();
		splitPane_5.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_4.setRightComponent(splitPane_5);
		
		JSplitPane splitPane_6 = new JSplitPane();
		splitPane_1.setRightComponent(splitPane_6);
		
		JSplitPane splitPane_7 = new JSplitPane();
		splitPane_6.setLeftComponent(splitPane_7);
		
		JSplitPane splitPane_8 = new JSplitPane();
		splitPane_8.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_7.setLeftComponent(splitPane_8);
		
		JSplitPane splitPane_9 = new JSplitPane();
		splitPane_9.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_8.setRightComponent(splitPane_9);
		
		JSplitPane splitPane_10 = new JSplitPane();
		splitPane_10.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_9.setRightComponent(splitPane_10);
		
		JSplitPane splitPane_11 = new JSplitPane();
		splitPane_11.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_10.setRightComponent(splitPane_11);
		
		JSplitPane splitPane_12 = new JSplitPane();
		splitPane_12.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_7.setRightComponent(splitPane_12);
		
		JSplitPane splitPane_13 = new JSplitPane();
		splitPane_13.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_12.setRightComponent(splitPane_13);
		
		JSplitPane splitPane_14 = new JSplitPane();
		splitPane_14.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_13.setRightComponent(splitPane_14);
		
		JSplitPane splitPane_15 = new JSplitPane();
		splitPane_15.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_14.setRightComponent(splitPane_15);
		
		JSplitPane splitPane_16 = new JSplitPane();
		splitPane_6.setRightComponent(splitPane_16);
		
		JSplitPane splitPane_17 = new JSplitPane();
		splitPane_17.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_16.setLeftComponent(splitPane_17);
		
		JSplitPane splitPane_18 = new JSplitPane();
		splitPane_18.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_17.setRightComponent(splitPane_18);
		
		JSplitPane splitPane_19 = new JSplitPane();
		splitPane_19.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_18.setRightComponent(splitPane_19);
		
		JSplitPane splitPane_20 = new JSplitPane();
		splitPane_20.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_19.setRightComponent(splitPane_20);
		
		JSplitPane splitPane_21 = new JSplitPane();
		splitPane_16.setRightComponent(splitPane_21);
		
		JSplitPane splitPane_22 = new JSplitPane();
		splitPane_22.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_21.setLeftComponent(splitPane_22);
		
		JSplitPane splitPane_23 = new JSplitPane();
		splitPane_23.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_22.setRightComponent(splitPane_23);
		
		JSplitPane splitPane_24 = new JSplitPane();
		splitPane_24.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_23.setRightComponent(splitPane_24);
		
		JSplitPane splitPane_25 = new JSplitPane();
		splitPane_25.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_24.setRightComponent(splitPane_25);
	}

}
