import java.util.*;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        int ano;
        System.out.print("informe o ano: ");
        ano = infor.nextInt();

        if(ano % 4 == 0 && ano % 100 !=0 || ano % 400 == 0){
            System.out.println(ano + ": é ano bissexto");
        }else{
            System.out.println(ano + ": não é ano bissexto");


    }
}

}