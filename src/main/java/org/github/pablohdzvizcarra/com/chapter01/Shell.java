package org.github.pablohdzvizcarra.com.chapter01;

/**
 * The Shell is a program that takes keyboard commands and passes to the
 * operating system.
 */
public interface Shell {

    /**
     * Passed the command shared by argument to the operating systems, the operating
     * system has the responsibility to interpret these commands.
     * 
     * @param command the command to be executed in the operating system.
     */
    void acceptCommand(String command);

}
