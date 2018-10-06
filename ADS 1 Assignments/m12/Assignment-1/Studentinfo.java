class Studentinfo {
	private String student name;
	private String DateofBirth;
	private int subject1marks;
	private int subject2marks;
	private int subject3marks;
	private int totalmarks;
	private String reservationcategory;

	Studentinfo(String student name1,String dateofbirth1,int subject1marks,int subject2marks, int subject3marks,int totalmarks, String reservationcategory) {
		this.student name = studentname1;
		this.dateofBirth  = dateofbirth1;
		this.subject1marks = subject1marks;
		this.subject2marks = subject2marks;
		this.subject3marks = subject3marks;
		this.totalmarks = totalmarks;
		this.reservationcategory = reservationcategory;
	}

	public String getStudentName() {
		return this.studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getDateofBirth() {
		return this.dateofbirth;
	}
	public void setDateofBirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getSubject1marks() {
		return this.subject1marks;
	}
	public void setSubject1marks(int subject1marks) {
		this.subject1marks = subject1marks;
	}

	public String getSubject2marks() {
		return this.subject2marks;
	}
	public void setSubject2marks(int subject2marks) {
		this.subject2marks = subject2marks;
	}

	public String getSubject3marks() {
		return this.subject2marks;
	}
	public void setSubject3marks(int subject3marks) {
		this.subject3marks = subject3marks;
	}
	public String getTotalmarks() {
		return this.subject2marks;
	} 
	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}
	public String getReservationCategory() {
		return this.reservationcategory;
	}
	public void setReservationCategory(int subject3marks) {
		this.reservationcategory = reservationcategory;
	}


	public int CampareTo(Studentinfo that) {
		if(this.totalmarks < that.totalmarks) return 1;
		if(this.subject3marks > that.subject3marks) return  subject marks2;
		if(this.subject2marks> that.subject2marks)
	}






}