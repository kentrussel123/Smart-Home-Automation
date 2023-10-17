// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        Command turnOnLights = new TurnOnLightsCommand(livingRoomLight);
        Command increaseTemperature = new IncreaseTemperatureCommand(thermostat);
        Command decreaseVolume = new DecreaseVolumeCommand(musicPlayer);

        SmartHomeControl remote = new SmartHomeControl();

        remote.setCommand(turnOnLights);
        remote.executeCommand();

        remote.setCommand(increaseTemperature);
        remote.executeCommand();

        remote.setCommand(decreaseVolume);
        remote.executeCommand();
    }
}