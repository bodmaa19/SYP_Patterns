package at.kaindorf.factory.bl;

import at.kaindorf.factory.beans.Enemy;

public class EnemyFactory extends AbstractGameObjectFactory<Enemy> {
    @Override
    protected Enemy generateConcreteGameObject() {
        return new Enemy();
    }
}
