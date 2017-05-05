public class Pokemon {
	String species;
	int attack;
	int defense;
	int speed;
	public void grow(int boost){
		attack += boost;
	}
	public void harden(int boost){
		defense += boost;
	}
	public void haste(int boost){
		speed += boost;
	}
	public String getSpecies(){
		return species;
	}
	public void setSpecies(String spc){
		species = spc;
	}
	public int getAttack(){
		return attack;
	}
	public void setAttack(int atk){
		attack = atk;
	}
	public int getDefense(){
		return defense;
	}
	public void setDefense(int def){
		defense = def;
	}
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int spd){
		speed = spd;
	}
	public Pokemon(String s, int a, int d, int sp){
		species=s;
		attack=a;
		defense=d;
		speed=sp;
	}
	
}
