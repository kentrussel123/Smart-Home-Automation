class DecreaseVolumeCommand implements Command {
    private MusicPlayer musicPlayer;

    public DecreaseVolumeCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.decreaseVolume();
    }
}