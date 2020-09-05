package logging;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public enum LogMarkers {

    SEARCH_KEY(MarkerFactory.getMarker("SEARCH_KEY"));

    public final Marker marker;

    private LogMarkers(Marker marker) {
        this.marker = marker;
    }
}
