package fatec_ipi_paoo_sabado_strategy_exercise;

public abstract class Character {
	
	private WeaponBehavior weaponBehavior;
	
	public void fight () {
		System.out.println("Fighting");
	}
	
	public void setWeapon (WeaponBehavior w) {
		this.weaponBehavior = w;
	}

}