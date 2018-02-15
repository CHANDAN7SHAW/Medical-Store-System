package medical;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Report extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 489);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSupplier = new JMenu("Supplier");
		menuBar.add(mnSupplier);
		
		JMenuItem mntmManage = new JMenuItem("Manage");
		mnSupplier.add(mntmManage);
		
		JMenu mnPurchase = new JMenu("Purchase");
		menuBar.add(mnPurchase);
		
		JMenuItem mntmManage_1 = new JMenuItem("Manage");
		mnPurchase.add(mntmManage_1);
		
		JMenu mnSale = new JMenu("Sale");
		menuBar.add(mnSale);
		
		JMenuItem mntmManage_2 = new JMenuItem("Manage");
		mnSale.add(mntmManage_2);
		
		JMenu mnReport = new JMenu("Report");
		menuBar.add(mnReport);
		
		JMenuItem mntmManage_3 = new JMenuItem("Manage");
		mnReport.add(mntmManage_3);
		
		JMenu mnLogout = new JMenu("Logout");
		menuBar.add(mnLogout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 716, 407);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Manage", null, panel, null);
		panel.setLayout(null);
		
		JComboBox supplier = new JComboBox();
		supplier.setBounds(279, 26, 221, 39);
		panel.add(supplier);
		
		JLabel lblSupplier = new JLabel("Supplier");
		lblSupplier.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSupplier.setBounds(149, 22, 82, 42);
		panel.add(lblSupplier);
		
		JLabel lblPurchase = new JLabel("Purchase");
		lblPurchase.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPurchase.setBounds(149, 72, 90, 42);
		panel.add(lblPurchase);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(279, 76, 221, 39);
		panel.add(comboBox);
		
		JLabel lblSale = new JLabel("Sale");
		lblSale.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSale.setBounds(149, 126, 82, 39);
		panel.add(lblSale);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(279, 126, 221, 39);
		panel.add(comboBox_1);
		
		JButton btnDone = new JButton("DONE");
		btnDone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDone.setBounds(375, 207, 125, 39);
		panel.add(btnDone);
	}
}
