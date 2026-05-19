public class LineComparisonComputation {

    public static void main(String[] args) {

        Point point1 = new Point(2, 4);
        Point point2 = new Point(6, 8);

        Point point3 = new Point(10, 12);
        Point point4 = new Point(14, 16);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);

        System.out.println("Line 1 Length : "
                + line1.calculateLength());

        System.out.println("Line 2 Length : "
                + line2.calculateLength());

        if (line1.equals(line2))
            System.out.println("Both Lines are Equal");
        else
            System.out.println("Both Lines are Not Equal");

        int result = line1.compareTo(line2);

        if (result == 0)
            System.out.println("Both Lines are Equal");

        else if (result > 0)
            System.out.println("Line 1 is Greater");

        else
            System.out.println("Line 2 is Greater");
    }
}