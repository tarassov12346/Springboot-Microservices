package com.javacodegeeks.example.rest.gameServer.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;

@Component
@Data
@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "name")
    private String playerName;

    public Long getId() {
        return id;
    }


    @Column(name = "score")
    private int playerScore;

    public Game() {
    }

    private Game(String playerName, int playerScore) {
        this.playerName = playerName;
        this.playerScore = playerScore;
    }

    public Game buildGame(String playerName, int playerScore){
        return new Game(playerName, playerScore);
    }


    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int collapsedLayersCount) {
        this.playerScore = collapsedLayersCount * 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game player = (Game) o;
        return Objects.equals(getPlayerName(), player.getPlayerName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlayerName());
    }
}
