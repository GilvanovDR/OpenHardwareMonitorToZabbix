/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.model;

public enum Type {
    VALUE,
    COMPUTER,
    MATHERBOARD,
    CHIP,
    VOLTAGE,
    TEMPERATURES,
    FAN,
    CONTROL,
    CPU,
    CLOCK,
    LOAD,
    POWER,
    RAM,
    HDD,
    ROOT;


    public static Type getType(String type) {
        switch (type) {
            case "images/transparent.png":
                return VALUE;
            case "images_icon/computer.png":
                return COMPUTER;
            case "images_icon/mainboard.png":
                return MATHERBOARD;
            case "images_icon/chip.png":
                return CHIP;
            case "images_icon/voltage.png":
                return VOLTAGE;
            case "images_icon/temperature.png":
                return TEMPERATURES;
            case "images_icon/fan.png":
                return FAN;
            case "images_icon/control.png":
                return CONTROL;
            case "images_icon/cpu.png":
                return CPU;
            case "images_icon/clock.png":
                return CLOCK;
            case "images_icon/load.png":
                return LOAD;
            case "images_icon/power.png":
                return POWER;
            case "images_icon/ram.png":
                return RAM;
            case "images_icon/hdd.png":
                return HDD;
        }
        return ROOT;
    }
}
