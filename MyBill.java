import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Thanks extends JFrame
{
	JTextArea jta2;
	Font f;
	Container cont;
	
	Thanks(String s)
	{
		cont=getContentPane();
		cont.setLayout(null);
		
		f=new Font("Arial",Font.BOLD+Font.ITALIC,40);
		jta2=new JTextArea();
		jta2.setBounds(0,0,850,50);
		jta2.setText(s);
		jta2.setFont(f);
		jta2.setBackground(Color.red);
		jta2.setForeground(Color.GREEN);
		cont.add(jta2);
	}
	
	
}

class BillPayment extends JFrame implements ActionListener
{
	Container cont;
	JTextArea jta;
	JButton back,finish;
	Font f;
	JLabel jl,title;
	
	BillPayment(String s)
	{
		super("Your Bill");
		cont=getContentPane();
		cont.setLayout(null);
		cont.setBackground(Color.cyan);
		
		jta=new JTextArea();
		jta.setBounds(25,50,600,500);
		jta.setText(s);
		f=new Font("Arial",Font.BOLD+Font.ITALIC,20);
		jta.setFont(f);
		jta.setForeground(Color.green);
		
		title=new JLabel("YOUR BILL");
		title.setBounds(300,10,300,20);
		title.setFont(f);
		title.setForeground(Color.red);
		back=new JButton("Back");
		finish=new JButton("Exit");
		
		back.setBounds(650,50,100,50);
		finish.setBounds(650,150,100,50);
		
		cont.add(jta); cont.add(back); cont.add(finish);
		cont.add(title);
		
		back.addActionListener(this);
		finish.addActionListener(this);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) 
	{
		String s=e.getActionCommand();
		
		if(s.equals("Back"))
		{
			Menu m=new Menu();
			m.setVisible(true);
			m.setSize(1200, 700);
			m.setLocation(10, 10);
		}
		else if(s.equals("Exit"))
		{
			Thanks th=new Thanks("THANK YOU FOR VISIT PLS VISIT AGAIN :)");
			th.setVisible(true);
			th.setSize(850,80);
			th.setLocation(300,200);
			
		}
	}
}

class Menu extends JFrame implements ActionListener
{
	Container cont;
	JPanel jptop,jp1,jp2,jp3;
	JLabel jltop,jlorder;
	Font f;
	JButton jbill;
	JLabel jlfood,jldrink,jlsnacks;
	JButton jsam,jvad,jdab;
	JButton jtea,jcof,jwater,jpep;
	JButton jchips,jtoast,jbis;
	JLabel chips,toast,bis;
	JLabel tea,cof,water,pep;
	JLabel sam,vad,dab;
	JLabel item,quantity,ditem,dquantity,sitem,squantity;
	Choice csam,cvad,cdab,ctea,ccof,cpep,cwater,cchips,ctoast,cbis;
	JTextArea jta;
	JLabel note;
	JTextField man,man1;
	String order;
	int total;
	
	Menu()
	{
		super("Tasty Resturnant");
		order="";
		total=0;
		cont=getContentPane();
		cont.setLayout(null);
		cont.setBackground(Color.orange);
		f=new Font("Arial",Font.BOLD+Font.ITALIC,30);
		jltop=new JLabel("TASTY RESTURNANT MENU");
		jltop.setBounds(400,10,500,40);
		jltop.setForeground(Color.GREEN);
		jltop.setFont(f);
		
		jlorder=new JLabel("pls give your order");
		jlorder.setBounds(550,50,300,20);	
		
		jptop=new JPanel();
		jptop.setBounds(0,0,1200,70);
		jptop.setBackground(Color.magenta);
		jptop.setLayout(null);
		
		jp1=new JPanel();
		jp1.setBounds(0,100,300,550);
		jp1.setBackground(Color.getHSBColor(110, 130, 75));
		
		jp1.setLayout(null);
		jlfood=new JLabel("Food Items");
		jlfood.setBounds(100,0,300,30);
		jlfood.setForeground(Color.BLUE);
		f=new Font("Arial",Font.BOLD,20);
		jlfood.setFont(f);
		
		item=new JLabel("Item");
		quantity=new JLabel("Quantity");
		
		item.setBounds(50,30,100,20);
		quantity.setBounds(180,30,100,20);
		csam=new Choice();
		cvad=new Choice();
		cdab=new Choice();
		
		for(int i=0;i<=10;i++)
		{
			csam.add(""+i);
			cvad.add(""+i);
			cdab.add(""+i);
		}
		
		jsam=new JButton(new ImageIcon("src//samosa.jpeg"));
		sam=new JLabel("Samosa- RS:20");
		jsam.setBounds(20,60,100,50);
		jsam.setToolTipText("samosa");
		sam.setBounds(20,120,100,10);
		csam.setBounds(160,70,100,30);
		
		jdab=new JButton(new ImageIcon("src//dabeli.jpeg"));
		dab=new JLabel("Dabeli- RS:25");
		jdab.setToolTipText("dabeli");
		jdab.setBounds(20,160,100,50);
		dab.setBounds(20,220,100,10);
		cdab.setBounds(160,170,100,30);
		
		jvad=new JButton(new ImageIcon("src//vadapav.jpeg"));
		vad=new JLabel("Vadapav- RS:25");
		jvad.setToolTipText("vadapav");
		jvad.setBounds(20,260,100,50);
		vad.setBounds(20,320,100,10);
		cvad.setBounds(160,270,100,30);
		
		jp1.add(jlfood); jp1.add(jsam); jp1.add(sam); jp1.add(jdab); jp1.add(dab); jp1.add(jvad); jp1.add(vad);
		jp1.add(item); jp1.add(quantity); jp1.add(cdab); jp1.add(cvad); jp1.add(csam);
		
		jp2=new JPanel();
		jp2.setBounds(320,100,300,550);
		jp2.setBackground(Color.getHSBColor(110, 130, 75));
		
		jp2.setLayout(null);
		jldrink=new JLabel("Drinks");
		jldrink.setBounds(100,0,300,30);
		jldrink.setForeground(Color.BLUE);
		jldrink.setFont(f);
		
		ditem=new JLabel("Item");
		dquantity=new JLabel("Quantity");
		
		ditem.setBounds(50,30,100,20);
		dquantity.setBounds(180,30,100,20);
		ctea=new Choice();
		ccof=new Choice();
		cpep=new Choice();
		cwater=new Choice();
		
		for(int i=0;i<=10;i++)
		{
			ctea.add(""+i);
			ccof.add(""+i);
			cpep.add(""+i);
			cwater.add(""+i);
		}
		
		jtea=new JButton(new ImageIcon("src//tea.jpeg"));
		tea=new JLabel("Tea- Rs:10");
		jtea.setToolTipText("tea");
		jtea.setBounds(20,60,100,50);
		tea.setBounds(20,120,100,10);
		ctea.setBounds(160,70,100,30);
		
		jcof=new JButton(new ImageIcon("src//coffee.jpeg"));
		cof=new JLabel("Coffee- Rs:20");
		jcof.setToolTipText("coffee");
		jcof.setBounds(20,160,100,50);
		cof.setBounds(20,220,100,10);
		ccof.setBounds(160,170,100,30);
		
		jpep=new JButton(new ImageIcon("src//pepsi.jpeg"));
		pep=new JLabel("Pepsi- Rs:20");
		jpep.setToolTipText("pepsi");
		jpep.setBounds(20,260,100,50);
		pep.setBounds(20,320,100,10);
		cpep.setBounds(160,270,100,30);
		
		jwater=new JButton(new ImageIcon("src//water.jpeg"));
		water=new JLabel("Water- Rs:10");
		jwater.setToolTipText("water");
		jwater.setBounds(20,360,100,50);
		water.setBounds(20,420,100,10);
		cwater.setBounds(160,370,100,30);
		
		jp2.add(jldrink); jp2.add(ditem); jp2.add(dquantity); jp2.add(jtea); jp2.add(tea); jp2.add(jcof);
		jp2.add(cof); jp2.add(pep); jp2.add(jpep); jp2.add(jwater); jp2.add(water); jp2.add(ctea); jp2.add(ccof);
		jp2.add(cwater); jp2.add(cpep);
		
		jp3=new JPanel();
		jp3.setBounds(640,100,300,550);
		jp3.setBackground(Color.getHSBColor(110, 130, 75));
		
		jp3.setLayout(null);
		jlsnacks=new JLabel("Snacks");
		jlsnacks.setBounds(100,0,300,30);
		jlsnacks.setForeground(Color.BLUE);
		jlsnacks.setFont(f);
		
		sitem=new JLabel("Item");
		squantity=new JLabel("Quantity");
		
		sitem.setBounds(50,30,100,20);
		squantity.setBounds(180,30,100,20);
		cchips=new Choice();
		ctoast=new Choice();
		cbis=new Choice();
		
		for(int i=0;i<=10;i++)
		{
			cchips.add(""+i);
			ctoast.add(""+i);
			cbis.add(""+i);
		}
		
		jchips=new JButton(new ImageIcon("src//chips.jpeg"));
		chips=new JLabel("Chips- Rs:10");
		jchips.setToolTipText("chips");
		jchips.setBounds(20,60,100,50);
		chips.setBounds(20,120,100,10);
		cchips.setBounds(160,70,100,30);
		
		jtoast=new JButton(new ImageIcon("src//toast.jpeg"));
		toast=new JLabel("Toast- Rs:20");
		jtoast.setToolTipText("toast");
		jtoast.setBounds(20,160,100,50);
		toast.setBounds(20,220,100,10);
		ctoast.setBounds(160,170,100,30);
		
		jbis=new JButton(new ImageIcon("src//biscuit.jpeg"));
		bis=new JLabel("Biscuit- Rs:10");
		jbis.setToolTipText("biscuit");
		jbis.setBounds(20,260,100,50);
		bis.setBounds(20,320,100,10);
		cbis.setBounds(160,270,100,30);
		
		jp3.add(jlsnacks); jp3.add(sitem); jp3.add(squantity); jp3.add(jchips); jp3.add(chips); jp3.add(cchips);
		jp3.add(toast); jp3.add(jtoast); jp3.add(ctoast); jp3.add(jbis); jp3.add(bis); jp3.add(cbis);
		
		jbill=new JButton("PAY BILL");
		jbill.setBounds(1000,500,100,50);
		
		jta=new JTextArea();
		jta.setBounds(970,280,200,200);
		
		note=new JLabel("Please give your valuable feedback");
		note.setBounds(970,260,300,20);
		f=new Font("Arial",Font.ITALIC,12);
		man=new JTextField();
		man.setLayout(null);
		man.setBounds(970,100,200,30);
		man1=new JTextField();
		man1.setLayout(null);
		man1.setBounds(970,129,200,30);
		man.setFont(f);
		man1.setFont(f);
		man.setText("*Pls To give order first select the");
		man1.setText("quantity and then click on food item");
		man.setForeground(Color.red);
		man1.setForeground(Color.RED);
//		man.enable(false);
//		man1.enable(false);
		
		cont.add(jta); cont.add(note); cont.add(man); cont.add(man1);
		cont.add(jptop); cont.add(jp1); cont.add(jp2); cont.add(jp3); cont.add(jbill);
		jptop.add(jltop); jptop.add(jlorder);
		
		jbill.addActionListener(this);
		jsam.addActionListener(this);
		jdab.addActionListener(this);
		jvad.addActionListener(this);
		jwater.addActionListener(this);
		jpep.addActionListener(this);
		jtea.addActionListener(this);
		jcof.addActionListener(this);
		jchips.addActionListener(this);
		jbis.addActionListener(this);
		jtoast.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public void actionPerformed(ActionEvent e) 
	{
		String s=e.getActionCommand();
		JButton jb=(JButton)e.getSource();
		String t=jb.getToolTipText();
		
		if(s.equals("PAY BILL"))
		{
			order+="---------------------------------------------------------------------------------------\n";
			order+="Total                  =   "+total;
		
			BillPayment billpay=new BillPayment(order);
			billpay.setVisible(true);
			billpay.setSize(800,600);
			billpay.setLocation(100,100);
		}
		else if(t.equals("samosa"))
		{
			int i=Integer.parseInt(csam.getSelectedItem());
			total+=20*i;
			order=order+"  SAMOSA :- 20 * "+i+" = "+20*i+"\n";
		}
		else if(t.equals("dabeli"))
		{
			int i=Integer.parseInt(cdab.getSelectedItem());
			total+=25*i;
			order=order+"  DABELI :- 25 * "+i+" = "+25*i+"\n";
		}
		else if(t.equals("vadapav"))
		{
			int i=Integer.parseInt(cvad.getSelectedItem());
			total+=25*i;
			order=order+"  VADAPAV :- 25 * "+i+" = "+25*i+"\n";
		}
		else if(t.equals("tea"))
		{
			int i=Integer.parseInt(ctea.getSelectedItem());
			total+=10*i;
			order=order+"  TEA :- 10 * "+i+" = "+10*i+"\n";
		}
		else if(t.equals("coffee"))
		{
			int i=Integer.parseInt(ccof.getSelectedItem());
			total+=20*i;
			order=order+"  COFFEE :- 20 * "+i+" = "+20*i+"\n";
		}
		else if(t.equals("water"))
		{
			int i=Integer.parseInt(cwater.getSelectedItem());
			total+=10*i;
			order=order+"  WATER :- 10 * "+i+" = "+10*i+"\n";
		}
		else if(t.equals("pepsi"))
		{
			int i=Integer.parseInt(cpep.getSelectedItem());
			total+=20*i;
			order=order+"  PEPSI :- 20 * "+i+" = "+20*i+"\n";
		}
		else if(t.equals("chips"))
		{
			int i=Integer.parseInt(cchips.getSelectedItem());
			total+=10*i;
			order=order+"  CHIPS :- 10 * "+i+" = "+10*i+"\n";
		}
		else if(t.equals("toast"))
		{
			int i=Integer.parseInt(ctoast.getSelectedItem());
			total+=20*i;
			order=order+"  TOAST :- 2O * "+i+" = "+20*i+"\n";
		}
		else if(t.equals("biscuit"))
		{
			int i=Integer.parseInt(cbis.getSelectedItem());
			total+=10*i;
			order=order+"  BISCUIT :- 10 * "+i+" = "+10*i+"\n";
		}
	}
	
}

public class MyBill 
{
	public static void main(String[] args) 
	{
		Menu m=new Menu();
		m.setVisible(true);
		m.setSize(1200, 700);
		m.setLocation(10, 10);
	}
}
