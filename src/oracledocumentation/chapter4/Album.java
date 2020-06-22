package oracledocumentation.chapter4;

public class Album {
    protected Track track;
    protected String name;

    public Album(Track track, String name) {
        this.track = track;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Album{" +
                "track=" + track +
                '}';
    }
}
