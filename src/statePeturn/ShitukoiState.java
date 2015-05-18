package statePeturn;

public class ShitukoiState implements State{
	@Override
	public void transition(Context context, String input){
	}

	@Override
	public void say(){
		System.out.println("しつこいー");
	}
}
