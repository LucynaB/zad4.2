package pl.example.app;

import pl.example.data.Line;

public class Longer {


    public Line isLonger(Line line1, Line line2) {

        if (line1.length() == line2.length()) {
            System.out.println("Odcinki mają taką samą długośc.");
            return line1;
        } else if (line1.length() > line2.length()) {
            System.out.println("Odcinek1 jest dłuższy.");
            return line1;
        } else{
            System.out.println("Odcinek2 jest dłuższy.");
            return line2;
        }


    }
}
