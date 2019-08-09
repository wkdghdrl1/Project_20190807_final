package com.biz.dm.model;

public class MenuVO {
	
 	private String m_morning;	//nvarchar2(100 char)
 	private String m_afternoon;	//nvarchar2(100 char)
 	private String m_evening;	//nvarchar2(100 char)
 	
 	
 	
	public MenuVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuVO(String m_morning, String m_afternoon, String m_evening) {
		super();
		this.m_morning = m_morning;
		this.m_afternoon = m_afternoon;
		this.m_evening = m_evening;
	}
	public String getM_morning() {
		return m_morning;
	}
	public void setM_morning(String m_morning) {
		this.m_morning = m_morning;
	}
	public String getM_afternoon() {
		return m_afternoon;
	}
	public void setM_afternoon(String m_afternoon) {
		this.m_afternoon = m_afternoon;
	}
	public String getM_evening() {
		return m_evening;
	}
	public void setM_evening(String m_evening) {
		this.m_evening = m_evening;
	}
	@Override
	public String toString() {
		return "MenuVO [m_morning=" + m_morning + ", m_afternoon=" + m_afternoon + ", m_evening=" + m_evening + "]";
	}
	
 	
 	
}
