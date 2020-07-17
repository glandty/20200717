/**
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 *
 * 输入描述:
 * 每个测试输入包含2个字符串
 *
 *
 * 输出描述:
 * 输出删除后的字符串
 * 示例1
 * 输入
 * They are students.
 * aeiou
 * 输出
 * Thy r stdnts.
 */
import java.util.Scanner;
public class Main {
    public static String delete(String src,String del){
        int[] map = new int[256];
        for (int i = 0; i < del.length(); i++) {
            map[del.charAt(i)]++;
        }
        char[] ch = src.toCharArray();
        int len = 0;
        for (int i = 0; i < ch.length; i++) {
            if(map[ch[i]] == 0){
                ch[len++] = ch[i];
            }
        }
        return new String(ch,0,len);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(delete(str1,str2));
    }
}