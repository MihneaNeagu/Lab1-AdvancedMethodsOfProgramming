package mi.factory;

import mi.container.Container;

public interface Factory {
    Container createContainer(Strategy startegy);
}