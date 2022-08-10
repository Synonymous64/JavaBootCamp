import java.util.*;
class Codec {

    Map<String, String> mp = new HashMap<String, String>();
    int n = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String res = "http://tinyurl.com/" + n;
        n++;
        mp.put(res, longUrl);
        return res;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return mp.get(shortUrl);
    }
}
public class EncodeandDecodeTinyURL {
    public static void main(String[] args) {
        
    }
}
