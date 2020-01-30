package sourceCashCounterApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Panel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class cashFrame {

	private JFrame frame;
	private JPanel coinPanel;
	private JLabel label;
	private JTextField fiveCoinTF;
	private JLabel fiveCoinLabel;
	private JLabel tenCoinLabel;
	private JTextField tenCoinTF;
	private JTextField twentyFiveCoinTF;
	private JLabel twentyFiveCoinLabel;
	private JLabel LoonieLabel;
	private JTextField loonieCoinTF;
	private JTextField toonieCoinTF;
	private JLabel toonieCoinLabel;
	private JPanel coinRollPanel;
	private JLabel label_1;
	private JTextField fiveRollTF;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField tenRollTF;
	private JTextField quarterRollTF;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField loonRollTF;
	private JTextField toonRollTF;
	private JLabel label_11;
	private JPanel billPanel;
	private JLabel label_12;
	private JTextField billFiveTF;
	private JLabel label_13;
	private JLabel label_14;
	private JTextField billTenTF;
	private JTextField billTwentyTF;
	private JLabel label_15;
	private JLabel label_16;
	private JTextField billFiftyTF;
	private JTextField billHundoTF;
	private JLabel label_17;
	private JLabel lblTotalCounted;
	private JLabel lblOverCashFloat;
	private JLabel totFiveCoin;
	private JLabel totTenCoin;
	private JLabel totQuarterCoin;
	private JLabel totLoonCoin;
	private JLabel totToonCoin;
	private JLabel totToonRoll;
	private JLabel totLoonRoll;
	private JLabel totQuarterRoll;
	private JLabel totTenRoll;
	private JLabel totFiveRoll;
	private JLabel totHundredBill;
	private JLabel totFiftyBill;
	private JLabel totTwentyBill;
	private JLabel totTenBill;
	private JLabel totFiveBill;
	private JLabel totalCounteLabel;
	private JLabel overCountedLabel;
	static double totFC, totTC, totQC, totLoonC, totToonC;
	static double totFB, totTB, totTwenB, totFIFB, totHunB;
	static double totNick, totDime, totQ, totLoons, totToons;
	static double floo = 500.00 ;
	
void clearTF() {
	fiveCoinTF.setText("");
	tenCoinTF.setText("");
	twentyFiveCoinTF.setText("");
	loonieCoinTF.setText("");
	toonieCoinTF.setText("");
	fiveRollTF.setText("");
	tenRollTF.setText("");
	quarterRollTF.setText("");
	loonRollTF.setText("");
	toonRollTF.setText("");
	billFiveTF.setText("");
	billTenTF.setText("");
	billTwentyTF.setText("");
	billFiftyTF.setText("");
	billHundoTF.setText("");
	
}
void clearLabels() {
	totFiveCoin.setText("$ 0.00");
	totTenCoin.setText("$ 0.00");
	totQuarterCoin.setText("$ 0.00");
	totLoonCoin.setText("$ 0.00");
	totToonCoin.setText("$ 0.00");

	totToonRoll.setText("$ 0.00");
	totLoonRoll.setText("$ 0.00");
	totQuarterRoll.setText("$ 0.00");
	totTenRoll.setText("$ 0.00");
	totFiveRoll.setText("$ 0.00");

	totHundredBill.setText("$ 0.00");
	totFiftyBill.setText("$ 0.00");
	totTwentyBill.setText("$ 0.00");;
	totTenBill.setText("$ 0.00");
	totFiveBill.setText("$ 0.00");
	
}
void clearCounters() {
	totFC = totTC = totQC = totLoonC = totToonC = 0;
	totFB = totTB = totTwenB =  totFIFB =  totHunB = 0;
	totNick =  totDime =  totQ =  totLoons = totToons = 0;
}
double giveTits() {
double tits = totFC + totTC + totQC + totLoonC + totToonC + totFB + totTB + totTwenB +  totFIFB +  totHunB + totNick +  totDime +  totQ +  totLoons + totToons; 
return tits;
}
double giveAss() {
	return -floo + giveTits();
}
/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cashFrame window = new cashFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public double CalcMethod(JTextField tF, Double denomVal, JLabel labelName, Double foo) {
		if(tF.getText() == null || tF.getText().isEmpty()) {
			foo = 0.0;
			labelName.setText("$ " + String.format("%.2f", foo ));
		}
		try {
		if(Integer.parseInt(tF.getText()) > 0) {
		foo = Double.valueOf(tF.getText())*denomVal;
		}
		else foo = 0.0;
		labelName.setText("$ " + String.format("%.2f", foo ));
		labelName.repaint();
		}
		catch(NumberFormatException nfe) {
			foo = 0.0;
			labelName.repaint();
			
		}
		return foo;
	}

	/**
	 * Create the application.
	 */
	public cashFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 919, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel displayPanel = new JPanel();
		displayPanel.setBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)));
		displayPanel.setBounds(10, 279, 880, 111);
		frame.getContentPane().add(displayPanel);
		displayPanel.setLayout(null);
		
		JLabel logolabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/ff4.png")).getImage();
		logolabel.setIcon(new ImageIcon(img1));
		logolabel.setBounds(3, 13, 300, 90);
		displayPanel.add(logolabel);
		
		JLabel byAhmadFaruqiLabel = new JLabel("by Ahmad Faruqi");
		byAhmadFaruqiLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 16));
		byAhmadFaruqiLabel.setBounds(104, 82, 116, 20);
		displayPanel.add(byAhmadFaruqiLabel);
		
		JLabel lblCashFloat = new JLabel("Cash Float:");
		lblCashFloat.setFont(new Font("Myriad Pro", Font.PLAIN, 15));
		lblCashFloat.setBounds(313, 44, 89, 24);
		displayPanel.add(lblCashFloat);
		
		JComboBox comboBoxFLOAT = new JComboBox();
		
		comboBoxFLOAT.setBackground(Color.WHITE);
		comboBoxFLOAT.setFont(new Font("Myriad Pro", Font.PLAIN, 13));
		comboBoxFLOAT.setBounds(390, 44, 73, 22);
		comboBoxFLOAT.addItem("$500");
		comboBoxFLOAT.addItem("$600");
		comboBoxFLOAT.addItem("$700");
		comboBoxFLOAT.addItem("$800");
		comboBoxFLOAT.addItem("$900");
		comboBoxFLOAT.addItem("$1000");
		comboBoxFLOAT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String msg = (String) comboBoxFLOAT.getSelectedItem();
			switch(msg) {
			
			case "$500" : floo = 500.00; overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			break;
			case "$600" : floo = 600.00; overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			break;
			case "$700" : floo = 700.00; overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			break;
			case "$800" : floo = 800.00; overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			break;
			case "$900" : floo = 900.00; overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			break;
			case "$1000" : floo = 1000.00; overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			break;
			}
			}
		});
		
		displayPanel.add(comboBoxFLOAT);
		
		lblTotalCounted = new JLabel("Total Counted");
		lblTotalCounted.setFont(new Font("Myriad Pro", Font.PLAIN, 20));
		lblTotalCounted.setBounds(487, 44, 118, 24);
		displayPanel.add(lblTotalCounted);
		
		totalCounteLabel = new JLabel("$ 0.00");
		totalCounteLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 40));
		totalCounteLabel.setBounds(487, 64, 201, 48);
		displayPanel.add(totalCounteLabel);
		
		lblOverCashFloat = new JLabel("Deposit");
		lblOverCashFloat.setHorizontalAlignment(SwingConstants.CENTER);
		lblOverCashFloat.setFont(new Font("Myriad Pro", Font.PLAIN, 20));
		lblOverCashFloat.setBounds(681, 44, 129, 24);
		displayPanel.add(lblOverCashFloat);
		
		JButton btnClearAll = new JButton("Clear All");
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearCounters();
				clearLabels();
				clearTF();
				totalCounteLabel.setText("$ 0.00");
				overCountedLabel.setText("$ 0.00");
				
			}
		});
		btnClearAll.setBounds(389, 80, 74, 23);
		displayPanel.add(btnClearAll);
		btnClearAll.setFont(new Font("Myriad Pro", Font.PLAIN, 10));
		
		overCountedLabel = new JLabel("$ 0.00");
		overCountedLabel.setForeground(Color.RED);
		overCountedLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 40));
		overCountedLabel.setBounds(695, 64, 185, 48);
		displayPanel.add(overCountedLabel);
		
		coinPanel = new JPanel();
		coinPanel.setBorder(new MatteBorder(0, 0, 0, 1, (Color) new Color(0, 0, 0)));
		coinPanel.setBounds(10, 1, 279, 280);
		frame.getContentPane().add(coinPanel);
		coinPanel.setLayout(null);
		
		label = new JLabel("Coins");
		label.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label.setBounds(10, 11, 59, 31);
		coinPanel.add(label);
		
		
		
		
		
		
		fiveCoinTF = new JTextField();
		
		fiveCoinTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				totFC = CalcMethod(fiveCoinTF, 0.05, totFiveCoin, totFC);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
				}
			
			
		});
		
		
		
		
		fiveCoinTF.setHorizontalAlignment(SwingConstants.CENTER);
		fiveCoinTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		fiveCoinTF.setColumns(10);
		fiveCoinTF.setBounds(10, 37, 59, 35);
		coinPanel.add(fiveCoinTF);
		
		fiveCoinLabel = new JLabel("x 5\u00A2");
		fiveCoinLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		fiveCoinLabel.setBounds(79, 41, 42, 31);
		coinPanel.add(fiveCoinLabel);
		
		tenCoinLabel = new JLabel("x 10\u00A2");
		tenCoinLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		tenCoinLabel.setBounds(79, 87, 55, 31);
		coinPanel.add(tenCoinLabel);
		
		tenCoinTF = new JTextField();
		tenCoinTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				totTC = CalcMethod(tenCoinTF, 0.1, totTenCoin, totTC);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		tenCoinTF.setHorizontalAlignment(SwingConstants.CENTER);
		tenCoinTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		tenCoinTF.setColumns(10);
		tenCoinTF.setBounds(10, 83, 59, 35);
		coinPanel.add(tenCoinTF);
		
		twentyFiveCoinTF = new JTextField();
		twentyFiveCoinTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				totQC = CalcMethod(twentyFiveCoinTF,0.25, totQuarterCoin, totQC);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		twentyFiveCoinTF.setHorizontalAlignment(SwingConstants.CENTER);
		twentyFiveCoinTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		twentyFiveCoinTF.setColumns(10);
		twentyFiveCoinTF.setBounds(10, 129, 59, 35);
		coinPanel.add(twentyFiveCoinTF);
		
		twentyFiveCoinLabel = new JLabel("x 25\u00A2");
		twentyFiveCoinLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		twentyFiveCoinLabel.setBounds(79, 133, 55, 31);
		coinPanel.add(twentyFiveCoinLabel);
		
		LoonieLabel = new JLabel("x $1");
		LoonieLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		LoonieLabel.setBounds(79, 179, 42, 31);
		coinPanel.add(LoonieLabel);
		
		loonieCoinTF = new JTextField();
		loonieCoinTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				totLoonC = CalcMethod(loonieCoinTF, 1.0, totLoonCoin, totLoonC);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		loonieCoinTF.setHorizontalAlignment(SwingConstants.CENTER);
		loonieCoinTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		loonieCoinTF.setColumns(10);
		loonieCoinTF.setBounds(10, 175, 59, 35);
		coinPanel.add(loonieCoinTF);
		
		toonieCoinTF = new JTextField();
		toonieCoinTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				totToonC = CalcMethod(toonieCoinTF, 2.0, totToonCoin, totToonC);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		toonieCoinTF.setHorizontalAlignment(SwingConstants.CENTER);
		toonieCoinTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		toonieCoinTF.setColumns(10);
		toonieCoinTF.setBounds(10, 221, 59, 35);
		coinPanel.add(toonieCoinTF);
		
		toonieCoinLabel = new JLabel("x $2");
		toonieCoinLabel.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		toonieCoinLabel.setBounds(79, 225, 42, 31);
		coinPanel.add(toonieCoinLabel);
		
		totFiveCoin = new JLabel("$ 0.00");
		totFiveCoin.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totFiveCoin.setBounds(174, 41, 100, 31);
		coinPanel.add(totFiveCoin);
		
		totTenCoin = new JLabel("$ 0.00");
		totTenCoin.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totTenCoin.setBounds(174, 87, 100, 31);
		coinPanel.add(totTenCoin);
		
		totQuarterCoin = new JLabel("$ 0.00");
		totQuarterCoin.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totQuarterCoin.setBounds(174, 133, 100, 31);
		coinPanel.add(totQuarterCoin);
		
		totLoonCoin = new JLabel("$ 0.00");
		totLoonCoin.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totLoonCoin.setBounds(174, 179, 100, 31);
		coinPanel.add(totLoonCoin);
		
		totToonCoin = new JLabel("$ 0.00");
		totToonCoin.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totToonCoin.setBounds(174, 225, 100, 31);
		coinPanel.add(totToonCoin);
		
		
		coinRollPanel = new JPanel();
		coinRollPanel.setBorder(new MatteBorder(0, 0, 1, 1, (Color) new Color(0, 0, 0)));
		coinRollPanel.setBounds(288, 1, 297, 280);
		frame.getContentPane().add(coinRollPanel);
		coinRollPanel.setLayout(null);
		
		label_1 = new JLabel("Coin Rolls");
		label_1.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_1.setBounds(10, 11, 103, 31);
		coinRollPanel.add(label_1);
		
		fiveRollTF = new JTextField();
		fiveRollTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				totNick = CalcMethod(fiveRollTF, 2.0, totFiveRoll, totNick);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		fiveRollTF.setHorizontalAlignment(SwingConstants.CENTER);
		fiveRollTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		fiveRollTF.setColumns(10);
		fiveRollTF.setBounds(20, 38, 59, 35);
		coinRollPanel.add(fiveRollTF);
		
		label_2 = new JLabel("x 5\u00A2");
		label_2.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_2.setBounds(89, 42, 42, 31);
		coinRollPanel.add(label_2);
		
		label_3 = new JLabel("x 10\u00A2");
		label_3.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_3.setBounds(89, 88, 55, 31);
		coinRollPanel.add(label_3);
		
		tenRollTF = new JTextField();
		tenRollTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				totDime = CalcMethod(tenRollTF, 5.0, totTenRoll, totDime);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		tenRollTF.setHorizontalAlignment(SwingConstants.CENTER);
		tenRollTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		tenRollTF.setColumns(10);
		tenRollTF.setBounds(20, 84, 59, 35);
		coinRollPanel.add(tenRollTF);
		
		quarterRollTF = new JTextField();
		quarterRollTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				totQ = CalcMethod(quarterRollTF, 10.0, totQuarterRoll, totQ);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		quarterRollTF.setHorizontalAlignment(SwingConstants.CENTER);
		quarterRollTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		quarterRollTF.setColumns(10);
		quarterRollTF.setBounds(20, 130, 59, 35);
		coinRollPanel.add(quarterRollTF);
		
		label_4 = new JLabel("x 25\u00A2");
		label_4.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_4.setBounds(89, 134, 55, 31);
		coinRollPanel.add(label_4);
		
		label_5 = new JLabel("x $1");
		label_5.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_5.setBounds(89, 180, 42, 31);
		coinRollPanel.add(label_5);
		
		loonRollTF = new JTextField();
		loonRollTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				totLoons = CalcMethod(loonRollTF, 25.0, totLoonRoll, totLoons);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		loonRollTF.setHorizontalAlignment(SwingConstants.CENTER);
		loonRollTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		loonRollTF.setColumns(10);
		loonRollTF.setBounds(20, 176, 59, 35);
		coinRollPanel.add(loonRollTF);
		
		toonRollTF = new JTextField();
		toonRollTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			
			totToons = CalcMethod(toonRollTF, 50.00, totToonRoll, totToons);
			totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
			overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		toonRollTF.setHorizontalAlignment(SwingConstants.CENTER);
		toonRollTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		toonRollTF.setColumns(10);
		toonRollTF.setBounds(20, 222, 59, 35);
		coinRollPanel.add(toonRollTF);
		
		label_11 = new JLabel("x $2");
		label_11.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_11.setBounds(89, 226, 42, 31);
		coinRollPanel.add(label_11);
		
		totFiveRoll = new JLabel("$ 0.00");
		totFiveRoll.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totFiveRoll.setBounds(189, 42, 107, 31);
		coinRollPanel.add(totFiveRoll);
		
		totTenRoll = new JLabel("$ 0.00");
		totTenRoll.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totTenRoll.setBounds(189, 88, 107, 31);
		coinRollPanel.add(totTenRoll);
		
		totQuarterRoll = new JLabel("$ 0.00");
		totQuarterRoll.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totQuarterRoll.setBounds(189, 134, 107, 31);
		coinRollPanel.add(totQuarterRoll);
		
		totLoonRoll = new JLabel("$ 0.00");
		totLoonRoll.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totLoonRoll.setBounds(189, 180, 107, 31);
		coinRollPanel.add(totLoonRoll);
		
		totToonRoll = new JLabel("$ 0.00");
		totToonRoll.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totToonRoll.setBounds(189, 226, 107, 31);
		coinRollPanel.add(totToonRoll);
		
		billPanel = new JPanel();
		billPanel.setBounds(584, 0, 295, 280);
		frame.getContentPane().add(billPanel);
		billPanel.setLayout(null);
		
		label_12 = new JLabel("Bills");
		label_12.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_12.setBounds(28, 11, 41, 31);
		billPanel.add(label_12);
		
		billFiveTF = new JTextField();
		billFiveTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			
			totFB = CalcMethod(billFiveTF, 5.0,totFiveBill, totFB);
			totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
			overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			
			}
		});
		billFiveTF.setHorizontalAlignment(SwingConstants.CENTER);
		billFiveTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		billFiveTF.setColumns(10);
		billFiveTF.setBounds(20, 38, 59, 35);
		billPanel.add(billFiveTF);
		
		label_13 = new JLabel("x $5");
		label_13.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_13.setBounds(89, 42, 42, 31);
		billPanel.add(label_13);
		
		label_14 = new JLabel("x $10");
		label_14.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_14.setBounds(89, 88, 55, 31);
		billPanel.add(label_14);
		
		billTenTF = new JTextField();
		billTenTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			
			totTB = CalcMethod(billTenTF, 10.0, totTenBill, totTB);
			totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
			overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		billTenTF.setHorizontalAlignment(SwingConstants.CENTER);
		billTenTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		billTenTF.setColumns(10);
		billTenTF.setBounds(20, 84, 59, 35);
		billPanel.add(billTenTF);
		
		billTwentyTF = new JTextField();
		billTwentyTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				totTwenB = CalcMethod(billTwentyTF, 20.0, totTwentyBill, totTwenB);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		billTwentyTF.setHorizontalAlignment(SwingConstants.CENTER);
		billTwentyTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		billTwentyTF.setColumns(10);
		billTwentyTF.setBounds(20, 130, 59, 35);
		billPanel.add(billTwentyTF);
		
		label_15 = new JLabel("x $20");
		label_15.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_15.setBounds(89, 134, 55, 31);
		billPanel.add(label_15);
		
		label_16 = new JLabel("x $50");
		label_16.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_16.setBounds(89, 180, 55, 31);
		billPanel.add(label_16);
		
		billFiftyTF = new JTextField();
		billFiftyTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				totFIFB = CalcMethod(billFiftyTF, 50.0, totFiftyBill, totFIFB);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		billFiftyTF.setHorizontalAlignment(SwingConstants.CENTER);
		billFiftyTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		billFiftyTF.setColumns(10);
		billFiftyTF.setBounds(20, 176, 59, 35);
		billPanel.add(billFiftyTF);
		
		billHundoTF = new JTextField();
		billHundoTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				totHunB = CalcMethod(billHundoTF, 100.00, totHundredBill, totHunB);
				totalCounteLabel.setText("$ " + String.format("%.2f", giveTits() ));
				overCountedLabel.setText("$ " + String.format("%.2f", giveAss() ));
			}
		});
		billHundoTF.setHorizontalAlignment(SwingConstants.CENTER);
		billHundoTF.setFont(new Font("Myriad Pro", Font.PLAIN, 23));
		billHundoTF.setColumns(10);
		billHundoTF.setBounds(20, 222, 59, 35);
		billPanel.add(billHundoTF);
		
		label_17 = new JLabel("x $100");
		label_17.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		label_17.setBounds(89, 226, 67, 31);
		billPanel.add(label_17);
		
		totFiveBill = new JLabel("$ 0.00");
		totFiveBill.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totFiveBill.setBounds(189, 42, 106, 31);
		billPanel.add(totFiveBill);
		
		totTenBill = new JLabel("$ 0.00");
		totTenBill.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totTenBill.setBounds(189, 88, 106, 31);
		billPanel.add(totTenBill);
		
		totTwentyBill = new JLabel("$ 0.00");
		totTwentyBill.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totTwentyBill.setBounds(189, 134, 106, 31);
		billPanel.add(totTwentyBill);
		
		totFiftyBill = new JLabel("$ 0.00");
		totFiftyBill.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totFiftyBill.setBounds(189, 180, 106, 31);
		billPanel.add(totFiftyBill);
		
		totHundredBill = new JLabel("$ 0.00");
		totHundredBill.setFont(new Font("Myriad Pro", Font.PLAIN, 25));
		totHundredBill.setBounds(189, 226, 106, 31);
		billPanel.add(totHundredBill);
	}
}
