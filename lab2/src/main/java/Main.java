import org.omg.CORBA.UNKNOWN;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name of planet. There is information about the following planets:");
        System.out.println("1. Earth");
        System.out.println("2. Mercury");
        System.out.println("3. Venus");
        int i = scan.nextInt();
        Planets planet;
        switch (i) {
            case 1:
                planet = Planets.EARTH;
                break;
            case 2:
                planet = Planets.MERCURY;
                break;
            case 3:
                planet = Planets.VENUS;
                break;
            default:
                planet = null;
                break;
        }
        if (planet != null) {
            System.out.println("Name = " + planet.getName() + ", area = " + planet.getArea() + ", diameter = " + planet.getDiameter() + ", satellites = " + planet.getSatellites() + '.');
        }
        else {
            System.out.println("Unknown planet");
        }
    }
    enum Planets {
        EARTH("Earth", 510072000, 12753, 1),
        MERCURY("Mercury", 74797000, 2439, 0),
        VENUS("Venus", 460234317, 12104, 0);
        private int area;

        public int getArea() {
            return area;
        }

        private int diameter;

        public int getDiameter() {
            return diameter;
        }

        private int satellites;

        public int getSatellites() {
            return satellites;
        }

        private String name;
        public String getName() {
            return name;
        }
        Planets(String _name, int _area, int _diameter, int _satellites) {
            name = _name;
            area = _area;
            diameter = _diameter;
            satellites = _satellites;
        }
    }
}
