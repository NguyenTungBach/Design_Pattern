package FlyweightPattern.Entity;

public class Attendee implements IAttendee{
    private String name;
    private int age;

    public Attendee(String name) {
        this.name = name;
    }

    @Override
    public void listenToConcert() {
        System.out.println(name + " Đang nghe buổi hòa nhạc " + age + " tuổi!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
