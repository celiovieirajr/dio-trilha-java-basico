package orientacaoObjetos.pacoteInterface;

public class SmarPhone implements VideoPlayer, MusicPlayer{
    @Override
    public void playVideo() {
        System.out.println("Play no vídeo do smartPhone");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pausando o vídeo do SmartoPhone");
    }

    @Override
    public void stopVideo() {
        System.out.println("Parar vídeo do SmartPhone");
    }

    @Override
    public void playMusic() {
        System.out.println("Play na musica do SmarPhone");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausando musica do SmartPhone");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando musica do SmartPhone");
    }
}
