package stringPrograms;

public class ImmutableObjects {

	public static void main(String[] args) {

		String str = "Learning";
		str.concat("Java"); // two objects create din SCP
		System.out.println(str); // value of object not changed -op (Learning) - str points to Learning

		// explicitly assigning it to reference variable
		str = str.concat("Java");
		System.out.println(str); // str now points to LearningJava

	}

}