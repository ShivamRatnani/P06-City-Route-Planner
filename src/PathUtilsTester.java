import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PathUtilsTester {
    public PathUtilsTester(){

    }

    //TODO: Add more cases to these please
    //Also I love you bro

    public static boolean testCountPathsNoPath(){
        Intersection start = new Intersection(1, 1);
        Intersection end = new Intersection(0, 1);
        if (PathUtils.countPaths(start, end) != 0) return false;
        else return true;
    }

    public static boolean testCountPathsOnePath(){
        Intersection start = new Intersection(0, 0);
        Intersection end = new Intersection(1, 1);
        if (PathUtils.countPaths(start, end) != 1) return false;
        else return true;
    }

    public static boolean testCountPathsRecursive(){
        Intersection start = new Intersection(0, 0);
        Intersection end = new Intersection(1, 2);
        if (PathUtils.countPaths(start, end) != 3) return false;
        else return true;
    }

    public static boolean testFindAllPathsNoPath(){
        Intersection start = new Intersection(1, 1);
        Intersection end = new Intersection(0, 1);
        if (PathUtils.findAllPaths(start, end).size() != 0) return false;
        else return true;
    }

    public static boolean testFindAllPathsOnePath(){
        Intersection start = new Intersection(1, 1);
        Intersection end = new Intersection(1, 2);
        if (PathUtils.findAllPaths(start, end).size() != 1) return false;
        else return true;
    }

    public static boolean testFindAllPathsRecursive(){
        Intersection start = new Intersection(0, 0);
        Intersection end = new Intersection(1, 2);
        if (PathUtils.findAllPaths(start, end).size() != 3) return false;
        else return true;
    }

}
