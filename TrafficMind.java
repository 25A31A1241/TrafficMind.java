import java.util.Scanner;

public class TrafficMind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] roads = {
            "Road A", "Road B", "Road C", "Road D"
        };

        int[] vehicles = new int[4];

        System.out.println("=== SMART TRAFFIC ANALYZER ===");

        for (int i = 0; i < roads.length; i++) {
            System.out.print("Enter vehicles on "
                    + roads[i] + ": ");
            vehicles[i] = sc.nextInt();
        }

        int max = vehicles[0];
        int busiest = 0;

        System.out.println("\n--- TRAFFIC REPORT ---");

        for (int i = 0; i < roads.length; i++) {
            System.out.println(roads[i] + ": "
                    + vehicles[i] + " vehicles");

            if (vehicles[i] > max) {
                max = vehicles[i];
                busiest = i;
            }
        }

        System.out.println("\nHighest Traffic: "
                + roads[busiest]);

        if (max >= 100)
            System.out.println("Status: Heavy Traffic");
        else if (max >= 50)
            System.out.println("Status: Moderate Traffic");
        else
            System.out.println("Status: Low Traffic");

        sc.close();
    }
}
