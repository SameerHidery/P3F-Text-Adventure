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
    static String url = "https://gist.githubusercontent.com/SameerHidery/09bc986e5fc4fa301a20bb22f8a12234/raw/07edb7a22d15ecf10888b8232b4c4d797280e135/IntroductoryChapter.txt";

    public static void readInto(Queue<String> q) throws Exception {
        URL wordsURL = new URL(url);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(wordsURL.openStream()));
        String word;
        while ((word = in.readLine()) != null){
            q.enqueue(word);
        }
        in.close();
    }
}
    



