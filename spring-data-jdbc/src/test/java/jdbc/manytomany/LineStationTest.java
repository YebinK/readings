package jdbc.manytomany;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class LineStationTest {
    @Autowired
    LineRepository lineRepository;
    @Autowired
    StationRepository stationRepository;

    @Test
    void name() {
        Station station = new Station("잠실역");
        Station savedStation = stationRepository.save(station);

        Line line = new Line("2호선", savedStation);
        Line savedLine = lineRepository.save(line);


    }
}