public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honour;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public Gryffindor(String name, int powerMagic, int transgressDistance, int nobility, int honour, int bravery) {
        super(name, powerMagic, transgressDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;

    }

}
