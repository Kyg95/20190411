package n0411;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;

class MenuWindow extends Frame {
	MenuBar mb;// �޴��� ��ġ�� ��
	Menu menu;// �޴��ٿ� ��ġ�� �޴�
	MenuItem[] items;// �޴��� ��ġ�� �޴�������
	Menu etc;// �޴� �ؿ� �޴��� ���� �޴�
	Menu file;// ���� �޴�
	Label[] infos;//�ȳ��޼����� ���̺�
	TextField[] inputs;//�Է¿� �ؽ�Ʈ�ʵ�
	Button[] btns; //��ư
	Choice depart;//�μ��̸� ���ÿ� ���̽�
	Panel panel;
	CheckboxMenuItem check_item1;// üũ�� �� �ִ� �޴�������
	CheckboxMenuItem check_item2;
	Button[] buttons;
	Font font;
	String[] depart_name = {"���ߺ�","�ѹ���","ȫ����","������",
			"��ۺ�","������"};
	
	void doIt() { //�гʷ� �� ������Ʈ
		infos = new Label[3];//���̺�3���� �迭����
		infos[0]=new Label("����� �Է��ϼ���.");
		infos[1]=new Label("�̸��� �Է��ϼ���.");
		infos[2]=new Label("�μ��� �����ϼ���.");
		inputs = new TextField[2];//�׽�Ʈ�ʵ� 2���� �迭����
		inputs[0]=new TextField(10);
		inputs[0].setBackground(Color.CYAN);
		inputs[1]=new TextField(20);
		inputs[1].setBackground(Color.cyan);
		depart=new Choice();//���̽� ����
		depart.setBackground(Color.GREEN);
		buttons = new Button[4];//��ư4���� �迭 ����
		buttons[0]=new Button("�� ��"); buttons[1]=new Button("�� ��");
		buttons[2]=new Button("�� ��"); buttons[3]=new Button("�� ȸ");
		this.setLayout(new GridLayout(5,4));
	}
	void addPanel() {//�гο� ���۳�Ʈ�� ���̴� �޼ҵ�
		panel.add(new Label());this.add(new Label());
		panel.add(new Label());this.add(new Label());
		panel.add(new Label());
		panel.add(infos[0]);	panel.add(inputs[0]);
		panel.add(new Label()); panel.add(new Label());
		panel.add(infos[1]);	panel.add(inputs[1]);
		panel.add(new Label()); panel.add(new Label());
		panel.add(infos[2]);	panel.add(depart);
		panel.add(new Label());
		panel.add(buttons[0]);panel.add(buttons[1]);
		panel.add(buttons[2]);panel.add(buttons[3]);
	}

	MenuWindow(String str) {
		super(str);
		panel = new Panel();
		panel.setLayout(new GridLayout(5,4));//�гο� ��ġ������ ����
		doIt();
		addPanel();
		font = new Font("Serif", Font.BOLD, 30);
		buttons = new Button[5];
		buttons[0] = new Button("ù��° ��ư");
		buttons[0].setFont(font);
		buttons[1] = new Button("ù��° ��ư");
		buttons[1].setFont(font);
		buttons[2] = new Button("ù��° ��ư");
		buttons[2].setFont(font);
		buttons[3] = new Button("ù��° ��ư");
		buttons[3].setFont(font);
		buttons[4] = new Button("ù��° ��ư");
		buttons[4].setFont(font);
		this.setLayout(new BorderLayout());
		// �������̾ƿ��� �� �������� ��ġ�����ڷ� ����
		this.add("North", buttons[0]);// ������ ���� ù��° ��ư�� ����
		this.add("East", buttons[1]);// ������ �����ʿ� �ι�° ��ư�� ����
		this.add("West", buttons[2]);// ������ ���ʿ� ����° ��ư�� ����
		this.add("Center", panel);// ������ ����� �׹�° ��ư�� ����
		this.add("South", buttons[4]);// ������ �Ʒ��� �ټ���° ��ư�� ����

		check_item1 = new CheckboxMenuItem("üũ�޴�1");
		check_item2 = new CheckboxMenuItem("üũ�޴�2");
		mb = new MenuBar();
		menu = new Menu("����");
		items = new MenuItem[6];// 3�� �޴��������� ���� �迭 ����
		// items[0] = new MenuItem("������");//ù��° �޴������� ����
		file = new Menu("������");
		MenuItem mi = new MenuItem("������ ����޴�");
		file.add(mi);

		items[1] = new MenuItem("�ҷ�����");// ù��° �޴������� ����
		items[2] = new MenuItem("�����ϱ�");// ù��° �޴������� ����
//		menu.add(items[0]);
		menu.add(file);
		menu.add(items[1]);
		menu.add(items[2]);
		etc = new Menu("��Ÿ");
		items[3] = new MenuItem("���� �޴�1");
		items[4] = new MenuItem("���� �޴�2");
		items[5] = new MenuItem("���� �޴�3");
		etc.add(items[3]);
		etc.add(items[4]);
		etc.add(items[5]);
		menu.addSeparator();// ���м� �߰�
		menu.add(etc);// �޴��� �޴�(etc)�� ���δ�.
		menu.addSeparator();// ���м� �߰�
		menu.add(check_item1);
		menu.add(check_item2);
		// �޴��� �޴��������� ���δ�.
		mb.add(menu);// �޴��ٿ� �޴��� ���δ�.
		this.setMenuBar(mb);// ���� �����쿡 �޴��ٸ� ���δ�.
		this.setSize(700, 600);
		this.setVisible(true);
	}
}

public class Study4 {
	public static void main(String[] args) {
		new MenuWindow("�޴� ������");
	}

}