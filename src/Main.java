public class Main {
    public static void main(String[] args) {
       permutaions("","abc");



    }

    static void permutaions(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        for (int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutaions(s + ch +   f, up.substring(1));
        }
    }
}