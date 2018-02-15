package medical;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import dao.Dao;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.awt.Font;

public class Supplier extends JFrame {

	private JPanel contentPane;
	private JTextField s_name;
	private JTextField s_email;
	private JTextField s_ph_no;
	private JTextField s_vat_no;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supplier frame = new Supplier();
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
	public Supplier() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 485);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSupplier = new JMenu("Supplier");
		menuBar.add(mnSupplier);
		
		JMenuItem mntmManage = new JMenuItem("Manage");
		mnSupplier.add(mntmManage);
		
		JMenu mnPurchase = new JMenu("Purchase");
		menuBar.add(mnPurchase);
		
		JMenuItem mntmManagePurchase = new JMenuItem("Manage");
		mntmManagePurchase.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
				new Purchase().setVisible(true);
			}
		});
		mnPurchase.add(mntmManagePurchase);
		
		JMenu mnSale = new JMenu("Sale");
		menuBar.add(mnSale);
		
		JMenuItem mntmManage_1 = new JMenuItem("Manage");
		mnSale.add(mntmManage_1);
		
		JMenu mnReport = new JMenu("Report");
		menuBar.add(mnReport);
		
		JMenu mnLogout = new JMenu("Logout");
		menuBar.add(mnLogout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 25, 711, 377);
		contentPane.add(tabbedPane);
		
		JPanel panel_add = new JPanel();
		tabbedPane.addTab("Add", null, panel_add, null);
		panel_add.setLayout(null);
		
		JLabel lblSname = new JLabel("S_NAME");
		lblSname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSname.setBounds(207, 39, 86, 20);
		panel_add.add(lblSname);
		
		JLabel lblSemail = new JLabel("S_EMAIL");
		lblSemail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSemail.setBounds(207, 79, 73, 17);
		panel_add.add(lblSemail);
		
		JLabel lblSphno = new JLabel("S_PH_NO");
		lblSphno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSphno.setBounds(207, 120, 86, 20);
		panel_add.add(lblSphno);
		
		JLabel lblSvatno = new JLabel("S_VAT_NO");
		lblSvatno.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSvatno.setBounds(207, 166, 86, 20);
		panel_add.add(lblSvatno);
		
		s_name = new JTextField();
		s_name.setBounds(335, 41, 135, 20);
		panel_add.add(s_name);
		s_name.setColumns(10);
		
		s_email = new JTextField();
		s_email.setBounds(335, 79, 135, 20);
		panel_add.add(s_email);
		s_email.setColumns(10);
		
		s_ph_no = new JTextField();
		s_ph_no.setBounds(335, 122, 135, 20);
		panel_add.add(s_ph_no);
		s_ph_no.setColumns(10);
		
		s_vat_no = new JTextField();
		s_vat_no.setBounds(335, 168, 135, 20);
		panel_add.add(s_vat_no);
		s_vat_no.setColumns(10);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClear.setBounds(148, 248, 89, 23);
		panel_add.add(btnClear);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSave.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				beans.Supplier s=new beans.Supplier();
				Calendar c=Calendar.getInstance();
				
				s.setS_id("S"+c.getTimeInMillis());
				s.setS_name(s_name.getText());
				s.setS_email(s_email.getText());
				s.setS_ph_no(s_ph_no.getText());
				s.setS_vat_no(s_vat_no.getText());
				if(Dao.insertSupplier(s))
					JOptionPane.showMessageDialog(Supplier.this, "Supplier added");
				else
					JOptionPane.showMessageDialog(null, "Supplier already  exists");
			}
		});
		btnSave.setBounds(417, 248, 89, 23);
		panel_add.add(btnSave);
		
		JPanel panel_del = new JPanel();
		tabbedPane.addTab("Delete", null, panel_del, null);
		panel_del.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(275, 58, 184, 29);
		panel_del.add(comboBox);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(370, 182, 89, 23);
		panel_del.add(btnDelete);
		
		JLabel lblSupplierId = new JLabel("Supplier id");
		lblSupplierId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSupplierId.setBounds(156, 65, 96, 22);
		panel_del.add(lblSupplierId);
		
		JPanel panel_edit = new JPanel();
		tabbedPane.addTab("Edit", null, panel_edit, null);
		panel_edit.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(257, 17, 210, 20);
		panel_edit.add(comboBox_1);
		
		JButton btnDone = new JButton("DONE");
		btnDone.setBounds(377, 56, 89, 23);
		panel_edit.add(btnDone);
		
		JPanel panel = new JPanel();
		panel.setBounds(130, 95, 500, 183);
		panel_edit.add(panel);
		panel.setLayout(null);
		
		JLabel lblSname_1 = new JLabel("S_NAME");
		lblSname_1.setBounds(119, 26, 46, 14);
		panel.add(lblSname_1);
		
		JLabel lblSemail_1 = new JLabel("S_EMAIL");
		lblSemail_1.setBounds(119, 51, 46, 14);
		panel.add(lblSemail_1);
		
		JLabel lblSphno_1 = new JLabel("S_PH_NO");
		lblSphno_1.setBounds(119, 83, 46, 14);
		panel.add(lblSphno_1);
		
		JLabel lblSvatno_1 = new JLabel("S_VAT_NO");
		lblSvatno_1.setBounds(119, 108, 57, 14);
		panel.add(lblSvatno_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 23, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(200, 48, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(200, 80, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(200, 105, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnDone_1 = new JButton("DONE");
		btnDone_1.setBounds(440, 295, 89, 23);
		panel_edit.add(btnDone_1);
		
		JLabel label = new JLabel("Supplier id");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(130, 14, 96, 22);
		panel_edit.add(label);
	}
}
