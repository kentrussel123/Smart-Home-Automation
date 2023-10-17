public class TurnOffLightsCommand implements Command {
    private Light light;

    public TurnOffLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
