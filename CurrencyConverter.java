import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter
{
    public static void main(String[] args) {
        double rupee, doller, pound,code,euro,KWD;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Welcome to Webeduclick Currency Converter Project ***\nEnter the Currency code\n1:Rupees\n2:Dollar\n3:Pound\n4:Euro\n5:Kuwaiti diner");
        code = sc.nextInt();
        if(code == 1)
        {
            System.out.println("Enetr amount in rupees");
            rupee = sc.nextDouble();
            doller = rupee / 77.34;
            System.out.println("Dollar : " +f.format(doller));
            pound = rupee / 94.47;
            System.out.println("pound : " +f.format(pound));
            euro = doller * 0.96;
            System.out.println("Euro : " + f.format(euro));
            KWD = doller * 0.31;
            System.out.println("Kuwaiti dinar : " + f.format(KWD));
        }
        else if(code == 3)
        {
           System.out.println("Enter amount in Euro:");
           euro = sc.nextDouble();
           rupee = euro * 80.43;
           System.out.println("Rupees : " + f.format(rupee));
           doller = euro * 1.04;
           System.out.println("Dollar : " + f.format(doller));
           pound = euro * 0.85;
           System.out.println("pound : " +f.format(pound));
           KWD = euro * 0.318949;
           System.out.println("Kuwaiti dinar : " +f.format(KWD));
        }
        else if(code == 5)
        {
            System.out.println("Enter amount in Kuwaiti dinner ");
            KWD = sc.nextDouble();
            rupee = KWD * 251.96;
            System.out.println("Rupees  : "+ f.format(rupee));
            doller = KWD * 3.26;
            System.out.println("Dollar : " +f.format(doller));
            pound = KWD * 2.67;
            System.out.println("Pound : " + f.format(pound));
            euro = KWD * 3.13;
            System.out.println("Euro  : " + f.format(euro));
        }
        else
        {
            System.out.println("Invalid Code! ");
        }
        
    }
}

