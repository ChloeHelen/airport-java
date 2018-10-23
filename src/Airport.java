import java.util.LinkedList;

public class Airport {

    private LinkedList<Plane> planeList = new LinkedList<Plane>();

    public String landPlane(Plane plane) {
        planeList.push(plane);
        return plane.getName() + " has landed";
    }
    
    public String takeOff(Plane plane){
        if (this.planeList.contains(plane)) {
            this.planeList.remove(plane);
            return plane.getName() + " has taken off";
        } else {
            throw new java.lang.IndexOutOfBoundsException("Plane is not in airport");
        }


    }

    public LinkedList getPlaneList() {
        return this.planeList;
    }
}
