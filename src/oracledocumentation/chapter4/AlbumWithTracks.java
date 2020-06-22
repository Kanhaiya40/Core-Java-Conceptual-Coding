package oracledocumentation.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem--
 * Convert the following code into a new implementation that uses
 * lambda expressions and aggregate operations instead of nested for loops.
 * Hint: Make a pipeline that invokes the filter, sorted, and collect operations,
 * in that order.
 * List<Album> favs = new ArrayList<>();
 * for (Album a : albums) {
 * boolean hasFavorite = false;
 * for (Track t : a.tracks) {
 * if (t.rating >= 4) {
 * hasFavorite = true;
 * break;
 * }
 * }
 * if (hasFavorite)
 * favs.add(a);
 * }
 * Collections.sort(favs, new Comparator<Album>() {
 * public int compare(Album a1, Album a2) {
 * return a1.name.compareTo(a2.name);
 * }});
 */
public class AlbumWithTracks {
    public static void main(String[] args) {
        Track track1 = new Track(5);
        Track track2 = new Track(2);
        Track track3 = new Track(1);
        Track track4 = new Track(7);
        Track track5 = new Track(8);
        Album[] album = {new Album(track1, "SportsDay"), new Album(track2, "BirthDay"), new Album(track3, "GrandFinale"), new Album(track4, "SagarFiest"), new Album(track5, "YogaDay")};
        List<Album> favs = new ArrayList<>(Arrays.asList(album));
        System.out.println(favs);
        List<Album> sortedFavs =
                favs.stream()
                        .filter(a -> a.track.rating > 2)
                        .sorted(Comparator.comparing(a -> a.name))
                        .collect(Collectors.toList());
        System.out.println(sortedFavs);

    }
}
