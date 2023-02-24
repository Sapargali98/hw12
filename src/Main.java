import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int myNumber;
        int a=10,b=5,d=17;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println("c="+a/b);
        int my_array[]={1,2,5,6,3,2};
        System.out.println("Second Largest: "+getSecondLargest(my_array,6));
        int[] array = {10, 20, 30};
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        System.out.println("Сумма= " + sum1);
        System.out.println("a = " + a + " b = " + b);
        a += b;
        b =a - b;
        a -= b;
        System.out.println("a = " + a + " b = " + b);
        System.out.println("a = " + a + " b = " + b);
        a += b;
        b =a - b;
        a -= b;
        System.out.println("a = " + a + " b = " + b);
        Scanner sr = new Scanner(System.in);
        System.out.print("Введите число от 1 до 20 -> ");
        if(sr.hasNextInt()){
            myNumber = sr.nextInt();
            if ((myNumber % 2) == 0){
                System.out.print("Четное число " + myNumber);
            }else{System.out.print("Не четное число " + myNumber);}
        }else{System.out.print("Вы ввели не целое число");}
        System.out.println();
        Scanner sr1= new Scanner(System.in);
        System.out.print("Введите число :");
        if(sr1.hasNextInt()){
            myNumber = sr1.nextInt();
            if (myNumber >0){
                System.out.print("Положительное число " + myNumber);
            }else if (myNumber<0){System.out.print("Отрицательное число " + myNumber);}
        }else{System.out.print("Число ровно нулю");}
        System.out.println();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Введите 3 числа");
        int k = scnr.nextInt();
        int l = scnr.nextInt();
        int m = scnr.nextInt();
        if (k<m) {
            if (m<l) {
                System.out.println("Наибольшее число из "+k+" "+l+" "+m);
                System.out.println("= "+l);
            } else {
                System.out.println("Наибольшее число из "+k+" "+l+" "+m);
                System.out.println("= "+m);
            }} else {
            if (a<l) {
                System.out.println("Наибольшее число из "+k+" "+l+" "+m);
                System.out.println("= "+l);
            }
            else {
                System.out.println("Наибольшее число из "+k+" "+l+" "+m);
                System.out.println("= "+k);
            }
        }
        String Str = "all i wanna do ";
        System.out.println(Str.replaceAll("a", "b"));}



        public static int getSecondLargest(int[] my_array,int total){
            int temp;
            for (int i = 0; i < total; i++)
            {
                for (int j = i + 1; j < total; j++)
                {
                    if (my_array[i] > my_array[j])
                    {
                        temp = my_array[i];
                        my_array[i] = my_array[j];
                        my_array[j] = temp;
                    }
                }
            }
            return my_array[total-2];
        }
    }








