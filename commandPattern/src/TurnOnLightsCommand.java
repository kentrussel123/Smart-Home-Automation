public class TurnOnLightsCommand implements Command{
    private Light light;

    public TurnOnLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
