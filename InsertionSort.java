public class InsertionSort{

     public static void main(String []args){
        int[] list = {5,12,5,9,38,10,15,12};
     	int key;
        for(int j=1;j<list.length;j++){
           key=list[j]; //current card
            for(int i=j-1;i>=0;i--){
              if(list[i]>key){
                list[i+1]=list[i];
                list[i]=key;
              }
            }
        }
        for( key=0;key<list.length;key++){
            System.out.println(list[key]+" ");
        }
     }
}
