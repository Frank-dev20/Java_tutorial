public class Flight {

//Paasenger can choose between movies with duration equals flight time

    public static boolean movieAndFlightTime(int flight_duration, int []movie_duration) {
        int numberOfMovies = 0;
        boolean isTrue=false;
        for (int i = 0; i < movie_duration.length; i++) {
            for (int j = 0; j < i; j++) {
                if(movie_duration[i] + movie_duration[j] == flight_duration){
                    isTrue=true;
                    System.out.println("You watched  " + j + " and " + i);
                numberOfMovies++;
                }

            }
        }
        System.out.println(numberOfMovies);
        return true;

    }

}
