import java.awt.EventQueue;
import javax.swing.*;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Font;

public class Keyboard implements ActionListener{

	private JFrame frm_AbdellahBoumaiza;
	JPanel panel = new JPanel();
	JTextArea textArea = new JTextArea();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Keyboard window = new Keyboard();
					window.frm_AbdellahBoumaiza.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Keyboard() {
		initialize();
	}

	
	public void createButtons() {

		JButton btnNewButton_21 = new JButton("\u0636");
		btnNewButton_21.addActionListener(this);
		panel.add(btnNewButton_21);
		
		JButton btnNewButton_7 = new JButton("\u0635");
		btnNewButton_7.addActionListener(this);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("\u0634");
		btnNewButton_6.addActionListener(this);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("\u0633");
		btnNewButton_5.addActionListener(this);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("\u0632");
		btnNewButton_4.addActionListener(this);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("\u0631");
		btnNewButton_3.addActionListener(this);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("\u0630");
		btnNewButton_2.addActionListener(this);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_10 = new JButton("\u062F");
		btnNewButton_10.addActionListener(this);
		panel.add(btnNewButton_10);
		
		JButton btnC = new JButton("\u062E");
		btnC.addActionListener(this);
		panel.add(btnC);
		
		JButton btnNewButton_12 = new JButton("\u062D");
		btnNewButton_12.addActionListener(this);
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("\u062C");
		btnNewButton_11.addActionListener(this);
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_9 = new JButton("\u062B");
		btnNewButton_9.addActionListener(this);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("\u062A");
		btnNewButton_8.addActionListener(this);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_13 = new JButton("\u0628");
		btnNewButton_13.addActionListener(this);
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_1 = new JButton("\u0627");
		btnNewButton_1.addActionListener(this);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\u0621");
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		JButton btnNewButton_19 = new JButton("\u064A");
		btnNewButton_19.addActionListener(this);
		panel.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("\u0648");
		btnNewButton_20.addActionListener(this);
		panel.add(btnNewButton_20);
		
		JButton btnNewButton_18 = new JButton("\u0647");
		btnNewButton_18.addActionListener(this);
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_17 = new JButton("\u0646");
		btnNewButton_17.addActionListener(this);
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_16 = new JButton("\u0645");
		btnNewButton_16.addActionListener(this);
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_15 = new JButton("\u0644");
		btnNewButton_15.addActionListener(this);
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("\u0643");
		btnNewButton_14.addActionListener(this);
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_27 = new JButton("\u0642");
		btnNewButton_27.addActionListener(this);
		panel.add(btnNewButton_27);
		
		JButton btnNewButton_26 = new JButton("\u0641");
		btnNewButton_26.addActionListener(this);
		panel.add(btnNewButton_26);
		
		JButton btnNewButton_25 = new JButton("\u063A");
		btnNewButton_25.addActionListener(this);
		panel.add(btnNewButton_25);
		
		JButton btnNewButton_24 = new JButton("\u0639");
		btnNewButton_24.addActionListener(this);
		panel.add(btnNewButton_24);
		
		JButton btnNewButton_23 = new JButton("\u0638");
		btnNewButton_23.addActionListener(this);
		panel.add(btnNewButton_23);
		
		JButton btnNewButton_22 = new JButton("\u0637");
		btnNewButton_22.addActionListener(this);
		
		JButton btnNewButton_54 = new JButton("Enter        ");
		btnNewButton_54.addActionListener(this);
		panel.add(btnNewButton_54);
		panel.add(btnNewButton_22);
		
		JButton btnNewButton_35 = new JButton("\u060C");
		btnNewButton_35.addActionListener(this);
		panel.add(btnNewButton_35);
		
		JButton btnNewButton_36 = new JButton("\u061F");
		btnNewButton_36.addActionListener(this);
		panel.add(btnNewButton_36);
		
		JButton btnNewButton_40 = new JButton("\u061B");
		btnNewButton_40.addActionListener(this);
		panel.add(btnNewButton_40);
		
		JButton btnNewButton_34 = new JButton(".");
		btnNewButton_34.addActionListener(this);
		panel.add(btnNewButton_34);
		
		JButton btnNewButton_39 = new JButton("\u0640");
		btnNewButton_39.addActionListener(this);
		panel.add(btnNewButton_39);
		
		JButton btnNewButton_38 = new JButton("\u0649");
		btnNewButton_38.addActionListener(this);
		panel.add(btnNewButton_38);
		
		JButton btnNewButton_37 = new JButton("\u0626");
		btnNewButton_37.addActionListener(this);
		panel.add(btnNewButton_37);
		
		JButton btnNewButton_33 = new JButton("\u0624");
		btnNewButton_33.addActionListener(this);
		panel.add(btnNewButton_33);
		
		JButton btnNewButton_32 = new JButton("\u0629");
		btnNewButton_32.addActionListener(this);
		panel.add(btnNewButton_32);
		
		JButton btnNewButton_31 = new JButton("\u0622");
		btnNewButton_31.addActionListener(this);
		panel.add(btnNewButton_31);
		
		JButton btnNewButton_30 = new JButton("\u0625");
		btnNewButton_30.addActionListener(this);
		panel.add(btnNewButton_30);
		
		JButton btnNewButton_29 = new JButton("\u0623");
		btnNewButton_29.addActionListener(this);
		panel.add(btnNewButton_29);
		
		//espace
		JButton btnNewButton_28 = new JButton("espace");
		btnNewButton_28.addActionListener(this);
		btnNewButton_28.setBounds(313, 256, 155, 23);
		frm_AbdellahBoumaiza.getContentPane().add(btnNewButton_28);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(36, 118, 706, 33);
		frm_AbdellahBoumaiza.getContentPane().add(panel_1);
		
		JButton btnNewButton_48 = new JButton("\u0661");
		btnNewButton_48.addActionListener(this);
		panel_1.add(btnNewButton_48);
		
		JButton btnNewButton_47 = new JButton("\u0662");
		btnNewButton_47.addActionListener(this);
		panel_1.add(btnNewButton_47);
		
		JButton btnNewButton_46 = new JButton("\u0663");
		btnNewButton_46.addActionListener(this);
		panel_1.add(btnNewButton_46);
		
		JButton btnNewButton_45 = new JButton("\u0664");
		btnNewButton_45.addActionListener(this);
		panel_1.add(btnNewButton_45);
		
		JButton btnNewButton_44 = new JButton("\u0665");
		btnNewButton_44.addActionListener(this);
		panel_1.add(btnNewButton_44);
		
		JButton btnNewButton_43 = new JButton("\u0666");
		btnNewButton_43.addActionListener(this);
		panel_1.add(btnNewButton_43);
		
		JButton btnNewButton_42 = new JButton("\u0667");
		btnNewButton_42.addActionListener(this);
		panel_1.add(btnNewButton_42);
		
		JButton btnNewButton_52 = new JButton("\u0668");
		btnNewButton_52.addActionListener(this);
		panel_1.add(btnNewButton_52);
		
		JButton btnNewButton_51 = new JButton("\u0669");
		btnNewButton_51.addActionListener(this);
		panel_1.add(btnNewButton_51);
		
		JButton btnNewButton_50 = new JButton("\u0660");
		btnNewButton_50.addActionListener(this);
		panel_1.add(btnNewButton_50);
		
		JButton btnNewButton_49 = new JButton("-");
		btnNewButton_49.addActionListener(this);
		panel_1.add(btnNewButton_49);
		
		JButton btnNewButton_41 = new JButton("+");
		btnNewButton_41.addActionListener(this);
		panel_1.add(btnNewButton_41);
		
		//arrow
		JButton btnNewButton_53 = new JButton("\u2190");
		btnNewButton_53.addActionListener(this);
		panel_1.add(btnNewButton_53);
		
		
	}

	private void initialize() {
		frm_AbdellahBoumaiza = new JFrame();
		frm_AbdellahBoumaiza.setFont(new Font("Bahnschrift", Font.PLAIN, 12));
		frm_AbdellahBoumaiza.setTitle("Abdellah Boumaiza");
		frm_AbdellahBoumaiza.setBounds(100, 100, 798, 340);
		frm_AbdellahBoumaiza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_AbdellahBoumaiza.getContentPane().setLayout(null);
		frm_AbdellahBoumaiza.setLocationRelativeTo(null);
		panel.setBounds(36, 157, 706, 99);
		

		createButtons();
		frm_AbdellahBoumaiza.getContentPane().add(panel);
		textArea.setLineWrap(true);
		textArea.setBounds(36, 32, 706, 75);
		textArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

		frm_AbdellahBoumaiza.getContentPane().add(textArea);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		switch (btn.getText()) {
		case "espace" : textArea.setText(textArea.getText() + " "); break;
		case "\u2190": textArea.setText(textArea.getText().substring(0, textArea.getText().length()-1)); break;
		case "Enter        " : textArea.setText(textArea.getText() + "\n");break;
		
		default: textArea.setText(textArea.getText() + btn.getText()); break;
		}

			

	}
}
