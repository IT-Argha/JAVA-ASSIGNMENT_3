//Q : 6
// AUTHOR: Argha Digar
// TITLE: Sports Simulation Program
// DESCRIPTION: This Java program defines an interface Playable with a method play() that is implemented by three classes (Football, Volleyball, and Basketball). Each class overrides the play() method to simulate playing the respective sport.


// Define the Playable interface
interface Playable {
    void play();
}

// Implement the Playable interface 
class Football implements Playable {
   
    public void play() {
        System.out.println("Playing Football");
    }
}

// Implement Playable interface 
class Volleyball implements Playable {

    public void play() {
        System.out.println("Playing Volleyball");
    }
}

// Implement the Playable interface 
class Basketball implements Playable {

    public void play() {
        System.out.println("Playing Basketball");
    }
}

public class Main {
    public static void main(String[] args) {
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Play the respective sports
        football.play();
        volleyball.play();
        basketball.play();
    }
}
