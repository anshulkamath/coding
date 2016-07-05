/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homervilledelivery;

import java.io.*;
import java.util.*;

/**
 *
 * @author 19sanchezj
 */
public class HomervilleDelivery {
    
    public static int count = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        final double TIME_PER_MILE = 2.5;
        
        ArrayList<Location> neighborhood = new ArrayList<Location>();
        // The name of the file to open.
        String fileName = "cycle11.txt";

        // Set Delimiter to be ',' to start
        File f = new File(fileName);
        Scanner s0 = new Scanner(f).useDelimiter(System.getProperty("line.separator"));
        int num = Integer.parseInt(s0.next().trim());
        // Skip 2 lines
        Scanner s = new Scanner(f).useDelimiter(",");
        s.nextLine();
        s.nextLine();
      
        // Keeps track of whether next() should give house, ave, or street
        int c = 0;
        
        int co = 0; // DEBUG CODE
        String complexString = "";
       
        int x = 0, y = 0; // Holds street/ave
        char z; // Holds house on street – capital is double letter
        
        try {
            while (s.hasNext()) {
                String temp = s.next().trim(); // read in next item
                if (temp.length() > 4) {
                    s.useDelimiter(System.getProperty("line.separator"));
                    complexString = temp;
                    break;
                } 
                if (c == 0) {
                    // if temp is a street
                    x = Integer.parseInt(temp.substring(0, temp.length() - 1));
                } else if (c == 1) {
                    // if temp is an avenue
                    y = Integer.parseInt(temp.substring(0, temp.length() - 1));
                    // Change to reading until newline
                    s.useDelimiter(System.getProperty("line.separator"));
                } else if (c == 2) {
                    if (temp.length() > 2) 
                        z = temp.toUpperCase().charAt(1);   
                    else
                        z = temp.toLowerCase().charAt(1);
                    
                    // Create new Location object and add it to the neighborhood
                    Location l = new Location(x, y, z);
                    neighborhood.add(l);
                    
                    // Reset for next iteration
                    c = -1;
                    s.useDelimiter(",");
                }
                c++;
               
                
            }
        }
        catch (StringIndexOutOfBoundsException error) {
        }
        catch (NumberFormatException d) {
            System.out.println(d);
        }
        
        int i = 0, j = 0, bart = 0, k = 0, lisa = 0;
        try {
            i = complexString.indexOf('x') + 3;
            j = complexString.indexOf('\n', i);

            neighborhood.add(new Location(2, 3, 'E'));
            neighborhood.add(new Location(149, 33, 'E'));

            bart = Integer.parseInt(complexString.substring(i, j).trim());

            k = complexString.indexOf('x', j + 1);
            lisa = Integer.parseInt(complexString.substring(k + 3).trim());
        } catch (StringIndexOutOfBoundsException error) {
        }
        
        
        ArrayList<Truck> t = new ArrayList<Truck>();
        t.add(new Truck(false, 2));
        t.add(new Truck(false, 2));
        t.add(new Truck(false, 2));
        t.add(new Truck(false, 2));
        t.add(new Truck(false, 2));
        t.add(new Truck(false, 2));
        
     
        getCycleData(neighborhood, num, bart, lisa, t);
        
               
    }
    
    public static void getCycleData(ArrayList<Location> all, int cycleNumber, int numBart, int numLisa, ArrayList<Truck> t) throws IOException {
        
        double totalCost = 0.0;    
        double gasCosts = 0.0;
        double ownedDistance = 0.0;
        
        int[] locs = new int[2];
        
        double hours = 0;
        double d = 0;
        double timeRequired = 0;
        double truckCost = 0;
        double eCost = 0;
        
        ArrayList<ArrayList<Location>> areas = splitArea(t.size(), all);
        for (int i = 0; i < areas.size(); i++) {
            Truck truck = t.get(i);
            double truckDistance = 0;
            ArrayList<Location> l = areas.get(i);
            ArrayList<ArrayList<Location>> subareas = splitArea(8, l); // Error is when 4 trucks and 8 sections/truck
            double tR = 0;
            for (int j = 0; j < subareas.size(); j++) {
                Location start, end;
                ArrayList<Location> path;
                System.out.println("Subarea Size: " + subareas.get(j).size());

                if (j != subareas.size() - 1) {
                    if (j == 0) {
                        ArrayList<Location> center = new ArrayList<Location>();
                        center.add(new Location(125, 22, 'a'));
                        locs = getClosest(center, subareas.get(j));
                    }
                    start = subareas.get(j).get(locs[1]);
                    locs = getClosest(subareas.get(j), subareas.get(j + 1));
                    end = subareas.get(j).get(locs[0]);
                                           
                   
                    
                } else {
                   start = subareas.get(j).get(locs[1]);
                   ArrayList<Location> center = new ArrayList<Location>();
                   center.add(new Location(125, 22, 'a'));
                   locs = getClosest(subareas.get(j), center);
                   end = subareas.get(j).get(locs[0]);
                }
   
                path = getPath(subareas.get(j), start, end);
                double distance = getRouteDistance(path);
                if (j != subareas.size() - 1) {
                    distance += end.getdistance(subareas.get(j + 1).get(locs[1]));
                }
                
                gasCosts = distance * 5; // factor in gas costs
                
                if (!truck.isRented())
                    ownedDistance += distance;
                
                
                System.out.println("Distance: " + distance);
                truckDistance += distance;
                double time = distance * 0.0833;
                
                if (foundLisa(subareas.get(j))) {
                    time += numLisa * (1. / 120);
                }
                
                if (foundBart(subareas.get(j))) {
                    time += numBart * (1. / 120);
                }
                
                
                
                time += subareas.get(j).size() * (1. / (60 * truck.getEmployees()));
                
                
                if (Math.ceil(time) > 8) {
                    eCost += (8 * 30) * truck.getEmployees();
                    eCost += (Math.ceil(time) - 8) * 45 * truck.getEmployees();
                } else {
                    eCost += (Math.ceil(time) * 30) * truck.getEmployees();
                }
                                
                tR += time;
                
                
                System.out.println("Time: " + time);
                
                
                
                hours += time;
                d += distance;
                                
                System.out.println();
            }
            
            if (!truck.isRented()) {
                if (cycleNumber == 1)
                    truckCost += 100000;
            } else {
                truckCost += 15000;
            }
            
            if (tR > timeRequired) {
                timeRequired = tR;
            }
            
            System.out.println("Truck Distance: " + truckDistance);
            System.out.println();

            
        }
        
        System.out.println("-----------------------");
        
        System.out.println("Total Workhours: " + hours); 
        System.out.println("Hours: " + timeRequired);
        System.out.println();
        
        totalCost += truckCost;
        System.out.println("Truck Cost: " + truckCost);
        
        totalCost += eCost;
        System.out.println("Employee Cost: " + eCost);
        
        
        gasCosts += (int)(ownedDistance / 100) * 1000;
        totalCost += gasCosts;
        System.out.println("Gas Cost: " + gasCosts);
        
        
        
        
        System.out.println("Total Cost: " + totalCost);
        
    }
    
      
    public static ArrayList<ArrayList<Location>> splitArea(int sections, ArrayList<Location> whole) 
    {
        ArrayList<ArrayList<Location>> broken = new ArrayList<ArrayList<Location>>();
        // Idea: to get x and y size, compute average of all houses, 
        // rather than just first and last
        int xSize = getAverageAvenue(whole);
        int ySize = getAverageStreet(whole);
        
        if (sections == 1)
            broken.add(whole);
        
        
        if (sections % 2 == 0) {
            
            ArrayList<Location> half1 = new ArrayList<>();
            ArrayList<Location> half2 = new ArrayList<>();
            ArrayList<Location> part1 = new ArrayList<>();;
            ArrayList<Location> part2 = new ArrayList<>();;
            ArrayList<Location> part3 = new ArrayList<>();;
            ArrayList<Location> part4 = new ArrayList<>();;

            if (sections >= 2) {            
                for (Location ele: whole) {
                    if (ele.getStreet() < ySize)
                        half1.add(ele);
                    else
                        half2.add(ele);                
                }
            }

            if (sections == 2) {
                broken.add(half1);
                broken.add(half2);
            }


            if (sections >= 4) {
                xSize = getAverageAvenue(half1);
                for (Location ele: half1) {
                    if (ele.getAvenue() < xSize)
                        part1.add(ele);
                    else
                        part2.add(ele);                
                }

                xSize = getAverageAvenue(half2);

                for (Location ele: half2) {
                    if (ele.getAvenue() < xSize)
                        part3.add(ele);
                    else
                        part4.add(ele);                
                }

                if (sections == 4) {
                    broken.add(part1);
                    broken.add(part2);
                    broken.add(part3);
                    broken.add(part4);
                }
            }

            if (sections == 8) {
                ArrayList<Location> s1 = new ArrayList<>();
                ArrayList<Location> s2 = new ArrayList<>();
                ArrayList<Location> s3 = new ArrayList<>();
                ArrayList<Location> s4 = new ArrayList<>();
                ArrayList<Location> s5 = new ArrayList<>();
                ArrayList<Location> s6 = new ArrayList<>();
                ArrayList<Location> s7 = new ArrayList<>();
                ArrayList<Location> s8 = new ArrayList<>();

                xSize = getAverageAvenue(part1);
                for (Location ele: part1) {
                    if (ele.getAvenue() < xSize)
                        s1.add(ele);
                    else
                        s2.add(ele);                
                }

                xSize = getAverageAvenue(part2);
                for (Location ele: part2) {
                    if (ele.getAvenue() < xSize)
                        s3.add(ele);
                    else
                        s4.add(ele);                
                }

                xSize = getAverageAvenue(part3);
                for (Location ele: part3) {
                    if (ele.getAvenue() < xSize)
                        s5.add(ele);
                    else
                        s6.add(ele);                
                }
                
                xSize = getAverageAvenue(part4);

                for (Location ele: part4) {
                    if (ele.getAvenue() < xSize)
                        s7.add(ele);
                    else
                        s8.add(ele);                
                }

                broken.add(s1);
                broken.add(s2);
                broken.add(s3);
                broken.add(s4);
                broken.add(s5);
                broken.add(s6);
                broken.add(s7);
                broken.add(s8);
            }
        }
        
        if (sections % 3 == 0) {
            ArrayList<Location> third1 = new ArrayList<Location>();
            ArrayList<Location> third2 = new ArrayList<Location>();
            ArrayList<Location> third3 = new ArrayList<Location>();
            
            ArrayList<Location> si1 = new ArrayList<Location>();
            ArrayList<Location> si2 = new ArrayList<Location>();
            ArrayList<Location> si3 = new ArrayList<Location>();
            ArrayList<Location> si4 = new ArrayList<Location>();
            ArrayList<Location> si5 = new ArrayList<Location>();
            ArrayList<Location> si6 = new ArrayList<Location>();
            
            if (sections >= 3) {
                for (Location ele : whole) {
                    if (ele.getStreet() < 83)
                        third1.add(ele);
                    
                    else if (ele.getStreet() > 83 && ele.getStreet() < 167)
                        third2.add(ele);
                    
                    else if (ele.getStreet() > 167)
                        third3.add(ele);
                }
            }
            
            if (sections == 3) {
                broken.add(third1);
                broken.add(third2);
                broken.add(third3);
            }
            
            if (sections == 6) {
                for (Location ele : third1) {
                    if (ele.getAvenue() < 22)
                        si1.add(ele);
                    else
                        si2.add(ele);
                }
                
                for (Location ele : third2) {
                    if (ele.getAvenue() < 22)
                        si3.add(ele);
                    else
                        si4.add(ele);
                }
                
                for (Location ele : third3)
                {
                    if (ele.getAvenue() < 22)
                        si5.add(ele);
                    else
                        si6.add(ele);
                }
                
                broken.add(si1);
                broken.add(si2);
                broken.add(si3);
                broken.add(si4);
                broken.add(si5);
                broken.add(si6);
            }
            
        }
        
        if (sections == 5) {
            ArrayList<Location> f1 = new ArrayList<Location>();
            ArrayList<Location> f2 = new ArrayList<Location>();
            ArrayList<Location> f3 = new ArrayList<Location>();
            ArrayList<Location> f4 = new ArrayList<Location>();
            ArrayList<Location> f5 = new ArrayList<Location>();
            
            for (Location ele : whole) {
                if (ele.getStreet() < 50)
                    f1.add(ele);
                else if (ele.getStreet() > 50 && ele.getStreet() < 100)
                    f2.add(ele);
                else if (ele.getStreet() > 100 && ele.getStreet() < 150)
                    f3.add(ele);
                else if (ele.getStreet() > 150 && ele.getStreet() < 200)
                    f4.add(ele);
                else if (ele.getStreet() > 200)
                    f5.add(ele);
            }
            
            broken.add(f1);
            broken.add(f2);
            broken.add(f3);
            broken.add(f4);
            broken.add(f5);
        }
        
        if (sections == 7)
        {
            ArrayList<Location> se1 = new ArrayList<Location>();
            ArrayList<Location> se2 = new ArrayList<Location>();
            ArrayList<Location> se3 = new ArrayList<Location>();
            ArrayList<Location> se4 = new ArrayList<Location>();
            ArrayList<Location> se5 = new ArrayList<Location>();
            ArrayList<Location> se6 = new ArrayList<Location>();
            ArrayList<Location> se7 = new ArrayList<Location>();
            
            for (Location ele : whole)
            {
                if (ele.getAvenue() < 7)
                    se1.add(ele);
                else if (ele.getAvenue() > 7 && ele.getAvenue() < 14)
                    se2.add(ele);
                else if (ele.getAvenue() > 14 && ele.getAvenue() < 21)
                    se3.add(ele);
                else if (ele.getAvenue() > 21 && ele.getAvenue() < 28)
                    se4.add(ele);
                else if (ele.getAvenue() > 28 && ele.getAvenue() < 35)
                    se5.add(ele);
                else if (ele.getAvenue() > 35 && ele.getAvenue() < 42)
                    se6.add(ele);
                else if (ele.getAvenue() > 42)
                    se7.add(ele);
            }
            
            broken.add (se1);
            broken.add (se2);
            broken.add (se3);
            broken.add (se4);
            broken.add (se5);
            broken.add (se6);
            broken.add (se7);
        }
        
        return broken;
    }
    
    public static int getAverageStreet(ArrayList<Location> whole) {
        double sum = 0;
        
        for (Location ele: whole) {
            sum += ele.getStreet();
        }
        
        return (int)sum / whole.size();
    }
    
    public static int getAverageAvenue(ArrayList<Location> whole) {
        double sum = 0;
        
        for (Location ele: whole) {
            sum += ele.getAvenue();
        }
        
        return (int)sum / whole.size();
    }
    
    public static boolean foundBart(ArrayList<Location> l) {
        for (Location ele: l) {
            if (ele.getStreet() == 2 && ele.getAvenue() == 3 && ele.getHouse() == 'E') {
                return true;
            }
        }
        return false;
    }
    
    
    
    public static boolean foundLisa(ArrayList<Location> l) {
        for (Location ele: l) {
            if (ele.getStreet() == 149 && ele.getAvenue() == 33 && ele.getHouse() == 'E') {
                return true;
            }
        }
        return false;
    }
    
    public static double getRouteDistance(ArrayList<Location> a) {
        double distance = 0;
        for (int i = 1; i < a.size(); i++) {
            
            distance += a.get(i).getdistance(a.get(i - 1));
        }
        return distance;
    }
    
    public static Location getNearestNeighbor(ArrayList<Location> in, Location loc, Location end) {
        double distance = Double.POSITIVE_INFINITY;
        Location nearest = loc;
        double temp;
        
        for (int i = 0; i < in.size(); i++) {
           
            
            temp = loc.getdistance(in.get(i)) / end.getdistance(in.get(i));
            if (temp <= distance && temp != 0) {
                distance = temp;
                nearest = in.get(i);
            }
        }
        return nearest;
    }
    
   
    
    
    public static ArrayList<Location> getPath(ArrayList<Location> in, Location start, Location end) {
        ArrayList<Location> out = new ArrayList<Location>(); // create empty path
        out.add(start); // add starting location to the path
        
        ArrayList<Location> inCopy = (ArrayList<Location>)in.clone(); // create copy of the houses
        while (inCopy.size() > 1) {
            // get nearest neighbor with remaining houses, the last location found, and the end location
            
            Location nearest = getNearestNeighbor(inCopy, out.get(out.size() - 1), end); 
            inCopy.remove(nearest);
            
            out.add(nearest);
        }
        out.add(end);
        out = optimizePath(out);
        return out;
    }
    
    public static ArrayList<Location> optimizePath(ArrayList<Location> path) {
        double bestDistance = getRouteDistance(path);
        for (int i = 0; i < path.size(); i++) {
            for (int j = 0; j < path.size(); j++) {
                //if (i != j) {
                    ArrayList<Location> temp = (ArrayList<Location>)path.clone();
                    Location eleI = temp.get(i);
                    Location eleJ = temp.get(j);
                    temp.remove(i);
                    temp.add(i, eleJ);
                    temp.remove(j);
                    temp.add(j, eleI);
                    double d = getRouteDistance(temp); 
                    if (d < bestDistance) {
                        path = temp;
                        bestDistance = d;
                    }
                //}
            }
        }
        
        return path;
    }
    
    public static int[] getClosest(ArrayList<Location> a, ArrayList<Location> b) {
        double distance = Double.POSITIVE_INFINITY;
        double temp = 0;
        int pos[] = new int[2];
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                temp = a.get(i).getdistance(b.get(j));
                if (temp < distance) {
                    distance = temp;
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }
        return pos;
    }
    
}