package com.app.arkan.xo_game;

import java.util.Date;

public class Players {
    private Date date;
    private String firstPlayer_name,secondPlayer_name;
    private int firstPlayer_wins,firstPlayer_losses,secondPlayer_wins,secondPlayer_losses;

    Players(Date date, String firstPlayer_name, String secondPlayer_name, int firstPlayer_wins, int firstPlayer_losses, int secondPlayer_wins,
            int secondPlayer_losses){
        this.date=date;
        this.firstPlayer_name=firstPlayer_name;
        this.firstPlayer_wins=firstPlayer_wins;
        this.firstPlayer_losses=firstPlayer_losses;
        this.secondPlayer_name=secondPlayer_name;
        this.secondPlayer_wins=secondPlayer_wins;
        this.secondPlayer_losses=secondPlayer_losses;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFirstPlayer_name() {
        return firstPlayer_name;
    }

    public void setFirstPlayer_name(String firstPlayer_name) {
        this.firstPlayer_name = firstPlayer_name;
    }

    public String getSecondPlayer_name() {
        return secondPlayer_name;
    }

    public void setSecondPlayer_name(String secondPlayer_name) {
        this.secondPlayer_name = secondPlayer_name;
    }

    public int getFirstPlayer_wins() {
        return firstPlayer_wins;
    }

    public void setFirstPlayer_wins(int firstPlayer_wins) {
        this.firstPlayer_wins = firstPlayer_wins;
    }

    public int getFirstPlayer_losses() {
        return firstPlayer_losses;
    }

    public void setFirstPlayer_losses(int firstPlayer_losses) {
        this.firstPlayer_losses = firstPlayer_losses;
    }

    public int getSecondPlayer_wins() {
        return secondPlayer_wins;
    }

    public void setSecondPlayer_wins(int secondPlayer_wins) {
        this.secondPlayer_wins = secondPlayer_wins;
    }

    public int getSecondPlayer_losses() {
        return secondPlayer_losses;
    }

    public void setSecondPlayer_losses(int secondPlayer_losses) {
        this.secondPlayer_losses = secondPlayer_losses;
    }
}
