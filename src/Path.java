import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Path {
    private ArrayList<Intersection> intersections;

    public Path(Intersection start, Intersection end) {
        intersections.add(new Intersection(0, 0));
    }

    public int length(){
        return intersections.size();
    }

    public Intersection getHead() throws NoSuchElementException {
        if (intersections.size() == 0) throw new NoSuchElementException();
        else return intersections.get(0);
    }

    public Intersection getTail() throws NoSuchElementException {
        if (intersections.size() == 0) throw new NoSuchElementException();
        else return intersections.get(intersections.size() - 1);
    }

    public void addTail(Intersection toAdd) throws IllegalArgumentException {
        Intersection emptyPath = new Intersection(0, 0);
        Intersection east = toAdd.goEast();
        Intersection north = toAdd.goNorth();

        if (toAdd.equals(emptyPath) || toAdd.equals(east) || toAdd.equals(north)) intersections.add(toAdd);
        else throw new IllegalArgumentException();
    }

    public void addHead(Intersection toAdd) throws IllegalArgumentException{
        Intersection emptyPath = new Intersection(0, 0);
        Intersection west = toAdd.goWest();
        Intersection south = toAdd.goSouth();

        if (toAdd.equals(emptyPath) || toAdd.equals(west) || toAdd.equals(south)) intersections.add(0, toAdd);
        else throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        String nonEmptyPath = "";
        if  (intersections.size() == 0) return "Empty";
        else{
            for (int i = 0; i < intersections.size(); i++){
                if (i != intersections.size() - 1) nonEmptyPath += intersections.get(i).toString() + "->";
                else nonEmptyPath += intersections.get(i).toString();
            }
        }
        return nonEmptyPath;
    }




}
