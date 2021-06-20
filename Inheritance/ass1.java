/*
 * Q1.Create two classes named Mammals and MarineAnimals.
Create another class named BlueWhale which inherits both the
above classes. Now, create a function in each of these classes
which prints "I am mammal", "I am a marine animal" and "I
belong to both the categories: Mammals as well as Marine
Animals" respectively. Now, create an object for each of the
above class and try calling

 */
interface Mammels
{
	 public abstract void display(String type);
}

interface MarineAnimals 
{
	public abstract void display(String type);
}
class BlueWhale implements MarineAnimals,Mammels
{
	 public void display(String type)
	 {
		 System.out.println(type);
	 }
}
public class ass1 {

	public static void main(String[] args) {
		
			BlueWhale bl = new BlueWhale();
			bl.display("I Am Mamal");

	}

}
