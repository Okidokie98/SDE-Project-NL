package com.hz;

abstract class AbstractCard {

    protected Printer printer;

    public AbstractCard(Printer printer) {
        this.printer = printer;
    }

    public void print() {

        this.printHeader();
        this.printMessage();
        this.printImage();
        this.printFooter();
    }

    protected abstract void printHeader();
    protected abstract void printMessage();
    protected abstract void printImage();
    protected abstract void printFooter();

}
