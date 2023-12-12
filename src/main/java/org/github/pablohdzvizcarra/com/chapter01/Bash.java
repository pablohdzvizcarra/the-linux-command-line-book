package org.github.pablohdzvizcarra.com.chapter01;

import org.github.pablohdzvizcarra.com.chapter03.LinuxSystem;

/**
 * Bash is a shell program, it is a implementation of a shell to interact with
 * the operating system
 */
public class Bash implements Shell {
    private LinuxSystem linuxSystem;

    public void setLinuxSystem(LinuxSystem linuxSystem) {
        this.linuxSystem = linuxSystem;
    }

    @Override
    public void acceptCommand(String command) {
        linuxSystem.acceptPrintCommand(command);
    }

}
