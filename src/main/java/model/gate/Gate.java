package model.gate;

public abstract class Gate {
    private int assignedfloorNumber;
    private int gateNumber;
    private boolean isOpen;
    private boolean isClosed;

    public Gate(int assignedfloorNumber, int gateNumber, boolean isOpen, boolean isClosed) {
        this.assignedfloorNumber = assignedfloorNumber;
        this.gateNumber = gateNumber;
        this.isOpen = isOpen;
        this.isClosed = isClosed;
    }

    public void closeTheGate(){
        isOpen = false;
        isClosed = true;
    }

    public void openTheGate(){
        isClosed = false;
        isOpen = true;
    }

    public int getAssignedfloorNumber() {
        return assignedfloorNumber;
    }

    public void setAssignedfloorNumber(int assignedfloorNumber) {
        this.assignedfloorNumber = assignedfloorNumber;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "assignedfloorNumber=" + assignedfloorNumber +
                ", gateNumber=" + gateNumber +
                ", isOpen=" + isOpen +
                ", isClosed=" + isClosed +
                '}';
    }
}
