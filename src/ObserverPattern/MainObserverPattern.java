package ObserverPattern;

import ObserverPattern.Entity.Boy;
import ObserverPattern.Entity.Friend;

public class MainObserverPattern {
    // Giả sử chúng ta có 1 Bạn và 1 đám con trai trẻ trâu.
    // Hiển nhiên cứ mỗi lần Nó buồn, vui, đăng Status Facebook cả đám cứ sồn sồn lên
    // Ở trường hợp này, Bạn chính là Subject
    // Đám nam nhi kia là Observer

    public static void main(String[] args) {
        Friend friend = new Friend();

        friend.AddToZone(new Boy("SomeOne A"));
        friend.AddToZone(new Boy("SomeOne B"));

        friend.PostFacebook();
    }
}
