package uaslp.enginering.exam.model;

public class    Room {
    public int number;
    public RoomStatus roomStatus;
    public String string;

    public Room(int number,String string,RoomStatus roomStatus){
        this.number = number;
        this.roomStatus  = roomStatus;
        this.string = string;
    }

    public int getNumber(){
        return number;
    }

    public RoomStatus getStatus(){
        return roomStatus;
    }
}