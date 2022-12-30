package Book;

import java.util.ArrayList;

import Book.BookVO;

public class BookDAO {
	
		//학생 정보 객체(StudentVO) 들을 저장하기 위해
		ArrayList<BookVO> svoList = new ArrayList<BookVO>();

		//insert: ArrayList 에 학생정보객체(StudentVO)를 추가하는 메서드
		public void insert(BookVO svo) {
			svoList.add(svo);
		}
		
		//select:전체 학생정보객체들을 반황하는 메서드
		public ArrayList<BookVO> select(){
			return svoList;
		}

}
