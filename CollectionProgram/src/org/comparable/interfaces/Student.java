package org.comparable.interfaces;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private String branch;
	private String loc;

	public Student(int id, String name, String branch, String loc) {

		this.id = id;
		this.name = name;
		this.branch = branch;
		this.loc = loc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", loc=" + loc + "]";
	}

	@Override
	public int compareTo(Student st) {
		if (this.getId() > st.getId())
			return 1;

		else if (this.getId() < st.getId())
			return -1;
		
		else
			return 0;
	}
}
