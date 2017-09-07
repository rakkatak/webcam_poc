package hello;

import com.github.sarxos.webcam.Webcam;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) {
//        Greeter greeter = new Greeter();
//        System.out.println(greeter.sayHello());
        try {
            Webcam webcam = Webcam.getDefault();
            webcam.open();
            ImageIO.write(webcam.getImage(), "PNG", new File("hello-world.png"));
        } catch (IOException ioe) {
            System.out.println("Exception "+ioe);
        }

    }
}
