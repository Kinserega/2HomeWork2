public class Slytherin extends Hogwarts{
    private int trick;
    private int deremination;
    private int ambition;
    private int resoursefulness;
    private int lust;

    public Slytherin(String name, int powerMagic, int transgressDistance, int trick, int deremination, int ambition, int resoursefulness, int lust) {
        super(name, powerMagic, transgressDistance);
        this.trick = trick;
        this.deremination = deremination;
        this.ambition = ambition;
        this.resoursefulness = resoursefulness;
        this.lust = lust;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDeremination() {
        return deremination;
    }

    public void setDeremination(int deremination) {
        this.deremination = deremination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResoursefulness() {
        return resoursefulness;
    }

    public void setResoursefulness(int resoursefulness) {
        this.resoursefulness = resoursefulness;
    }

    public int getLust() {
        return lust;
    }

    public void setLust(int lust) {
        this.lust = lust;
    }

}
