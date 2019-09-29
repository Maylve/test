import java.util.Scanner;
public class Work129 
{
    public static void main(String[] args) 
    {
        int i = 1; //第一项数字
        int firstNum = 1;
        int secondNum = 1;
        int preNum = 1;
        int lastNum = 1;
        int lastLastNum = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想求和到第多少项： ");
        int input = scanner.nextInt();
        while(i <= input)
        {
            lastLastNum = preNum + lastNum;//3
            preNum = lastNum;//1
            lastNum = lastLastNum;//2
            System.out.print(lastLastNum + " ");       
            i++;
        }
    }
}
