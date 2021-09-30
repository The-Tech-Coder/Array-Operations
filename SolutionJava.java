import java.io.*;
class Array{
	int a[];
	int n;
	void readData() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of elements: ");
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++){
			a[i] = Integer.parseInt(br.readLine());
		}	
	}

	void display(){
		for(int i=0; i<n; i++){
			System.out.print(a[i]+" ");
            System.out.println();
		}
	}

	int search(int x){
		int i=0;
		while(i<n && a[i]!=x){
			i++;
		}
		if(i<n) return i;
		else return -1;
	}

	void sort(){
		int temp;
		for(int i=n-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}

class ArrayDemo2{
	public static void main(String args[])throws IOException{
		Array a1 = new Array();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int option;
		do{
			System.out.println("1:Read, 2:Search, 3:Sort, 4:Display, 5:Quit");
			System.out.print("Enter your option: ");
			option = Integer.parseInt(br.readLine());
			switch(option){
				case 1: a1.readData();break;
				case 2: System.out.println("Enter the element to be searched: ");
					int x = Integer.parseInt(br.readLine());
					int y = a1.search(x);
					if(y!=-1){
						System.out.println(x+" is present at position no. "+y);
					}
                    else{
						System.out.println(x+" is not present");
					}
					break;
				case 3: a1.sort();
					System.out.println("Array Sorted");
					break;
				case 4: System.out.println("The Array Elements are: ");
					a1.display();
					break;
			}
		}
        while(option!=5);
		
	}
}
