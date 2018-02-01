
public class DicePermutation {

	public static void dicePermuation(int length, String prefix){
		if(length == 0){
			System.out.println(prefix);
		}else{
			for(int i=1;i<=6;i++){
				dicePermuation(length-1, prefix+i);
			}
		}
	}
	
	public static void main(String[] args) {
		dicePermuation(3, "");
	}
	
}
