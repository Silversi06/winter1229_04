package Book;

import java.util.ArrayList;

import Book.BookVO;

public class BookDAO {
	
		//�л� ���� ��ü(StudentVO) ���� �����ϱ� ����
		ArrayList<BookVO> svoList = new ArrayList<BookVO>();

		//insert: ArrayList �� �л�������ü(StudentVO)�� �߰��ϴ� �޼���
		public void insert(BookVO svo) {
			svoList.add(svo);
		}
		
		//select:��ü �л�������ü���� ��Ȳ�ϴ� �޼���
		public ArrayList<BookVO> select(){
			return svoList;
		}

}
