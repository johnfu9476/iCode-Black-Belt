import java.util.Random;

public class PlayQueueGame {
    public static void main(String[] args) {
        Queue playQueue = new Queue(5);

        for (int i = 1; i <= 8; i++) {
            joinGameQueue(playQueue, "Child" + i);
        }

        playGame(playQueue);
    }

    private static void joinGameQueue(Queue playQueue, String child) {
        if (!playQueue.isFull(playQueue)) {
            playQueue.enqueue(child);
            System.out.println(child + " joined the game queue.");
        } else {
            System.out.println(child + " is waiting as the game queue is full.");
        }
    }

    private static void playGame(Queue playQueue) {
        while (!playQueue.isEmpty(playQueue)) {
            String currentPlayer = playQueue.dequeue();
            System.out.println(currentPlayer + " is playing the game.");

            // Simulate playing time
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(currentPlayer + " finished playing and leaves.");
        }

        System.out.println("Game queue is empty. All children played the game.");
    }
}
