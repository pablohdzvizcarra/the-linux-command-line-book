package org.github.pablohdzvizcarra.com.chapter03;

import java.util.List;

public class StringPrintCommand {
    private List<String> arguments;
    private List<String> options;

    public StringPrintCommand(List<String> arguments, List<String> options) {
        this.arguments = arguments;
        this.options = options;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public List<String> getOptions() {
        return options;
    }

}
