import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    static int id = 0;

    public void startApp() {
        ArrayList<Student> students = new ArrayList<>();

        while (true)
        {
            System.out.println("请选择操作：");
            System.out.println("**********************************");
            System.out.println("*             1 插入             *");
            System.out.println("*             2 查找             *");
            System.out.println("*             3 删除             *");
            System.out.println("*             4 修改             *");
            System.out.println("*             5 输出             *");
            System.out.println("*             6 退出             *");
            System.out.println("**********************************");

            System.out.println("请输入你的选择：");

            Scanner in = new Scanner(System.in);
            int input = in.nextInt();

            switch (input){
                case 1:
                    addStudent(students);
                    break;

                case 2:
                    findStudent(students);
                    break;

                case 3:
                    deleteStudent(students);
                    break;

                case 4:
                    updateStudent(students);
                    break;

                case 5:
                    findAllStudent(students);
                    break;

                case 6:
                    System.out.println("已退出，谢谢使用！");
                    System.exit(0);

                default:
                    System.out.println("输入有误，请重新输入！");
                    break;

            }

        }

    }
    public static void addStudent(ArrayList<Student> arrayList) {
        String bitDate = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();

        while(true)
        {
            System.out.println("请输入日期(xxxx/xx/xx)：");
            String birDate1 = sc.nextLine();
            if (birDate1.length()<11)
            {
                bitDate = birDate1;
                break;
            }
            else{
                System.out.println("格式错误，请重新输入！");
            }
        }

        System.out.println("请输入性别(0|1)：");
        String gender = sc.nextLine();
        Student student = new Student();
        student.setID(id++);
        student.setName(name);
        student.setBirDate(bitDate);
        student.setGender(gender);

        arrayList.add(student);
        System.out.println("添加成功!");


    }

    public static void deleteStudent(ArrayList<Student> arrayList){
        if (arrayList.size()==0)
        {
            System.out.println("未查询到学生信息，请先添加学生信息！");
            return;
        }

        int flag = 0;
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要删除学生的姓名：");
            String name = sc.nextLine();
            int index = 0;
            for (int i=0; i<arrayList.size(); i++) {
                Student s = arrayList.get(i);
                if (name.equals(s.getName())) {
                    arrayList.remove(s.ID);
                    flag = 1;
                    System.out.println("删除成功！");
                }
            }

            if (flag!=1){
                System.out.println("找不到该同学请重新输入");
            }
            else
                break;
        }



    }

    public static void findStudent(ArrayList<Student> arrayList){

        if (arrayList.size()==0)
        {
            System.out.println("未查询到学生信息，请先添加学生信息！");
            return;
        }

        int flag = 0;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要查找学生的姓名：");
            String name = sc.nextLine();
            for (int i=0; i<arrayList.size(); i++) {
                Student student = arrayList.get(i);
                if (name.equals(student.getName())) {
                    flag = 1;
                    System.out.println("学号\t姓名\t出生日期\t\t性别");
                    System.out.println(student.getID()+"\t\t"+student.getName()+"\t\t"+student.getBirDate()+"\t\t\t\t"+student.getGender());
                }
            }
            if (flag!=1){
                System.out.println("找不到该同学请重新输入");
            }
            else
                break;
        }
    }

    public static void updateStudent(ArrayList<Student> arrayList){

        if (arrayList.size()==0)
        {
            System.out.println("未查询到学生信息，请先添加学生信息！");
            return;
        }

        int flag = 0;

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要查找学生的姓名：");
            String name = sc.nextLine();
            for (Student student : arrayList) {
                if (name.equals(student.getName())) {
                    flag = 1;
                    System.out.println("请输入更新的姓名：");
                    String name1 = sc.nextLine();
                    student.setName(name1);


                    while(true)
                    {
                        System.out.println("请输入日期(xxxx/xx/xx)：");
                        String bitDate = student.getBirDate();
                        String birDate1 = sc.nextLine();
                        if (birDate1.length()<11)
                        {
                            bitDate = birDate1;
                            student.setBirDate(bitDate);
                            break;
                        }
                        else{
                            System.out.println("格式错误，请重新输入！");
                        }
                    }

                    System.out.println("请输入性别(0|1)：");
                    String gender = sc.nextLine();
                    student.setGender(gender);
                    System.out.println("修改成功！");
                }
            }
            if (flag!=1){
                System.out.println("找不到该同学请重新输入");
            }
            else
                break;
        }

    }

    public static void findAllStudent(ArrayList<Student> arrayList){
        if (arrayList.size()==0)
        {
            System.out.println("未查询到学生信息，请先添加学生信息！");
            return;
        }

        System.out.println("所有学生的信息如下：");
        System.out.println("学号\t姓名\t出生日期\t\t性别（女0|男1）");
        for (Student student : arrayList)
        {
            System.out.println(student.getID()+"\t\t"+student.getName()+"\t\t"+student.getBirDate()+"\t\t\t\t"+student.getGender());
        }

    }

} //第一次修改

