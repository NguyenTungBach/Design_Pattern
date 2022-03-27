package FlyweightPattern.Factory;

import FlyweightPattern.Entity.Attendee;
import FlyweightPattern.Entity.IAttendee;

import java.util.HashMap;

public class AttendeeFactory {
    private static final HashMap attendees = new HashMap();

    public static IAttendee getAttendee(String name) {
        // Lấy ra đối tượng từ HashMap
        Attendee attendee = (Attendee)attendees.get(name);
        // Nếu không tìm thấy đối tượng HashMap thì thêm vào
        if(attendee == null) {
            attendee = new Attendee(name);
            attendees.put(name, attendee);
            System.out.println("Người tham dự mới: " + name);
        }
        return attendee;
    }
}
