import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class WindmillSpeed extends Applet implements Runnable, ActionListener, ItemListener {
	Thread th;
	int st;
	boolean flag;
	Button bt;
	CheckboxGroup cbg;
	Checkbox cs, cm, cf;
	int speed;

	public void init() {
		setLayout(null);
		th = new Thread(this);
		st = 45;
		flag = false;
		speed = 30;
		bt = new Button("START");
		bt.setBounds(100, 400, 120, 40);

		cbg = new CheckboxGroup();
		cs = new Checkbox("SLOW", cbg, true);
		cm = new Checkbox("MEDIUM", cbg, false);
		cf = new Checkbox("FAST", cbg, false);

		cs.setBounds(100, 200, 120, 30);
		cm.setBounds(100, 250, 120, 30);
		cf.setBounds(100, 300, 120, 30);

		add(bt);
		add(cs);
		add(cm);
		add(cf);

		bt.addActionListener(this);

		cs.addItemListener(this);
		cm.addItemListener(this);
		cf.addItemListener(this);

		th.start();
	}

	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand(); // used to get text on clicked button

		if (s.equals("START")) {
			flag = true;
			bt.setLabel("STOP");
		} else {
			flag = false;
			bt.setLabel("START");
		}
	}

	public void run() {
		while (true) {
			if (flag) {
				st++;
			}
			repaint();
			try {
				Thread.sleep(speed);
			} catch (Exception e) {
			}
		}

	}

	public void paint(Graphics g) {
		g.fillRect(450, 450, 400, 50);
		g.fillRect(625, 200, 50, 250);

		g.setColor(Color.red);
		g.fillArc(500, 50, 300, 300, st, 30);

		g.setColor(Color.blue);
		g.fillArc(500, 50, 300, 300, st + 140, 30);

		g.setColor(Color.green);
		g.fillArc(500, 50, 300, 300, st + 245, 30);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String s = cbg.getSelectedCheckbox().getLabel();

		if (s.equals("SLOW")) {
			speed = 30;
		} else if (s.equals("MEDIUM")) {
			speed = 10;
		} else {
			speed = 2;
		}

	}

}