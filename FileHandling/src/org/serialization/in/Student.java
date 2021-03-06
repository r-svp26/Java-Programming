package org.serialization.in;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	static String clg_code = "0115NRI18";

	private int id;
	private String name;
	transient Double perc;
	private String loc;

	public Student(int id, String name, Double perc, String loc) {

		this.id = id;
		this.name = name;
		this.perc = perc;
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

	public Double getPerc() {
		return perc;
	}

	public void setPerc(Double perc) {
		this.perc = perc;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Student [clg_code=" + clg_code + ", id=" + id + ", name=" + name + ",perc=" + perc + ", loc=" + loc
				+ "]";
	}

}
