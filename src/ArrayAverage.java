public class ArrayAverage {
        public static void main(String[] args) {
            int sum = 0, pass = 0, len;
            double average, hScore = 0;
            double[] score = {
                    56.4, 67.5, 87.0, 89.2, 34.3, 76.3,
                    22.2, 90.6, 87.7, 64.0, 77.2, 65.5,
                    50.4, 67.2, 77.3, 38.5, 74.2, 33.6,
                    43.0, 32.5
            };
            len = score.length;

            for (int k = 0; k < len; k++) {
                sum += score[k];

                if (score[k] >= 40.0)
                    pass++;
                if (score[k] > hScore)
                    hScore = score[k];
            }
            average = sum / len;
            System.out.println("\n\tAverage Score = "+average);
            System.out.println("\n\tNo of Students who passed = "+ pass);
            System.out.println("\n\tThe highest Score = "+hScore);
        }
    }