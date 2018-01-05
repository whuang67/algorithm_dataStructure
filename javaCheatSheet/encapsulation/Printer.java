public class Printer {
    private int tonerLever;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLever, boolean duplexPrinter) {
        if(tonerLever >= 0 && tonerLever <= 100) {
            this.tonerLever = tonerLever;
        } else {
            this.tonerLever = -1;
        }
        this.duplexPrinter = duplexPrinter;
        this.numberOfPages = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLever + tonerAmount > 100) {
                return -1;
            } else {
                this.tonerLever += tonerAmount;
                return this.tonerLever;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplexPrinter) {
            if(pagesToPrint % 2 == 0)
                pagesToPrint /= 2;
            else
                pagesToPrint = pagesToPrint/2+1;
            System.out.println("Printing in duplex mode.");
        }
        this.numberOfPages += pagesToPrint;
        return this.numberOfPages;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }
}
