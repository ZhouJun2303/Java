public class AddSumWhile{//声明类Addsumwhile
     public static void main(String[] args){
         int num=0; 
         int i=0;        	 //1.申明并初始化
         while(i<=100){  	 //2.循环条件
         	num+=i;          //3.将循环结果放在num中
        	 i++;            //4.i自＋1
         	System.out.println("第"+i+"次累加的结果是"+num);  
                          	 //5.输出并换行打印
          }
     }
}