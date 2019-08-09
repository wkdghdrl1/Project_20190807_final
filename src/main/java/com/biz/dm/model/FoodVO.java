package com.biz.dm.model;

public class FoodVO {
	
	private String t_seq;	//number
	private String t_foodname;	//nvarchar2(100 char)
	private String t_nutrient;	//nvarchar2(300 char)
	private String t_kcal; //	number
	private String t_recommendmenu;
	
	public FoodVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodVO(String t_seq, String t_foodname, String t_nutrient, String t_kcal) {
		super();
		this.t_seq = t_seq;
		this.t_foodname = t_foodname;
		this.t_nutrient = t_nutrient;
		this.t_kcal = t_kcal;
	}
	public String getT_seq() {
		return t_seq;
	}
	public void setT_seq(String t_seq) {
		this.t_seq = t_seq;
	}
	public String getT_foodname() {
		return t_foodname;
	}
	public void setT_foodname(String t_foodname) {
		this.t_foodname = t_foodname;
	}
	public String getT_nutrient() {
		return t_nutrient;
	}
	public void setT_nutrient(String t_nutrient) {
		this.t_nutrient = t_nutrient;
	}
	public String getT_kcal() {
		return t_kcal;
	}
	public void setT_kcal(String t_kcal) {
		this.t_kcal = t_kcal;
	}
	public String getT_recommendmenu() {
		return t_recommendmenu;
	}
	public void setT_recommendmenu(String t_recommendmenu) {
		this.t_recommendmenu = t_recommendmenu;
	}
	@Override
	public String toString() {
		return "FoodVO [t_seq=" + t_seq + ", t_foodname=" + t_foodname + ", t_nutrient=" + t_nutrient + ", t_kcal="
				+ t_kcal + "]";
	}
	
	
}
