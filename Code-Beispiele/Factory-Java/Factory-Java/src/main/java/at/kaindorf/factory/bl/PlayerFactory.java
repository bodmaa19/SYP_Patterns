package at.kaindorf.factory.bl;

import at.kaindorf.factory.beans.Player;

public class PlayerFactory extends AbstractGameObjectFactory<Player> {
    @Override
    protected Player generateConcreteGameObject() {
        return new Player();
    }
}
