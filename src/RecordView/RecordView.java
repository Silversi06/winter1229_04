package RecordView;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Record.RecordVO;

public class RecordView extends JPanel {
	JTable table;
	DefaultTableModel model;
	ArrayList<RecordVO> recordVOList;
	String[]header = {"학번","성명","학년","반","국어","영어","수학","과학","총점","평균"};

	JPanel panS;
	JComboBox<String> categoryCombo;
	JLabel[] lbls= new JLabel[header.length-2];
	JTextField[] tf = new JTextField[header.length-2];
	JButton btnAdd = new JButton("성적추가");
	
	
	public RecordView() {
		setLayout(new BorderLayout());
		
		panS = new JPanel();
		panS = new JPanel(new GridLayout(5,4));
		for(int i=0; i<lbls.length; i++) {
			lbls[i]= new JLabel(header[i]);
			panS.add(lbls[i]);
			tf[i]= new JTextField();
			panS.add(tf[i]);
		}
			for(int i=0; i<3; i++) {
				panS.add(new JLabel(" "));
		}
		panS.add(btnAdd);
	}

	
	public void initView() {
		model= new DefaultTableModel(header,recordVOList.size()) {
		@Override
		public boolean isCellEditable(int row, int column){
			return false;
		}
	};
	
	table = new JTable(model);
	table.getColumnModel().getColumn(0).setPreferredWidth(50);
	table.getColumnModel().getColumn(1).setPreferredWidth(50);
	table.getColumnModel().getColumn(2).setPreferredWidth(50);
	table.getColumnModel().getColumn(3).setPreferredWidth(50);
	table.getColumnModel().getColumn(4).setPreferredWidth(50);
	table.getColumnModel().getColumn(5).setPreferredWidth(50);
	table.getColumnModel().getColumn(6).setPreferredWidth(50);
	table.getColumnModel().getColumn(7).setPreferredWidth(50);
	table.getColumnModel().getColumn(8).setPreferredWidth(50);
	table.getColumnModel().getColumn(9).setPreferredWidth(50);
	
	
	JScrollPane scroll = new JScrollPane(table);
	
	putResult();
	
	add("Center",scroll);
	add("South",panS);
}
	//DefaultTableModel에 도서정보들을 설저안다.
	public void putResult() {
		//modeldml: 행 개수 설정
		model.setRowCount(recordVOList.size());
		RecordVO vo = null;
		for(int i=0; i<recordVOList.size(); i++) {
			vo= recordVOList.get(i);
			//i:행번호 , 0:열번호
			model.setValueAt(vo.getNumber(), i, 0);
			model.setValueAt(vo.getName(), i, 1);
			model.setValueAt(vo.getGrade(), i, 2);
			model.setValueAt(vo.getGroup(), i, 3);
			model.setValueAt(vo.getKor(), i, 4);
			model.setValueAt(vo.getEng(), i, 5);
			model.setValueAt(vo.getMat(), i, 6);
			model.setValueAt(vo.getSci(), i, 7);
			model.setValueAt(vo.getTotal(), i, 8);
			model.setValueAt(vo.getAverage(), i, 9);
			
		}
	}


	public void setRecordVOList(ArrayList<RecordVO> recordVOList) {
		this.recordVOList = recordVOList;
	}


	public JButton getBtnAdd() {
		return btnAdd;
	}
	
	public RecordVO neededInsertData() {
		RecordVO vo= new RecordVO();
		vo.setNumber(Integer.parseInt(tf[0].getText()));
		vo.setName(tf[1].getText());
		vo.setGrade(Integer.parseInt(tf[2].getText()));
		vo.setGroup(Integer.parseInt(tf[3].getText()));
		vo.setKor(Integer.parseInt(tf[4].getText()));
		vo.setEng(Integer.parseInt(tf[5].getText()));
		vo.setMat(Integer.parseInt(tf[6].getText()));
		vo.setSci(Integer.parseInt(tf[7].getText()));
		vo.setTotal();
		vo.setAverage();
		
		return vo;
		
	}
	public void initInsertData() {
		for(int i=0; i<tf.length; i++) {
			tf[i].setText("");
		}
	}
	

	public JTable getTable() {
		return table;
	}
}
