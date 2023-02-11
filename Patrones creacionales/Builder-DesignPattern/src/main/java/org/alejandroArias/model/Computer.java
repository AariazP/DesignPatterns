package org.alejandroArias.model;

public class Computer {

    private String brand;
    private String model;
    private String color;
    private String serialNumber;
    private String processor;
    private String ram;
    private String hardDrive;
    private String operatingSystem;
    private String screen;
    private String keyboard;

    public Computer(){}

    /**
     * Este es el constructor de la clase Computer, pero es demasiado largo y tedioso
     * cuando se tiene que crear un objeto de esta clase se debe pasar todos los parametros hacer los setters
     * y luego hacer el get para poder usar el objeto
     * cosa que es ilegible y tediosa
     */

    /*public Computer(String brand, String model, String color, String serialNumber, String processor, String ram, String hardDrive, String operatingSystem, String screen, String keyboard) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.operatingSystem = operatingSystem;
        this.screen = screen;
        this.keyboard = keyboard;
    }*/

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    /**
     * Esta clase es un builder que nos permite crear objetos de la clase Computer
     */


    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", screen='" + screen + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
