package com.hz;

import javax.smartcardio.Card;

public class HighSchoolCard extends AbstractCard {
    public HighSchoolCard(Printer printer) {
        super(printer);
    }

    @Override
    public void printHeader() {
        String header = "";
        header = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(header);

    }

    @Override
    public void printMessage() {
        String msg = "";
        msg = "This calls for celebrating! Congratulations!";
        this.printer.printLine(msg);

    }

    @Override
    public void printImage() {
                    this.printer.printLine("     ,_");
            this.printer.printLine("| `\"\"---..._____");
            this.printer.printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
            this.printer.printLine("       \\   ```` ``\"---...__  |");
            this.printer.printLine("       |`              |   ``!");
            this.printer.printLine("       |               |     A");
            this.printer.printLine("       |               /\\   /#\\");
            this.printer.printLine("       /`--..______..-'  |  ###");
            this.printer.printLine("      |   /  `\\    /`--. |  ###");
            this.printer.printLine("     _|  |  .-;`-./;-.  ||  ###");
            this.printer.printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
            this.printer.printLine("    |  `-' \\__/ _  \\__/ |  |`#");
            this.printer.printLine("   \\_,                 /_/");
            this.printer.printLine("       `\\              /");
            this.printer.printLine("         '.  '.__.'  .'");
            this.printer.printLine(" jgs      `-,____,-'");
            this.printer.printLine("           /\"\"\"I\"\"\\");
            this.printer.printLine("           /`---'--'\\");
    }

    @Override
    public void printFooter() {
        String footer = "";
        footer = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(footer);

    }
}
