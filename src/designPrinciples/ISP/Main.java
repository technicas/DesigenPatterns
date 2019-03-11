package designPrinciples.ISP;

public class Main {
    public static void main(String[] args) {
        InputModule input = StuScoreList.getInputModule();
        CountModule count = StuScoreList.getCountModule();
        PrintModule print = StuScoreList.getPrintModule();

        input.insert();
        count.countAverage();
        print.printStuInfo();
        print.queryStuInfo();
    }
}
