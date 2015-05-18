package statePeturn;

public class OhaState implements State{
	@Override
	public void transition(Context context, String input){
		if("Hello".equals(input) || "Hi".equals(input)){
			context.changeState(new KontihaState());
		}
	}

	@Override
	public void say(){
		System.out.println("おはー");
	}
}
