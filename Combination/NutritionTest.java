/*1: wap to create a class Nutrition and calulate the total calories in the provided food. If fat is provided 3gm then total calories would be 6, if protein is 2gm then total calories would be 4, if 5gm carbohydrate then calories would be 15?

Given are: protein = 20 , carbohydrates = 30, fat= 15
Hint for result (total calories) : calories of fat + calories of protein + calories of carbohydrates*/

class Nutrition
{
	static int calculateCalories(int protein,int carbohydrate,int fat)
	{
		int totalCalories=0;
		System.out.println("Fat:-"+fat);
		System.out.println("Protein:-"+protein);
		System.out.println("Carbohydrate:-"+carbohydrate);
		totalCalories=(protein*2)+(carbohydrate*3)+(fat*2);
		return totalCalories;
	}
}
class NutritionTest
{
	public static void main(String args[])
	{
		int protein=Integer.parseInt(args[0]);
		int carbohydrate=Integer.parseInt(args[1]);
		int fat=Integer.parseInt(args[2]);
		int a=Nutrition.calculateCalories(protein,carbohydrate,fat);
		System.out.println(a);
	}
}