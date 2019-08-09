package com.biz.dm.model;

public class MemberVO extends MenuVO{
		
	private String u_gender;	//varchar2(10 byte)
	private String u_age;	//varchar2(3 byte)
	private String u_height;	//varchar2(2 byte)
	private String u_weight;	//varchar2(3 byte)
	private int u_kcal;	//number
	
	private String total_kcal;
	private String base_kcal;
	
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVO(String m_morning, String m_afternoon, String m_evening) {
		super(m_morning, m_afternoon, m_evening);
		// TODO Auto-generated constructor stub
	}
	public MemberVO(String u_gender, String u_age, String u_height, String u_weight, int u_kcal, String total_kcal,
			String base_kcal) {
		super();
		this.u_gender = u_gender;
		this.u_age = u_age;
		this.u_height = u_height;
		this.u_weight = u_weight;
		this.u_kcal = u_kcal;
		this.total_kcal = total_kcal;
		this.base_kcal = base_kcal;
	}
	
	public String getU_gender() {
		return u_gender;
	}
	public void setU_gender(String u_gender) {
		this.u_gender = u_gender;
	}
	public String getU_age() {
		return u_age;
	}
	public void setU_age(String u_age) {
		this.u_age = u_age;
	}
	public String getU_height() {
		return u_height;
	}
	public void setU_height(String u_height) {
		this.u_height = u_height;
	}
	public String getU_weight() {
		return u_weight;
	}
	public void setU_weight(String u_weight) {
		this.u_weight = u_weight;
	}
	public int getU_kcal() {
		return u_kcal;
	}
	public void setU_kcal(int u_kcal) {
		this.u_kcal = u_kcal;
	}
	public String getTotal_kcal() {
		return total_kcal;
	}
	public void setTotal_kcal(String total_kcal) {
		this.total_kcal = total_kcal;
	}
	public String getBase_kcal() {
		return base_kcal;
	}
	public void setBase_kcal(String base_kcal) {
		this.base_kcal = base_kcal;
	}
	@Override
	public String toString() {
		return "MemberVO [u_gender=" + u_gender + ", u_age=" + u_age + ", u_height=" + u_height + ", u_weight="
				+ u_weight + ", u_kcal=" + u_kcal + ", total_kcal=" + total_kcal + ", base_kcal=" + base_kcal + "]";
	}
	
	
	
	
	
	
}
