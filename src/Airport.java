public class Airport {

    public String landPlane(Plane plane) {
        String s = plane.getName() + " has landed";
        return s;
    }
    
    public String takeOff(Plane plane){
        String s = plane.getName() + " has taken off";
        return s;
    }
}


