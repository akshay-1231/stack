package data_structure;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stackclass obj = new Stackclass();// object created System.out.println("Enter size of stack:");
		int size = sc.nextInt();
		obj.create_Stack(size);
		int ch, e;
		do {
			System.out.println("Stack Menu");
			System.out.println("-----------");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Print all elements");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				if (obj.is_Full() != true)// not full
				{
					System.out.println("Enter a number:");
					e = sc.nextInt();
					obj.push(e);
				}

				else
					System.out.println("Stack Full");

				break;
			case 2:
				if (obj.is_Empty() != true)// not empty
				{
					System.out.println("Element poped is " + obj.pop());
				}

				else
					System.out.println("Stack Empty");

				break;
			case 3:
				if (obj.is_Empty() != true)// not empty
				{
					System.out.println("Element @peek is " + obj.peek());
				}

				else {
					System.out.println("Stack Empty");
				}

				break;
			case 4:
				if (obj.is_Empty() != true)// not empty
				{
					System.out.println("Elements in stack are\n");
					obj.print_Stack();
				} else {
					System.out.println("Stack Empty");
				}

				break;
			case 0:
				System.out.println("Thanks for using code , coded by amartechnavigator");
				break;
			default:
				System.out.println("Wrong option selsected:");
				break;

			}
		} while (ch != 0);

	}
}
