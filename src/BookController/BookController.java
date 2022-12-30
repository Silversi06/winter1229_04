package BookController;

import java.util.ArrayList;
import java.util.Scanner;

import BookController.BookController;
import BookView.BookView;

import Book.BookDAO;
import Book.BookVO;

public class BookController {
	
		public static final int CONTINUE=1;
		public static final int BREAK=0;
		
		ArrayList<Integer>isbn = new ArrayList<Integer>();
		ArrayList<String>bookName = new ArrayList<String>();
		ArrayList<String>publish_author = new ArrayList<String>();
		ArrayList<Integer>price = new ArrayList<Integer>();
		ArrayList<String>category = new ArrayList<String>();
		
		//콘솔창에서 입력받은 학생정보를 각각의 ArrayLis에 저장해준다.
		//생성된 StudentVO객체를 StudentDAO 객체의 ArrayList에 저장한다.(insert()사용)
		public void consolToList() {
			//콘솔에 입력받기 위해 Scanner 생성
			Scanner s1= new Scanner(System.in); //문자열입력용
			Scanner s2= new Scanner(System.in);//숫자입력용
			Scanner s3= new Scanner(System.in);
			Scanner s4= new Scanner(System.in);
			Scanner s5= new Scanner(System.in);
			Scanner s6= new Scanner(System.in);
			//여러학생 정보(동적 인원 수)를 입력받기 위해서 ArrayList 객체생성
			
			
			//콘솔창에서 학생정보를 입력받을 때 계속 입력받을 것인지 멈출 것인지의 상태를 저장하는 것
			int flag = CONTINUE;
			System.out.println("============= 도서정보입력 ============");
			while(true) {
				if(flag==CONTINUE) {
					System.out.print("==도서번호 입력 : ");
					isbn.add(s1.nextInt());
					System.out.print("==도서이름 입력 : ");
					bookName.add(s5.nextLine());
					System.out.print("==저자명 입력 : ");
					publish_author.add(s6.nextLine());
					System.out.print("==가격 입력 : ");
					price.add(s3.nextInt());
					System.out.print("==카테고리 입력 : ");
					category.add(s4.nextLine());
				}else if(flag==BREAK) {
					break;
				}
			
				System.out.println("계속 도서정보를 입력받으시겠습니다?(계속:1, 중지:0)");
				flag=s2.nextInt();
			}
			
			s1.close();
			s2.close();
			
		}
		//생성된 StudentVO객체를 StudentDAO r객체의 ArrayList 에 저장한다(insert()사용)
		public void voToDAO(BookDAO dao) {
			
			for(int i=0; i<isbn.size(); i++) {
				BookVO svo = new BookVO(isbn.get(i),bookName.get(i),publish_author.get(i),price.get(i),category.get(i));
				dao.insert(svo);
			}
		}
		public static void main(String []agrs) {
			BookController controller = new BookController();
			//콘솔창에서 입력 받은 값을 각각의 정보를 저장하는 ArrayList에 저장하는 메서드
			controller.consolToList();
			//입력받는 값들을 사용하여 StudentVO객체를 생성하여 DAO의 ArrayList에 저장하는 메서드
			BookDAO dao = new BookDAO();
			controller.voToDAO(dao);
			//화면에 출력
			BookView sView = new BookView();
			sView.view(dao.select());
			
			
		}

}
