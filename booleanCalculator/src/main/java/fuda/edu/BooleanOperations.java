package fuda.edu;

public class BooleanOperations {
    private Boolean firstOne;
    private Boolean secondOne;
    public BooleanOperations(boolean firstOne, boolean secondOne) {
        this.firstOne = firstOne;
        this.secondOne = secondOne;
    }

    public BooleanOperations(){}

    public boolean isFirstOne() {
        return firstOne;
    }

    public void setFirstOne(boolean firstOne) {
        this.firstOne = firstOne;
    }

    public boolean isSecondOne() {
        return secondOne;
    }

    public void setSecondOne(boolean secondOne) {
        this.secondOne = secondOne;
    }

    public boolean conjunction(){
        boolean result = false;
        if (firstOne && secondOne) {
            result = true;
        }

        return result;
    }
}
