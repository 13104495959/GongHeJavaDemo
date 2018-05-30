public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        VariableClass variableClass = new VariableClass();
        // 使用未初始化的变量,系统会默认生成初始化值,来防止奔溃,int是0, String是null
        System.out.println(variableClass.number1);
        System.out.println(variableClass.string1);

        ClassClass classClass = new ClassClass();
        if (classClass instanceof ClassClass)
        {
            System.out.println(ClassClass.width);
            System.out.println(classClass.width);
            System.out.println("classClass是ClassClass的对象");
        }

        // private的变量使用点语法的时候,是不会提示出来的,如果强行时候会报错,提示此变量是私有变量
        System.out.println(classClass.name);
        System.out.println(classClass.sex);
        System.out.println(classClass.height);

    }
}
