/*
 * Created by JFormDesigner on Wed Sep 15 20:56:43 CST 2021
 */

package com.hl.magic.server.console;

import javax.swing.plaf.*;
import com.hl.magic.server.common.util.LimitedDocument;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author wst1
 */
public class Login extends JFrame {

	public Login() {
		initComponents();
		initData();
	}
	public static void main(String[] args) {
		// SwingUtilities.invokeLater(new Runnable() {
		// 	@Override
		// 	public void run() {
		// 		JFrame.setDefaultLookAndFeelDecorated(true);
		// 		Login frame = new Login();
		// 		frame.setSize(new Dimension(200, 300));
		// 		/** 设置圆角 */
		// 		//设置窗体圆角，最后两个参数分别为圆角的宽度、高度数值，一般这两个数值都是一样的
		// 		AWTUtilities.setWindowShape(frame, new RoundRectangle2D.Double(
		// 				0.0D, 0.0D, frame.getWidth(), frame.getHeight(), 26.0D,
		// 				26.0D));
		// 		frame.setVisible(true);
		// 	}
		//
		// });

		Login frame = new Login();
		frame.setVisible(true);
	}

	public void initData() {
		passwordField1.setDocument(new LimitedDocument(8));

	}

	private void okButtonActionPerformed(ActionEvent e) {
		// TODO add your code here
		JOptionPane.showMessageDialog(null, "提示消息", "标题", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(new JFrame(), "管理员在点击登录按钮");

		//返回的是按钮的index  i=0或者1
		int n = JOptionPane.showConfirmDialog(null, "你高兴吗?", "标题", JOptionPane.YES_NO_OPTION);
		if (comboBox1.getSelectedItem().equals("管理员")) {
			Object[] obj2 = {"足球", "篮球", "乒乓球"};
			String s = (String) JOptionPane.showInputDialog(null, "请选择你的爱好:\n", "爱好", JOptionPane.PLAIN_MESSAGE, new ImageIcon("icon.png"), obj2, "足球");
		}


	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		panel1 = new JPanel();
		comboBox1 = new JComboBox<>();
		passwordField1 = new JPasswordField();
		okButton = new JButton();
		label1 = new JLabel();
		label2 = new JLabel();

		//======== this ========
		setTitle("\u767b\u5f55");
		setBackground(new Color(131, 151, 208));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(LineBorder.createBlackLineBorder());
			dialogPane.setBackground(new Color(131, 151, 208));
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setBackground(new Color(131, 151, 208));
				contentPanel.setMaximumSize(new Dimension(400, 250));
				contentPanel.setMinimumSize(new Dimension(400, 2503));
				contentPanel.setBorder(new LineBorder(new Color(238, 238, 238)));

				//======== panel1 ========
				{
					panel1.setBackground(new Color(131, 158, 208));

					//---- comboBox1 ----
					comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
						"\u8d85\u7ea7\u7ba1\u7406\u5458",
						"\u5ba1\u8ba1\u5458",
						"\u7ba1\u7406\u5458"
					}));

					//---- okButton ----
					okButton.setText("\u786e\u5b9a");
					okButton.addActionListener(e -> okButtonActionPerformed(e));

					//---- label1 ----
					label1.setText("\u7528\u6237\u540d");

					//---- label2 ----
					label2.setText("\u53e3\u4ee4");

					GroupLayout panel1Layout = new GroupLayout(panel1);
					panel1.setLayout(panel1Layout);
					panel1Layout.setHorizontalGroup(
						panel1Layout.createParallelGroup()
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(65, 65, 65)
								.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
									.addComponent(label2)
									.addComponent(label1))
								.addGap(18, 18, 18)
								.addGroup(panel1Layout.createParallelGroup()
									.addComponent(okButton, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
									.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(94, Short.MAX_VALUE))
					);
					panel1Layout.setVerticalGroup(
						panel1Layout.createParallelGroup()
							.addGroup(panel1Layout.createSequentialGroup()
								.addGap(28, 28, 28)
								.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(label1)
									.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
									.addComponent(label2)
									.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addComponent(okButton)
								.addContainerGap(76, Short.MAX_VALUE))
					);
				}

				GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
				contentPanel.setLayout(contentPanelLayout);
				contentPanelLayout.setHorizontalGroup(
					contentPanelLayout.createParallelGroup()
						.addGroup(contentPanelLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
				contentPanelLayout.setVerticalGroup(
					contentPanelLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
				);
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		setSize(400, 300);
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JPanel panel1;
	private JComboBox<String> comboBox1;
	private JPasswordField passwordField1;
	private JButton okButton;
	private JLabel label1;
	private JLabel label2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
