package edu.northeastern.weiwang;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        {
            System.out.println("Question 1");
            Student student1 = new Student(101, "ABC");
            System.out.println("Roll number of the first student: " + student1.printRoll());
            System.out.println("Name of the first student: "+ student1.printName());
            Student student2 = new Student(student1);
            System.out.println("Roll number of the second student: " + student2.printRoll());
            System.out.println("Name of the second student: "+ student2.printName());
            System.out.println("----------");
        }

        {
            System.out.println("Question 2");
            Triangle triangle1 = new Triangle(4, 2);
            System.out.println(triangle1.printShape());
            System.out.println(triangle1.getArea());
            System.out.println(triangle1.getPerimeter());
            System.out.println();
            Triangle triangle2 = new Triangle(3);
            System.out.println(triangle2.printShape());
            System.out.println(triangle2.getArea());
            System.out.println(triangle2.getPerimeter());
            System.out.println();
            Rhombus rhombus1 = new Rhombus(6, 8);
            System.out.println(rhombus1.printShape());
            System.out.println(rhombus1.getArea());
            System.out.println(rhombus1.getPerimeter());
            System.out.println();
            Rhombus rhombus2 = new Rhombus(8);
            System.out.println(rhombus2.printShape());
            System.out.println(rhombus2.getArea());
            System.out.println(rhombus2.getPerimeter());
            System.out.println("----------");
        }

        {
            System.out.println("Question 3");
            Rectangle r = new Rectangle(2.0, 3.0);
            Circle c = new Circle(4.0);
            r.computeArea();
            r.computePerimeter();
            c.computeArea();
            c.computePerimeter();
            r.display();
            c.display();
            System.out.println("----------");
        }

        {
            System.out.println("Question 4");
            Player[] players = new Player[4];
            players[0] = new Player("aaa", 10);
            players[1] = new Player("bbb", 20);
            players[2] = new Player("ccc", 20);
            players[3] = new Player("ddd", 30);
            Arrays.sort(players, new PlayerComparator());
            for (Player p : players) {
                System.out.println(p.name + " " + p.score);
            }
            System.out.println("----------");
        }
    }
}
