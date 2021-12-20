package com.company.command.structure;

public class Client {

    public static void main(String[] args) {
        Command[] commands = new Command[10];
        commands[0] = new CommandOne();
        commands[1] = new CommandOne();
        commands[2] = new CommandOne();
        commands[3] = new CommandOne();
        commands[4] = new CommandOne();
        commands[5] = new CommandTwo();
        commands[6] = new CommandTwo();
        commands[7] = new CommandTwo();
        commands[8] = new CommandTwo();
        commands[9] = new CommandTwo();

        int index = 0;

        while (true) {
            Command command = commands[((int) (Math.random() * 9))];
            if (Math.random()>0.5){
                command.execute();
            } else {
                command.undo();
            }
            index++;
            if (index == 200) break;
        }
    }
}
