package Record;

import java.util.ArrayList;

import Record.RecordVO;

public class RecordDAO {
	//학생 정보 객체(StudentVO) 들을 저장하기 위해
			ArrayList<RecordVO> svoList = new ArrayList<RecordVO>();

			//insert: ArrayList 에 학생정보객체(StudentVO)를 추가하는 메서드
			public void insert(RecordVO svo) {
				svoList.add(svo);
			}
			
			public void delete(int row) {
				svoList.remove(row);
			}
			
			//select:전체 학생정보객체들을 반황하는 메서드
			public ArrayList<RecordVO> select(){
				return svoList;
			}

}