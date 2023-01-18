package mi.runner;

import mi.container.Container;
import mi.factory.Strategy;
import mi.factory.TaskContainerFactory;
import mi.model.Task;

public class StrategyTaskRunner implements TaskRunner{
    private Container container;

    public StrategyTaskRunner(Strategy strategy) {
        this.container = TaskContainerFactory.getInstance().createContainer(strategy);
        //create Factory as a singleton object
    }

    @Override
    public void executeOneTask() {
        if(!container.isEmpty())
            container.remove().execute();
    }

    @Override
    public void executeAll() {
        while (!container.isEmpty())
            executeOneTask();
    }

    @Override
    public void addTask(Task t) {
        container.add(t);
    }

    @Override
    public boolean hasTask() {
        return !container.isEmpty();
    }
}
