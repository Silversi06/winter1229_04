package Record;

import java.util.ArrayList;

import Record.RecordVO;

public class RecordDAO {
	//�л� ���� ��ü(StudentVO) ���� �����ϱ� ����
			ArrayList<RecordVO> svoList = new ArrayList<RecordVO>();

			//insert: ArrayList �� �л�������ü(StudentVO)�� �߰��ϴ� �޼���
			public void insert(RecordVO svo) {
				svoList.add(svo);
			}
			
			public void delete(int row) {
				svoList.remove(row);
			}
			
			//select:��ü �л�������ü���� ��Ȳ�ϴ� �޼���
			public ArrayList<RecordVO> select(){
				return svoList;
			}

}