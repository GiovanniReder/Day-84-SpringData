package giovanni.springdata.entities;

public class Table {
    private long numberOfTable;
    private int placeSetting;
    private boolean free;

    public Table(long numberOfTable, int placeSetting, boolean free) {
        this.numberOfTable = numberOfTable;
        this.placeSetting = placeSetting;
        this.free = free;
    }

    public long getNumberOfTable() {
        return numberOfTable;
    }

    public void setNumberOfTable(long numberOfTable) {
        this.numberOfTable = numberOfTable;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public int getPlaceSetting() {
        return placeSetting;
    }

    public void setPlaceSetting(int placeSetting) {
        this.placeSetting = placeSetting;
    }

    @Override
    public String toString() {
        return "Table{" +
                "numberOfTable=" + numberOfTable +
                ", placeSetting=" + placeSetting +
                ", free=" + free +
                '}';
    }
}
