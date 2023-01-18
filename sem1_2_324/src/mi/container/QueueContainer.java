package mi.container;

import mi.model.Task;

public class QueueContainer extends AbstractContainer implements Container {
    @Override
    public Task remove() {
        return container.remove(size() - 1);
    }

}
