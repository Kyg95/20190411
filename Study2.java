package n0411;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

class EmpSystem extends Frame{//��� ���� ���� 
	Label[] infos;//�ȳ��޼����� ���̺�
	TextField[] inputs;//�Է¿� �ؽ�Ʈ�ʵ�
	Choice depart;//�μ��̸� ���ÿ� ���̽�
	Button[] btns;//��ư�� �迭
	String[] depart_name = {"���ߺ�","�ѹ���","ȫ����","������",
			"��ۺ�","������"};
	EmpSystem(String title){
		super(title);
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
		for(int i=0; i<depart_name.length; i++) {
			depart.add(depart_name[i]);
		}//��� �μ����� �����̽� �߰�
		btns = new Button[4];//��ư4���� �迭 ����
		btns[0]=new Button("�� ��"); btns[1]=new Button("�� ��");
		btns[2]=new Button("�� ��"); btns[3]=new Button("�� ȸ");
		this.setLayout(new GridLayout(5,4));
		//ȭ���� 5�� 4���� �����ؼ� �� ������ ������Ʈ�� ��ġ��Ű��
		//��ġ������(GridLayout) ����
		this.add(new Label());this.add(new Label());
		this.add(new Label());this.add(new Label());
		this.add(new Label());
		this.add(infos[0]);	this.add(inputs[0]);
		this.add(new Label()); this.add(new Label());
		this.add(infos[1]);	this.add(inputs[1]);
		this.add(new Label()); this.add(new Label());
		this.add(infos[2]);	this.add(depart);
		this.add(new Label());
		this.add(btns[0]);this.add(btns[1]);
		this.add(btns[2]);this.add(btns[3]);
		this.setBackground(Color.YELLOW);
		this.setSize(500, 200);
		this.setVisible(true);
	}
}
public class Study2 {
	public static void main(String[] args) {
		EmpSystem es = new EmpSystem("����������� ver1.0");
	}
}
