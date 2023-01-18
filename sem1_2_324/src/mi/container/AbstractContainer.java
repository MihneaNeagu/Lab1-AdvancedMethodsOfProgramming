package mi.container;

import mi.model.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractContainer implements Container {
    protected List<Task> container;

    public AbstractContainer(){
        container = new ArrayList<>();
    }

    public abstract Task remove();

    @Override
    public void add(Task task) {
        container.add(task);
    }

    @Override
    public int size() {
        return container.size();
    }

    @Override
    public boolean isEmpty() {
        return size() != 0;
    }
}
