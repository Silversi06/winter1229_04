package RecordController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import Record.RecordDAO;
import Record.RecordVO;
import RecordView.RecordView;

public class RecordController extends JFrame {
	RecordDAO dao;
	ArrayList<RecordVO> recordVOList;
	RecordView view;
	JTable table;
	
	public RecordController() {
		dao = new RecordDAO();
		view = new RecordView();
		recordVOList = dao.select();
		view.setRecordVOList(recordVOList);
		view.initView();
		JButton btnAdd = view.getBtnAdd();
		btnAdd.addActionListener(btnAddL);
		table = view.getTable();
		table.addMouseListener(tableL);
		//JTable table = view.getTable();
		add(view,"Center");
		setTitle("����ó���ý���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(200,200);
		setSize(600,500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RecordController();

	}
	
	ActionListener btnAddL = new ActionListener() {
		//neededIndsertData(): panS �� �ִ� JTextField�� �Էµ� ����� JCombobox�� ��
		//BookVO�� �ʵ尪���� �ʱ�ȭ�Ͽ� BookVO��ü �������� ��ȯ�ϴ� �޼ҵ�
		@Override
		public void actionPerformed(ActionEvent e) {
			RecordVO vo = view.neededInsertData();
			dao.insert(vo);
			recordVOList = dao.select();
			view.setRecordVOList(recordVOList);
			view.putResult();
			view.initInsertData();
		}
	};
	
	MouseAdapter tableL = new MouseAdapter() {
		
		public void mouseClicked(MouseEvent e) {
			int state=1;
			if(e.getClickCount()==2) {
				state = JOptionPane.showConfirmDialog(RecordController.this, "���� �����Ͻðڽ��ϱ�?","��������",JOptionPane.YES_NO_OPTION);
				if(state == JOptionPane.YES_OPTION) {
					dao.delete(table.getSelectedRow());
					recordVOList = dao.select();
					view.setRecordVOList(recordVOList);
					view.putResult();
				}
			}
		}
	};
	

}
