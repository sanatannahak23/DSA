package com.tp.practiceOne;

import java.util.Arrays;

public class CustomContryAndState {

    public static class Result {
        public final int output1;
        public final int output2;

        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }

    public static class CountryInfo implements Comparable<CountryInfo> {
        int index;
        int[] sortedRating;

        public CountryInfo(int index, int[] sortedRating) {
            this.index = index;
            this.sortedRating = sortedRating;
        }

        @Override
        public int compareTo(CountryInfo other) {
            for (int i = 0; i < sortedRating.length; i++) {
                if (this.sortedRating[i] != other.sortedRating[i])
                    return Integer.compare(sortedRating[i], other.sortedRating[i]);
            }
            return 0;
        }
    }

    public Result profitDevelopment(int totalStates, int statesPerCountry, int targetMonth, int[] ratings) {
//        int numOfCoutnries = totalStates / statesPerCountry;
//        CountryInfo[] countries = new CountryInfo[numOfCoutnries];
//
//        for (int i = 0; i < numOfCoutnries; i++) {
//            int[] perCountry = new int[statesPerCountry];
//            System.arraycopy(ratings, i * statesPerCountry, perCountry, 0, statesPerCountry);
//            Arrays.sort(perCountry);
//            CountryInfo countryInfo = new CountryInfo(i, perCountry);
//            countries[i] = countryInfo;
//        }
//
//        Arrays.sort(countries);
//
//        int monthCount = 0;
//        for (CountryInfo info : countries) {
//            for (int n : info.sortedRating) {
//                monthCount++;
//                if (monthCount == targetMonth) return new Result(info.index + 1, n);
//            }
//        }
//
//        return new Result(-1, -1);

        int numOfCountries = totalStates / statesPerCountry;
        CountryInfo[] countryInfos = new CountryInfo[numOfCountries];
        for (int i = 0; i < totalStates; i++) {
            int[] states = new int[statesPerCountry];
            System.arraycopy(ratings, i * statesPerCountry, states, 0, statesPerCountry);
            Arrays.sort(states);
            countryInfos[i] = new CountryInfo(i, states);
        }

        Arrays.sort(countryInfos);

        int monthMax = 0;
        for (CountryInfo countryInfo : countryInfos) {
            for (int i = 0; i < countryInfo.sortedRating.length; i++) {
                monthMax++;
                if (monthMax == targetMonth) return new Result(i + 1, countryInfo.sortedRating[i]);
            }
        }
        return new Result(-1, -1);
    }
}
