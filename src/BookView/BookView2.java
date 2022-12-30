package BookView;

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

import Book.BookVO;

public class BookView2 extends JPanel {
	JTable table;
	DefaultTableModel model;
	ArrayList<BookVO> bookVOList;
	String[]header = {"도서번호","도서명","작가","가격","카테고리"};
	String [] categoryNames= {"IT도서","소설","비소설","애니","경제"};
	JPanel panS;
	JComboBox<String> categoryCombo;
	JLabel[] lbls= new JLabel[header.length];
	JTextField[] tf = new JTextField[header.length-1];
	JButton btnAdd = new JButton("도서추가");
	
	
	public BookView2() {
		setLayout(new BorderLayout());
		
		categoryCombo = new JComboBox<String>(categoryNames);
		
		panS = new JPanel();
		panS = new JPanel(new GridLayout(4,4));
		for(int i=0; i<header.length; i++) {
			lbls[i]= new JLabel(header[i]);
			panS.add(lbls[i]);
			if(i<header.length-1) {
				tf[i]= new JTextField();
				panS.add(tf[i]);
			}else 
				panS.add(categoryCombo);
				
			}
			for(int i=0; i<3; i++) {
				panS.add(new JLabel(" "));
		}
		panS.add(btnAdd);
	}

	
	public void initView() {
		model= new DefaultTableModel(header,bookVOList.size()) {
		@Override
		public boolean isCellEditable(int row, int column){
			return false;
		}
	};
	
	table = new JTable(model);
	table.getColumnModel().getColumn(0).setPreferredWidth(50);
	table.getColumnModel().getColumn(1).setPreferredWidth(200);
	table.getColumnModel().getColumn(2).setPreferredWidth(100);
	table.getColumnModel().getColumn(3).setPreferredWidth(50);
	
	
	
	JScrollPane scroll = new JScrollPane(table);
	
	putResult();
	
	add("Center",scroll);
	add("South",panS);
}
	//DefaultTableModel에 도서정보들을 설저안다.
	public void putResult() {
		//modeldml: 행 개수 설정
		model.setRowCount(bookVOList.size());
		BookVO vo = null;
		for(int i=0; i<bookVOList.size(); i++) {
			vo= bookVOList.get(i);
			//i:행번호 , 0:열번호
			model.setValueAt(vo.getIsbn(), i, 0);
			model.setValueAt(vo.getBooknName(), i, 1);
			model.setValueAt(vo.getPublish_authore(), i, 2);
			model.setValueAt(vo.getPrice(), i, 3);
			model.setValueAt(vo.getCategory(), i, 4);
		}
	}


	public void setBookVOList(ArrayList<BookVO> bookVOList) {
		this.bookVOList = bookVOList;
	}


	public JButton getBtnAdd() {
		return btnAdd;
	}
	
	public BookVO neededInsertData() {
		BookVO vo= new BookVO();
		vo.setIsbn(Integer.parseInt(tf[0].getText()));
		vo.setBooknName(tf[1].getText());
		vo.setPublish_authore(tf[2].getText());
		vo.setPrice(Integer.parseInt(tf[3].getText()));
		vo.setCategory((String)categoryCombo.getSelectedItem());
		return vo;
	}
	public void initInsertData() {
		for(int i=0; i<tf.length; i++) {
			tf[i].setText("");
		}
		categoryCombo.setSelectedIndex(0);
	}

}
