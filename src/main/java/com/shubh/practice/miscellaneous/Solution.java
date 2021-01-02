package com.shubh.practice.miscellaneous;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingStatisticsCollector stats = new RatingStatisticsCollectorImpl();
            final Set<String> apps = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String app = tokens[0];
                apps.add(app);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewRating(app, runs);

            }

            for (String app : apps) {
                System.out.println(
                        String.format("%s %.2f %d", app, stats.getAverageRating(app), stats.getRatingsCount(app)));
            }

        }
        scanner.close();

    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingStatisticsCollector {
        // Ratings feed will call this method when new app rating information is received. This is input to your class. ratings is a non negative integer between 0 to 10.
        public void putNewRating(String app, int rating);

        // Report the average rating of the app.
        public double getAverageRating(String app);

        // Report the total number of rating for an app.
        public int getRatingsCount(String app);
    }

    public static class RatingStatisticsCollectorImpl implements RatingStatisticsCollector {

        private Map<String, Integer> applications = new ConcurrentHashMap<>();
        private Map<String, Float> ratings = new ConcurrentHashMap<>();

        @Override
        public void putNewRating(String app, int rating) {
            applications.put(app, applications.getOrDefault(app, 0) + 1);
            ratings.put(app, ratings.getOrDefault(app, 0f) + rating);
        }

        @Override
        public double getAverageRating(String app) {
            return ratings.getOrDefault(app, 0f) /
                    applications.getOrDefault(app, 0);
        }

        @Override
        public int getRatingsCount(String app) {
            return applications.getOrDefault(app, 0);
        }
    }
}
