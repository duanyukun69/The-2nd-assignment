public class TestEquals {
    public static void main(String[] args)
    {
        int a = 3;
        int b = 4;
        int c = 3;
        System.out.println(a == b);//结果是false
        System.out.println(a == c);//结果是true
        System.out.println(a.equals(c));//错误，编译不能通过，equals方法不能运用与基本类型的比较
    }
}
