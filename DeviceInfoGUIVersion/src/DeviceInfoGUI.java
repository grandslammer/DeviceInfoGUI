import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class DeviceInfoGUI extends JFrame {
	static App myApp = new App();

	private JPanel contentPane;
	static JTextArea textAreaDisplay;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton rdbtnNo = new JRadioButton("No");
	JLabel lblImage = new JLabel("");
	int currentDeviceNb = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeviceInfoGUI frame = new DeviceInfoGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		;
	}

	/**
	 * Create the frame.
	 */
	public DeviceInfoGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textAreaDisplay = new JTextArea();
		textAreaDisplay.setBounds(333, 46, 352, 296);
		textAreaDisplay.setEditable(false);
		contentPane.add(textAreaDisplay);
		contentPane.add(textAreaDisplay);

		JLabel lblDeviceInformation = new JLabel("Device Information");
		lblDeviceInformation.setBounds(455, 21, 113, 14);
		lblDeviceInformation.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDeviceInformation);

		JButton btnFirst = new JButton("First");
		btnFirst.setBounds(206, 372, 89, 23);
		btnFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaDisplay.setText(myApp.getFirstDevice());
				currentDeviceNb = 1;
				ImageNavigator();
			}
		});
		contentPane.add(btnFirst);

		JButton btnNext = new JButton("Next");
		btnNext.setBounds(336, 372, 89, 23);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textAreaDisplay.setText(myApp.getNextDevice());

				if (currentDeviceNb < 10)
					currentDeviceNb++;
				else
					currentDeviceNb = 1;
				
				ImageNavigator();
			}
		});
		contentPane.add(btnNext);

		JButton btnPrevious = new JButton("Previous");
		btnPrevious.setBounds(462, 372, 89, 23);
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaDisplay.setText(myApp.getPreviousDevice());

				if (currentDeviceNb > 1)
					currentDeviceNb--;
				else
					currentDeviceNb = 10;
				
				ImageNavigator();
			}
		});
		contentPane.add(btnPrevious);

		JButton btnLast = new JButton("Last");
		btnLast.setBounds(596, 372, 89, 23);
		btnLast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaDisplay.setText(myApp.getLastDevice());
				currentDeviceNb = 10;
				ImageNavigator();
			}
		});
		contentPane.add(btnLast);

		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(596, 506, 89, 23);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaDisplay.setText("Help screen!");
			}
		});
		contentPane.add(btnHelp);

		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(769, 506, 89, 23);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnExit);

		JPanel panel = new JPanel();
		panel.setBounds(701, 157, 121, 84);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "More Info", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel);
		panel.setLayout(null);

		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myApp.setShowFullInfo(true);
				textAreaDisplay.setText(myApp.getCurrentDevice());
			}
		});
		rdbtnYes.setBounds(6, 16, 109, 23);
		panel.add(rdbtnYes);
		buttonGroup.add(rdbtnYes);
		rdbtnNo.setSelected(true);

		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myApp.setShowFullInfo(false);
				textAreaDisplay.setText(myApp.getCurrentDevice());
			}
		});
		rdbtnNo.setBounds(6, 54, 109, 23);
		panel.add(rdbtnNo);
		buttonGroup.add(rdbtnNo);
		lblImage.setBounds(40, 107, 283, 235);
		contentPane.add(lblImage);

		boolean firstRun = true;
		if (firstRun) {
			// System.out.println(myApp.getFirstDevice());
			textAreaDisplay.setText(myApp.getFirstDevice());
			ImageNavigator();
			firstRun = false;
		}
	}

	public void ImageNavigator() {
		switch (currentDeviceNb) {
		case 1:
			lblImage.setIcon(new ImageIcon("img\\Hp Envy Photo Printer.jpg"));
			break;
		case 2:
			lblImage.setIcon(new ImageIcon("img\\Asus Zen Beam projector.jpg"));
			break;
		case 3:
			lblImage.setIcon(new ImageIcon("img\\Guild Belt Sander.jpg"));
			break;
		case 4:
			lblImage.setIcon(new ImageIcon("img\\Vtech s&S video baby monitor.jpg"));
			break;
		case 5:
			lblImage.setIcon(new ImageIcon("img\\Remington wet & dry electric shaver.jpg"));
			break;
		case 6:
			lblImage.setIcon(new ImageIcon("img\\Celestron Astro Fi Telescope.jpg"));
			break;
		case 7:
			lblImage.setIcon(new ImageIcon("img\\Sony Waterproof Mp3 Player.jpg"));
			break;
		case 8:
			lblImage.setIcon(new ImageIcon("img\\Panasonic Microwave Oven.jpg"));
			break;
		case 9:
			lblImage.setIcon(new ImageIcon("img\\Croydex Fog Free Mirror.jpg"));
			break;
		case 10:
			lblImage.setIcon(new ImageIcon("img\\Babyliss Curl Hair Dryer.jpg"));
			break;
		}
	}
}
