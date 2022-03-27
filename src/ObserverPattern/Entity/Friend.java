package ObserverPattern.Entity;

import java.util.ArrayList;
import java.util.List;

public class Friend {
    private boolean NeedAttention = false;// Trạng thái cần được quan tâm

    public List<Boy> Teammate = new ArrayList<>();

    public void PostFacebook()
    {
        System.out.println("Complete post");
        setNeedAttention(true);
    }

    public boolean isNeedAttention() {
        return NeedAttention;
    }

    // Đặt trạng thái cần được quan tâm và thông báo cho mấy BOY
    public void setNeedAttention(boolean needAttention) {
        NeedAttention = needAttention;
        Notify();
    }

    public void Notify()
    {
        for (Boy b : Teammate) {
            b.Care();
        }
    }

    // Register observer.
    public void AddToZone(Boy b)
    {
        Teammate.add(b);
    }
}
