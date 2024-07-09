public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutes){
            int expectedMinutesInOven = expectedMinutesInOven();
     return expectedMinutesInOven - minutes;
}
    

    public int preparationTimeInMinutes(int layersInLasagna) {
        return layersInLasagna * 2;
    }
    
    
    public int totalTimeInMinutes(int layersInLasagna, int minutesInOven) {
        return preparationTimeInMinutes(layersInLasagna) + minutesInOven;

    }
}
