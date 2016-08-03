/**
 * Created by 0908 on 03.08.2016.
 */
public class Echo {
    public static void main (String[] args){
        int i = 0;
        while (i < args.length){
            System.out.print(args[i] + " ");
            i++;
        }
        System.out.println();
    }
}
