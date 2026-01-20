class Bank {
    int getRateOfInterest() {
        return 5;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class HDFC extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

public class RunTime {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("SBI ROI: " + b.getRateOfInterest());

        b = new HDFC();
        System.out.println("HDFC ROI: " + b.getRateOfInterest());
    }
}

