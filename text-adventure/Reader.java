import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.net.*;
import java.io.*;
import java.util.ArrayList;
/**
 * Write a description of class Reader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reader
{
    static String url = "https://gist.githubusercontent.com/SameerHidery/09bc986e5fc4fa301a20bb22f8a12234/raw/e2362e62ddc2764b78561f9f151faab811bd4d19/IntroductoryChapter.txt";

    public static void readInto(ArrayList<String> list) throws Exception {
        URL wordsURL = new URL(url);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(wordsURL.openStream()));
        String word;
        while ((word = in.readLine()) != null){
            list.add(word);
        }
        in.close();
    }
}
    



