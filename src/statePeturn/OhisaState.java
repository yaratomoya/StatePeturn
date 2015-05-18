package statePeturn;

public class OhisaState implements State{
	@Override
	public void transition(Context context, String input){
		if("Hi".equals(input)){
			context.changeState(new OhaState());
		}else if("Hello".equals(input)){
			context.changeState(new KonbanState());
		}
	}

	@Override
	public void say(){
		System.out.println("おひさー");
	}
}
