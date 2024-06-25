import java.util.Random;

class RandomNumberGenerator implements Runnable {
    private Random random = new Random();
    private volatile boolean isRunning = true;

    public void stop() {
        isRunning = false;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        long duration = 0;
        
        while (duration < 5000 && isRunning) { // Run for 5 seconds
            int number = random.nextInt(100); // Generate a random number between 0 and 99
            System.out.println("Main Thread Generates Random Integer: " + number);

            if (number % 2 == 0) {
                new Thread(new SquareCalculator(number)).start(); // Create and start a thread to calculate square
            } else {
                new Thread(new CubeCalculator(number)).start(); // Create and start a thread to calculate cube
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            duration = System.currentTimeMillis() - startTime; // Calculate elapsed time
        }

        stop(); // Ensure that the program stops after the desired duration
    }
}

class SquareCalculator implements Runnable {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = number * number;
        System.out.println("New Thread " + number + " is EVEN and Square of " + number + " is: " + square);
    }
}

class CubeCalculator implements Runnable {
    private int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("New Thread " + number + " is ODD and Cube of " + number + " is: " + cube);
    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        Thread generatorThread = new Thread(generator);
        generatorThread.start();

        try {
            Thread.sleep(7000); // Sleep for 7 seconds
            generator.stop(); // Signal the generator thread to stop
            generatorThread.join(); // Wait for the generator thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
