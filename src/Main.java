public class Main {
    public static void main(String[] args) {

        Punt p1 = new Punt(1, 3, 4);
        Punt p2 = new Punt(2, 5, 6);
        Punt p3 = new Punt(3, 7, 8);


        Linia line = new Linia(18, p1, p2);


        Area area = new Area(2, p1, p2, p3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(line);
        System.out.println(area);

    }





}