package statePeturn;

public class KontihaState implements State {

	@Override
	public void transition(Context context, String input) {
		if("Hi".equals(input)){
			context.changeState(new OhisaState());
		}else if("Hello".equals(input)){
			context.changeState(new SakkiState());
		}
	}

	@Override
	public void say() {
		System.out.println("こんちはー");
	}

}
