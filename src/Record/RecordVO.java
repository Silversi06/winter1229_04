package Record;

public class RecordVO {
	private int number;
	private String name;
	private int grade;
	private int group;
	private int kor;
	private int eng;
	private int mat;
	private int sci;
	private int total;
	private double average;
	
	public RecordVO(){
		
	}

	public RecordVO(int number, String name, int grade, int group, int kor, int eng, int mat, int sci, int total,
			double average) {
		super();
		this.number = number;
		this.name = name;
		this.grade = grade;
		this.group = group;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sci = sci;
		this.total = total;
		this.average = average;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = kor+eng+mat+sci;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage() {
		this.average = total/4.0;
	}

	@Override
	public String toString() {
		return "RecordVO [number=" + number + ", name=" + name + ", grade=" + grade + ", group=" + group + ", kor="
				+ kor + ", eng=" + eng + ", mat=" + mat + ", sci=" + sci + ", total=" + total + ", average=" + average
				+ "]";
	}
	
	
	

}
