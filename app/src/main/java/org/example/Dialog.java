package org.example;



public class Dialog {
    int earnings, spendings;
    public Dialog() {
        this.earnings = 0;
        this.spendings = 0;
    }

    public void entryPoint() {
        int menuitem = IO.enterMenuitem();
        switch (menuitem) {
            case 1: this.enterEarnings(); break;
            case 2: this.enterSpendings(); break;
            case 3: this.calculateTax(); break;
        }
    }

    void newEntryPoint() {
	this.earnings = 0;
	this.spendings = 0;
	this.entryPoint();
    }

    void enterEarnings() {
        this.earnings += IO.enterNumber(Strings.ENTER_EARNINGS);
        this.entryPoint();
    }

    void enterSpendings() {
        this.spendings += IO.enterNumber(Strings.ENTER_SPENDINGS);
        this.entryPoint();
    }

    void calculateTax() {
        int taxByEarnings = Taxes.byEarnings(this.earnings);
        int taxByEarningsMinusSpendings = Taxes.byEarningsMinusSpendings(this.earnings, this.spendings);
        if (taxByEarnings < taxByEarningsMinusSpendings) {
            System.out.printf(
		Strings.RESULT_FMT,
		Strings.EARNINGS,
		taxByEarnings,
		taxByEarningsMinusSpendings,
		taxByEarningsMinusSpendings - taxByEarnings);
        } else if (taxByEarningsMinusSpendings < taxByEarnings) {
            System.out.printf(
		Strings.RESULT_FMT,
		Strings.EARNINGS_MINUS_SPENDINGS,
		taxByEarningsMinusSpendings,
		taxByEarnings,
		taxByEarnings - taxByEarningsMinusSpendings);
        } else {
            System.out.printf(Strings.RESULT_TIE_FMT, taxByEarnings);
        }
	this.newEntryPoint();
    }

}

