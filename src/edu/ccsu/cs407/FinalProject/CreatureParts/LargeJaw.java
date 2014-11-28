package edu.ccsu.cs407.FinalProject.CreatureParts;

public class LargeJaw extends CreatureComponent 
{
	public boolean canEatLarger(){
		return true;
	}
	
	@Override
	public String toString(){
		return "Large Jaw";
	}
}
