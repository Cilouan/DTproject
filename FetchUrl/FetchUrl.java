public class FetchUrl {

public static void main(String[] args) {
    URL url;
    InputStream is = null;
    BufferedReader br;
    String line;
    Scanner input = new Scanner(System.in);

        url = new URL(input.next());
        is = url.openStream();
        br = new BufferedReader(new InputStreamReader(is));

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

}
}
