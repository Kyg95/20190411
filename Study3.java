package n0411;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

class FontWindow extends Frame {
	Label[] lbls;
	Font[] fonts;
	String abc;
	Dialog info;
	FileDialog open, save;

	FontWindow(String title) {
		super(title);
		open = new FileDialog(this, "���� ����", FileDialog.LOAD);
		save = new FileDialog(this, "���� ����", FileDialog.SAVE);
		// 1����:���̾�αװ� �Ҽӵ� ������, 2����:���̾�α��� ����
		// 3����:���̾�α��� ����(LOAD,SAVE)
		open.show();
		save.show();
		// �޼����� �缱:�� �޼��尡 �������� �޼������� �˸�
		info = new Dialog(this, "�� ��", false);
		// 1����:���̾�αװ� �Ҽӵ� ������, 2����:���̷��α��� ����
		// 3����:��޿���(����̸� �ʼ������� �ʿ����� �ǹ�,true�̸� ���)
		info.setSize(140, 90);// ���̾�α��� ũ�� ����
		info.setLocation(50, 50);// ���̾�αװ� ��µǴ� ��ġ ����
		info.setLayout(new FlowLayout());// ���̾�α��� ��ġ�����ڼ���
		Button ok = new Button("ok");// ���̾�α׿� ���� ��ư ����
		info.add(ok);// ���̾�α׿� ��ư�� ����
		info.setVisible(true);// ���̾�α׸� Ȱ��ȭ
		abc = "�����ٶ󸶹ٻ�����īŸ����";
		fonts = new Font[4];// ��Ʈ�� �迭����
		fonts[0] = new Font("Serif", Font.PLAIN, 20);
		// 1����:��Ʈ�� ����,2����:����ü, 3����:ũ��
		fonts[1] = new Font("Serif", Font.ITALIC, 25);// ���Ÿ�ü
		fonts[2] = new Font("Serif", Font.BOLD, 30);// ����ü
		fonts[3] = new Font("Serif", Font.BOLD + Font.ITALIC, 35);
		// ���� ���Ÿ�ü
		lbls = new Label[4];
		lbls[0] = new Label(abc);
		lbls[0].setFont(fonts[0]);
		lbls[1] = new Label(abc);
		lbls[1].setFont(fonts[1]);
		lbls[2] = new Label(abc);
		lbls[2].setFont(fonts[2]);
		lbls[3] = new Label(abc);
		lbls[3].setFont(fonts[3]);
		this.setLayout(new FlowLayout());
		this.add(lbls[0]);
		this.add(lbls[1]);
		this.add(lbls[2]);
		this.add(lbls[3]);
		this.setSize(400, 200);
		this.setVisible(true);
	}
}

public class Study3 {
	public static void main(String[] args) {
		new FontWindow("��Ʈ");
	}
}