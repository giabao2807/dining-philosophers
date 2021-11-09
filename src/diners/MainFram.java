package diners;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

public class MainFram extends JFrame {
	public MainFram() {
		initComponents();
	}

	private JPanel one, two, three, four, five;
	private JPanel jPanel1, jPanel2, jPanel3;
	private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel6;
	private JLabel jLabel7, jLabel8, jLabel9;

	private void initComponents() {
		one = new JPanel();
		two = new JPanel();
		three = new JPanel();
		four = new JPanel();
		five = new JPanel();
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		jPanel3 = new JPanel();

		jLabel6 = new JLabel();
		jLabel7 = new JLabel();
		jLabel1 = new JLabel();
		jLabel8 = new JLabel();
		jLabel9 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		jLabel4 = new JLabel();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Dinning Philosopher");
		setBackground(new Color(0, 153, 153));

		five.setBackground(new Color(255, 255, 255));
		GroupLayout fiveLayout = new GroupLayout(five);
		five.setLayout(fiveLayout);
		fiveLayout
				.setHorizontalGroup(fiveLayout.createParallelGroup(Alignment.LEADING).addGap(0, 160, Short.MAX_VALUE));
		fiveLayout.setVerticalGroup(fiveLayout.createParallelGroup(Alignment.LEADING).addGap(0, 33, Short.MAX_VALUE));

		two.setBackground(new Color(255, 255, 255));

		GroupLayout twoLayout = new GroupLayout(two);
		two.setLayout(twoLayout);
		twoLayout.setHorizontalGroup(twoLayout.createParallelGroup(Alignment.LEADING).addGap(0, 160, Short.MAX_VALUE));
		twoLayout.setVerticalGroup(twoLayout.createParallelGroup(Alignment.LEADING).addGap(0, 26, Short.MAX_VALUE));

		four.setBackground(new Color(255, 255, 255));

		GroupLayout fourLayout = new GroupLayout(four);
		four.setLayout(fourLayout);
		fourLayout
				.setHorizontalGroup(fourLayout.createParallelGroup(Alignment.LEADING).addGap(0, 160, Short.MAX_VALUE));
		fourLayout.setVerticalGroup(fourLayout.createParallelGroup(Alignment.LEADING).addGap(0, 24, Short.MAX_VALUE));

		one.setBackground(new Color(255, 255, 255));
		one.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

		GroupLayout oneLayout = new GroupLayout(one);
		one.setLayout(oneLayout);
		oneLayout.setHorizontalGroup(oneLayout.createParallelGroup(Alignment.LEADING).addGap(0, 160, Short.MAX_VALUE));
		oneLayout.setVerticalGroup(oneLayout.createParallelGroup(Alignment.LEADING).addGap(0, 26, Short.MAX_VALUE));

		three.setBackground(new Color(255, 255, 255));

		GroupLayout threeLayout = new GroupLayout(three);
		three.setLayout(threeLayout);
		threeLayout
				.setHorizontalGroup(threeLayout.createParallelGroup(Alignment.LEADING).addGap(0, 164, Short.MAX_VALUE));
		threeLayout.setVerticalGroup(threeLayout.createParallelGroup(Alignment.LEADING).addGap(0, 25, Short.MAX_VALUE));

		jLabel6.setIcon(new ImageIcon(getClass().getResource("/images/p0.jpg"))); // NOI18N

		jLabel7.setIcon(new ImageIcon(getClass().getResource("/images/p1.jpg"))); // NOI18N

		jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/p4.jpg"))); // NOI18N

		jLabel8.setIcon(new ImageIcon(getClass().getResource("/images/p2.jpg"))); // NOI18N

		jLabel9.setIcon(new ImageIcon(getClass().getResource("/images/p3.jpg"))); // NOI18N

		// set color for three state
		jPanel1.setBackground(new Color(255, 255, 0));
		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 21, Short.MAX_VALUE));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGap(0, 18, Short.MAX_VALUE));

		jPanel2.setBackground(new Color(255, 0, 0));
		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(Alignment.LEADING).addGap(0, 21, Short.MAX_VALUE));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGap(0, 18, Short.MAX_VALUE));

		jPanel3.setBackground(Color.green);
		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(Alignment.LEADING).addGap(0, 21, Short.MAX_VALUE));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGap(0, 18, Short.MAX_VALUE));

		// Three state
		jLabel2.setText("Eating");
		jLabel3.setText("Hungry");
		jLabel4.setText("Thinking");

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout
								.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(379, 379, 379).addComponent(jLabel9))
								.addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap()
										.addComponent(four, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGap(44, 44, 44))
								.addGroup(layout
										.createSequentialGroup().addGap(25, 25, 25)
										.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(
												jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE).addComponent(
														jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(jLabel2)
												.addGroup(layout.createSequentialGroup().addGap(116, 116, 116)
														.addGroup(layout.createParallelGroup(Alignment.LEADING)
																.addComponent(five, GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(jLabel1)))
												.addComponent(jLabel4).addComponent(jLabel3))
										.addGap(96, 96, 96)
										.addGroup(layout.createParallelGroup(Alignment.LEADING)
												.addComponent(one, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel6))))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(two, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7).addComponent(jLabel8).addComponent(three,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(38, 38, 38)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(jLabel7).addComponent(jLabel6))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(one, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel9).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(four, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(32, 32, 32))
						.addGroup(layout.createSequentialGroup()
								.addComponent(two, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
								.addComponent(jLabel8).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(three, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(37, 37, 37))))
				.addGroup(layout.createSequentialGroup().addGap(33, 33, 33)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel2))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3))
						.addGap(11, 11, 11)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel4))
						.addGap(98, 98, 98).addComponent(jLabel1)
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(five, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();

	}

	private final int THINKING = 0;
	private final int HUNGRY = 1;
	private final int EATING = 2;

	//set color for philosopher 
	void setPosition(int pos, int status) {
		if (pos == 0) {
			if (status == HUNGRY) {
				one.setBackground(Color.red);
			} else if (status == EATING) {
				one.setBackground(Color.yellow);
			} else {
				one.setBackground(Color.green);
			}
		}
		else if (pos == 1) {
			if (status == HUNGRY) {
				two.setBackground(Color.red);
			} else if (status == EATING) {
				two.setBackground(Color.yellow);
			} else {
				two.setBackground(Color.green);
			}
		} else if (pos == 2) {
			if (status == HUNGRY) {
				three.setBackground(Color.red);
			} else if (status == EATING) {
				three.setBackground(Color.yellow);
			} else {
				three.setBackground(Color.green);
			}
		} else if (pos == 3) {
			if (status == HUNGRY) {
				four.setBackground(Color.red);
			} else if (status == EATING) {
				four.setBackground(Color.yellow);
			} else {
				four.setBackground(Color.green);
			}
		} else {
			if (status == HUNGRY) {
				five.setBackground(Color.red);
			} else if (status == EATING) {
				five.setBackground(Color.yellow);
			} else {
				five.setBackground(Color.green);
			}

		}

	}
}
