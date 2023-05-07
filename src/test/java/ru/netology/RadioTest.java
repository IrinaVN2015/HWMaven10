package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio1 = new Radio(15);

    @Test
    public void shouldSetCurrentNumberMax() {

        radio.setCurrentNumber(9);
        Assertions.assertEquals(9, radio.getCurrentNumber());
    }

    @Test
    public void shouldSetCurrentNumberMaxRadio1() {

        radio1.setCurrentNumber(14);
        Assertions.assertEquals(14, radio1.getCurrentNumber());
    }

    @Test
    public void shouldSetCurrentNumberAboveMax() {

        radio.setCurrentNumber(10);
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    public void shouldSetCurrentNumberAboveMaxRadio1() {

        radio1.setCurrentNumber(15);
        Assertions.assertEquals(0, radio1.getCurrentNumber());
    }

    @Test
    public void shouldSetCurrentNumberMin() {

        radio.setCurrentNumber(0);
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    public void shouldSetCurrentNumberMinRadio1() {

        radio1.setCurrentNumber(0);
        Assertions.assertEquals(0, radio1.getCurrentNumber());
    }

    @Test
    public void shouldSetCurrentNumberBelowMin() {

        radio.setCurrentNumber(-1);
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    public void shouldSetCurrentNumberBelowMinRadio1() {

        radio1.setCurrentNumber(-1);
        Assertions.assertEquals(0, radio1.getCurrentNumber());
    }

    @Test
    public void shouldSetCurrentNumberMiddle() {

        radio.setCurrentNumber(5);
        Assertions.assertEquals(5, radio.getCurrentNumber());
    }

    @Test
    public void shouldSetCurrentNumberMiddleRadio1() {

        radio1.setCurrentNumber(7);
        Assertions.assertEquals(7, radio1.getCurrentNumber());
    }

    @Test
    public void shouldSetDefaultNumberBelowMinRadio1() {

        radio1.setDefaultNumber(-1);
        Assertions.assertEquals(0, radio1.getCurrentNumber());
    }

    @Test
    public void shouldSetDefaultNumberAboveMaxRadio1() {

        radio1.setDefaultNumber(17);
        Assertions.assertEquals(15, radio1.getDefaultNumber());
    }

    @Test
    public void shouldSetDefaultNumberMiddleRadio1() {

        radio1.setDefaultNumber(7);
        Assertions.assertEquals(15, radio1.getDefaultNumber());
    }

    @Test
    public void shouldSetDefaultNumberEqualDefaultNumberRadio1() {

        radio1.setDefaultNumber(15);
        Assertions.assertEquals(15, radio1.getDefaultNumber());
    }


    @Test
    public void shouldIncreaseNumberByOne() {

        radio.setCurrentNumber(1);
        radio.nextIncreaseNumber();
        Assertions.assertEquals(2, radio.getCurrentNumber());
    }

    @Test
    public void shouldIncreaseNumberByOneRadio1() {

        radio1.setCurrentNumber(7);
        radio1.nextIncreaseNumber();
        Assertions.assertEquals(8, radio1.getCurrentNumber());
    }

    @Test
    public void shouldIncreaseNumberAfterMax() {

        radio.setCurrentNumber(9);
        radio.nextIncreaseNumber();
        Assertions.assertEquals(0, radio.getCurrentNumber());
    }

    @Test
    public void shouldIncreaseNumberAfterMaxRadio1() {

        radio1.setCurrentNumber(14);
        radio1.nextIncreaseNumber();
        Assertions.assertEquals(0, radio1.getCurrentNumber());
    }

    @Test
    public void shouldDecreaseNumberByOne() {

        radio.setCurrentNumber(7);
        radio.prevDecreaseNumber();
        Assertions.assertEquals(6, radio.getCurrentNumber());
    }

    @Test
    public void shouldDecreaseNumberByOneRadio1() {

        radio1.setCurrentNumber(14);
        radio1.prevDecreaseNumber();
        Assertions.assertEquals(13, radio1.getCurrentNumber());
    }

    @Test
    public void shouldDecreaseNumberAfterMin() {

        radio.setCurrentNumber(0);
        radio.prevDecreaseNumber();
        Assertions.assertEquals(9, radio.getCurrentNumber());
    }

    @Test
    public void shouldDecreaseNumberAfterMinRadio1() {

        radio1.setCurrentNumber(0);
        radio1.prevDecreaseNumber();
        Assertions.assertEquals(14, radio1.getCurrentNumber());
    }


    @Test
    public void shouldSetCurrentVolumeMax() {

        radio.setCurrentVolume(100);
        radio1.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
        Assertions.assertEquals(100, radio1.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeAboveMax() {

        radio.setCurrentVolume(101);
        radio1.setCurrentVolume(101);

        Assertions.assertEquals(0, radio1.getCurrentVolume());
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMin() {

        radio.setCurrentVolume(0);
        radio1.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
        Assertions.assertEquals(0, radio1.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeBelowMin() {

        radio.setCurrentVolume(-1);
        radio1.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());
        Assertions.assertEquals(0, radio1.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMiddle() {

        radio.setCurrentVolume(50);
        radio1.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());
        Assertions.assertEquals(50, radio1.getCurrentVolume());
    }


    @Test
    public void shouldHigherVolumeByOne() {

        radio.setCurrentVolume(5);
        radio.higherVolume();
        radio1.setCurrentVolume(5);
        radio1.higherVolume();
        Assertions.assertEquals(6, radio.getCurrentVolume());
        Assertions.assertEquals(6, radio1.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeVolumeAfterMax() {

        radio.setCurrentVolume(100);
        radio.higherVolume();
        radio1.setCurrentVolume(100);
        radio1.higherVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
        Assertions.assertEquals(100, radio1.getCurrentVolume());
    }


    @Test
    public void shouldBelowVolumeByOne() {

        radio.setCurrentVolume(50);
        radio.belowVolume();
        radio1.setCurrentVolume(50);
        radio1.belowVolume();
        Assertions.assertEquals(49, radio.getCurrentVolume());
        Assertions.assertEquals(49, radio1.getCurrentVolume());
    }

    @Test
    public void shouldNotChangeVolumeAfterMin() {

        radio.setCurrentVolume(0);
        radio.belowVolume();
        radio1.setCurrentVolume(0);
        radio1.belowVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
        Assertions.assertEquals(0, radio1.getCurrentVolume());
    }
}