package stringPrograms.stringBuffer;

public class HashCodeMethod {

	public static void main(String[] args) {

		// String returns new hashcode value when you concat string but StringBuffer
		// returns same.

		String str = "Github";
		System.out.println("Hashcode value of original string:" + str.hashCode());
		str = str + "repo";
		System.out.println("Hashcode value of new string:" + str.hashCode());

		StringBuffer sb = new StringBuffer("Github");
		System.out.println("Hashcode value of original sb string:" + sb.hashCode());
		sb.append("repo");
		System.out.println("Hashcode value of new sb string:" + sb.hashCode());

	}

}