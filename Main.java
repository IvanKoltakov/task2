package vsu.koltakov_1_2;

public class Main {
    public static void main(String[] args){
        train train = new train(18,"dsds",12);
        train.print();
        train.setNumber(11);
        train.setLine("южная");
        train.setWagonsCount(20);
        train.getNumber();
        train.getLine();
        train.getWagonsCount();
        Station Station = new Station("ботанический сад",50,"новокузнецкая");
        Station.print();
        Station.setNameStation("Арбатская");
        Station.setAwgWorkload(200);
        Station.setStreetLocation("Московская");
        Station.getNameStation();
        Station.getAwgWorkload();
        Station.getStreetLocation();
        Schedule Schedule = new Schedule("питерская","12:35",20);
        Schedule.print();
        Schedule.setTimeArrival("10:50");
        Schedule.setNumber(2);
        Schedule.setNameStation("северная");
        Schedule.getTimeArrival();
        Schedule.getNumber();
        Schedule.getNameStation();
    }
}
