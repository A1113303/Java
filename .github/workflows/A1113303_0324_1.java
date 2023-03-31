import java.util.*;
class animal{
    String name;
    double height;
    int weight;
    int speed;

    double distance(int x,double y){
        return x*y*this.speed;
    }

    int distance(int x){
        return x*this.speed;
    }
}
public class A1113303_0324_1{
    public static void main(String[] args){

        animal[] group;
        group=new animal[4];
        int[] x;
        x=new int[4];
        int[] y;
        y=new int[4];
        int i;
        String ans;

        for(i=0;i<4;i++){
            group[i]=new animal();
        }
        
        group[0].name="雪寶";
        group[0].height=1.1;
        group[0].weight=52;
        group[0].speed=100;
        group[1].name="驢子";
        group[1].height=1.5;
        group[1].weight=99;
        group[1].speed=200;
        group[2].name="安那";
        group[2].height=1.7;
        group[2].weight=48;
        group[2].speed=120;
        group[3].name="愛沙";
        group[3].height=1.7;
        group[3].weight=50;
        group[3].speed=120;

        for(i=0;i<4;i++){
            System.out.println("請輸入"+group[i].name+"的時間(x值)：");
            Scanner sc=new Scanner(System.in);
            x[i]=sc.nextInt();
        }
        System.out.println("請問是否輸入加速度(y值)？");
        Scanner sc=new Scanner(System.in);
        ans=sc.next();
        
        if(ans=="是"){

            for(i=0;i<4;i++){
                System.out.println("請輸入"+group[i].name+"的加速度(y值)：");
                Scanner sc1=new Scanner(System.in);
                y[i]=sc1.nextInt();
            }
            System.out.println(group[i].name+"的奔跑距離為"+group[i].distance(x[i],y[i]));

        }else if(ans=="否"){

            for(i=0;i<4;i++){
                System.out.println(group[i].name+"的奔跑距離為"+group[i].distance(x[i]));
            }  
        }

    }
}