import java.util.Random;

public class Sneak extends Monsters{

    //Sneak

    public static Random n = new Random();
    public static int sneakDamage = n.nextInt(3) + 3;

    public Sneak() {
        super(4, "Sneak", sneakDamage, 12,0);

    }

}
