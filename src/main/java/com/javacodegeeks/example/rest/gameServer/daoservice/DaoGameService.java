package com.javacodegeeks.example.rest.gameServer.daoservice;

import com.javacodegeeks.example.rest.gameServer.model.Game;

import java.util.List;

public interface DaoGameService {
    void recordScore(Game game);
    void retrieveScores();
    void retrievePlayerScores(String playerName);
    List<Game> getAllGames();
    String getBestPlayer();
    int getBestScore();
    int getPlayerBestScore();
    int getPlayerAttemptsNumber();
    Long deleteByName(String name);
}
