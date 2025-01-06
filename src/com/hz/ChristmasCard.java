package com.hz;

public class ChristmasCard extends AbstractCard{
    public ChristmasCard(Printer printer) {
        super(printer);
    }

    @Override
    public void printHeader() {
        this.printer.printLine("--@--#--&----------------------&--#--@--");

    }

    @Override
    public void printMessage() {
        this.printer.printLine("Het is kerst, hier heb je een aantal kerstboompjes:");

    }

    @Override
    public void printImage() {
        this.printer.printLine("🎄🎄🎄");

    }

    @Override
    public void printFooter() {
        this.printer.printLine("--@--#--&----------------------&--#--@--");

    }
}
