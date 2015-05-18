package statePeturn;

public class InitialState implements State{
	@Override
    public void transition(Context context, String input) {
        if ("Hello".equals(input)) {
            context.changeState(new OhaState());
        }else if("Hi".equals(input)){
        	context.changeState(new TukaretaState());
        }
    }

    @Override
    public void say() {

    }

}
