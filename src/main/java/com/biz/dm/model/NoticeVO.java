package com.biz.dm.model;

public class NoticeVO {
		
	private long n_seq;	//number
	private String n_subject;	//nvarchar2(100 char)
	private String n_date;	//varchar2(20 byte)
	private String n_time;	//varchar2(20 byte)
	private String n_writer;	//nvarchar2(50 char)
	private String n_substance;	//nvarchar2(1000 char)

	
	
	public NoticeVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public NoticeVO(long n_seq, String n_subject, String n_date, String n_time, String n_writer, String n_substance) {
		super();
		this.n_seq = n_seq;
		this.n_subject = n_subject;
		this.n_date = n_date;
		this.n_time = n_time;
		this.n_writer = n_writer;
		this.n_substance = n_substance;
	}



	public long getN_seq() {
		return n_seq;
	}



	public void setN_seq(long n_seq) {
		this.n_seq = n_seq;
	}



	public String getN_subject() {
		return n_subject;
	}



	public void setN_subject(String n_subject) {
		this.n_subject = n_subject;
	}



	public String getN_date() {
		return n_date;
	}



	public void setN_date(String n_date) {
		this.n_date = n_date;
	}



	public String getN_time() {
		return n_time;
	}



	public void setN_time(String n_time) {
		this.n_time = n_time;
	}



	public String getN_writer() {
		return n_writer;
	}



	public void setN_writer(String n_writer) {
		this.n_writer = n_writer;
	}



	public String getN_substance() {
		return n_substance;
	}



	public void setN_substance(String n_substance) {
		this.n_substance = n_substance;
	}



	@Override
	public String toString() {
		return "NoticeVO [n_seq=" + n_seq + ", n_subject=" + n_subject + ", n_date=" + n_date + ", n_time=" + n_time
				+ ", n_writer=" + n_writer + ", n_substance=" + n_substance + "]";
	}
	
	
	
}
