package uap.mains;

import java.util.Scanner;
import uap.models.Torus;
import uap.models.Sphere;


public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Dewi Lestari Tampubolon");
        System.out.println("245150707111015");
        System.out.println("=============================================");
        
        // Input dan perhitungan untuk Torus (Donat dengan lubang)
        System.out.print("Isikan Major Radius : ");
        double majorRadius = scanner.nextDouble();
        System.out.print("Isikan Minor Radius : ");
        double minorRadius = scanner.nextDouble();
        
        Torus torus = new Torus(majorRadius, minorRadius);
        torus.printInfo();
        
        // Input dan perhitungan untuk Sphere (Donat tanpa lubang)
        System.out.print("Isikan radius : ");
        double radius = scanner.nextDouble();
        
        Sphere sphere = new Sphere(radius);
        sphere.printInfo();
        
    }
}