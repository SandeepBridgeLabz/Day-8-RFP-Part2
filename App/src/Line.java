public class Line implements Comparable<Line> {

    Point startPoint;
    Point endPoint;

    public Line(Point startPoint, Point endPoint) {

        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double calculateLength() {

        return Math.sqrt(
                Math.pow((endPoint.x - startPoint.x), 2) +
                        Math.pow((endPoint.y - startPoint.y), 2));
    }

    @Override
    public boolean equals(Object object) {

        if (this == object)
            return true;

        if (object == null || getClass() != object.getClass())
            return false;

        Line line = (Line) object;

        return Double.compare(
                this.calculateLength(),
                line.calculateLength()) == 0;
    }

    @Override
    public int compareTo(Line line) {

        return Double.compare(
                this.calculateLength(),
                line.calculateLength());
    }
}