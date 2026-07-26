import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>() ;
        list.add(23);
        list.add(3);
        list.add(32);
        list.add(71);
        System.out.println("args = " + list);
        Collections.sort(list);
        System.out.println("args = " + list);
    }
}