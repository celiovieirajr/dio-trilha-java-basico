package orientacaoObjetos.exerciciosInterface;

public class Main {

    public static void main(String[] args) {

        var musica = MusicPlayer.music;
        System.out.println(musica);

        var musicPlayer = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("Play na música");
            }

            @Override
            public void pauseMusic() {
                System.out.println("Pausando a música");
            }

            @Override
            public void stopMusic() {
                System.out.println("Stop na música");
            }
        };

        var musicaPlayer2 = new MusicPlayer() {

            @Override
            public void playMusic() {
                System.out.println("PLay music dois");
            }

            @Override
            public void pauseMusic() {
                System.out.println("Pause music dois");
            }

            @Override
            public void stopMusic() {
                System.out.println("Stop music dois");
            }
        };

        var videoPlayer = new VideoPlayer() {

            @Override
            public void playVideo() {
                System.out.println("Play no vídeo");
            }

            @Override
            public void pauseVideo() {
                System.out.println("Pause no vídeo");
            }

            @Override
            public void stopVideo() {

            }
        };

        musicPlayer.playMusic();
        musicaPlayer2.stopMusic();
        System.out.println(musicPlayer.getClass());
    }
}
