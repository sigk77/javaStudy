import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
public class WaitRoom extends JPanel {
	JTable table1,table2;
	DefaultTableModel model1,model2;
	JTextPane tp;
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6;
	WaitRoom(){
		String[] col1= {"���̸�","����/�����","�ο�"};
		String[][] row1=new String[0][3];
		model1=new DefaultTableModel(row1,col1);
		table1=new JTable(model1);
		JScrollPane Js1=new JScrollPane(table1);
		
		String[] col2= {"���̸�","����/�����","�ο�"};
		String[][] row2=new String[0][3];
		model2=new DefaultTableModel(row2,col2);
		table2=new JTable(model2);
		JScrollPane Js2=new JScrollPane(table2);
		
		setLayout(null);
		Js1.setBounds(10,15,600,400);
		Js2.setBounds(10,420,600,290);
		
		tp=new JTextPane();
		tf=new JTextField();
		b1=new JButton("�游���");
	    b2=new JButton("�����");
	    b3=new JButton("����������");
	    b4=new JButton("��������");
	    b5=new JButton("1:1����");
	    b6=new JButton("������");
	    				
	   
	    JScrollPane js3=new JScrollPane(tp);
	    js3.setBounds(615, 15, 380, 400);
	    
	    tf.setBounds(615,420,380,30);
	    add(tf);
	    
	    JPanel p=new JPanel();
	    p.setLayout(new GridLayout(3,2,5,5));
	    p.add(b1);p.add(b2);
	    p.add(b3);p.add(b4);
	    p.add(b5);p.add(b6);
	    
	    p.setBounds(615, 460, 380, 240);
	    add(p);
	    add(js3);
		add(Js1);
		add(Js2);
	}
}
