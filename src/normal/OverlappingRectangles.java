package normal;

public class OverlappingRectangles {

    int length1,breadth1;
    int length2,breadth2;
    int area1,area2;

    public boolean overlappingArea(){
        area1 = length1*breadth1;
        area2 = length2*breadth2;

        if (area1==area2){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        OverlappingRectangles ol = new OverlappingRectangles();
        int len1=45,len2=45;
        int b1=23,b2=23;

        System.out.println(ol.overlappingArea());
    }

}
