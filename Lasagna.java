public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven){
        int expectedMinutesInOven = expectedMinutesInOven();
        return expectedMinutesInOven - actualMinutesInOven;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayersAdded){
        return numberOfLayersAdded * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayersAdded, int actualMinutesInOven){
        return 2 * numberOfLayersAdded + actualMinutesInOven;
    }
}


