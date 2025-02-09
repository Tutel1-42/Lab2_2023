package logic.unit;

public class ToughMan extends BaseCompetitor {

	private int maxHp;

	public ToughMan(String name) {
		super(name);
		this.setHp(8);
		this.setPower(4);
		this.setMaxHp(8);
	}

	public ToughMan(String name, int hp, int power) {
		super(name, hp, power);
		this.setMaxHp(hp);
	}

	public void heal(int healHp) {
		if (healHp < 0) {
			this.setHp(this.getHp());
		} else if (this.getHp() + healHp > this.getMaxHp()) {
			this.setHp(maxHp);

		}

		else
			this.setHp(this.getHp() + healHp);
	}

	public void attack(BaseCompetitor enemy) {
		if (enemy.getType().equals("Sorcerer")) {
			enemy.setHp(enemy.getHp() - this.getPower() / 2);
		} else if (enemy.getType().equals("ToughMan") || enemy.getType().equals("BaseCompetitor")) {
			enemy.setHp(enemy.getHp() - this.getPower());
		} else
			enemy.setHp(enemy.getHp() - this.getPower() * 3 / 2);

	}

	// setter & getter

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		if (maxHp < 0) {
			this.maxHp = 0;
			this.setHp(0);
		} else if (maxHp < this.getHp()) {
			this.setHp(maxHp);
			this.maxHp = maxHp;
		} else
			this.maxHp = maxHp;
	}

}
