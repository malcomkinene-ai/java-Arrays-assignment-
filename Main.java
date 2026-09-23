public class GradeCalc {

    public static void main(String[] args) {
        int[] marks = {70, 80, 65, 90, 85};
        
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        // Cast to double so we don't drop decimal precision
        double avg = (double) total / marks.length;

        System.out.println("Marks count: " + marks.length);
        System.out.println("Total: " + total);
        System.out.println("Average mark: " + avg);
    }
}