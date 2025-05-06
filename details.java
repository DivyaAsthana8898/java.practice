import java.util.Scanner;

class details{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Enter your fathers name:");
        String fname = input.nextLine();
        System.out.println("Enter your mothers name :");
        String mname = input.nextLine();
        System.out.println("Enter your current age");
        int age = input.nextInt();
        System.out.println("Enter your tenth calss percentage:");
        int page = input.nextInt();
        System.out.println("My name is:"+name);
        System.out.println("My fathers name is :"+fname);
        System.out.println("My mothers name is :"+mname);
        System.err.println("My age is :"+age);
        System.err.println("My percentage is :"+page);



    }
}
