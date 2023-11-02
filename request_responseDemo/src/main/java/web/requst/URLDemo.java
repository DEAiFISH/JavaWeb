package web.requst;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String username = "张三";
        //1.URL编码
        String encode = URLEncoder.encode(username, "UTF-8");
        System.out.println("encode = " + encode);

        //2.URL解码
//        String decode = URLDecoder.decode(encode, "UTF-8");
        String decode = URLDecoder.decode(encode, "ISO-8859-1");
        System.out.println("decode = " + decode);

        //3.转换为字节数据
        byte[] bytes = decode.getBytes("ISO-8859-1");

        //4.将字节数据转换为字符串
        String s = new String(bytes, "UTF-8");

        System.out.println(s);
    }
}
