import java.util.Scanner;


class marks
{
	Physics p;
	Chemistry c;
	Mathematics m;
	static int rollno=1;
	float avg;
	int sum;
	void total(Physics p,Chemistry c,Mathematics m)
	{
		sum = p.marks+c.marks+m.marks;
		avg =(sum)/3;
		
		System.out.println(rollno++);
		System.out.println(p.marks);
		System.out.println(c.marks);
		System.out.println(m.marks);
		System.out.println(sum);
		System.out.println(avg);
		
	}
	
	
	/*void getmarks(int roll, int marks, String subject)
	{
		System.out.println(roll+"marks in "+subject+" are "+marks);
		
	}*/
}
class Physics extends marks
{
	int marks;
	
	void getmarks(int marks)
	{
		this.marks=marks;
	}
}
class Chemistry extends marks
{
	int marks;
	
	void getmarks(int marks)
	{
		this.marks=marks;
	}
}
class Mathematics extends marks
{
		int marks;
	
	void getmarks(int marks)
	{
		this.marks=marks;
	}

}
public class ass3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students in a class");
		int n = sc.nextInt();
		//int p[] = new int[n];
		//int c[] = new int[n];
		//int m[] = new int[n];
	
		//Physics ph[] = new Physics[n];
		//Chemistry ch[] = new Chemistry[n];
		//Mathematics mh[] = new Mathematics[n];
		Mathematics mh =  new Mathematics();
		mh.getmarks(80);
		Physics ph = new Physics();
		ph.getmarks(70);
		Chemistry ch = new Chemistry();
		ch.getmarks(90);
		
		marks mp = new marks();
		mp.total(ph,ch,mh);
		/*for(int i = 0;i<n;i++)
		{
		
			System.out.println("Enter Marks of Physics");
			int pmarks = sc.nextInt();
			ph[i]= new Physics();
			ph[i].getmarks(i+1, pmarks);
			
			System.out.println("Enter Marks of Chemistery");
			int cmarks = sc.nextInt();
			ch[i]= new Chemistry();
			ch[i].getmarks(i+1, cmarks);
			
			System.out.println("Enter Marks of Mathematics");
			int mmarks = sc.nextInt();
			mh[i]= new Mathematics();
			mh[i].getmarks(i+1, mmarks);
		}*/

	}

}


