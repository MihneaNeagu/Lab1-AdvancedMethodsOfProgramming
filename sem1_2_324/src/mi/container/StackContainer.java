package mi.container;

import mi.model.Task;

import java.util.ArrayList;
import java.util.List;

public class StackContainer extends AbstractContainer implements Container{

    @Override
    public Task remove() {
        return container.remove(size()-1);
    }

}
