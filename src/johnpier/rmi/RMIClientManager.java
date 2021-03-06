package johnpier.rmi;

import johnpier.*;

import java.rmi.*;
import java.rmi.registry.*;

public class RMIClientManager {
    public static final String GAME_MANAGER_PATH_NAME = "com.johnpier.server.GameManager";
    public static final String ACHIEVEMENTS_MANAGER_PATH_NAME = "com.johnpier.server.AchievementsManager";
    public static final int PORT = 1099;

    public static GameManager getGameManager() throws NotBoundException, RemoteException {
        Registry registry = LocateRegistry.getRegistry(PORT);
        return (GameManager) registry.lookup(GAME_MANAGER_PATH_NAME);
    }

    public static AchievementsManager getAchievementsManager() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(PORT);
        return (AchievementsManager) registry.lookup(ACHIEVEMENTS_MANAGER_PATH_NAME);
    }
}
