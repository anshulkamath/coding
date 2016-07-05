/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinateplane;

/**
 *
 * @author 19kamatha
 */
public class CoordinatePlane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point p1 = new Point (3, 5);
        Point p2 = new Point (5, 7);
        DynamicPoints n = new DynamicPoints(p1, p2);
        System.out.println(n.generateSlope());
        System.out.println(n.isIntersecting());
    }
    
}
