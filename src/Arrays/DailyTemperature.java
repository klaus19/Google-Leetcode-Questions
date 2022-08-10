package Arrays;

//Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i]
// is the number of days you have to wait after the ith day to get a warmer temperature.
// If there is no future day for which this is possible, keep answer[i] == 0 instead.

public class DailyTemperature {


        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int[] answer = new int[n];
            for (int day = 0; day < n; day++) {
                for (int futureDay = day + 1; futureDay < n; futureDay++) {
                    if (temperatures[futureDay] > temperatures[day]) {
                        answer[day] = futureDay - day;
                        break;
                    }
                }
            }

            return answer;
        }
    }

