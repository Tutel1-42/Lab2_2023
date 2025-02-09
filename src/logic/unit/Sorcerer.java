package logic.unit;

public class Sorcerer extends BaseCompetitor{
	public Sorcerer(String name) {
		super (name);
		this.setHp(4);
		this.setPower(2);
	}
	
	public Sorcerer(String name, int hp, int power) {
		super (name, hp, power);
	}
	
	public void lowerPower(BaseCompetitor enemy, int powerDown) {
		if (powerDown < 0) {
			enemy.setPower(enemy.getPower());
		}
		else if (enemy.getPower() - powerDown < 1) {
			enemy.setPower(1);
		}
		else
			enemy.setPower(enemy.getPower() - powerDown);
	}
	
	public void attack(BaseCompetitor enemy) {
		if (enemy.getType() == "Tiger") {
			enemy.setHp(enemy.getHp() - this.getPower()/2);
		}
		else if (enemy.getType() == "BaseCompetitor" || enemy.getType() == "Sorcerer") {
			enemy.setHp(enemy.getHp() - this.getPower());
		}
		
		else
			enemy.setHp(enemy.getHp() - this.getPower()*3/2);
	}
}
