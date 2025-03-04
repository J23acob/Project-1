import java.util.Random;

public class Game {
    private Random random;

    public Game() {
        this.random = new Random();
    }

    // Simulate one round of Monty Hall:
    // - Place the car randomly behind 1 of 3 doors.
    // - Contestant picks a door at random.
    // - Host reveals a different door with a goat.
    // - Contestant either switches or stays.
    // Returns true if contestant wins the car.
    public boolean playGame(boolean switchDoor) {
        // 1) Setup & randomly place the car
        door[] doors = {new door("Door 1"), new door("Door 2"), new door("Door 3")};
        int carDoor = random.nextInt(3);
        doors[carDoor].setCar();

        // 2) Contestant chooses a door randomly
        int chosenDoor = random.nextInt(3);

        // 3) Host reveals a goat (not the chosen door & not the car door)
        int revealedDoor;
        do {
            revealedDoor = random.nextInt(3);
        } while (revealedDoor == chosenDoor || doors[revealedDoor].hasCar());

        // 4) If switchDoor == true, contestant switches to the other unopened door
        if (switchDoor) {
            for (int i = 0; i < 3; i++) {
                if (i != chosenDoor && i != revealedDoor) {
                    chosenDoor = i;
                    break;
                }
            }
        }

        // 5) Return whether the final chosen door contains the car
        return doors[chosenDoor].hasCar();
    }
}
