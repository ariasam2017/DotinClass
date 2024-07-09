package Session7;

import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        Persson persson=new Persson();
        persson.setName("Amir");
        persson.setAge(22);
        Persson persson2=new Persson();
        persson2.setName("Mohammad");
        persson2.setAge(23);
        System.out.println(persson.getAge()+" "+persson.getName()+" "+persson2.getAge()+" "+persson2.getName());
    }
}
