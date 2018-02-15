package medical;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

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

import java.awt.event.ActionListener;
import java.util.Calendar;

public class Purchase extends JFrame {

	private JPanel contentPane;
	private JTextField st_id;
	private JTextField m_name;
	private JTextField batch_no;
	private JTextField comp_name;
	private JTextField cost_price;
	private JTextField mrp;
	private JTextField no_of_boxes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Purchase frame = new Purchase();
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
	public Purchase() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 490);
		
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
		mntmManage_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
				new Customer().setVisible(true);
			}
		});
		mnSale.add(mntmManage_2);
		
		JMenu mnReport = new JMenu("Report");
		menuBar.add(mnReport);
		
		JMenu mnLogout = new JMenu("Logout");
		menuBar.add(mnLogout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 32, 694, 387);
		contentPane.add(tabbedPane);
		
		JPanel panel_entry = new JPanel();
		tabbedPane.addTab("Stock Entry", null, panel_entry, null);
		panel_entry.setLayout(null);
		
		JLabel lblStid = new JLabel("ST_ID");
		lblStid.setBounds(129, 44, 46, 14);
		panel_entry.add(lblStid);
		
		JLabel lblMname = new JLabel("M_NAME");
		lblMname.setBounds(129, 69, 46, 14);
		panel_entry.add(lblMname);
		
		JLabel lblBatchno = new JLabel("BATCH_NO");
		lblBatchno.setBounds(129, 99, 54, 14);
		panel_entry.add(lblBatchno);
		
		JLabel lblCompname = new JLabel("COMP_NAME");
		lblCompname.setBounds(129, 123, 63, 14);
		panel_entry.add(lblCompname);
		
		JLabel lblCostprice = new JLabel("COST_PRICE");
		lblCostprice.setBounds(129, 154, 75, 14);
		panel_entry.add(lblCostprice);
		
		JLabel lblMrp = new JLabel("MRP");
		lblMrp.setBounds(129, 179, 46, 14);
		panel_entry.add(lblMrp);
		
		JLabel lblNoofboxes = new JLabel("NO_OF_BOXES");
		lblNoofboxes.setBounds(129, 207, 75, 14);
		panel_entry.add(lblNoofboxes);
		
		st_id = new JTextField();
		st_id.setBounds(251, 41, 86, 20);
		panel_entry.add(st_id);
		st_id.setColumns(10);
		
		m_name = new JTextField();
		m_name.setBounds(251, 66, 86, 20);
		panel_entry.add(m_name);
		m_name.setColumns(10);
		
		batch_no = new JTextField();
		batch_no.setBounds(251, 96, 86, 20);
		panel_entry.add(batch_no);
		batch_no.setColumns(10);
		
		comp_name = new JTextField();
		comp_name.setBounds(251, 120, 86, 20);
		panel_entry.add(comp_name);
		comp_name.setColumns(10);
		
		cost_price = new JTextField();
		cost_price.setBounds(251, 151, 86, 20);
		panel_entry.add(cost_price);
		cost_price.setColumns(10);
		
		mrp = new JTextField();
		mrp.setBounds(251, 176, 86, 20);
		panel_entry.add(mrp);
		mrp.setColumns(10);
		
		no_of_boxes = new JTextField();
		no_of_boxes.setBounds(251, 204, 86, 20);
		panel_entry.add(no_of_boxes);
		no_of_boxes.setColumns(10);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(108, 278, 89, 23);
		panel_entry.add(btnClear);
		
		JButton btnDone = new JButton("DONE");
		btnDone.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				beans.Purchase p=new beans.Purchase();
				p.setSt_id(st_id.getText());
				p.setM_name(m_name.getText());
				p.setBatch_no(batch_no.getText());
				p.setComp_name(comp_name.getText());
				p.setCost_price(cost_price.getText());
				p.setMrp(mrp.getText());
				p.setNo_of_boxes(no_of_boxes.getText());
				if(Dao.insertStock(p))
					JOptionPane.showMessageDialog(Purchase.this, "Stock added");
				else
					JOptionPane.showMessageDialog(null, "Stock already  exists");
				
			}
		});
		btnDone.setBounds(374, 278, 89, 23);
		panel_entry.add(btnDone);
		
		JPanel panel_view = new JPanel();
		tabbedPane.addTab("View Stock", null, panel_view, null);
		panel_view.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(191, 55, 199, 30);
		panel_view.add(comboBox);
		
		JButton btnDone_1 = new JButton("DONE");
		btnDone_1.setBounds(342, 136, 89, 23);
		panel_view.add(btnDone_1);
		
		
		
	}

	
	
}
