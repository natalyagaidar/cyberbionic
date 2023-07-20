package homework.lesson5;

import java.lang.reflect.*;

public class Task3 {
    public static void main(String[] args) {

        Class cl = MyClass.class;
        getClassInfo(cl);
    }

    private static void getClassInfo(Class cl) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        String s3 = (char) 27 + "[31m";
        String s4 = (char) 27 + "[32m";


        System.out.println(s + "Class name: " + cl.getName());

        System.out.println(s + "Public Reflection fields:" + s1);

        Field[] fields = cl.getFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
            System.out.println();
        }

        System.out.println(s + "Modifiers:" + s1);
        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods))
            System.out.print("private ");
        if (Modifier.isAbstract(mods))
            System.out.print("abstract ");
        if (Modifier.isFinal(mods))
            System.out.print("final ");

        System.out.println(s3 + "Constructors:");
        Constructor[] ctors = cl.getConstructors();
        for (Constructor c : ctors) {
            System.out.println(s4 + "\tName: " + s1 + c.getName());
            String paramsString = s1;
            Parameter[] params = c.getParameters();
            for (Parameter p : params) {
                paramsString += paramsString + p.getType() + " " + p.getName() + " ";
            }
            System.out.println(s4 + "\tParameters: " + paramsString);
            System.out.println();
        }

        System.out.println(s3 + "Methods:");
        Method[] methods = cl.getMethods();
        for (Method m : methods) {
            System.out.println(s4 + "\tName: " + s1 + m.getName());

            String paramsString = s1;
            Parameter[] params = m.getParameters();
            for (Parameter p : params) {
                paramsString += paramsString + p.getType() + " " + p.getName() + " ";
            }
            System.out.println(s4 + "\tParameters: " + paramsString);
            System.out.println(s4 + "\tReturn type: " + s1 + m.getReturnType());
            System.out.println();
        }
    }

    class MyClass {
        public int myFaforiteNumber;
        String myName;
        protected String myFavoriteColor;

        public MyClass(String myName) {
            this.myName = myName;
        }

        public MyClass(int myFaforiteNumber, String myFavoriteColor) {
            this.myFaforiteNumber = myFaforiteNumber;
            this.myFavoriteColor = myFavoriteColor;
        }

        @Override
        public String toString() {
            return String.format("Hello, my name is %s, I like number %s. My favorite color is %s",
                    myName, myFaforiteNumber, myFavoriteColor);
        }

        public void setMyName(String myName) {
            this.myName = myName;
        }

        public void setMyFavoriteColor(String myFavoriteColor) {
            this.myFavoriteColor = myFavoriteColor;
        }

        public int getMyFaforiteNumber() {
            return myFaforiteNumber;
        }

        public void setMyFaforiteNumber(int myFaforiteNumber) {
            this.myFaforiteNumber = myFaforiteNumber;
        }

        public String getMyName() {
            return myName;
        }

        public String getMyFavoriteColor() {
            return myFavoriteColor;
        }
    }
}
