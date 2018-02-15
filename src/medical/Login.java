package medical;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import dao.Dao;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField user_id;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(303, 57, 73, 31);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 23));
		contentPane.add(lblLogin);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLUE, 6, true));
		panel.setBounds(154, 99, 390, 221);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUserid = new JLabel("User_ID");
		lblUserid.setBounds(71, 39, 72, 25);
		lblUserid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblUserid);
		
		user_id = new JTextField();
		user_id.setBounds(183, 45, 155, 20);
		panel.add(user_id);
		user_id.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setBounds(71, 70, 84, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				beans.Login l=new beans.Login();
				l.setUser_id(user_id.getText());
				l.setPassword(new String(password.getPassword()));
				if(Dao.isLoginOk(l))
				{
					dispose();
					new Supplier().setVisible(true);
				}
				else{
					JOptionPane.showMessageDialog(null,"Wrong user id or password");
				}
			}
		});
		btnLogin.setBounds(249, 149, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(71, 149, 89, 23);
		panel.add(btnReset);
		
		password = new JPasswordField();
		password.setBounds(183, 76, 155, 20);
		panel.add(password);
	}
}
