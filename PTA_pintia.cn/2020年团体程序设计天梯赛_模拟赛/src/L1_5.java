import java.util.Scanner;

/**
 * L1-5 判断题
 * <p>
 * 判断题的评判很简单，本题就要求你写个简单的程序帮助老师判题并统计学生们判断题的得分。
 * <p>
 * 输入格式：
 * 输入在第一行给出两个不超过 100 的正整数 N 和 M，分别是学生人数和判断题数量。
 * 第二行给出 M 个不超过 5 的正整数，是每道题的满分值。第三行给出每道题对应的正确答案，0 代表“非”，1 代表“是”。
 * 随后 N 行，每行给出一个学生的解答。数字间均以空格分隔。
 * <p>
 * 输出格式：
 * 按照输入的顺序输出每个学生的得分，每个分数占一行。
 * <p>
 * 输入样例：
 * 3 6
 * 2 1 3 3 4 5
 * 0 0 1 0 1 1
 * 0 1 1 0 0 1
 * 1 0 1 0 1 0
 * 1 1 0 0 1 1
 * <p>
 * 输出样例：
 * 13
 * 11
 * 12
 */
public class L1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStudent = scanner.nextInt();
        int numberProblem = scanner.nextInt();

        int[] problemSorce = new int[numberProblem];
        int[] problemAnswer = new int[numberProblem];

        // int[][] studentAnswer = new int[numberStudent][numberProblem];
        int[] studentAnswer = new int[numberProblem];

        for (int i = 0; i < numberProblem; i++) {
            problemSorce[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberProblem; i++) {
            problemAnswer[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberStudent; i++) {
            int studentSorce = 0;
            for (int j = 0; j < numberProblem; j++) {
                // if (problemAnswer[j] == studentAnswer[i][j]) {
                // studentAnswer[i][j] = scanner.nextInt();
                studentAnswer[j] = scanner.nextInt();
                if (problemAnswer[j] == studentAnswer[j]) {
                    studentSorce += problemSorce[j];
                }
            }
            System.out.println(studentSorce);
        }
    }
}
