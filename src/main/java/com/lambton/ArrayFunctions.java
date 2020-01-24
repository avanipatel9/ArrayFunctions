package com.lambton;

public class ArrayFunctions
{

    public static void main(String[] args)
    {
        int []b,x,y;//b,x and y all are arrays;
        int x2, y2[];// x2 int, y2 array;
        int x3[], y3; //x3 array, y3 int;
        int []x4, y4[]; // x4 - 1D array, y4 - 2D array;

        int c[ ] = new int[5];
        c[0] = 10;
        c[1] = 20;
        c[2] = 30;
        c[3] = 40;
        c[4] = 50;
        //c[5] = 60; error : out of bound index;
        int a[];
        a = new int[2];
        a[0] = 100;
        a[1] = 200;

        stringArray();
        displayReverseArray();
        findArray();

        int d[] = new int []{1,2,3,4,5,6,7,8,9,10};
        System.out.println(d.length);
        System.out.println("Using for(;;)");
        for (int i=0;i<d.length;i++)
        {
            System.out.println(d[i]);
        }

        for (int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        System.out.println("Using Compact for(:)");
        for(int p:d)
        {
            System.out.println(p);
        }
        y4 = new int[3][3];
    }

    public static void findArray()
    {
        int sum=0, max=0, min=1;
        float avg=0;
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<a.length;i++)
        {
            sum = sum + a[i];

            if(min > a[i])
            {
                min = a[i];
            }
            if(max<a[i])
            {
                max=a[i];
            }

            avg = (float)sum/a.length;

        }
        System.out.println("Sum =" + sum);
        System.out.println("Max =" + max);
        System.out.println("Min =" + min);
        System.out.println("Avg =" + avg);
    }

    public static void displayReverseArray()
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println("a[i] = " + a[i]);

        }

    }

    public static void stringArray()
    {
        String month[];
        month = new String[10];
        month[0]="January";
        month[1]="February";
        month[2]="March";
        month[3]="April";
        month[4]="May";
        month[5]="June";
        month[6]="July";
        month[7]="August";
        month[8]="September";
        month[9]="October";

        for(int i=0; i<month.length; i++)
        {
            String rstr = reverseStringArray(month[i]);
            System.out.println(month[i] + "<->" + rstr);

        }

    }

    public static String reverseStringArray(String s)
    {

        char a;
        String temp;
        char months[] = s.toCharArray();
        int len = months.length;

        for(int i=0, j = len-1; i<len/2; i++, j--)
        {
            a = months[i];
            months[i] = months[j];
            months[j] = a;

        }

        temp = new String(months);
        return temp;

    }


}
