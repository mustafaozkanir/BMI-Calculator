import java.util.Scanner;

public class bodymass {
    public static void main (String[] args){
        double weight, height,bodymassindex;

        System.out.println("Please Enter Your Weight");
        Scanner inputweight = new Scanner(System.in);
        weight = inputweight.nextDouble();


        System.out.println("Please Enter Your Height");
        Scanner inputheight = new Scanner(System.in);
        height = inputheight.nextDouble();

        bodymassindex = weight / (Math.pow(height, 2));
        System.out.println("Your BMI: "+bodymassindex+" ");








    }
    
}