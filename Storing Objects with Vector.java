class Student {

	private int stud_id;
	private String sname;

	//class declaration
	public Student() {
	}

	public Student(int stud_id, String sname) {
		//'this' indicates that the variable stud_id comes from this class
		this.stud_id = stud_id; 
		this.sname = sname;
	}

	//getter and setter {
	public String getSname() {
		return sname;
	}

	public void setSname() {
		this.sname = sname;
	}
	//}

	public int setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	@Override
	public String toString() {
		return "student{" + "stud_id=" + stud_id + "sname=" + sname + '}';
	}
}