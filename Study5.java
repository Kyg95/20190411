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
	CheckboxMenuItem check_item1;// üũ�� �� �ִ� �޴�������
	CheckboxMenuItem check_item2;

	Button[] btns;
	Font font;

	Panel panel;// ������ ��� �� �г�
//////////////////////////////////////
	Label[] infos;// �ȳ��޼����� ���̺�
	TextField[] inputs;// �Է¿� �ؽ�Ʈ�ʵ�
	Choice depart;// �μ��̸� ���ÿ� ���̽�
	Button[] buttons;// ��ư�� �迭
	String[] depart_name = { "���ߺ�", "�ѹ���", "ȫ����", "������", "��ۺ�", "������" };

//////////////////////////////////////
	void doIt() {// �гο� �� ������Ʈ ó�� �޼���
		infos = new Label[3];// ���̺�3���� �迭����
		infos[0] = new Label("����� �Է��ϼ���.");
		infos[1] = new Label("�̸��� �Է��ϼ���.");
		infos[2] = new Label("�μ��� �����ϼ���.");
		inputs = new TextField[2];// �׽�Ʈ�ʵ� 2���� �迭����
		inputs[0] = new TextField(10);
		inputs[0].setBackground(Color.CYAN);
		inputs[1] = new TextField(20);
		inputs[1].setBackground(Color.cyan);
		depart = new Choice();// ���̽� ����
		depart.setBackground(Color.GREEN);
		for (int i = 0; i < depart_name.length; i++) {
			depart.add(depart_name[i]);
		} // ��� �μ����� �����̽� �߰�
		buttons = new Button[4];// ��ư4���� �迭 ����
		buttons[0] = new Button("�� ��");
		buttons[1] = new Button("�� ��");
		buttons[2] = new Button("�� ��");
		buttons[3] = new Button("�� ȸ");
	}

	void addPanel() {// �гο� ���۳�Ʈ�� ���̴� �޼���
		panel.add(new Label());
		panel.add(new Label());
		panel.add(new Label());
		panel.add(new Label());
		panel.add(new Label());
		panel.add(infos[0]);
		panel.add(inputs[0]);
		panel.add(new Label());
		panel.add(new Label());
		panel.add(infos[1]);
		panel.add(inputs[1]);
		panel.add(new Label());
		panel.add(new Label());
		panel.add(infos[2]);
		panel.add(depart);
		panel.add(new Label());
		panel.add(buttons[0]);
		panel.add(buttons[1]);
		panel.add(buttons[2]);
		panel.add(buttons[3]);
	}

	MenuWindow(String str) {
		super(str);
		panel = new Panel();// �г� ����
		panel.setLayout(new GridLayout(5, 4));// �гο� ��ġ������ ����
		doIt();
		addPanel();
		font = new Font("Serif", Font.BOLD, 30);
		btns = new Button[5];
		btns[0] = new Button("ù��° ��ư");
		btns[0].setFont(font);
		btns[1] = new Button("�ι�° ��ư");
		btns[1].setFont(font);
		btns[2] = new Button("����° ��ư");
		btns[2].setFont(font);
		btns[3] = new Button("�׹�° ��ư");
		btns[3].setFont(font);
		btns[4] = new Button("�ټ���° ��ư");
		btns[4].setFont(font);
		this.setLayout(new BorderLayout());
//�������̾ƿ��� �� �������� ��ġ�����ڷ� ����
		this.add("North", btns[0]);// ������ ���� ù��° ��ư�� ����
		this.add("East", btns[1]);// ������ �����ʿ� �ι�° ��ư�� ����
		this.add("West", btns[2]);// ������ ���ʿ� ����° ��ư�� ����
		this.add("Center", panel);// ������ ����� �׹�° ��ư�� ����
		this.add("South", btns[4]);// ������ �Ʒ��� �ټ���° ��ư�� ����

		check_item1 = new CheckboxMenuItem("üũ�޴�1");
		check_item2 = new CheckboxMenuItem("üũ�޴�2");
		mb = new MenuBar();
		menu = new Menu("����");
		items = new MenuItem[6];// 3�� �޴��������� ���� �迭 ����
//items[0] = new MenuItem("������");//ù��° �޴������� ����
		file = new Menu("������");
		MenuItem mi = new MenuItem("������ ����޴�");
		file.add(mi);

		items[1] = new MenuItem("�ҷ�����");// ù��° �޴������� ����
		items[2] = new MenuItem("�����ϱ�");// ù��° �޴������� ����
//	menu.add(items[0]);
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
//�޴��� �޴��������� ���δ�.
		mb.add(menu);// �޴��ٿ� �޴��� ���δ�.
		this.setMenuBar(mb);// ���� �����쿡 �޴��ٸ� ���δ�.
		this.setSize(700, 400);
		this.setVisible(true);
	}
}

public class Study5 {
	public static void main(String[] args) {
		new MenuWindow("�޴� ������");
	}

}
