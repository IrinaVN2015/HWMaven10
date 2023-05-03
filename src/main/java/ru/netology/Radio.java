package ru.netology;

public class Radio {
    int currentNumber;
    int minStationNumber = 0;
    int maxStationNumber = 9;
    int currentVolume;
    int minVolume = 0;
    int maxVolume = 100;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber > 9) {
            return;
        }
        this.currentNumber = newCurrentNumber;
    }

    public void nextIncreaseNumber() {
        if (currentNumber < maxStationNumber) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = 0;
        }
    }

    public void prevDecreaseNumber() {
        if (currentNumber > minStationNumber) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = 9;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void higherVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void belowVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}

