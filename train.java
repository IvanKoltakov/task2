package vsu.koltakov_1_2;

public class train {
    public int train_number;
    public String line;
    public int wagons_count;

    public train(int train_number, String line, int wagons_count) {
        this.train_number = train_number;
        this.line = line;
        this.wagons_count = wagons_count;
    }

    public void getNumber() {
        System.out.println("Номер вагона " + this.train_number);
    }

    public void setNumber(int train_number) {
        this.train_number = train_number;
    }

    public void getLine() {
        System.out.println("Поезд ходит по линии - " + this.line);
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void getWagonsCount() {
        System.out.println("Поезд состоит из " + this.wagons_count + " вагонов.");
    }

    public void setWagonsCount(int wagons_count) {
        this.wagons_count = wagons_count;
    }
    public void print() {
        System.out.println("Номер поезда: " + train_number + "\n" + "Линия:" + line + "\n"
                + "Количество вагонов:" + wagons_count + "\n");
    }
}
