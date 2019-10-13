package 小学生考试系统;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class defahgrsagtwsgrw {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					defahgrsagtwsgrw window = new defahgrsagtwsgrw();
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
	public defahgrsagtwsgrw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frame = new JFrame("广州市X小学数学考试自动系统");
		frame.getContentPane().setLayout(null);
		frame.setBounds(600, 250,300,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		JLabel JLabel = new JLabel("姓名");
		JLabel.setFont(new Font("楷体",Font.BOLD,15));
		JLabel.setBounds(20, 20, 108, 30);
		frame.getContentPane().add(JLabel);
		
		JLabel label = new JLabel("班级");
		label.setBounds(20, 80, 108, 30);
		label.setFont(new Font("楷体",Font.BOLD,15));
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("专业");
		label_1.setBounds(20, 140, 108, 30);
		label_1.setFont(new Font("楷体",Font.BOLD,15));
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u59D3\u540D");
		label_2.setFont(new Font("楷体", Font.BOLD, 15));
		label_2.setBounds(157, 20, 108, 30);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u59D3\u540D");
		label_3.setFont(new Font("楷体", Font.BOLD, 15));
		label_3.setBounds(157, 80, 108, 30);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u59D3\u540D");
		label_4.setFont(new Font("楷体", Font.BOLD, 15));
		label_4.setBounds(157, 140, 108, 30);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("成绩");
		label_5.setFont(new Font("楷体", Font.BOLD, 15));
		label_5.setBounds(20, 200, 108, 30);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u6210\u7EE9");
		label_6.setFont(new Font("楷体", Font.BOLD, 15));
		label_6.setBounds(157, 200, 108, 30);
		frame.getContentPane().add(label_6);
		frame.setVisible(true);
}

