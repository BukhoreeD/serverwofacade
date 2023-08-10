package serverwofacade;

public class ServerFacade {
    private ScheduleServer scheduleServer;

    public ServerFacade() {
        scheduleServer = new ScheduleServer();
    }

    public void startServer() {
        scheduleServer.startBooting();
        scheduleServer.readSystemConfigFile();
        scheduleServer.init();
        scheduleServer.initializeContext();
        scheduleServer.initializeListeners();
        scheduleServer.createSystemObjects();
        System.out.println("Start working......");
    }

    public void stopServer() {
        System.out.println("After work done.........");
        scheduleServer.releaseProcesses();
        scheduleServer.destroySystemObjects();
        scheduleServer.destroyListeners();
        scheduleServer.destroyContext();
        scheduleServer.shutdown();
    }
}
