public class Racecar {
    public static void main(String[] args) {
        int target=6;
        int pos=0;
        int speed=1;
        String seq="";
        while(pos!=target){
            if(pos<target){
                seq+='A';
                pos+=speed;
                speed*=2;
            }
            else{
                seq+='R';
                if(speed>=0){
                    speed=-1;
                    pos-=speed;
                }
                else{
                    speed=1;
                }
            }
        }
        System.out.println(seq.length());
    }
}
