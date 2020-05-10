package jdbc.manytomany;

import org.springframework.data.annotation.Id;

public class Station {
    @Id
    private Long id;
    private String stationName;

    public Station(String stationName) {
        this.stationName = stationName;
    }

    public Long getId() {
        return id;
    }

    public String getStationName() {
        return stationName;
    }
}
