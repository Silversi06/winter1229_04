package BookView;

import java.util.ArrayList;

import Book.BookVO;

public class BookView {

	//view(ArrayList<StudentVO> svoList): ȭ�鿡 ����� ���� �޼���
		public void view(ArrayList<BookVO> svoList) {
			for(BookVO svo : svoList) {
				System.out.println("=====================");
				System.out.println("===������ȣ : "+svo.getIsbn());
				System.out.println("===�����̸� : "+svo.getBooknName());
				System.out.println("===���ڸ� : "+svo.getPublish_authore());
				System.out.println("===���� :  "+svo.getPrice());
				System.out.println("===ī�װ� : "+svo.getCategory());
				System.out.println("=====================");
			}
		}
}
