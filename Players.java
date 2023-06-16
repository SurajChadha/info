// Task: Write a java program to create a Players Pojo class with id,name, score and have AOB to have collection of 10 players implement Operaration: search, modify, iterate of objects

// show players with score higher then 102 runs

// Hint: AOB, POJO Debug Table

import java.util.ArrayList;

public class Players {
    private int id;
    private String name;
    private int score;

    public Players(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        ArrayList<Players> playersList = new ArrayList<Players>();

        // Add 10 players to the list
        playersList.add(new Players(1, "Player 1", 100));
        playersList.add(new Players(2, "Player 2", 150));
        playersList.add(new Players(3, "Player 3", 120));
        playersList.add(new Players(4, "Player 4", 90));
        playersList.add(new Players(5, "Player 5", 110));
        playersList.add(new Players(6, "Player 6", 140));
        playersList.add(new Players(7, "Player 7", 130));
        playersList.add(new Players(8, "Player 8", 160));
        playersList.add(new Players(9, "Player 9", 170));
        playersList.add(new Players(10, "Player 10", 105));

        // Search for a player by id
        int searchId = 3;
        for (Players player : playersList) {
            if (player.getId() == searchId) {
                System.out.println("Player found: " + player.getName());
            }
        }

        // Modify a player's score
        int modifyId = 5;
        for (Players player : playersList) {
            if (player.getId() == modifyId) {
                player.setScore(200);
                System.out.println("Player score modified: " + player.getName() + " - " + player.getScore());
            }
        }

        // Iterate through all players and print their name and score
        for (Players player : playersList) {
            System.out.println("Player: " + player.getName() + " - " + player.getScore());
        }

        // iterate and print the players with score higher than 102 runs
        for (Players player : playersList) {
            if (player.getScore() > 102) {
                System.out.println(
                        "Player with score higher than 102 runs: " + player.getName() + " - " + player.getScore());
            }
        }
    }
}
