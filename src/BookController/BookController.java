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
		
		//�ܼ�â���� �Է¹��� �л������� ������ ArrayLis�� �������ش�.
		//������ StudentVO��ü�� StudentDAO ��ü�� ArrayList�� �����Ѵ�.(insert()���)
		public void consolToList() {
			//�ֿܼ� �Է¹ޱ� ���� Scanner ����
			Scanner s1= new Scanner(System.in); //���ڿ��Է¿�
			Scanner s2= new Scanner(System.in);//�����Է¿�
			Scanner s3= new Scanner(System.in);
			Scanner s4= new Scanner(System.in);
			Scanner s5= new Scanner(System.in);
			Scanner s6= new Scanner(System.in);
			//�����л� ����(���� �ο� ��)�� �Է¹ޱ� ���ؼ� ArrayList ��ü����
			
			
			//�ܼ�â���� �л������� �Է¹��� �� ��� �Է¹��� ������ ���� �������� ���¸� �����ϴ� ��
			int flag = CONTINUE;
			System.out.println("============= ���������Է� ============");
			while(true) {
				if(flag==CONTINUE) {
					System.out.print("==������ȣ �Է� : ");
					isbn.add(s1.nextInt());
					System.out.print("==�����̸� �Է� : ");
					bookName.add(s5.nextLine());
					System.out.print("==���ڸ� �Է� : ");
					publish_author.add(s6.nextLine());
					System.out.print("==���� �Է� : ");
					price.add(s3.nextInt());
					System.out.print("==ī�װ� �Է� : ");
					category.add(s4.nextLine());
				}else if(flag==BREAK) {
					break;
				}
			
				System.out.println("��� ���������� �Է¹����ðڽ��ϴ�?(���:1, ����:0)");
				flag=s2.nextInt();
			}
			
			s1.close();
			s2.close();
			
		}
		//������ StudentVO��ü�� StudentDAO r��ü�� ArrayList �� �����Ѵ�(insert()���)
		public void voToDAO(BookDAO dao) {
			
			for(int i=0; i<isbn.size(); i++) {
				BookVO svo = new BookVO(isbn.get(i),bookName.get(i),publish_author.get(i),price.get(i),category.get(i));
				dao.insert(svo);
			}
		}
		public static void main(String []agrs) {
			BookController controller = new BookController();
			//�ܼ�â���� �Է� ���� ���� ������ ������ �����ϴ� ArrayList�� �����ϴ� �޼���
			controller.consolToList();
			//�Է¹޴� ������ ����Ͽ� StudentVO��ü�� �����Ͽ� DAO�� ArrayList�� �����ϴ� �޼���
			BookDAO dao = new BookDAO();
			controller.voToDAO(dao);
			//ȭ�鿡 ���
			BookView sView = new BookView();
			sView.view(dao.select());
			
			
		}

}
