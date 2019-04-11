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
	MenuBar mb;// 메뉴가 위치할 바
	Menu menu;// 메뉴바에 위치할 메뉴
	MenuItem[] items;// 메뉴에 위치할 메뉴아이템
	Menu etc;// 메뉴 밑에 메뉴를 위한 메뉴
	Menu file;// 파일 메뉴
	Label[] infos;//안내메세지용 레이블
	TextField[] inputs;//입력용 텍스트필드
	Button[] btns; //버튼
	Choice depart;//부서이름 선택용 초이스
	Panel panel;
	CheckboxMenuItem check_item1;// 체크할 수 있는 메뉴아이템
	CheckboxMenuItem check_item2;
	Button[] buttons;
	Font font;
	String[] depart_name = {"개발부","총무부","홍보부","영업부",
			"배송부","관리부"};
	
	void doIt() { //패너렝 들어갈 컴포넌트
		infos = new Label[3];//레이블3개용 배열생성
		infos[0]=new Label("사번을 입력하세요.");
		infos[1]=new Label("이름을 입력하세요.");
		infos[2]=new Label("부서를 선택하세요.");
		inputs = new TextField[2];//테스트필드 2개용 배열생성
		inputs[0]=new TextField(10);
		inputs[0].setBackground(Color.CYAN);
		inputs[1]=new TextField(20);
		inputs[1].setBackground(Color.cyan);
		depart=new Choice();//초이스 생성
		depart.setBackground(Color.GREEN);
		buttons = new Button[4];//버튼4개용 배열 생성
		buttons[0]=new Button("삽 입"); buttons[1]=new Button("삭 제");
		buttons[2]=new Button("수 정"); buttons[3]=new Button("조 회");
		this.setLayout(new GridLayout(5,4));
	}
	void addPanel() {//패널에 컴퍼넌트를 붙이는 메소드
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
		panel.setLayout(new GridLayout(5,4));//패널에 배치관리자 설정
		doIt();
		addPanel();
		font = new Font("Serif", Font.BOLD, 30);
		buttons = new Button[5];
		buttons[0] = new Button("첫번째 버튼");
		buttons[0].setFont(font);
		buttons[1] = new Button("첫번째 버튼");
		buttons[1].setFont(font);
		buttons[2] = new Button("첫번째 버튼");
		buttons[2].setFont(font);
		buttons[3] = new Button("첫번째 버튼");
		buttons[3].setFont(font);
		buttons[4] = new Button("첫번째 버튼");
		buttons[4].setFont(font);
		this.setLayout(new BorderLayout());
		// 보더레이아웃을 이 윈도우의 배치관리자로 설정
		this.add("North", buttons[0]);// 윈도우 위에 첫번째 버튼을 붙임
		this.add("East", buttons[1]);// 윈도우 오른쪽에 두번째 버튼을 붙임
		this.add("West", buttons[2]);// 윈도우 왼쪽에 세번째 버튼을 붙임
		this.add("Center", panel);// 윈도우 가운데에 네번째 버튼을 붙임
		this.add("South", buttons[4]);// 윈도우 아래에 다섯번째 버튼을 붙임

		check_item1 = new CheckboxMenuItem("체크메뉴1");
		check_item2 = new CheckboxMenuItem("체크메뉴2");
		mb = new MenuBar();
		menu = new Menu("파일");
		items = new MenuItem[6];// 3개 메뉴아이템을 위한 배열 생성
		// items[0] = new MenuItem("새파일");//첫번째 메뉴아이템 생성
		file = new Menu("새파일");
		MenuItem mi = new MenuItem("새파일 서브메뉴");
		file.add(mi);

		items[1] = new MenuItem("불러오기");// 첫번째 메뉴아이템 생성
		items[2] = new MenuItem("저장하기");// 첫번째 메뉴아이템 생성
//		menu.add(items[0]);
		menu.add(file);
		menu.add(items[1]);
		menu.add(items[2]);
		etc = new Menu("기타");
		items[3] = new MenuItem("서브 메뉴1");
		items[4] = new MenuItem("서브 메뉴2");
		items[5] = new MenuItem("서브 메뉴3");
		etc.add(items[3]);
		etc.add(items[4]);
		etc.add(items[5]);
		menu.addSeparator();// 구분선 추가
		menu.add(etc);// 메뉴에 메뉴(etc)를 붙인다.
		menu.addSeparator();// 구분서 추가
		menu.add(check_item1);
		menu.add(check_item2);
		// 메뉴에 메뉴아이템을 붙인다.
		mb.add(menu);// 메뉴바에 메뉴를 붙인다.
		this.setMenuBar(mb);// 현재 윈도우에 메뉴바를 붙인다.
		this.setSize(700, 600);
		this.setVisible(true);
	}
}

public class Study4 {
	public static void main(String[] args) {
		new MenuWindow("메뉴 윈도우");
	}

}