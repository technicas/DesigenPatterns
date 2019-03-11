package designPrinciples.ISP;

public class StuScoreList implements InputModule, CountModule, PrintModule {
    private StuScoreList() {
    }

    public static InputModule getInputModule() {
        return (InputModule)new StuScoreList();
    }

    public static CountModule getCountModule() {
        return (CountModule)new StuScoreList();
    }

    public static PrintModule getPrintModule() {
        return (PrintModule)new StuScoreList();
    }

    public void printStuInfo() {
        System.out.println("打印模块的printStuInfo方法被调用");
    }

    public void queryStuInfo() {
        System.out.println("打印模块的queryStuInfo方法被调用");
    }

    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore方法被调用");
    }

    public void countAverage() {
        System.out.println("统计模块的countAverage方法被调用");
    }

    public void insert() {
        System.out.println("输入模块的insert方法被调用");
    }

    public void delete() {
        System.out.println("输入模块的delete方法被调用");
    }

    public void modify() {
        System.out.println("输入模块的modify方法被调用");
    }
}
