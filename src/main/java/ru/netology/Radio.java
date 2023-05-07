package ru.netology;

public class Radio {
    int defaultNumber = 10;
    int minStationNumber = 0;
    int maxStationNumber = 9;
    int currentNumber;
    int currentVolume;
    int minVolume = 0;
    int maxVolume = 100;

    public Radio() {
    }

    public Radio(int defaultNumber) {
        this.defaultNumber = defaultNumber;
        this.maxStationNumber = defaultNumber - 1;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getDefaultNumber() {
        return defaultNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < 0) {
            return;
        }
        if (newCurrentNumber >= defaultNumber) {
            return;
        }
        this.currentNumber = newCurrentNumber;
    }

    public void setDefaultNumber(int newDefaultNumber) {
        if (newDefaultNumber < minStationNumber) {
            return;
        }
        if (newDefaultNumber > defaultNumber) {
            return;
        }
        if (newDefaultNumber != defaultNumber) {
            return;
        }
        this.defaultNumber = newDefaultNumber;
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
            currentNumber = maxStationNumber;
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

