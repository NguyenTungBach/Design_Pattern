package Refactor.ModeFacade;

import Refactor.Action;
import Refactor.ModelObserver.ModelIObserver;

public interface ModelIFacade {
    void addSubscriber(ModelIObserver modelIObserver);
    void removeSubscriber(ModelIObserver modelIObserver);
    void sendNotify(Action action);
}
