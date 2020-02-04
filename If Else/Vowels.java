/*Write a Java program to print Vowel or Consonant.*/

class Vowels
{
	public static void main(String args[])
	{
		char word='a';
		if(word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u')
		{
			System.out.println(word+" is a vowels");
		}
		else
		{
			System.out.println(word+" is a consonant");
		}
	}
}