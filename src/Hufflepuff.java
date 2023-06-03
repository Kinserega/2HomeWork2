public class Hufflepuff extends Hogwarts{
    private int workLike;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerMagic, int transgressDistance, int workLike, int loyalty, int honesty) {
        super(name, powerMagic, transgressDistance);
        this.workLike = workLike;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getWorkLike() {
        return workLike;
    }

    public void setWorkLike(int workLike) {
        this.workLike = workLike;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

}
