package at.kaindorf.factory.bl;

import at.kaindorf.factory.beans.Enemy;
import at.kaindorf.factory.beans.GameObject;
import at.kaindorf.factory.beans.Player;
import java.security.InvalidParameterException;

public class MethodGameObjectFactory {

    public GameObject generate(String objectType) {
        return switch (objectType.toLowerCase().replace(" ", "")) {
            case "enemy" -> new Enemy();
            case "player" -> new Player();
            default -> throw new InvalidParameterException("This factory only supports GameObjects");
        };
    }

    public <T extends GameObject> T generate(Class<T> gameObjectClass) {
        return switch (gameObjectClass.getSimpleName()) {
            case "Enemy" -> (T) new Enemy();
            case "Player" -> (T) new Player();
            default -> throw new InvalidParameterException("This factory only supports GameObjects");
        };
    }
}
