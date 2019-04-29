import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Frame1 {

	private JFrame frame;
	private JLabel lblMessage;
	private JTextField txtUserText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClickThisFor = new JButton("Show message");
		btnClickThisFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText(txtUserText.getText().toUpperCase());
			}
		});
		btnClickThisFor.setBounds(171, 204, 117, 29);
		frame.getContentPane().add(btnClickThisFor);
		
		lblMessage = new JLabel("");
		lblMessage.setBounds(139, 130, 190, 29);
		frame.getContentPane().add(lblMessage);
		
		txtUserText = new JTextField();
		txtUserText.setBounds(139, 43, 178, 38);
		frame.getContentPane().add(txtUserText);
		txtUserText.setColumns(10);
	}
}
