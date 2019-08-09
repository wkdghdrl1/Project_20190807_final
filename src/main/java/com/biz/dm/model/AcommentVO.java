package com.biz.dm.model;

public class AcommentVO {
		
	private long a_seq;	//number
	private String a_subject;	//nvarchar2(100 char)
	private String a_date;	//varchar2(20 byte)
	private String a_time;	//varchar2(20 byte)
	private String a_writer;	//nvarchar2(50 char)
	private String a_substance;	//nvarchar2(1000 char)
	
	
	
	public AcommentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AcommentVO(long a_seq, String a_subject, String a_date, String a_time, String a_writer, String a_substance) {
		super();
		this.a_seq = a_seq;
		this.a_subject = a_subject;
		this.a_date = a_date;
		this.a_time = a_time;
		this.a_writer = a_writer;
		this.a_substance = a_substance;
	}
	public long getA_seq() {
		return a_seq;
	}
	public void setA_seq(long a_seq) {
		this.a_seq = a_seq;
	}
	public String getA_subject() {
		return a_subject;
	}
	public void setA_subject(String a_subject) {
		this.a_subject = a_subject;
	}
	public String getA_date() {
		return a_date;
	}
	public void setA_date(String a_date) {
		this.a_date = a_date;
	}
	public String getA_time() {
		return a_time;
	}
	public void setA_time(String a_time) {
		this.a_time = a_time;
	}
	public String getA_writer() {
		return a_writer;
	}
	public void setA_writer(String a_writer) {
		this.a_writer = a_writer;
	}
	public String getA_substance() {
		return a_substance;
	}
	public void setA_substance(String a_substance) {
		this.a_substance = a_substance;
	}
	@Override
	public String toString() {
		return "AcommentVO [a_seq=" + a_seq + ", a_subject=" + a_subject + ", a_date=" + a_date + ", a_time=" + a_time
				+ ", a_writer=" + a_writer + ", a_substance=" + a_substance + "]";
	}
	
	
}
