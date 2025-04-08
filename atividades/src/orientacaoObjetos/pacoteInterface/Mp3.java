package orientacaoObjetos.pacoteInterface;

public class Mp3 implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("Play na musica do MP3");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando musica do MP3");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop da musica do MP3");
    }
}
