package labs.lab01;

public class GradeCalculator {

    public static double average(int[] scores) {
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public static int highest(int[] scores) {
        int highest = scores[0];

        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }

    public static void main(String[] args) {
        int[] scores = {85, 90, 72, 96, 88};

        System.out.println("Average: " + average(scores));
        System.out.println("Highest: " + highest(scores));
    }
}
