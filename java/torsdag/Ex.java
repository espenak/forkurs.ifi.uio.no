
public class Ex {
	public static String exec(String cmd) throws Exception {
		Process p = Runtime.getRuntime().exec(cmd);
		java.util.Scanner s = new java.util.Scanner(p.getInputStream());
		String out = "";
		while(s.hasNextLine())
			out += s.nextLine() + "\n";
		return out;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(exec("ls"));

		String username = args[0];

		if(username.equals("espeak"))
			System.out.println(exec("finger " + username));
 		else
			System.out.println(exec("id " + username));
	}
}
