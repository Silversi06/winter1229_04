package BookView;

import java.util.ArrayList;

import Book.BookVO;

public class BookView {

	//view(ArrayList<StudentVO> svoList): 화면에 출력을 위한 메서드
		public void view(ArrayList<BookVO> svoList) {
			for(BookVO svo : svoList) {
				System.out.println("=====================");
				System.out.println("===도서번호 : "+svo.getIsbn());
				System.out.println("===도서이름 : "+svo.getBooknName());
				System.out.println("===저자명 : "+svo.getPublish_authore());
				System.out.println("===가격 :  "+svo.getPrice());
				System.out.println("===카테고리 : "+svo.getCategory());
				System.out.println("=====================");
			}
		}
}
