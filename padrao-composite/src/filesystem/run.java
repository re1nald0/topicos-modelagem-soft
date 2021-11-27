package filesystem;

public class run {
    public static void main(String[] args) {
        SystemFile root = new Folder("FileSystem root");
        SystemFile videos = new Folder("Videos");
        SystemFile imagens = new Folder("Imagens");
        SystemFile aleatorios = new Folder("Aleatorios");

        SystemFile video1 = new VideoFile("Video 1", "Video 1 binaries");
        SystemFile video2 = new VideoFile("Video 2 - 22/11/2021", "Video 2 binaries");

        SystemFile imagem1 = new ImageFile("Imagem 1 - 15/05/2000", "Image 1 binaries");
        SystemFile imagem2 = new ImageFile("Imagem 2 - 22/11/2021", "Image 2 binaries");

        SystemFile text1 = new TextFile("Texto 1 - 10/10/2021", "Text 1 binaries");
        SystemFile imagemAleatoria3 = new VideoFile("Imagem Aleatoria 3 - 22/11/2021", "Image Aleatoria binaries");
    
        ((Folder) root).newFile(videos);
        ((Folder) root).newFile(imagens);
        ((Folder) root).newFile(aleatorios);

        ((Folder) root).getFolder(0).newFile(video1);
        ((Folder) root).getFolder(0).newFile(video2);

        ((Folder) root).getFolder(1).newFile(imagem1);
        ((Folder) root).getFolder(1).newFile(imagem2);

        ((Folder) root).getFolder(2).newFile(text1);
        ((Folder) root).getFolder(2).newFile(imagemAleatoria3);

        root.describe();
    }
}
