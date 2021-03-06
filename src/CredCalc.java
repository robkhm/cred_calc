import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CredCalc extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_3;
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
					CredCalc frame = new CredCalc();
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
	public CredCalc() {
		// Установка границ окна
		setBounds(100, 100, 522, 370);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		// Создание текстовой метки
		JLabel label = new JLabel("\u0421\u0443\u043C\u043C\u0430 \u043A\u0440\u0435\u0434\u0438\u0442\u0430");
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(10, 11, 120, 14);
		getContentPane().add(label);
		
		// Создание текстового поля
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(185, 11, 165, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		// Создание текстовой метки
		JLabel label_1 = new JLabel("\u0440\u0443\u0431.");
		label_1.setBounds(363, 14, 46, 14);
		getContentPane().add(label_1);
		
		// Создание текстовой метки
		JLabel label_2 = new JLabel("\u041F\u0440\u043E\u0446\u0435\u043D\u0442\u043D\u0430\u044F \u0441\u0442\u0430\u0432\u043A\u0430");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_2.setBounds(10, 39, 120, 14);
		getContentPane().add(label_2);
		
		// Создание текстового поля
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(185, 39, 165, 20);
		getContentPane().add(textField_1);
		
		// Создание текстовой метки
		JLabel label_3 = new JLabel("%");
		label_3.setBounds(363, 42, 46, 14);
		getContentPane().add(label_3);
		
		// Создание текстовой метки
		JLabel label_4 = new JLabel("\u0421\u0440\u043E\u043A \u043A\u0440\u0435\u0434\u0438\u0442\u0430");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_4.setBounds(10, 69, 120, 14);
		getContentPane().add(label_4);
		
		// Создание текстового поля
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setColumns(10);
		textField_2.setBounds(185, 69, 165, 20);
		getContentPane().add(textField_2);

		// Создание текстовой метки
		JLabel label_6 = new JLabel("\u0412\u0438\u0434 \u043F\u043B\u0430\u0442\u0435\u0436\u0430");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_6.setBounds(10, 94, 120, 14);
		getContentPane().add(label_6);
		
		// Создание радиокнопки
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("\u0410\u043D\u043D\u0443\u0438\u0442\u0435\u0442\u043D\u044B\u0439");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(185, 95, 200, 20);
		getContentPane().add(rdbtnNewRadioButton);
		
		// Создание радиокнопки
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\u0414\u0438\u0444\u0444\u0435\u0440\u0435\u043D\u0446\u0438\u0440\u043E\u0432\u0430\u043D\u043D\u044B\u0439");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(185, 118, 200, 20);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		// Создание текстовой метки
		JLabel label_5 = new JLabel("\u0415\u0436\u0435\u043C\u0435\u0441\u044F\u0447\u043D\u044B\u0435 \u043A\u043E\u043C\u0438\u0441\u0441\u0438\u0438");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_5.setBounds(10, 148, 144, 14);
		getContentPane().add(label_5);
		
		// Создание текстового поля
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.setBounds(185, 145, 165, 20);
		getContentPane().add(textField_3);
		
		// Создание комбинированного списка
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"% \u043E\u0442 \u0441\u0443\u043C\u043C\u044B \u043A\u0440\u0435\u0434\u0438\u0442\u0430", "% \u043E\u0442 \u043E\u0441\u0442\u0430\u0442\u043A\u0430 \u0437\u0430\u0434\u043E\u043B\u0436\u0435\u043D\u043D\u043E\u0441\u0442\u0438"}));
		comboBox.setBounds(356, 144, 140, 20);
		getContentPane().add(comboBox);
		
		// Создание текстовой метки
		JLabel label_7 = new JLabel("\u0415\u0434\u0438\u043D\u043E\u0432\u0440\u0435\u043C\u0435\u043D\u043D\u044B\u0435 \u043A\u043E\u043C\u0438\u0441\u0441\u0438\u0438");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_7.setBounds(10, 176, 144, 14);
		getContentPane().add(label_7);
		
		// Создание текстового поля
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.setBounds(185, 173, 165, 20);
		getContentPane().add(textField_4);
		
		// Создание комбинированного списка
		final JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"% \u043E\u0442 \u0441\u0443\u043C\u043C\u044B \u043A\u0440\u0435\u0434\u0438\u0442\u0430", "\u0440\u0443\u0431."}));
		comboBox_1.setBounds(356, 172, 140, 20);
		getContentPane().add(comboBox_1);
		
		// Создание кнопки рассчётов
		JButton btnNewButton = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Ввод данных
				double sum = Double.valueOf(textField.getText());
				double proc = Double.valueOf(textField_1.getText());
				double length = Double.valueOf(textField_2.getText());
				boolean ann = rdbtnNewRadioButton.isSelected();
				double em = Double.valueOf(textField_3.getText());
				boolean em_sum = comboBox.getSelectedIndex() == 0;
				double ev = Double.valueOf(textField_4.getText());
				boolean ev_proc = comboBox_1.getSelectedIndex() == 0;
				
				// Вычисление
				double p_min = sum, p_max = 0, p_total = 0;
				for(int i = 0; i < length; i++) {
					double p = 0;
					double P = (proc / 1200);
					if (ann) p = sum * (P + P / (Math.pow(P + 1, length) - 1));
					else p = sum / length + (sum - i * sum / length) * proc / (1200);
					if (em_sum) p += sum * em / 100;
					else p += (sum - i * sum / length) * em / 100;
					if (p_min > p) p_min = p;
					if (p_max < p) p_max = p;
					p_total += p;
				}
				if (ev_proc) p_total += sum * ev / 100;
				else p_total += ev;
				
				// Вывод данных
				if (p_min != p_max) textField_5.setText(String.format("%.2f", p_min) + " ... " + String.format("%.2f", p_max));
				else textField_5.setText(String.format("%.2f", p_min));
				textField_6.setText(String.format("%.2f", p_total - sum));
				textField_7.setText(String.format("%.2f", p_total));
				
			}
		});
		btnNewButton.setBounds(185, 204, 165, 23);
		getContentPane().add(btnNewButton);
		
		// Создание текстовой метки
		JLabel label_8 = new JLabel("\u0415\u0436\u0435\u043C\u0435\u0441\u044F\u0447\u043D\u044B\u0439 \u043F\u043B\u0430\u0442\u0435\u0436");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_8.setBounds(10, 233, 120, 14);
		getContentPane().add(label_8);
		
		// Создание текстового поля
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(185, 233, 165, 20);
		getContentPane().add(textField_5);
		
		// Создание текстовой метки
		JLabel label_9 = new JLabel("\u0440\u0443\u0431.");
		label_9.setBounds(363, 236, 46, 14);
		getContentPane().add(label_9);
		
		// Создание текстовой метки
		JLabel label_10 = new JLabel("\u041F\u0435\u0440\u0435\u043F\u043B\u0430\u0442\u0430 \u043F\u043E \u043A\u0440\u0435\u0434\u0438\u0442\u0443");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_10.setBounds(10, 262, 120, 14);
		getContentPane().add(label_10);
		
		// Создание текстового поля
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(185, 262, 165, 20);
		getContentPane().add(textField_6);
		
		// Создание текстовой метки
		JLabel label_11 = new JLabel("\u0440\u0443\u0431.");
		label_11.setBounds(363, 265, 46, 14);
		getContentPane().add(label_11);
		
		// Создание текстовой метки
		JLabel label_12 = new JLabel("\u0412\u044B\u043F\u043B\u0430\u0442\u044B \u0437\u0430 \u0432\u0435\u0441\u044C \u0441\u0440\u043E\u043A");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_12.setBounds(10, 290, 120, 14);
		getContentPane().add(label_12);
		
		// Создание текстового поля
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(185, 290, 165, 20);
		getContentPane().add(textField_7);
		
		// Создание текстовой метки
		JLabel label_13 = new JLabel("\u0440\u0443\u0431.");
		label_13.setBounds(363, 293, 46, 14);
		getContentPane().add(label_13);
		
		// Создание кнопки очистки
		JButton button = new JButton("\u041E\u0447\u0438\u0441\u0442\u0438\u0442\u044C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("0");
				textField_1.setText("0");
				textField_2.setText("0");
				textField_3.setText("0");
				textField_4.setText("0");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
			}
		});
		button.setBounds(366, 203, 89, 23);
		getContentPane().add(button);
		
	}
}
