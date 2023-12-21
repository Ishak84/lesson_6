public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(1000, 444, "Boss");
        boss.setHp(1000);
        boss.setDamage(444);
        boss.setName("Boss");
        boss.weapon.setWeaponType(WeaponType.GUN);
        boss.weapon.setName("Gun");
        System.out.println("hp: " + boss.getHp() + "\ndamage: " + boss.getDamage() + "\nname: " + boss.getName()
                + "\nWeaponType: " + boss.weapon.getWeaponType() + "\nname: " + boss.weapon.getName())
        ;
    }

}
