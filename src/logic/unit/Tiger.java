package logic.unit;

public class Tiger extends BaseCompetitor {
	public Tiger(String name) {
		super(name);
		this.setHp(7);
		this.setPower(5);
	}

	public Tiger(String name, int hp, int power) {
		super(name, hp, power);
	}

	public void train(int addPower) {
		if (addPower <= 0) {
			this.setPower(getPower());
		} else
			this.setPower(this.getPower() + addPower);
	}

	public void attack(BaseCompetitor enemy) {
		if (enemy.getType().equals("ToughMan")) {
			enemy.setHp(enemy.getHp() - this.getPower() / 2);
		} else if (enemy.getType().equals("Tiger") || enemy.getType().equals("BaseCompetitor")) {
			enemy.setHp(enemy.getHp() - this.getPower());
		} else
			enemy.setHp(enemy.getHp() - this.getPower() * 3 / 2);
	}
}
