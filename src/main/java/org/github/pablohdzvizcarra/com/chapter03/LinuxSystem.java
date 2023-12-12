package org.github.pablohdzvizcarra.com.chapter03;

import java.util.ArrayList;
import java.util.List;

/**
 * Accepts commands from a shell, and parse them into concrete actions.
 */
public class LinuxSystem {
    private static final int COMMAND_POSITION = 0;

    /**
     * Manage a PrintCommand, this method has the responsibility to interpret the
     * command shared by argument and execute this specific command.
     * 
     * @param command the command to be parsed and execute.
     */
    public void acceptPrintCommand(String command) {
        List<String> arguments = new ArrayList<>();
        List<String> options = new ArrayList<>();

        String[] tokens = command.split(" ");

        String cmd = tokens[COMMAND_POSITION];
        System.out.println("Executing the command: " + cmd);

        for (int i = 1; i < tokens.length; i++) {
            if (tokens[i].startsWith("-")) {
                options.add(tokens[i]);
            } else {
                arguments.add(tokens[i]);
            }
        }

        String commandProcessed = processOptionsInArguments(options, arguments);

        System.out.println(commandProcessed);
    }

    private String processOptionsInArguments(List<String> options, List<String> arguments) {
        String originalText = String.join(" ", arguments);
        String textTransformed = null;
        for (String option : options) {
            switch (option) {
                case "-u":
                    textTransformed = originalText.toUpperCase();
                    break;
                default:
                    break;
            }
        }
        return textTransformed;
    }
}
