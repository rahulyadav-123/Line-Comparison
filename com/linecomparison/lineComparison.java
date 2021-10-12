package com.linecomparison;

import java.util.Scanner;

public class lineComparison {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter the value of starting point according to x-axis  of frist line: ");
				double x1 = sc.nextDouble();
					
				System.out.print("Enter the value of starting point according to y-axis  of frist line: ");
				double y1 = sc.nextDouble();
					
				System.out.print("Enter the value of end point according to x-axis  of frist line: ");
				double x2 = sc.nextDouble();
					
				System.out.print("Enter the value of end point according to x-axis  of frist line: ");
				double y2 = sc.nextDouble();
				
				double length_of_line = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1 ),2));
				System.out.println(length_of_line);
				
				
				System.out.print("Enter the value of starting point according to x-axis  of Second line: ");
				double xx1 = sc.nextDouble();
				
				System.out.print("Enter the value of starting point according to y-axis  of Second line: ");
				double yy1 = sc.nextDouble();
				
				System.out.print("Enter the value of end point according to x-axis  of Second line: ");
				double xx2 = sc.nextDouble();
				
				System.out.print("Enter the value of end point according to x-axis  of Second line: ");
				double yy2 = sc.nextDouble();
				 
				double Sec_length_of_line = Math.sqrt(Math.pow((xx2 - xx1),2) + Math.pow((yy2 - yy1 ),2));
				System.out.println(Sec_length_of_line);
				
				
				if ( length_of_line > Sec_length_of_line)
					System.out.println("Line One is Greater");
				else if (length_of_line == Sec_length_of_line )
					System.out.println("Line One and Line Two are Equal");
				else
					System.out.println("Line Two is Greater");
			}

		}


	