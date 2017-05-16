package com.example.android.tutormatchtest;

public class Skill {
	public String skillName;
	public int skillDifficulty; // ranked 1 through 5, 5 is highest
	//public Image example;
	
	public Skill(String skillName, int skillDifficulty) {
		this.skillName = skillName;
		this.skillDifficulty = skillDifficulty;
		//this.example = example;
	}

	public String getSkillName(){
		return skillName;
	}

	


	
}
