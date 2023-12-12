package org.github.pablohdzvizcarra.com.chapter01;

import org.github.pablohdzvizcarra.com.chapter03.LinuxSystem;
import org.junit.jupiter.api.Test;

class ITermTest {

    @Test
    void shouldPrintStringInUppercaseUsingCommand() {
        LinuxSystem linux = new LinuxSystem();
        Bash bashShell = new Bash();
        bashShell.setLinuxSystem(linux);
        ITerm iTerm = new ITerm(bashShell);

        String command = "printstr -u hello world";
        iTerm.shellPrompt(command);
    }
}
