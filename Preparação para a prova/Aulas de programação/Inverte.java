public class Inverte {

	static public void main(String[] args){
		if (args.length < 1){
			System.out.println("Informe uma String!");
		}
		else{
			String st = args[0];
			for(int i=st.length()-1;i>=0;i--){
				System.out.printf("%c",st.charAt(i));
			}
			System.out.printf("%n");
		}
	}
}
