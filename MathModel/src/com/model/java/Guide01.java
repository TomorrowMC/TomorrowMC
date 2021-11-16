package com.model.java;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 */
class transform implements Comparable {
    private String name;
    double transNow = 0;
    double sunHaoRate;
    ArrayList ListofContains = new ArrayList();
    static final double MAXMUM = 6000;

    public transform(String name, double sunHaoRate) {
        this.name = name;
        this.sunHaoRate = sunHaoRate;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        transform tem = (transform) o;
        if (this.sunHaoRate== tem.sunHaoRate){
            return this.name.compareTo(tem.name);
        }else{return Double.compare(this.sunHaoRate, tem.sunHaoRate);}
    }

    @Override
    public String toString() {
        return "transform{" +
                "name='" + name + '\'' +
                ", ListofContains=" + ListofContains +
                '}';
    }
}


class product implements Comparable {
    private String name;
    double kucunNumber;
    double yuee;
    ArrayList yueeList=new ArrayList();
    boolean status = false;

    public product(String name, double kucunNumber) {
        this.name = name;
        this.kucunNumber = kucunNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        product tem = (product) o;
        if (this.kucunNumber==tem.kucunNumber){
            return this.getName().compareTo(tem.getName());
        }else{return Double.compare(this.kucunNumber, tem.kucunNumber);}
    }

    @Override
    public String toString() {
        return
                name + "," + yuee;
              // "["+ name + "," + yuee+"]";
    }
}


public class Guide01 {
    public static void main(String[] args) {
        double[] sunHaoRateArray1 = {1.810256855, 1.060226641, 0.1295, 1.570482353, 2.889825301, 0.543761111, 2.078833333, 0.735603056};
        double[] sunHaoRateArray2 = {2.366516071, 1.17805756, 0.1295, 1.570482353, 2.889825301, 0.543761111, 2.078833333, 0.984647265};
        double[] sunHaoRateArray3 ={1.522129078 ,0.876139105 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.557090397} ;
        double[] sunHaoRateArray4 ={1.117039802 ,0.940766216 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.601768314} ;
        double[] sunHaoRateArray5 ={0.936540931 ,0.825678247 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,3.545382325};
        double[] sunHaoRateArray6 ={1.311819185 ,1.000377277 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.853647094};
        double[] sunHaoRateArray7 ={0.990848627 ,1.119526851 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.56627003};
        double[] sunHaoRateArray8 ={1.25684426 ,1.060272584 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.7311497};
        double[] sunHaoRateArray9 ={2.335429419 ,1.004175487 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.720345773 };
        double[] sunHaoRateArray10 ={2.690307394 ,1.011332721 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.663161049 };
        double[] sunHaoRateArray11 ={2.928451509 ,0.836327328 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.667966927 };
        double[] sunHaoRateArray12 ={2.048233523 ,1.128572104 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.678};
        double[] sunHaoRateArray13 ={ 2.063713042 ,1.359571136 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.735603056 };
        double[] sunHaoRateArray14 ={2.138802645 ,0.831599012 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.984647265 };
        double[] sunHaoRateArray15 ={2.51157588 ,0.835128795 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.557090397 };
        double[] sunHaoRateArray16 ={2.431028384 ,1.364800725 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.601768314 };
        double[] sunHaoRateArray17={2.591483167 ,1.19193038 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,3.545382325 };
        double[] sunHaoRateArray18 ={2.645080682 ,1.484946906 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.853647094};
        double[] sunHaoRateArray19 ={2.018499227 ,1.071873877 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.56627003};
        double[] sunHaoRateArray20 ={1.933678033 ,1.189188008 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.7311497 };
        double[] sunHaoRateArray21 ={2.250456165 ,1.06915445 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.720345773 };
        double[] sunHaoRateArray22 ={2.102110757 ,0.95164206 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.663161049};
        double[] sunHaoRateArray23 ={2.181715758 ,1.127312105 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.667966927 };
        double[] sunHaoRateArray24 ={1.9224 ,1.246590545 ,0.1295 ,1.570482353 ,2.889825301 ,0.543761111 ,2.078833333 ,0.678 };

        int[] chanliang1=  {180,0,790,630,690,9660,18660,410,790,30,70,20,2350,20,660,410,340,170,0,420,820,440,870,1,450,3740};
        int[] chanliang2={160,0,7170,0,640,0,0,150,650,20,30,10,1100,10,540,210,0,0,110,470,630,300,770,0,530,0};
        int[] chanliang3= {170,4,880,8,800,9610,2,340,770,10,60,20,1090,10,700,170,1,0,1,7010,750,360,940,0,590,0};
        int[] chanliang4= {180,0,730,600,870,0,1,30,520,10,70,10,1080,4,760,140,1,220,0,390,700,280,1060,0,580,0};
        int[] chanliang5={180,0,910,4,1010,1,21290,470,870,10,70,10,1120,5,900,150,550,0,190,350,720,510,1170,8,690,0};
        int[] chanliang6={210,30,810,5,620,10,3,10,820,20,70,10,1250,8,940,280,8,0,0,530,790,390,910,1,610,0};
        int[] chanliang7= {180,10,840,7,750,10,8,710,670,40,50,20,1050,30,450,350,5,310,220,7250,640,630,920,1,560,0};
        int[] chanliang8= {230,120,630,9,710,10,1,120,610,60,60,20,1600,60,660,550,6,0,0,540,730,290,930,170,570,0};
        int[] chanliang9= {170,130,820,8,730,20,18000,440,710,80,60,10,1920,130,900,670,30,270,0,660,770,490,870,530,630,0};
        int[] chanliang10={190,60,790,2,730,10,2,190,680,100,70,10,1880,210,720,760,4,0,230,450,660,510,770,1560,630,3130};
        int[] chanliang11={140,0,750,653,490,10,3,530,18750,120,80,20,3015,160,750,690,5,300,0,550,710,1470,620,1020,560,300};
        int[] chanliang12={160,30,780,4,640,1,4,10,21260,140,70,10,2150,150,670,930,5,30,0,550,770,660,730,650,530,6280};
        int[] chanliang13={170,0,890,9,700,7,4,750,7300,130,80,10,3200,130,790,1060,10,0,30,640,820,650,730,540,550,0};
        int[] chanliang14= {200,130,810,2,660,4,2,70,600,120,70,10,1700,140,810,1070,3,0,0,370,860,370,830,520,590,290};
        int[] chanliang15={180,260,890,5,730,20,10000,620,640,130,70,4,1590,200,860,1040,7,70,0,440,990,340,650,940,670,0};
        int[] chanliang16={150,150,850,614,660,9,1,230,1500,140,80,0,1540,210,820,1070,2,0,10,400,770,790,910,1070,640,0};
        int[] chanliang17={160,270,940,9,550,10,7,540,730,180,80,1,1730,200,900,1160,2,0,0,710,730,600,810,710,610,3690};
        int[] chanliang18={140,290,800,1,530,10,1,570,600,180,70,10,1740,220,560,1230,3,70,0,7000,820,540,700,11380,610,1430};
        int[] chanliang19={160,330,810,7,650,20,8,90,670,200,60,260,2380,150,750,1300,6,0,40,410,810,440,760,36970,580,0};
        int[] chanliang20={170,280,800,732,720,4,1,90,21000,360,70,420,2040,120,880,1650,2,0,0,1160,920,500,610,12990,580,0};
        int[] chanliang21= {130,70,890,5,580,10,10200,2520,590,300,80,450,2710,110,770,1730,5,90,100,50,760,50,730,50,520,0};
        int[] chanliang22={160,220,850,1,520,5,5,110,570,270,90,570,2540,110,690,1650,2,1,1,140,890,120,820,80,520,5000};
        int[] chanliang23={180,120,1050,10,600,10,10,2500,680,160,90,600,2130,110,830,1340,8,0,0,100,720,130,880,40,560,0};
        int[] chanliang24={160,0,910,3,710,7,1,270,650,80,70,590,2100,70,830,800,1,120,100,8180,850,9760,850,8,570,590};



        int[][] chanliang = {chanliang1, chanliang2,chanliang3,chanliang4,chanliang5,chanliang6,chanliang7,chanliang8,chanliang9,chanliang10,chanliang11,chanliang12,chanliang13,chanliang14,chanliang15,chanliang16,chanliang17,chanliang18,chanliang19,chanliang20,chanliang21,chanliang22,chanliang23,chanliang24};
        double[][] sunHaoRateArray = {sunHaoRateArray1, sunHaoRateArray2,sunHaoRateArray3,sunHaoRateArray4,sunHaoRateArray5,sunHaoRateArray6,sunHaoRateArray7,sunHaoRateArray8,sunHaoRateArray9,sunHaoRateArray10,sunHaoRateArray11,sunHaoRateArray12,sunHaoRateArray13,sunHaoRateArray14,sunHaoRateArray15,sunHaoRateArray16,sunHaoRateArray17,sunHaoRateArray18,sunHaoRateArray19,sunHaoRateArray20,sunHaoRateArray21,sunHaoRateArray22,sunHaoRateArray23,sunHaoRateArray24};
        for (int z = 0; z < sunHaoRateArray.length; z++) {
            System.out.println(z + 1 + "\t" + "本次的轮次：");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            transform t1 = new transform("T1", sunHaoRateArray[z][0]);
            transform t2 = new transform("T2", sunHaoRateArray[z][1]);
            transform t3 = new transform("T3", sunHaoRateArray[z][2]);
            transform t4 = new transform("T4", sunHaoRateArray[z][3]);
            transform t5 = new transform("T5", sunHaoRateArray[z][4]);
            transform t6 = new transform("T6", sunHaoRateArray[z][5]);
            transform t7 = new transform("T7", sunHaoRateArray[z][6]);
            transform t8 = new transform("T8", sunHaoRateArray[z][7]);
            TreeSet totalTransform = new TreeSet();
            totalTransform.add(t1);
            totalTransform.add(t2);
            totalTransform.add(t3);
            totalTransform.add(t4);
            totalTransform.add(t5);
            totalTransform.add(t6);
            totalTransform.add(t7);
            totalTransform.add(t8);
            String[] shengchanshang = {"S031","S078","S108","S114","S131","S139","S140","S143","S151","S154","S189","S208","S229","S273","S275","S282","S291","S292","S307","S308","S329","S330","S340","S348","S352","S395"};
            product product1 = new product(shengchanshang[0], chanliang[z][0]);
            product product2 = new product(shengchanshang[1], chanliang[z][1]);
            product product3 = new product(shengchanshang[2], chanliang[z][2]);
            product product4 = new product(shengchanshang[3], chanliang[z][3]);
            product product5 = new product(shengchanshang[4], chanliang[z][4]);
            product product6 = new product(shengchanshang[5], chanliang[z][5]);
            product product7 = new product(shengchanshang[6], chanliang[z][6]);
            product product8 = new product(shengchanshang[7], chanliang[z][7]);
            product product9 = new product(shengchanshang[8], chanliang[z][8]);
            product product10 = new product(shengchanshang[9], chanliang[z][9]);
            product product11 = new product(shengchanshang[10], chanliang[z][10]);
            product product12 = new product(shengchanshang[11], chanliang[z][11]);
            product product13 = new product(shengchanshang[12], chanliang[z][12]);
            product product14 = new product(shengchanshang[13], chanliang[z][13]);
            product product15 = new product(shengchanshang[14], chanliang[z][14]);
            product product16 = new product(shengchanshang[15], chanliang[z][15]);
            product product17 = new product(shengchanshang[16], chanliang[z][16]);
            product product18 = new product(shengchanshang[17], chanliang[z][17]);
            product product19 = new product(shengchanshang[18], chanliang[z][18]);
            product product20 = new product(shengchanshang[19], chanliang[z][19]);
            product product21 = new product(shengchanshang[20], chanliang[z][20]);
            product product22 = new product(shengchanshang[21], chanliang[z][21]);
            product product23 = new product(shengchanshang[22], chanliang[z][22]);
            product product24 = new product(shengchanshang[23], chanliang[z][23]);
            product product25= new product(shengchanshang[24], chanliang[z][24]);
            product product26= new product(shengchanshang[25], chanliang[z][25]);


            TreeSet totalproducts = new TreeSet();
            totalproducts.add(product1);
            totalproducts.add(product2);
            totalproducts.add(product3);
            totalproducts.add(product4);
            totalproducts.add(product5);
            totalproducts.add(product6);
            totalproducts.add(product7);
            totalproducts.add(product8);
            totalproducts.add(product9);
            totalproducts.add(product10);
            totalproducts.add(product11);
            totalproducts.add(product12);
            totalproducts.add(product13);
            totalproducts.add(product14);
            totalproducts.add(product15);
            totalproducts.add(product16);
            totalproducts.add(product17);
            totalproducts.add(product18);
            totalproducts.add(product19);
            totalproducts.add(product20);
            totalproducts.add(product21);
            totalproducts.add(product22);
            totalproducts.add(product23);
            totalproducts.add(product24);
            totalproducts.add(product25);
            totalproducts.add(product26);
            for (int ww=0;ww<5;ww++) {
                for (Object obj :
                        totalTransform) {
                    transform tran = (transform) obj;
                    label1:
                    for (Object o :
                            totalproducts) {
                        product product = (com.model.java.product) o;
                        //判断转运商的容量是否足够，足够就添加
                        if (product.kucunNumber > 6000) {
                            System.out.println("分阶段添加" + product.getName() + "进" + tran.getName());
                            tran.ListofContains.add(product);
                            product.kucunNumber -= transform.MAXMUM - tran.transNow;
                            product.yueeList.add(transform.MAXMUM - tran.transNow);
                            tran.transNow +=transform.MAXMUM - tran.transNow;
                            break label1;
                        }
                        if (product.status == false) {
                            if (transform.MAXMUM - tran.transNow > product.kucunNumber) {
                                product.yuee = product.kucunNumber;
                                tran.ListofContains.add(product);
                                tran.transNow += product.kucunNumber;
                                product.kucunNumber = 0;
                                product.status = true;
                            }
                        }
                    }
                }
            }

            for (Object obj :
                    totalTransform) {
                transform tran = (transform) obj;
                System.out.println("运输商名称：" + tran.getName() + "包含的生产商" + tran.ListofContains);

            }
            for (Object o :
                    totalproducts) {
                product pro=(product) o;
                if (pro.yueeList.size()!=0){
                    System.out.println("名字是："+pro.getName()+pro.yueeList);
                }


            }

        }
        //算一下第四问的损耗
        double trulyProduction=0;

        for (int j = 0 ;j<sunHaoRateArray.length;j++) {
            for (int i = 0; i < sunHaoRateArray[j].length; i++) {
                trulyProduction += 6000*(1-sunHaoRateArray[j][i]);
            }
        }
        System.out.println(trulyProduction);
    }

}
