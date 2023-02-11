package org.alejandroArias.model;

public class ComputerBuilder {

    //este tipo de patrón se basa en la programación fluida
    /*
     * donde se crea un objeto y se opera
     * sobre el mismo objeto en lugar de crear un objeto
     * y luego operar usando setters
     * ej:
     *          obj
     *          .setA(1)
     *          .setB(2)
     *          .setC(3)
     *          .setD(4)
     *          .setE(5);
     * por este motivo se usa el return this
     * para que el objeto se retorne asi mismo
     */
    private Computer computer;  //este es el objeto que se va a retornar
                                //y que se va a operar en el main

    public ComputerBuilder(){
        computer = new Computer();
    }  //este es el constructor de la clase ComputerBuilder
                                                            //que va a retornar un objeto de tipo ComputerBuilder

    //Estos métodos es como si fuesen setters, pero con la diferencia
    //de que retornan el objeto mismo
    public ComputerBuilder color(String color){
        computer.setColor(color);
        return this;
    }

    public ComputerBuilder serialNumber(String serialNumber){
        computer.setSerialNumber(serialNumber);
        return this;
    }

    public ComputerBuilder processor(String processor){
        computer.setProcessor(processor);
        return this;
    }

    public ComputerBuilder ram(String ram){
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder hardDrive(String hardDrive){
        computer.setHardDrive(hardDrive);
        return this;
    }

    public ComputerBuilder operatingSystem(String operatingSystem){
        computer.setOperatingSystem(operatingSystem);
        return this;
    }

    public ComputerBuilder screen(String screen){
        computer.setScreen(screen);
        return this;
    }

    public ComputerBuilder keyboard(String keyboard){
        computer.setKeyboard(keyboard);
        return this;
    }

    /**
     * Este método es el que crea el objeto, es el que se llama al final
     * de la cadena de métodos. Y es el que retorna el objeto del tipo Computer
     * @return Computer computer
     */

    public Computer build(){return computer;}

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
