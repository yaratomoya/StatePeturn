package statePeturn;

public class KonbanState implements State {

	@Override
	public void transition(Context context, String input) {
		if("Hello".equals(input)){
			context.changeState(new ShitukoiState());
		}
	}

	@Override
	public void say() {
		System.out.println("こんばんわー");
	}

}
