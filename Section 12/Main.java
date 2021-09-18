/*
    Only add/edit code where it is stated in the description.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private Map<String, String> vocabulary = new HashMap<String, String>();
    
    public Main() {
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));
        
        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
    }
    
    public void command() {
        // write code here
        Scanner scanner = new Scanner(System.in);
        this.vocabulary.put("NORTH", "N");
        this.vocabulary.put("EAST", "E");
        this.vocabulary.put("SOUTH", "S");
        this.vocabulary.put("WEST", "W");
        this.vocabulary.put("QUIT", "Q");
        int location = 1;
        String direction = "";
        while (true) {
            System.out.println(this.locations.get(location).getDescription());
            if (location == 0) {
                break;
            }
            System.out.print("Available exits are ");
            System.out.println(this.locations.get(location).getExits().keySet());
            for (String exit : this.locations.get(location).getExits().keySet()) {
                System.out.print(exit + ", ");
            }
            for (String word : scanner.nextLine().toUpperCase().split(" ")) {
                if (this.vocabulary.containsKey(word)) {
                    direction = vocabulary.get(word);
                    break;
                }
            }
            if (this.locations.get(location).getExits().containsKey(direction)) {
                location = this.locations.get(location).getExits().get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
        scanner.close();
    }
}
