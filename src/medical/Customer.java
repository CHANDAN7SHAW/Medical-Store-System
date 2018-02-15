package medical;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import dao.Dao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class Customer extends JFrame {

	private JPanel contentPane;
	private JTextField c_ph_no;
	private JTextField c_name;
	private JTextField c_email;
	private JTextField c_address;
	private JTextField no_of_boxes;
	private JTextField mrp;
	private JTextField discount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer frame = new Customer();
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
	public Customer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 475);
		
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
		mnReport.addActionListener(new ActionListener() 
		{
			public void actionPerformed1(ActionEvent arg0) 
			{
				dispose();
				new Report().setVisible(true);
			}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		menuBar.add(mnReport);
		
		JMenu mnLogout = new JMenu("Logout");
		menuBar.add(mnLogout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 717, 393);
		contentPane.add(tabbedPane);
		
		JPanel panel_sale = new JPanel();
		tabbedPane.addTab("Sale", null, panel_sale, null);
		panel_sale.setLayout(null);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.setBounds(158, 323, 89, 23);
		panel_sale.add(btnClear);
		
		JPanel panel = new JPanel();
		panel.setBounds(158, 11, 468, 152);
		panel_sale.add(panel);
		panel.setLayout(null);
		
		JLabel lblCph = new JLabel("C_PH");
		lblCph.setBounds(10, 11, 68, 14);
		panel.add(lblCph);
		lblCph.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblCname = new JLabel("C_NAME");
		lblCname.setBounds(10, 36, 68, 14);
		panel.add(lblCname);
		lblCname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblCemail = new JLabel("C_EMAIL");
		lblCemail.setBounds(10, 61, 68, 14);
		panel.add(lblCemail);
		lblCemail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblCaddress = new JLabel("C-ADDRESS");
		lblCaddress.setBounds(10, 86, 84, 14);
		panel.add(lblCaddress);
		lblCaddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		c_ph_no = new JTextField();
		c_ph_no.setBounds(136, 10, 191, 20);
		panel.add(c_ph_no);
		c_ph_no.setColumns(10);
		
		c_name = new JTextField();
		c_name.setBounds(136, 35, 191, 20);
		panel.add(c_name);
		c_name.setColumns(10);
		
		c_email = new JTextField();
		c_email.setBounds(136, 60, 191, 20);
		panel.add(c_email);
		c_email.setColumns(10);
		
		c_address = new JTextField();
		c_address.setBounds(136, 86, 191, 49);
		panel.add(c_address);
		c_address.setColumns(10);
		
		JButton btnDone_1 = new JButton("DONE");
		btnDone_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				beans.Customer s=new beans.Customer();
						
				s.setC_ph(c_ph_no.getText());
				s.setC_name(c_name.getText());
				s.setC_email(c_email.getText());
				s.setC_address(c_address.getText());
				if(Dao.insertCustomer(s))
					JOptionPane.showMessageDialog(Customer.this, "Customer added");
				else
					JOptionPane.showMessageDialog(null, "Customer already  exists");
				
			}
		});
		btnDone_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDone_1.setBounds(369, 118, 89, 23);
		panel.add(btnDone_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(156, 172, 470, 140);
		panel_sale.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNoofboxes = new JLabel("NO_OF_BOXES");
		lblNoofboxes.setBounds(10, 11, 115, 14);
		panel_1.add(lblNoofboxes);
		lblNoofboxes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblMname = new JLabel("M_NAME");
		lblMname.setBounds(10, 36, 95, 30);
		panel_1.add(lblMname);
		lblMname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblMrp = new JLabel("MRP");
		lblMrp.setBounds(10, 77, 84, 14);
		panel_1.add(lblMrp);
		lblMrp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblDiscount = new JLabel("DISCOUNT");
		lblDiscount.setBounds(10, 108, 84, 14);
		panel_1.add(lblDiscount);
		lblDiscount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		no_of_boxes = new JTextField();
		no_of_boxes.setBounds(135, 9, 193, 23);
		panel_1.add(no_of_boxes);
		no_of_boxes.setColumns(10);
		
		JComboBox m_name = new JComboBox();
		m_name.setBounds(135, 43, 185, 23);
		panel_1.add(m_name);
		
		mrp = new JTextField();
		mrp.setBounds(135, 76, 185, 20);
		panel_1.add(mrp);
		mrp.setColumns(10);
		
		discount = new JTextField();
		discount.setBounds(135, 107, 185, 20);
		panel_1.add(discount);
		discount.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(360, 95, 89, 23);
		panel_1.add(btnAdd);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnComplete = new JButton("COMPLETE");
		btnComplete.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComplete.setBounds(508, 325, 118, 23);
		panel_sale.add(btnComplete);
		
		JPanel panel_viewsale = new JPanel();
		tabbedPane.addTab("View", null, panel_viewsale, null);
		panel_viewsale.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(271, 78, 235, 37);
		panel_viewsale.add(comboBox);
		
		JButton btnDone = new JButton("DONE");
		btnDone.setBounds(417, 177, 89, 23);
		panel_viewsale.add(btnDone);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCustomerId.setBounds(107, 82, 113, 23);
		panel_viewsale.add(lblCustomerId);
	}
}
