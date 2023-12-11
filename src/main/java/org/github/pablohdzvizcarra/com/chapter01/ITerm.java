package org.github.pablohdzvizcarra.com.chapter01;

/**
 * iTerm is a terminal program to interact with a shell.
 */
public class ITerm implements TerminalProgram {
    private Shell shell;

    public ITerm(Shell shell) {
        this.shell = shell;
    }

    /**
     * Accepts input for the user (commands) to execute in a shell program.
     * 
     * @param command the command to be executed in the shell.
     */
    public void shellPrompt(String command) {
        shell.acceptCommand(command);
    }
}
