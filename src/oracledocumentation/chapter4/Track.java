package oracledocumentation.chapter4;

public class Track {
    protected
    final int rating;

    Track(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Track{" +
                "rating=" + rating +
                '}';
    }
}
