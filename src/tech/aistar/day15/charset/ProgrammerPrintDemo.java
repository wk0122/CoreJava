package tech.aistar.day15.charset;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/17 0017
 */
public class ProgrammerPrintDemo {
    public static void main(String[] args) {
        try(InputStreamReader in = new InputStreamReader(new FileInputStream("src/tech/aistar/day15/charset/CharSetDemo.java"))){

            int len = -1;

            while((len = in.read())!=-1){
                System.out.print((char)len);
                Thread.sleep(50);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
