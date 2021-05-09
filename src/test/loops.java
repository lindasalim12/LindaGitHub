package test;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int index = 5;
		
		
		//------------ While Loop ------------------
		
		while(index>0) {
			
			if(index!=3) {
				System.out.println(index);
			}
			
			index--;
			
		}
		
		int index1 = 5;
		
		while(index1>0) {
			
			System.out.println(index1);
			
			if(index1==3) {
				break;
				
			}
			
			index1--;
			
		}
int  index3=1;
do {
	System.out.println(index3);
	index3++;
}while(index3<11);

for(int j=0;j<11; j++) {
	System.out.println(j);
}
int myArray [] = {1,2,3,4,5};
for(int i=0; i<myArray.length;i++)
{
	System.out.println(myArray[i]);
}
	}

}
