package tutorial3.Zad1;

import java.util.ArrayList;
import java.util.List;

public class RailwayStation {
    private String name;
    private int platformsNumber = 3;
    private List<Train> trains = new ArrayList<>();

    public RailwayStation(String name) {
        this.name = name;
    }

    public void increaseTracks(int addedTracks){
        platformsNumber += addedTracks;
    }

    public void launchTrain(String trainName){
        if(trains.size() < platformsNumber)
            trains.add(new Train(trainName));
    }
}
