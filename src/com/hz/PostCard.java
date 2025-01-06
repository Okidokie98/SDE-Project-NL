package com.hz;

public class PostCard extends AbstractCard {
    public PostCard(Printer printer) {
        super(printer);
    }

    @Override
    public void printHeader() {
        String header = "";
        header = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        this.printer.printLine(header);
    }

    @Override
    public void printMessage() {
        String msg = "";
        msg = "Greetings from the netherlands!";
        this.printer.printLine(msg);
    }

    @Override
    public void printImage() {
         this.printer.printLine("        Art by Hayley Jane Wakenshaw");
         this.printer.printLine("");
         this.printer.printLine("             /)  (\\");
         this.printer.printLine("        .-._((,~~.))_.-,");
         this.printer.printLine("         `=.   99   ,='");
         this.printer.printLine("           / ,o~~o. \\");
         this.printer.printLine("          { { .__. } }");
         this.printer.printLine("           ) `~~~\' (");
         this.printer.printLine("          /`-._  _\\.-\\");
         this.printer.printLine("         /         )  \\");
         this.printer.printLine("       ,-X        #   X-.");
         this.printer.printLine("      /   \\          /   \\");
         this.printer.printLine("     (     )| |  | |(     )");
         this.printer.printLine("      \\   / | |  | | \\   /");
         this.printer.printLine("       \\_(.-( )--( )-.)_/");
         this.printer.printLine("       /_,\\ ) /  \\ ( /._\\");
         this.printer.printLine("           /_,\\  /._\\");

    }

    @Override
    public void printFooter() {
        String footer = "";
        footer = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        this.printer.printLine(footer);
    }
}
