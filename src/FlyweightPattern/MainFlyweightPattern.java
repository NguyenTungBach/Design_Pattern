package FlyweightPattern;

import FlyweightPattern.Entity.Attendee;
import FlyweightPattern.Factory.AttendeeFactory;

import java.util.Random;

public class MainFlyweightPattern {
    private static final String[] names = {"Quyền", "Tiến", "Thành", "Hòa"};

    private static String getRandomName() {
        int randomName = new Random().nextInt(names.length);
        return names[randomName];
    }

    private static int getRandomAge() {
        return (int)(Math.random()*80);
    }

    public static void main(String[] args) {
        // Chọn ngẫu nhiên tên và tuổi
        for(int i = 0; i < 4; ++i) {
            Attendee attendee = (Attendee) AttendeeFactory.getAttendee(getRandomName());
            attendee.setAge(getRandomAge());
            attendee.listenToConcert();
        }
        System.out.println("------------------------------");
    }
}
