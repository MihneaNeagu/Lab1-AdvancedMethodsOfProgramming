package mi;


import mi.container.Container;
import mi.container.QueueContainer;
import mi.container.StackContainer;
import mi.factory.Factory;
import mi.factory.Strategy;
import mi.factory.TaskContainerFactory;
import mi.model.MessageTask;
import mi.model.SortingTask;
import mi.model.Task;
import mi.runner.StrategyTaskRunner;
import mi.runner.TaskRunner;
import mi.sorting.SortingStrategy;

import java.time.LocalDateTime;

public class Main {

    private static void testSortQuick() {
        int[] array2 = {6,-5,7,4,-100,100};
        SortingTask task = new SortingTask(1L,"abc", array2, SortingStrategy.QuickSort);
        task.execute();
    }

    private static void testSortBubble(){
        int[] array = {6,-5,7,4,-100,100};
        SortingTask task = new SortingTask(1L,"abc", array, SortingStrategy.BubbleSort);
        task.execute();

    }

    private static void testQueueContainer(){
        MessageTask m0=new MessageTask(12L, "sem Map0", "concepte OPP", LocalDateTime.now());
        MessageTask m1=new MessageTask(2L, "sem Map1", "concepte OPP", LocalDateTime.now());
        MessageTask m2=new MessageTask(132L, "sem Map2", "concepte OPP", LocalDateTime.now());
        MessageTask m3=new MessageTask(152L, "sem Map3", "concepte OPP", LocalDateTime.now());
        MessageTask m4=new MessageTask(712L, "sem Map4", "concepte OPP", LocalDateTime.now());

        Container container = new QueueContainer();

        container.add(m0);
        container.add(m1);
        container.add(m2);
        container.add(m3);
        container.add(m4);

        assert container.size() == 5;
        assert container.remove() == m0;
    }

    public static void testFactoryInstance(){
        Factory f1 = TaskContainerFactory.getInstance();
        Factory f2 = TaskContainerFactory.getInstance();
        assert f1 == f2;
    }

    public static void main(String[] args) {

        testSortBubble();
        testSortQuick();
        testQueueContainer();
        testFactoryInstance();

//        MessageTask m0=new MessageTask(12L, "sem Map0", "concepte OPP", LocalDateTime.now());
//        MessageTask m1=new MessageTask(2L, "sem Map1", "concepte OPP", LocalDateTime.now());
//        MessageTask m2=new MessageTask(132L, "sem Map2", "concepte OPP", LocalDateTime.now());
//        MessageTask m3=new MessageTask(152L, "sem Map3", "concepte OPP", LocalDateTime.now());
//        MessageTask m4=new MessageTask(712L, "sem Map4", "concepte OPP", LocalDateTime.now());

//        Container container = new StackContainer();
//        container.add(m0);
//        container.add(m1);
//        container.add(m2);
//        container.add(m3);
//        container.add(m4);
//
//        while (!container.isEmpty()){
//            Task task = container.remove();
//            task.execute();
//        }
//        TaskRunner runner = new StrategyTaskRunner(Strategy.LIFO);
//        runner.addTask(m0);
//        runner.addTask(m1);
//        runner.addTask(m2);
//        runner.addTask(m3);
//        runner.addTask(m4);
//
//        runner.executeAll();
    }
}
