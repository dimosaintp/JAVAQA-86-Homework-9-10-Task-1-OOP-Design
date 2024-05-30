package ru.netology;

public class Radio {

    private int minStation;
    private int maxStation;
    private int minVolume;
    private int maxVolume;
    private int currentVolume = minVolume;
    private int currentStation = minStation;

    // Конструкторы.

    public Radio(int quantity) {
        this.maxStation = quantity - 1;
    }

    public Radio() {
        this.minStation = 0;
        this.maxStation = 9;
        this.minVolume = 0;
        this.maxVolume = 100;
    }

    // Методы.

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void nextVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void prevVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    // Геттеры и сеттеры.

    public int getMaxStationStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}