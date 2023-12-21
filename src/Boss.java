public class Boss extends GameEntity{
    Weapon weapon = new Weapon();


    public Boss(int hp, int damage, String name) {
        super(hp, damage, name);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

