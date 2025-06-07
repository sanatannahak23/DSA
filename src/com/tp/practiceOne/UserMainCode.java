package com.tp.practiceOne;

import java.util.Arrays;

class UserMainCode {

    public static class Result {
        public final int output1;
        public final int output2;

        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }

    // Helper class to represent a country and its sorted state ratings
    public static class CountryInfo implements Comparable<CountryInfo> {
        int countryId;         // Original 0-based country index
        int[] sortedStates;    // Sorted state ratings for this country

        CountryInfo(int countryId, int[] sortedStates) {
            this.countryId = countryId;
            this.sortedStates = sortedStates;
        }

        @Override
        public int compareTo(CountryInfo other) {
            for (int i = 0; i < this.sortedStates.length; i++) {
                if (this.sortedStates[i] != other.sortedStates[i]) {
                    return Integer.compare(this.sortedStates[i], other.sortedStates[i]);
                }
            }
            return 0;
        }
    }

    public Result profitDevelopment(int totalStates, int statesPerCountry, int targetMonth, int[] ratings) {
        int totalCountries = totalStates / statesPerCountry;
        CountryInfo[] countryList = new CountryInfo[totalCountries];

        // Build each country with its sorted state ratings
        for (int i = 0; i < totalCountries; i++) {
            int[] currentStates = new int[statesPerCountry];
            System.arraycopy(ratings, i * statesPerCountry, currentStates, 0, statesPerCountry);
            Arrays.sort(currentStates);
            countryList[i] = new CountryInfo(i, currentStates);
        }

        // Sort countries based on lexicographically ordered state ratings
        Arrays.sort(countryList);

        // Traverse through the sorted list to find the target month
        int currentMonth = 0;

        for (CountryInfo country : countryList) {
            for (int rating : country.sortedStates) {
                currentMonth++;
                if (currentMonth == targetMonth) {
                    return new Result(country.countryId + 1, rating);  // 1-based indexing
                }
            }
        }

        // If targetMonth exceeds total number of states
        return new Result(-1, -1);
    }
}