package orientacaoObjetos.pacoteInterface;

public record MusicaBox(String musica, boolean ispaused) implements MusicPlayer {

    @Override
    public void playMusic() {

    }

    @Override
    public void pauseMusic() {

    }

    @Override
    public void stopMusic() {

    }
}
