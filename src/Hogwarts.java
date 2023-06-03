public class Hogwarts {
    private String name;
    private int powerMagic;
    private int transgressDistance;

    public Hogwarts(String name, int powerMagic, int transgressDistance) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgressDistance = transgressDistance;
    }
    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }
}
