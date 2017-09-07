package com.west.schoolmessenger.leapsprint;

import com.github.sarxos.webcam.Webcam;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class WebcamMain {
    public static void main(String[] args) {
        try {
            Webcam webcam = Webcam.getDefault();
            webcam.open();
            ImageIO.write(webcam.getImage(), "PNG", new File("webcam-poc.png"));
        } catch (IOException ioe) {
            System.out.println("Exception "+ioe);
        }

    }
}
