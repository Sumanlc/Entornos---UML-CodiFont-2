public class Area {

    private int id;

    private Punt p1;
    private Punt p2;
    private Punt p3;

    public Area(int id, Punt  p1, Punt p2, Punt p3) {
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                '}';
    }




}
