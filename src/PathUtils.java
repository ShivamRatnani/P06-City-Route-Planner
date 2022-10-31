import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PathUtils {

    public PathUtils() {

    }

    //TODO: Implement this method
    public static int countPaths(Intersection start, Intersection end) {
        //need to do this recursively

        int pathCount = 0;
        if (start.getX() > end.getX() || start.getY() > end.getY())
            return 0;
        else if (start.getX() == end.getX() && start.getY() == end.getY())
            return 1;
        else {
            pathCount += countPaths(start.goEast(), end);
            pathCount += countPaths(start.goNorth(), end);
        }
        return pathCount;

    }

    //TODO: Implement this method
    public static ArrayList<Path> findAllPaths(Intersection start, Intersection end) {
        //need to do this recursively

        ArrayList<Path> allPaths = new ArrayList<>();
        if (countPaths(start, end) == 0) return allPaths;
        else if (countPaths(start, end) == 1) {
            allPaths.add(new Path(start, end));
        }
        else {
            for (int i = 0; i < countPaths(start, end); i++) {

            }


            }
        return allPaths;
        }



    }



}
