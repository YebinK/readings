package jdbc.manytomany;

import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

public class Line {
    @Id
    private Long id;
    private String lineName;
    private Set<LineStation> stations;

    public Line(String lineName) {
        this(lineName, new HashSet<>());
    }

    public Line(String lineName, Set<LineStation> stations) {
        this.lineName = lineName;
        this.stations = stations;
    }

    public void addStations(LineStation lineStation) {
        stations.add(lineStation);
    }

    public void removeStations(LineStation lineStation) {
        stations.remove(lineStation);
    }

    public Long getId() {
        return id;
    }

    public String getLineName() {
        return lineName;
    }

    public Set<LineStation> getStations() {
        return stations;
    }
}
