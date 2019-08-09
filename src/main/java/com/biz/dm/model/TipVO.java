package com.biz.dm.model;

public class TipVO {
	
	
	private long t_seq;	//number
	private String t_subject;	//nvarchar2(100 char)
	private String t_date;	//varchar2(20 byte)
	private String t_time;	//varchr2(20 byte)
	private String t_writer;	//nvarchar2(50 char)
	private String t_substance;	//nvarchar2(1000 char)
	
	
	
	
	public TipVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipVO(long t_seq, String t_subject, String t_date, String t_time, String t_writer, String t_substance) {
		super();
		this.t_seq = t_seq;
		this.t_subject = t_subject;
		this.t_date = t_date;
		this.t_time = t_time;
		this.t_writer = t_writer;
		this.t_substance = t_substance;
	}
	public long getT_seq() {
		return t_seq;
	}
	public void setT_seq(long t_seq) {
		this.t_seq = t_seq;
	}
	public String getT_subject() {
		return t_subject;
	}
	public void setT_subject(String t_subject) {
		this.t_subject = t_subject;
	}
	public String getT_date() {
		return t_date;
	}
	public void setT_date(String t_date) {
		this.t_date = t_date;
	}
	public String getT_time() {
		return t_time;
	}
	public void setT_time(String t_time) {
		this.t_time = t_time;
	}
	public String getT_writer() {
		return t_writer;
	}
	public void setT_writer(String t_writer) {
		this.t_writer = t_writer;
	}
	public String getT_substance() {
		return t_substance;
	}
	public void setT_substance(String t_substance) {
		this.t_substance = t_substance;
	}
	@Override
	public String toString() {
		return "TipVO [t_seq=" + t_seq + ", t_subject=" + t_subject + ", t_date=" + t_date + ", t_time=" + t_time
				+ ", t_writer=" + t_writer + ", t_substance=" + t_substance + "]";
	}

	
	
}
	
