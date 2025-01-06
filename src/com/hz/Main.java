package com.hz;

public class Main {

    // READ THE INSTRUCTIONS IN THIS METHOD, PLEASE!!!
    public static void main(String[] args) {

        // Lets print some cards
        Printer printer = new Console();

        // INSTRUCTIONS, READ CAREFULLY !!!!!!!!!!!!!!!!!!!!!!!!!!
        // For a normal postcard use: true, false
        // For a graduation card use: false, true


        // ONLY SET ONE OF THE BOOLEAN PARAMETERS TO TRUE!!!!
        // DON'T FORGET THAT!

        // WE NEED TO MAKE THIS MESSY CODE BETTER IMHO, MAYBE ONE OF THE SKILLED
        // HBO-ICT STUDENTS CAN HELP US OUT.

        // IF WE HAVE TO ADD AN OTHER TYPE OF CARD...
        // ...I QUIT THIS JOB.
//        AbstractCard card = new AbstractCard(printer, false, true);
AbstractCard card = new HighSchoolCard(printer);
        card.print();
    }
}
