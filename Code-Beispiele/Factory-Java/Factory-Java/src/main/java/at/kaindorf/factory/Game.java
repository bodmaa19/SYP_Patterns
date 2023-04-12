package at.kaindorf.factory;

import at.kaindorf.factory.beans.Enemy;
import at.kaindorf.factory.beans.Player;
import at.kaindorf.factory.bl.AbstractGameObjectFactory;
import at.kaindorf.factory.bl.EnemyFactory;
import at.kaindorf.factory.bl.MethodGameObjectFactory;
import at.kaindorf.factory.bl.PlayerFactory;
import java.security.InvalidParameterException;

public class Game {
    public static void main(String[] args) {
        //Variante 1: Abstract Factory
            AbstractGameObjectFactory<Player> playerFactory = new PlayerFactory();
            Player player1 = playerFactory.generate();
            Player player2 = playerFactory.generate();

            AbstractGameObjectFactory<Enemy> enemyFactory = new EnemyFactory();
            Enemy enemy1 = enemyFactory.generate();
        //

        //Variante 2: Methode Factory [without generics]
            try {
                MethodGameObjectFactory factory = new MethodGameObjectFactory();
                Player p1 = (Player) factory.generate("player");
                Player p2 = (Player) factory.generate("player");

                Enemy e1 = (Enemy) factory.generate("enemy");
            } catch (InvalidParameterException e) {
                System.out.println(e.getMessage());
            }

            //Problems
            try {
                MethodGameObjectFactory factory = new MethodGameObjectFactory();
                Player p1 = (Player) factory.generate("enemy");
            } catch (Exception e) {
                //System.out.println(e.getMessage());
            }

            try {
                MethodGameObjectFactory factory = new MethodGameObjectFactory();
                Player p1 = (Player) factory.generate("playyer");
            } catch (Exception e) {
                //System.out.println(e.getMessage());
            }
        //

        //Variante 2: Methode Factory [with generics]
            MethodGameObjectFactory factory = new MethodGameObjectFactory();
            Enemy enemy = factory.generate(Enemy.class);
            enemy.setEnemyName("BLOB");
            enemy.setDescription("Weak slime");
            System.out.println(enemy);
        //


    }
}
