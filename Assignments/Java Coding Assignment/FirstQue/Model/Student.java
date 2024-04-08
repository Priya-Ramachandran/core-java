package studentassignment.model;

public class Student {
	
	private int stuid;
	private String stuname;
	private String stucity;
	
	public Student() {
		
	}

	public Student(int stuid, String stuname, String stucity) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stucity = stucity;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStucity() {
		return stucity;
	}

	public void setStucity(String stucity) {
		this.stucity = stucity;
	}

	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", stucity=" + stucity + "]";
	}
	
	

}
