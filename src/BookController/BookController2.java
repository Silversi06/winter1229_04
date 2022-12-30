package BookController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import Book.BookDAO;
import Book.BookVO;
import BookView.BookView2;

public class BookController2 extends JFrame {
	BookDAO dao;
	ArrayList<BookVO> bookVOList;
	BookView2 view2;
	
	public BookController2() {
		dao = new BookDAO();
		view2 = new BookView2();
		bookVOList = dao.select();
		view2.setBookVOList(bookVOList);
		view2.initView();
		JButton btnAdd = view2.getBtnAdd();
		btnAdd.addActionListener(btnAddL);
		add(view2,"Center");
		setTitle("���������ý���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200,200);
		setSize(600,500);
		setVisible(true);
		
	}
	

	
	public static void main(String[] args) {
		new BookController2();
	}
	
	ActionListener btnAddL = new ActionListener() {
		//neededIndsertData(): panS �� �ִ� JTextField�� �Էµ� ����� JCombobox�� ��
		//BookVO�� �ʵ尪���� �ʱ�ȭ�Ͽ� BookVO��ü �������� ��ȯ�ϴ� �޼ҵ�
		@Override
		public void actionPerformed(ActionEvent e) {
			BookVO vo = view2.neededInsertData();
			dao.insert(vo);
			view2.setBookVOList(bookVOList);
			view2.putResult();
			view2.initInsertData();
		}
	};

}
