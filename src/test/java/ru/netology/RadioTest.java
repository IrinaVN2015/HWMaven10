package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentNumberMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNumberAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10);
        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNumberMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNumberBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentNumberMiddle() {
        Radio radio = new Radio();
        radio.setCurrentNumber(5);
        int expected = 5;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseNumberByOne() {
        Radio radio = new Radio();
        radio.setCurrentNumber(1);
        radio.nextIncreaseNumber();
        int expected = 2;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNumberAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.nextIncreaseNumber();
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseNumberByOne() {
        Radio radio = new Radio();
        radio.setCurrentNumber(7);
        radio.prevDecreaseNumber();
        int expected = 6;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNumberAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.prevDecreaseNumber();
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeMiddle() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldHigherVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.higherVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeVolumeAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.higherVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldBelowVolumeByOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.belowVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeVolumeAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.belowVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}