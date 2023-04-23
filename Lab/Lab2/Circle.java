
package L2Q5;

public class Circle implements Comparable<Circle>{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle o) {
        if(radius>o.radius){
            return 1;
        }else if(radius<o.radius){
            return -1;
        }else{
            return 0;
        }
 }
}
