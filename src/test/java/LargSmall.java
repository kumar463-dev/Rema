public class LargSmall{
    public static void main(String[] args) {
        Integer[] num = {1,-333,444,903940,-32338,0,333,1,03344};
        int larg= num[0];
        int small = num[0];

        for(int i=1; i<num.length; i++){
            if(num[i]>larg){
                larg = num[i];
            }
            else if (num[i]<small){
                small = num[i];
            }
        }

        System.out.println("Largest number is:: "+ larg);
        System.out.println("Smallest number is:: "+ small);

    }
}