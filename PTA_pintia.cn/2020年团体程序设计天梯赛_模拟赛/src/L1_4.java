import java.util.Scanner;

/**
 * L1-4 冠军魔术
 * <p>
 * 2018年FISM（世界魔术大会）近景总冠军简纶廷的表演中有一个情节：
 * 以桌面上一根带子为界，当他将纸牌从带子的一边推到另一边时，纸牌会变成硬币；把硬币推回另一边会变成纸牌。
 * 这里我们假设纸牌会变成等量的硬币，而硬币变成纸牌时，纸牌的数量会加倍。
 * 那么给定纸牌的初始数量，当他来回推了 N 次（来/回各算一次）后，手里拿的是纸牌还是硬币？数量是多少？
 * <p>
 * 输入格式：
 * 输入在一行里给出两个正整数，分别是纸牌的初始数量和魔术师推送的次数。这里假设初始状态下魔术师手里全是纸牌。
 * <p>
 * 输出格式：
 * 如果最后魔术师手里是纸牌，输出 0 和纸牌数量；如果是硬币，则输出 1 和硬币数量。数字间须有 1 个空格。
 * 题目保证结果数值不超出整型范围（即 2^31 −1）。
 * <p>
 * 输入样例 1：
 * 3 7
 * <p>
 * 输出样例 1：
 * 1 24
 * <p>
 * 输入样例 2：
 * 8 4
 * <p>
 * 输出样例 2：
 * 0 32
 */
public class L1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int times = scanner.nextInt();

        int realTimes = times / 2;
        int numberFin = (int)(number * Math.pow(2, realTimes));

        if (times % 2 == 0) {
            System.out.println("0 " + numberFin);
        } else {
            System.out.println("1 " + numberFin);
        }
    }
}
