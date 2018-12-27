/**
 * Class Untitled
 */
 import java.util.ArrayList;
public class Main1 {
	
	public static <E> void yazdir (E[] dizi){
		
		for (E e:dizi) {
			
			System.out.println(e);
		}
		
		
	}
	
	public static void main(String[] args) {
    	
    	Character[] char_array = {'J','A','V','A'};
    	Integer [] integer_array = {1,2,3,4,5,6};
		String[] string_array = {"java","Pyhton","C++","PHP"} ;
		Student [] student_array = {new Student("Mustafa"),new Student("Mehmet"),new Student("Merve")};

System.out.println("****************************************************************");

//charPrint.yazdir(char_array);
//stringPrint.yazdir(string_array);
//studentPrint.yazdir(student_array);
//intergerPrint.yazdir(integer_array);

YazdirmaSinifi <Character> karakYazdir = new YazdirmaSinifi<Character>();
karakYazdir.yazdir(char_array);
System.out.println("****************************************************************");

YazdirmaSinifi <String> stringYazdir = new YazdirmaSinifi<String>();
stringYazdir.yazdir(string_array);
System.out.println("****************************************************************");

YazdirmaSinifi <Student> StundentYazdir = new YazdirmaSinifi<Student>();
StundentYazdir.yazdir(student_array);
System.out.println("****************************************************************");

YazdirmaSinifi <Integer> intYazdir = new YazdirmaSinifi<Integer>();
intYazdir.yazdir(integer_array);

System.out.println("******************generic function is running**********************");

yazdir (string_array);
yazdir (char_array);
yazdir (student_array);
yazdir ( integer_array);
System.out.println("****************************************************************");

	}
}