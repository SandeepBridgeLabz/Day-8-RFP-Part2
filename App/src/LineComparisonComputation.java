public class LineComparisonComputation {

    public static void main(String[] args) {

        Double line1Length = Math.sqrt(
                Math.pow((6 - 2), 2) +
                        Math.pow((8 - 4), 2));

        Double line2Length = Math.sqrt(
                Math.pow((10 - 6), 2) +
                        Math.pow((12 - 8), 2));

        if (line1Length.equals(line2Length))
            System.out.println("Both lines are Equal");
        else
            System.out.println("Both lines are Not Equal");
    }
}