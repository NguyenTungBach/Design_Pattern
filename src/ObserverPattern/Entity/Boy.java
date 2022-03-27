package ObserverPattern.Entity;

public class Boy {
    public String Name;

    public Boy(String name)
    {
        Name = name;
    }

    public void Care()
    {
        System.out.println(Name +" : Sao không đồng chí?");
    }
}
