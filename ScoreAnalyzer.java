public class ScoreAnalyzer {

    public String classifyResult(int[] scores) {

        int sum = 0;

        for (int score : scores) {
            if (score >= 0 && score <= 100) {
                sum += score;
            }
        }

        double avg = (double) sum / scores.length;

        if (avg >= 85) {
            return "Excellent";
        } else if (avg >= 70) {
            return "Good";
        } else if (avg >= 50) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}
