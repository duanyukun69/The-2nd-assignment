public class TestEquals2 {
    public static void main(String[] args)
    {
        Integer n1 = new Integer(30);
        Integer n2 = new Integer(30);
        Integer n3 = new Integer(31);
        System.out.println(n1 == n2);//结果是false 两个不同的Integer对象，故其地址不同，
        System.out.println(n1 == n3);//那么不管是new Integer(30)还是new Integer(31) 结果都显示false
        System.out.println(n1.equals(n2));//结果是true 根据jdk文档中的说明，n1与n2指向的对象中的内容是相等的，都是30，故equals比较后结果是true
        System.out.println(n1.equals(n3));//结果是false 因对象内容不一样，一个是30一个是31
    }
}
