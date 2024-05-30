package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test // Пользователь не устанавливает количество станций.
    public void setNullQuantityStations() {
        Radio radio = new Radio();
        Assertions.assertEquals(9, radio.getMaxStationStation());
    }

    @Test // Пользователь устанавливает количество станций.
    public void setCurrentQuantityStations() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(29, radio.getMaxStationStation());
    }

    @Test  // Пользователь устанавливает отрицательный номер станции.
    public void lessThanAcceptableStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test  // Пользователь устанавливает нулевой номер станции.
    public void nullValueStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь устанавливает допустимый номер станции.
    public void acceptableStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test   // Пользователь устанавливает граничный к максимально допустимому номер станции.
    public void beforeMaximumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь устанавливает максимально допустимый номер станции.
    public void MaximumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь устанавливает больше, чем максимально допустимый номер станции.
    public void moreThanMaximumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь устанавливает нулевой уровень громкости.
    public void nullValueVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь устанавливает отрицательный уровень громкости.
    public void lessThanAcceptableVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь устанавливает допустимый уровень громкости.
    public void acceptableVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь устанавливает уровень громкости граничный с максимально допустимым.
    public void beforeMaximumVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь устанавливает максимально допустимый уровень громкости.
    public void MaximumVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь устанавливает больше, чем максимально допустимый уровень громкости.
    public void moreThanMaximumVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(110);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test  // Пользователь переключает на 1 станцию вперёд начиная с нулевой.
    public void nullNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает на 1 станцию вперёд начиная с граничной максимальной станции.
    public void acceptableNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает на 1 станцию вперёд начиная с максимальной станции.
    public void maximumAcceptableNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает на 1 станцию назад начиная с нулевой станции.
    public void minimumAcceptablePrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает на 1 станцию назад начиная с первой станции.
    public void nullPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает на 1 станцию назад начиная с максимальной станции.
    public void acceptablePrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает громкость вперёд начиная с нулевой громкости.
    public void nullVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает громкость вперёд начиная с граничной максимально допустимой громкости.
    public void acceptableNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.nextVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает громкость вперёд начиная с максимально допустимой громкости.
    public void maximumAcceptableNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает громкость назад начиная с нулевой громкости.
    public void minimumAcceptablePrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает громкость назад начиная с первой громкости.
    public void nullPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.prevVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test // Пользователь переключает громкость назад начиная с максимально допустимой громкости.
    public void acceptablePrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.prevVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}