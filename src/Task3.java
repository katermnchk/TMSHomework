public class Task3 {
    public static void main(String[] args){
        int n = 126, first, mid, end;
        first = n/100;
        mid = (n/10)%10;
        end = n%10;
        System.out.println("res = " + (first+mid+end));
    }
}
