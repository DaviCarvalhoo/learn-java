package projects;

public class NumericLoops {
    public static void main(String[] args) {
        // int num = 0;
        // while(num<5){
        //     num++;
        //     System.out.println(num);
        // }
        for(int i = 0;i <= 5; i++){
            for(int j = 0; j <= 5; j++){
                System.out.println(i +"x"+ j +" = "+ j*i);
            }
        }
    }
}
