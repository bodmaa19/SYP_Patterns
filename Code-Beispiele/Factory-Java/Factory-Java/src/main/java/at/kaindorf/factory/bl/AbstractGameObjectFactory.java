package at.kaindorf.factory.bl;

import at.kaindorf.factory.beans.GameObject;

public abstract class AbstractGameObjectFactory<T extends GameObject> {
    private int id = 0;

    public T generate() {
        T gameObject = generateConcreteGameObject();
        gameObject.setId(id);
        id++;
        return gameObject;
    }

    protected abstract T generateConcreteGameObject();
}
