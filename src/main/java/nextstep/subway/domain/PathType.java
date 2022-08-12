package nextstep.subway.domain;

public enum PathType {
    DISTANCE, DURATION;

    public double getWeight(Section section) {
        return 0;
    }
}
