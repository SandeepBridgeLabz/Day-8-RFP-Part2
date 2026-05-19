public class LineComparisonComputation {

    public static void main(String[] args) {

        Double line1Length = Math.sqrt(
                Math.pow((6 - 2), 2) +
                        Math.pow((8 - 4), 2));

        Double line2Length = Math.sqrt(
                Math.pow((15 - 10), 2) +
                        Math.pow((18 - 12), 2));

        int result = line1Length.compareTo(line2Length);

        if (result == 0)
            System.out.println("Both Lines are Equal");

        else if (result > 0)
            System.out.println("Line 1 is Greater than Line 2");

        else
            System.out.println("Line 1 is Less than Line 2");
    }
}