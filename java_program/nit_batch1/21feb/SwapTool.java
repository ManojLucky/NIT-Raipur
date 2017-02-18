
/* 
Auther: surendra kuamr  sao
S/W Architech & Corporate s/w Trainer
Email : sur.nit.mca@gmail.com
phone 9009442844
Raipur (C.G)
*/

public class SwapTool{

//cal by value
public void swap(int a, int b){
 int t =a;
 a=b;
 b=t;
}

public void swap(MyData ref){

int t  = ref.i;
ref.i=ref.j;
ref.j =t;

}




}