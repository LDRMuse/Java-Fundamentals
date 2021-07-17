package labs_examples.packages;

import labs_examples.packages.first_package.FirstClass;
import labs_examples.packages.second_package.SecondClass;

public class PackageController {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();

        firstClass.sayHello();
        secondClass.notProtectedMethod();
        secondClass.sayBye();
    }
}
