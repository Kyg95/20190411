package n0411;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;

class MyWindow extends Frame {
	Label[] lbls;
	Choice[] choice;
	List[] hobbys;
	TextField[] inputs; // ������ �Է¿� ������Ʈ
	TextArea area;// �����ٿ� ��ģ ������ �Է¿� ������Ʈ

	MyWindow(String title) {
		super(title);
		lbls = new Label[5];
		choice = new Choice[5];
		hobbys = new List[2];
		inputs = new TextField[2];
		hobbys[0] = new List(3, false);// ��� ���ÿ� ����Ʈ
		hobbys[0].setForeground(Color.BLUE);
		hobbys[0].setBackground(Color.YELLOW);
		// 3:ȭ�鿡 ��µ� �����Ͱ���, false:���߼��� ��� ����
		hobbys[1] = new List(2, true);// Ư�� ���ÿ� ����Ʈ
		hobbys[1].setForeground(Color.CYAN);
		hobbys[1].setBackground(Color.MAGENTA);
		// 2:ȭ�鿡 ��µ� �����Ͱ���, true:���߼��� ���
		hobbys[0].add("�뷡�ϱ�");
		hobbys[0].add("�");
		hobbys[0].add("����");
		hobbys[0].add("����");
		hobbys[1].add("����");
		hobbys[1].add("���α׷�");
		hobbys[1].add("�뷡�ϱ�");
		hobbys[1].add("û���ϱ�");
		lbls[0] = new Label("������ �����ϼ���.");
		lbls[1] = new Label("���� �����ϼ���.");
		lbls[2] = new Label("���� �����ϼ���.");
		lbls[3] = new Label("ID�� �Է��ϼ���.");
		lbls[4] = new Label("��ȣ�� �Է��ϼ���.");
		inputs[0] = new TextField("ID�Է�", 20);
		// ù��° ����:ȭ�鿡 ��µ� ���ڿ�, �ι�° ����: �ִ����
		inputs[1] = new TextField(20);// ��ȣ��
		inputs[1].setEchoChar('*');// �Է¹��� ��� ��� ���� ����
		// ù��° ����:�ִ����
		area = new TextArea("�Ұ����� �Է��ϼ���.", 5, 30);
		// ù��° ����:ȭ�鿡 ��µ� ���ڿ�, �ι�° ����:���� ����,
		// ����° ����:���� ����
		for (int i = 0; i < choice.length; i++) {
			choice[i] = new Choice();
		}
		// ù��° ���̽��� ������ �ִ´�. 1920����� 2019�����
		choice[0].add("�⵵�� �����ϼ���.");
		for (int i = 2019; i >= 1920; i--) {
			choice[0].add(i + "");
		} // 2019���� 1920������ ���ڸ� ���ڿ��� �ٲ㼭 ���̽��� �ִ´�.
			// �ι�° ���̽��� ���� �ִ´�. 1���� 12����
		choice[1].add("���� �����ϼ���.");
		for (int i = 1; i <= 12; i++) {
			choice[1].add(i + "");
		}
		// ����° ���̽��� ���� �ִ´�. 1���� 28 Ȥ�� 30 Ȥ�� 31
		choice[2].add("���� �����ϼ���.");
		for (int i = 1; i <= 30; i++) {
			choice[2].add(i + "");
		}
		choice[3].add("������ �����ϼ���.");
		choice[3].add("���ѹα�");
		choice[3].add("�Ϻ�");
		choice[3].add("�߱�");
		choice[3].add("�̱�");
		choice[3].add("����");
		choice[3].add("�븸");
		choice[4].add("���������� �����ϼ���.");
		choice[4].add("�����");
		choice[4].add("��õ��");
		choice[4].add("������");
		choice[4].add("��⵵");
		choice[4].add("��û��");
		choice[4].add("������");
		// ��ġ������ ���� FlowLayout���� ����
		this.setLayout(new FlowLayout());
		this.add(lbls[3]);
		this.add(inputs[0]);
		this.add(lbls[4]);
		this.add(inputs[1]);
		this.add(area);
		this.add(hobbys[0]);
		this.add(hobbys[1]);
		this.add(lbls[0]);
		this.add(choice[0]);
		this.add(lbls[1]);
		this.add(choice[1]);
		this.add(lbls[2]);
		this.add(choice[2]);
		this.add(choice[3]);
		this.add(choice[4]);
		// ������ ũ�� ����
		this.setSize(400, 250);
		// ������ Ȱ��ȭ
		this.setVisible(true);

	}// ������
}

public class Study1 {
	public static void main(String[] args) {
		MyWindow mw = new MyWindow("������� ����");
	}
}
