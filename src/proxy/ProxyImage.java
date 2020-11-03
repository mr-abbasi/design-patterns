package proxy;

/**
 * @author Mohammad.Abbasi
 * @created 02/11/2020
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(this.realImage == null){
            this.realImage = new RealImage(fileName);
        }

        this.realImage.display();
    }
}
