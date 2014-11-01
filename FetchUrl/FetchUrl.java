import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.util.Scanner;

public class FetchUrl {

public static void main(String[] args) {
    URL url;
    InputStream is = null;
    BufferedReader br;
    String line;
    Scanner input = new  Scanner(System.in);

        url = new URL(input.next());
        is = url.openStream();
        br = new BufferedReader(new InputStreamReader(is));

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

}
}
