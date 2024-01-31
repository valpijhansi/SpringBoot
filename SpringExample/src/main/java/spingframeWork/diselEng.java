package spingframeWork;

public class diselEng implements IEngine {
	public diselEng() {
		System.out.println("diselEng::Constructor");
	}

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		System.out.println("Journey Started.....");
		return true;
	
	}

}
