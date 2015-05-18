package statePeturn;

public class TukaretaState implements State {

	@Override
	public void transition(Context context, String input) {
		if(input.equals("Hello") || input.equals("Hi")){
			context.changeState(new OhisaState());
		}
	}

	@Override
	public void say() {
		System.out.println("つかれたー");
	}

}
