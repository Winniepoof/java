package test;

public class t_arr {
    public int max_num(int [] a){
        int max=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
            }
            else continue;
        }
    return max;
    }

    public static  void main(String[] args){
        int [] a=new int[5];
        a[0]=2;
        a[1]=3;
        a[2]=10;
        a[3]=7;
        a[4]=9;
        int sum=0;
        for (int i=0;i<5;i++){
            sum+=a[i];
        }
        System.out.println(sum);

        t_arr m=new t_arr();
        System.out.println(m.max_num(a));

        hello_world h=new hello_world();
        h.p();
    }

}
